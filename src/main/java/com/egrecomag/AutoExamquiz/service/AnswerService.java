package com.egrecomag.AutoExamquiz.service;

import com.egrecomag.AutoExamquiz.exception.ResourceNotFoundException;
import com.egrecomag.AutoExamquiz.model.Answer;
import com.egrecomag.AutoExamquiz.model.Question;
import com.egrecomag.AutoExamquiz.repository.AnswerRepository;
import com.egrecomag.AutoExamquiz.transfer.AnswerResponse;
import com.egrecomag.AutoExamquiz.transfer.GetAnswersRequest;
import com.egrecomag.AutoExamquiz.transfer.GetQuestionsRequest;
import com.egrecomag.AutoExamquiz.transfer.QuestionResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class AnswerService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AnswerService.class);

    private final AnswerRepository answerRepository;

    @Autowired
    public AnswerService(AnswerRepository answerRepository){this.answerRepository = answerRepository;}

    public Answer getAnswer (long id){
        LOGGER.info("Retrieving answer {}", id);

        return answerRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Answer " + id +" not found"));
    }

    @Transactional
    public Page<AnswerResponse> getAnswers(GetAnswersRequest request, Pageable pageable) {
        LOGGER.info("Retrieving answers: {}", request);

        Page<Answer> answers;

        answers = answerRepository.findAll(pageable);

        List<AnswerResponse> answerResponses = new ArrayList<>();

        for (Answer answer : answers.getContent()) {
            AnswerResponse answersResponse = new AnswerResponse();
            answersResponse.setId(answer.getId());
            answersResponse.setContent(answer.getContent());

            answerResponses.add(answersResponse);
        }

        return new PageImpl<>(answerResponses, pageable,
                answers.getTotalElements());
    }
}

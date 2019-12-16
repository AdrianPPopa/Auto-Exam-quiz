package com.egrecomag.AutoExamquiz.service;

import com.egrecomag.AutoExamquiz.exception.ResourceNotFoundException;
import com.egrecomag.AutoExamquiz.model.Question;
import com.egrecomag.AutoExamquiz.repository.QuestionRepository;
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
public class QuestionService {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(QuestionService.class);

    private final QuestionRepository questionRepository;

    @Autowired
    public QuestionService(QuestionRepository questionRepository){this.questionRepository = questionRepository;}

    public Question getQuestion(long id) {
        LOGGER.info("Retrieving question {}", id);
        // using Optional
        return questionRepository.findById(id)
                // lambda expressions
                .orElseThrow(() ->
                        new ResourceNotFoundException("Question " + id + " not found."));
    }

    @Transactional
    public Page<QuestionResponse> getQuestions(GetQuestionsRequest request, Pageable pageable) {
        LOGGER.info("Retrieving questions: {}", request);

        Page<Question> questions;

        questions = questionRepository.findAll(pageable);

        List<QuestionResponse> questionResponses = new ArrayList<>();

        for (Question question : questions.getContent()) {
            QuestionResponse questionsResponse = new QuestionResponse();
            questionsResponse.setId(question.getId());
            questionsResponse.setContent(question.getContent());

            questionResponses.add(questionsResponse);
        }

        return new PageImpl<>(questionResponses, pageable,
                questions.getTotalElements());
    }
}

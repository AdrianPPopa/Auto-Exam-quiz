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

    public Question getQuestion(int id) {
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
            questionsResponse.setTitle(question.getTitle());
            questionsResponse.setAnswer1(question.getAnswer1());
            questionsResponse.setAnswer2(question.getAnswer2());
            questionsResponse.setAnswer3(question.getAnswer3());



            questionResponses.add(questionsResponse);
        }

        return new PageImpl<>(questionResponses, pageable,
                questions.getTotalElements());
    }


    public String findAnswerIsCorrect (int questionId){
        Question userQuestion = questionRepository.findById(questionId).get();
        for (int i =0; i <questionRepository.findAll().size();i++){
            return userQuestion.getIsCorrect();
            } return "";
        }
}

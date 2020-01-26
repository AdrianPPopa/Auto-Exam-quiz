package com.egrecomag.AutoExamquiz.web;

import com.egrecomag.AutoExamquiz.model.Answer;
import com.egrecomag.AutoExamquiz.service.AnswerService;
import com.egrecomag.AutoExamquiz.transfer.AnswerResponse;
import com.egrecomag.AutoExamquiz.transfer.GetAnswersRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/answers")
public class AnswerController {
    private final AnswerService answerService;

    @Autowired
    public AnswerController(AnswerService answerService) {
        this.answerService = answerService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Answer> getAnswer (@PathVariable("id") int id ){
        Answer answer = answerService.getAnswer(id);
        return new ResponseEntity<>(answer, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<Page<AnswerResponse>> getAnswers (GetAnswersRequest request, Pageable pageable){
        Page<AnswerResponse> answer = answerService.getAnswers(request, pageable);
        return new ResponseEntity<>(answer, HttpStatus.OK);
    }
}

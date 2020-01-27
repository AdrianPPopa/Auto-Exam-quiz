package com.egrecomag.AutoExamquiz.web;

import com.egrecomag.AutoExamquiz.model.Question;
import com.egrecomag.AutoExamquiz.service.QuestionService;
import com.egrecomag.AutoExamquiz.transfer.GetQuestionsRequest;
import com.egrecomag.AutoExamquiz.transfer.QuestionResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;


@Controller
@RequestMapping("/questions")
public class QuestionController {

    private final QuestionService questionService;

    @Autowired
    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Question> getQuestion (@PathVariable("id") int id) {
        Question question = questionService.getQuestion(id);
        return new ResponseEntity<>(question, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<Page<QuestionResponse>> getQuestions(GetQuestionsRequest request, Pageable pageable){
        Page<QuestionResponse> question = questionService.getQuestions(request, pageable);
        return new ResponseEntity<>(question, HttpStatus.OK);
    }

    @RequestMapping(value = "submit", method = RequestMethod.POST)
    public String submit(HttpServletRequest request){
        int score =0;
        String []questionIds = request.getParameterValues("questionId");
        for (String questionId: questionIds){
            System.out.println(questionId);
//            String answerCorrect = questionService.findAnswerIsCorrect(Integer.parseInt(questionId));
//            if (answerCorrect.equals(Integer.parseInt(request.getParameter("question_" +questionId)))){
//                score++;
//            }
        }
        System.out.println("print something if works");
        request.setAttribute("score",score);
        return "redirect:/result";
    }

}

package com.egrecomag.AutoExamquiz.repository;

import com.egrecomag.AutoExamquiz.model.Answer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AnswerRepository extends JpaRepository<Answer,Integer> {

    // find by nested properties
    Page<Answer> findByQuestionId(int answerId, Pageable pageable);
}
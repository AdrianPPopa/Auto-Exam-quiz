package com.egrecomag.AutoExamquiz.repository;

import com.egrecomag.AutoExamquiz.model.Answer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AnswerRepository extends JpaRepository<Answer,Long> {
    Optional<Answer> findById(long id);
}
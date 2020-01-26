package com.egrecomag.AutoExamquiz.repository;

import com.egrecomag.AutoExamquiz.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface QuestionRepository extends JpaRepository<Question, Integer> {
    Optional<Question> findById(int id);
}

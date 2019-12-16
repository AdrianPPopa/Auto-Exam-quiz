package com.egrecomag.AutoExamquiz.repository;

import com.egrecomag.AutoExamquiz.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface QuestionRepository extends JpaRepository<Question, Long> {
    Optional<Question> findById(long id);
}

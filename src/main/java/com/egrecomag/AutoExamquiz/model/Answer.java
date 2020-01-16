package com.egrecomag.AutoExamquiz.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Entity
@Table (name = "answers")
public class Answer {

    @Id
    private long id;

    @NotNull
    private String content;

    @NotNull
    private boolean isCorrect;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public void setCorrect(boolean correct) {
        isCorrect = correct;
    }

    public Answer() {
    }

    @Override
    public String toString() {
        return "Answer{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", isCorrect=" + isCorrect +
                '}';
    }
}

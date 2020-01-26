package com.egrecomag.AutoExamquiz.model;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Objects;


@Entity
@Table(name = "questions")
public class Question {
    @Id
    private int id;

    @NotNull
    private String content;

    public Question() {
    }

    public Question(@NotNull String content) {
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", content='" + content + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Question question = (Question) o;
        return id == question.id &&
                content.equals(question.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, content);
    }
}

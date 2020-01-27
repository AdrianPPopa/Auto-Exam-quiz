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
    private String title;

    @NotNull
    private String answer1;

    @NotNull
    private String answer2;

    @NotNull
    private String answer3;

    @NotNull
    private String isCorrect;

    private Question (){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAnswer1() {
        return answer1;
    }

    public void setAnswer1(String answer1) {
        this.answer1 = answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public void setAnswer2(String answer2) {
        this.answer2 = answer2;
    }

    public String getAnswer3() {
        return answer3;
    }

    public void setAnswer3(String answer3) {
        this.answer3 = answer3;
    }

    public String getIsCorrect() {
        return isCorrect;
    }

    public void setIsCorrect(String isCorrect) {
        this.isCorrect = isCorrect;
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", answer1='" + answer1 + '\'' +
                ", answer2='" + answer2 + '\'' +
                ", answer3='" + answer3 + '\'' +
                ", isCorrect='" + isCorrect + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Question question = (Question) o;
        return id == question.id &&
                title.equals(question.title) &&
                answer1.equals(question.answer1) &&
                answer2.equals(question.answer2) &&
                answer3.equals(question.answer3) &&
                isCorrect.equals(question.isCorrect);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, answer1, answer2, answer3, isCorrect);
    }
}

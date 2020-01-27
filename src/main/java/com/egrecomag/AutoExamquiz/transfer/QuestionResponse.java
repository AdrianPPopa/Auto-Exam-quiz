package com.egrecomag.AutoExamquiz.transfer;

import java.util.Objects;

public class QuestionResponse {

    private long id;
    private String title;
    private String answer1;
    private String answer2;
    private String answer3;
    private String isCorrect;

    public QuestionResponse() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuestionResponse that = (QuestionResponse) o;
        return id == that.id &&
                title.equals(that.title) &&
                answer1.equals(that.answer1) &&
                answer2.equals(that.answer2) &&
                answer3.equals(that.answer3) &&
                isCorrect.equals(that.isCorrect);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, answer1, answer2, answer3, isCorrect);
    }

    @Override
    public String toString() {
        return "QuestionResponse{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", answer1='" + answer1 + '\'' +
                ", answer2='" + answer2 + '\'' +
                ", answer3='" + answer3 + '\'' +
                ", isCorrect=" + isCorrect +
                '}';
    }
}

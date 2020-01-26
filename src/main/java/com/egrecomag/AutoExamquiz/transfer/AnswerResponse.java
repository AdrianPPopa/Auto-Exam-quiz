package com.egrecomag.AutoExamquiz.transfer;

import java.util.Objects;

public class AnswerResponse {
    private int id;
    private String content;
    private boolean isCorrect;
    private int question_id;

    public AnswerResponse(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public void setCorrect(boolean correct) {
        isCorrect = correct;
    }


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(int question_id) {
        this.question_id = question_id;
    }

    @Override
    public String toString() {
        return "AnswerResponse{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", isCorrect=" + isCorrect +
                ", question_id=" + question_id +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AnswerResponse that = (AnswerResponse) o;
        return id == that.id &&
                isCorrect == that.isCorrect &&
                question_id == that.question_id &&
                content.equals(that.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, content, isCorrect, question_id);
    }
}

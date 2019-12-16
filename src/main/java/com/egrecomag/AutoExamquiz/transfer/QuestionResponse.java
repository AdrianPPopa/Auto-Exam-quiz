package com.egrecomag.AutoExamquiz.transfer;

import java.util.Objects;

public class QuestionResponse {

    private long id;
    private String content;

    public QuestionResponse() {
    }

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

    @Override
    public String toString() {
        return "QuestionResponse{" +
                "id=" + id +
                ", content='" + content + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuestionResponse that = (QuestionResponse) o;
        return id == that.id &&
                content.equals(that.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, content);
    }
}

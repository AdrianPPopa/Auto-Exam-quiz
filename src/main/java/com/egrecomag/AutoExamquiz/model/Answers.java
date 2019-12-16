package com.egrecomag.AutoExamquiz.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Entity
@Table (name = "answers")
public class Answers {

    @Id
    private long id;

    @NotNull
    private String content;

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
        return "Answers{" +
                "id=" + id +
                ", content='" + content + '\'' +
                '}';
    }
}

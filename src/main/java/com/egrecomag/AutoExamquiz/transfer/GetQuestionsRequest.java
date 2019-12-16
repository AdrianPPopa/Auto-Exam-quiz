package com.egrecomag.AutoExamquiz.transfer;

import javax.validation.constraints.NotNull;

public class GetQuestionsRequest {
    @NotNull
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public GetQuestionsRequest(@NotNull String content) {
        this.content = content;
    }
}

package com.egrecomag.AutoExamquiz.transfer;

import javax.validation.constraints.NotNull;

public class GetAnswersRequest {

    @NotNull
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public GetAnswersRequest(@NotNull String content) {
        this.content = content;
    }
}

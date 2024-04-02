package com.example.trackerpro.model;

public class ResponseMessage {
    private String text;

    public ResponseMessage(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}


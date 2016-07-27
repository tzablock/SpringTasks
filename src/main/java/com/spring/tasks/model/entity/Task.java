package com.spring.tasks.model.entity;

/**
 * Created by tomasz on 7/9/16.
 */
public class Task {
    private String name;
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

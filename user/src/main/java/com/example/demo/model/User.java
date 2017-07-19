package com.example.demo.model;

public class User {
    private Integer userId;

    private String name;

    private String comment;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    @Override
    public String toString()
    {
        return "{" +
                "userId:" + userId +
                ", name:'" + name + '\'' +
                ", comment:'" + comment + '\'' +
                '}';
    }
}
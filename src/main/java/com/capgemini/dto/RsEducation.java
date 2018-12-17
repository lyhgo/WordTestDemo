package com.capgemini.dto;

public class RsEducation {
    private Integer id;

    private Integer educationId;

    private String content;

    public RsEducation(Integer id, Integer educationId) {
        this.id = id;
        this.educationId = educationId;
    }

    public RsEducation(Integer id, Integer educationId, String content) {
        this.id = id;
        this.educationId = educationId;
        this.content = content;
    }

    public RsEducation() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEducationId() {
        return educationId;
    }

    public void setEducationId(Integer educationId) {
        this.educationId = educationId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}
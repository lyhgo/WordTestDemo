package com.capgemini.dto;

public class RsTechnical {
    private Integer id;

    private Integer technicalExeId;

    private String content;

    public RsTechnical(Integer id, Integer technicalExeId) {
        this.id = id;
        this.technicalExeId = technicalExeId;
    }

    public RsTechnical(Integer id, Integer technicalExeId, String content) {
        this.id = id;
        this.technicalExeId = technicalExeId;
        this.content = content;
    }

    public RsTechnical() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTechnicalExeId() {
        return technicalExeId;
    }

    public void setTechnicalExeId(Integer technicalExeId) {
        this.technicalExeId = technicalExeId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}
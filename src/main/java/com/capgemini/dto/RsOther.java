package com.capgemini.dto;

public class RsOther {
    private Integer id;

    private Integer otherId;

    private String content;

    public RsOther(Integer id, Integer otherId) {
        this.id = id;
        this.otherId = otherId;
    }

    public RsOther(Integer id, Integer otherId, String content) {
        this.id = id;
        this.otherId = otherId;
        this.content = content;
    }

    public RsOther() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOtherId() {
        return otherId;
    }

    public void setOtherId(Integer otherId) {
        this.otherId = otherId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}
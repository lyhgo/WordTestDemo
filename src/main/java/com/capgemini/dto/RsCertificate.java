package com.capgemini.dto;

public class RsCertificate {
    private Integer id;

    private Integer certificateId;

    private String content;

    public RsCertificate(Integer id, Integer certificateId) {
        this.id = id;
        this.certificateId = certificateId;
    }

    public RsCertificate(Integer id, Integer certificateId, String content) {
        this.id = id;
        this.certificateId = certificateId;
        this.content = content;
    }

    public RsCertificate() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCertificateId() {
        return certificateId;
    }

    public void setCertificateId(Integer certificateId) {
        this.certificateId = certificateId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}
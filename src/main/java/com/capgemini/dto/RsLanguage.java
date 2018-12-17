package com.capgemini.dto;

public class RsLanguage {
    private Integer id;

    private String language;

    private Integer listenSpeak;

    private Integer read;

    private Integer write;

    private Integer languageId;

    public RsLanguage(Integer id, String language, Integer listenSpeak, Integer read, Integer write, Integer languageId) {
        this.id = id;
        this.language = language;
        this.listenSpeak = listenSpeak;
        this.read = read;
        this.write = write;
        this.languageId = languageId;
    }

    public RsLanguage() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }

    public Integer getListenSpeak() {
        return listenSpeak;
    }

    public void setListenSpeak(Integer listenSpeak) {
        this.listenSpeak = listenSpeak;
    }

    public Integer getRead() {
        return read;
    }

    public void setRead(Integer read) {
        this.read = read;
    }

    public Integer getWrite() {
        return write;
    }

    public void setWrite(Integer write) {
        this.write = write;
    }

    public Integer getLanguageId() {
        return languageId;
    }

    public void setLanguageId(Integer languageId) {
        this.languageId = languageId;
    }
}
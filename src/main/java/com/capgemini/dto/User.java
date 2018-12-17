package com.capgemini.dto;

public class User {
    private Integer id;

    private String username;

    private String password;

    private Integer type;

    private Integer userDetailId;

    public User(Integer id, String username, String password, Integer type, Integer userDetailId) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.type = type;
        this.userDetailId = userDetailId;
    }

    public User() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getUserDetailId() {
        return userDetailId;
    }

    public void setUserDetailId(Integer userDetailId) {
        this.userDetailId = userDetailId;
    }
}
package com.mjc.voice.domain;

/**
 * Created by gcb on 2019/1/23.
 */
public class User {
    private Long id ;
    private String userName ;
    private String passWord ;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}

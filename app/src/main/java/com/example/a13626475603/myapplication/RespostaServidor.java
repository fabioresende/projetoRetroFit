package com.example.a13626475603.myapplication;

/**
 * Created by 13626475603 on 01/11/2016.
 */
public class RespostaServidor {
    private String userId;
    private Integer id;
    private String title;
    private String body;

    public RespostaServidor(){}

    public String getUserId() {
        return userId;
    }


    public void setUserId(String userid) {
        this.userId = userid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}

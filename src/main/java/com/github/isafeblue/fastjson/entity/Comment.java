package com.github.isafeblue.fastjson.entity;

/**
 * @author 浅蓝
 * @email blue@ixsec.org
 * @since 2020/5/9 12:58
 */
public class Comment {

    private String name;
    private String email;
    private String content;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

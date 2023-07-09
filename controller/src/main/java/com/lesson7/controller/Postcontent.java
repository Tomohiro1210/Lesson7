package com.lesson7.controller;

import java.time.LocalDateTime;

public class Postcontent {
    private LocalDateTime nowTime;
    private String name;
    private String category;
    private String contents;

    public Postcontent(LocalDateTime nowTime, String name, String category, String contents) {
        this.nowTime = nowTime;
        this.name = name;
        this.category = category;
        this.contents = contents;
    }

    public LocalDateTime getNowTime() {
        return nowTime;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getContents() {
        return contents;
    }

    public void setNowTime(LocalDateTime nowTime) {
        this.nowTime = nowTime;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
}

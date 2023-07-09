package com.lesson7.controller;
import jakarta.validation.constraints.NotBlank;

public class CreateForm {
    @NotBlank(message = "名前が必要です！")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

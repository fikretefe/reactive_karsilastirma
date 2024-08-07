package com.etiya.intern.entity.dto;

public class UserDto {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserDto(String name) {
        this.name = name;

    }

    public UserDto() {
    }
}

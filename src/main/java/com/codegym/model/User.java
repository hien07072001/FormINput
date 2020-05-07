package com.codegym.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

//@NotEmpty: không để trống
//
//@Size(min = 2, max = 30): độ dài từ 2 đến 30
//
//@Min(18): Giá trị nhỏ nhất là 18

public class User {
    @NotEmpty
    @Size(min=2,max=30)
    private  String name;

    @Min(18)
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

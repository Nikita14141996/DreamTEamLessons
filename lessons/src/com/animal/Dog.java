package com.animal;

import java.time.LocalDate;

public class Dog implements Animal {
    private  int age;
    private String sex;
    private LocalDate birthday;

    public Dog(int age, String sex, LocalDate birthday) {
        this.age = age;
        this.sex = sex;
        this.birthday = birthday;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getSex() {
        return sex;
    }

    @Override
    public LocalDate getBirthday() {
        return birthday;
    }
}

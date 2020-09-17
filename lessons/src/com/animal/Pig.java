package com.animal;

import java.time.LocalDate;

public class Pig implements MammalAnimal{
    private final String name;
    private final boolean chindren;
    private final int age;
    private final String sex;
    private final LocalDate birthday;


    public Pig(String name, boolean children, int age, String sex, LocalDate birthday){
         this.name= name;
         this.chindren= children;
         this.age= age;
         this.sex= sex;
         this.birthday= birthday;
     }



    @Override
    public String getName() {
        return name;
    }

    @Override
    public Boolean hasChildren() {
        return chindren;
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

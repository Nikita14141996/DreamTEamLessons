package com.animal;

import java.time.LocalDate;

public class Pig implements MammalAnimal{
    private final String name;
    private final boolean chindren;


    public Pig(String name, boolean children ){
         this.name= name;
         this.chindren= children;
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
        return 0;
    }

    @Override
    public String getSex() {
        return null;
    }

    @Override
    public LocalDate getBirthday() {
        return null;
    }
}

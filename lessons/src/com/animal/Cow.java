package com.animal;

import javax.naming.Name;
import java.time.LocalDate;

public class Cow implements MammalAnimal {

    private final String name;
    private final boolean children;
    private final int age;
    private final String sex;
    private final LocalDate birthday;

    public Cow (String name, boolean children,int age, String sex, LocalDate birthday ){
        this.name =name;
        this.children = children;
        this.age= age;
        this.sex= sex;
        this.birthday= birthday;

}
    @Override
    public String getName()
        {return name ; }


    @Override
    public Boolean hasChildren() {
        return children;
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

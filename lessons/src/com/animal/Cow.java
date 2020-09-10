package com.animal;

import javax.naming.Name;
import java.time.LocalDate;

public class Cow implements MammalAnimal {

    private final String name;
    private final boolean children;

    public Cow (String name, boolean children){
        this.name =name;
        this.children = children;

}
    @Override
    public String getName() {
        {return name ; }
    }

    @Override
    public Boolean hasChildren() {
        return children;
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

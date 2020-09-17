package com.animal;

import javax.naming.Name;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Cat cat1=new Cat(10,"Female", LocalDate.now());
        Dog dog1=new Dog(20,"Female", LocalDate.now());
        Cow cow1=new Cow( "cow",true,15,"Feamle", LocalDate.now());
        Pig pig1=new Pig("pig", false, 20,"Female", LocalDate.now());


 tellMeAboutAnimal(cat1);
        tellMeAboutAnimal(dog1);
        tellMeAboutMammalAnimal(cow1);
        tellMeAboutMammalAnimal(pig1);
    }

    private static void tellMeAboutMammalAnimal(MammalAnimal mammalAnimal) {
        System.out.println(
                mammalAnimal.getName().toString()+"    " +
                mammalAnimal.hasChildren().booleanValue()+" ." +
                "Name :  "+ mammalAnimal.getName()+
                        "Children : "+ mammalAnimal.hasChildren() + " . ");
        System.out.println(
                mammalAnimal.getClass().getSimpleName()+ " Birthday : " +
                        mammalAnimal.getBirthday().toString() +
                        "Age : "+ mammalAnimal.getAge()+
                        "Sex : "+ mammalAnimal.getSex()+ " . ");





    }


    public static void tellMeAboutAnimal(Animal animal){
        System.out.println(
                animal.getClass().getSimpleName()+" Birthday;"+

                        animal.getBirthday().toString() +

                        "Age: "+ animal.getAge()+
                        "Sex: "+ animal.getSex()+ "."

        );
    }
}


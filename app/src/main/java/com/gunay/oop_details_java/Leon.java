package com.gunay.oop_details_java;

public class Leon extends Prop implements Walk{


    // Buradaki super extend edilen Prop sınıfına referans verir
    // Referans vermenin en derin hali object 'e referans vermektir mesela Prop'a gidip super kullansak object'e referans verir.
    public Leon(String name, String color) {
        super(name, color);
    }

    @Override
    public boolean walker() {
        System.out.println("leons can walk");
        return false;
    }
}

package com.gunay.oop_details_java;

public class Prop {

    String name;
    String color;

    // buradaki referans object 'e verilir
    // her sınıf birer objeden kalıtım alıyor denebilir
    // Referans vermenin en derin hali object 'e referans vermektir mesela Prop'a gidip super kullansak object'e referans verir.
    // boş constructer yapıldığında arka planda object'e super(referans) verilir
    // object'e gidene kadar hep arka planda super çağrılır
    // boş constructor için super yazsakta yazmasakta fark etmiyor her türlü super arka planda kullanılıyor

    public Prop(){
        super();
    }
    public Prop(String name, String color) {
        this.name = name;
        this.color = color;
    }
}

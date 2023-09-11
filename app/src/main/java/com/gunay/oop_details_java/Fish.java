package com.gunay.oop_details_java;

public class Fish {

    String type;
    int weight;

    // final son değeri atanmış ve değiştirilemeyeceği anlamına gelir.
    // static burada form değişkeninin fish sınıfının bir instance'si(obje) üzerinden değilde sınıfın kendisinin bir değişken gibi olmasını sağlar.
    // metodlar içinde geçerlidir
    // static kullanılarak oluşturulan değişken ve metodlara import edilerek heryerden ulaşılabilir.
    // impoert etmessen sınıfın adı üzerinden kullan
    public static final String form = "konserve balik";

    // Bir sınıfın birden çok constructer'ı olabilir

    public Fish(){

    }

    public Fish(String type, int weight) {
        this.type = type;
        this.weight = weight;
    }



    public static void swimFishStatic(){
        System.out.println("My type" + form);
    }

    public void swimFish(){
        System.out.println("My type " +this.type+ "My weight"+ this.weight);
    }

}

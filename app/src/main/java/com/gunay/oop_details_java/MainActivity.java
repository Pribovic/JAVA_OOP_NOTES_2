package com.gunay.oop_details_java;

import static com.gunay.oop_details_java.Fish.form;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Fish balik = new Fish();
        balik.type = "hamsi";
        balik.weight = 2;

        Fish balik2 = new Fish("levrek",3);

        System.out.println(form);

        // import etmiceksen bu şekilde kullanılabilir.
        //System.out.println(Fish.form);


        balik.swimFish();
        //Static olana sınıf üzerinden ulaşabilirsin instance üzerinden değil
        Fish.swimFishStatic();


        // Default method use with interface
        Leon aslan = new Leon("Le","yellow");
        aslan.walkerBody();


    }
}
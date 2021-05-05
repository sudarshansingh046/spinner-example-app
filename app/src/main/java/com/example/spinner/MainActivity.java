package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
Spinner s1,s2,s3;

    int[] img={R.drawable.fastfood,R.drawable.burger,R.drawable.cake,R.drawable.chaumin,R.drawable.chocolatecake,R.drawable.pestry,R.drawable.pizza};
    String[] items={"Fast food", "BURGER","CAKE","CHAUMIN","CHOCOLATE CAKE","PESTRY","PIZZA"};
    int[] imga={R.drawable.animals,R.drawable.tiger,R.drawable.cheetah,R.drawable.dog,R.drawable.deer1,R.drawable.cat,R.drawable.lion,R.drawable.elephant,R.drawable.zebra};
    String[] animals={"Animals","Tiger","Cheetah","Dog","Deer","Cat","Lion","Elephant","Zebra"};
    int[] imgb={R.drawable.birds,R.drawable.cuckoo,R.drawable.cock,R.drawable.crane,R.drawable.dove,R.drawable.duck,R.drawable.kite,R.drawable.crow,R.drawable.eagle};
    String[] birds={"Birds","Cuckoo","Cock","Crane","Dove","Duck","Kite","Crow","Eagle"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getIntent();
        s1=(Spinner)findViewById(R.id.s1);
        s2=(Spinner)findViewById(R.id.s2);
        s3=(Spinner)findViewById(R.id.s3);



        Spinner1 fastfood=new Spinner1(MainActivity.this,img,items);
        s1.setAdapter(fastfood);
        s1.setOnItemSelectedListener(fastfood);
        Spinner2 animal=new Spinner2(MainActivity.this,imga,animals);
        s2.setAdapter(animal);
        s2.setOnItemSelectedListener(animal);
        Spinner3 bird=new Spinner3(MainActivity.this,imgb,birds);
        s3.setAdapter(bird);
        s3.setOnItemSelectedListener(bird);


    }


}
package com.example.spinner;

import android.content.Context;
import android.speech.tts.TextToSpeech;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;
import java.util.zip.Inflater;

public class Spinner2 extends BaseAdapter implements AdapterView.OnItemSelectedListener {
    TextToSpeech ttt;
    Context context;
    int[] imga;
    String[] animals;
    LayoutInflater layoutinflater;
    public Spinner2(MainActivity mainActivity, int[] imga, String[] animals) {
        this.context=mainActivity;
        this.imga=imga;
        this.animals=animals;
        layoutinflater=layoutinflater.from(context);
    }

    @Override
    public int getCount() {
        return animals.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView= layoutinflater.inflate(R.layout.spinner1,null);
        ImageView imgs=convertView.findViewById(R.id.imgs);
        TextView t1=convertView.findViewById(R.id.t1);
        imgs.setImageResource(imga[position]);
        t1.setText(animals[position]);




        return convertView;
    }
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, final int position, long id) {

        Toast.makeText(context.getApplicationContext(), animals[position], Toast.LENGTH_LONG).show();
        ttt=new TextToSpeech(context.getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                ttt.setLanguage(Locale.UK);
                ttt.speak(animals[position],TextToSpeech.QUEUE_FLUSH,null);
            }
        });
    }


    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}

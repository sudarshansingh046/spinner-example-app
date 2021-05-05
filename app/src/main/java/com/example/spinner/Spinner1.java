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

public class Spinner1 extends BaseAdapter implements AdapterView.OnItemSelectedListener {
    TextToSpeech ttt;
    Context context;
    int[] img;
    String[] items;
    LayoutInflater layoutinflater;
    public Spinner1(MainActivity mainActivity, int[] img, String[] items) {
        this.context=mainActivity;
        this.img=img;
        this.items=items;
        layoutinflater=layoutinflater.from(context);
    }

    @Override
    public int getCount() {
        return items.length;
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
        imgs.setImageResource(img[position]);
        t1.setText(items[position]);

        return convertView;
    }
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, final int position, long id) {

        Toast.makeText(context.getApplicationContext(), items[position], Toast.LENGTH_LONG).show();
        ttt=new TextToSpeech(context.getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                ttt.setLanguage(Locale.UK);
                ttt.speak(items[position],TextToSpeech.QUEUE_FLUSH,null);
            }
        });
    }


    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }


}

package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;


public class Phrases extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);
        ArrayList<Word> palabras = new ArrayList<Word>();
        /**
         * Añade la lista de palabras en ingles y miwok
         */
        palabras.add(new Word("Where are you going?", "minto wuksus"));
        palabras.add(new Word("What is your name?", "tinnә oyaase'nә"));
        palabras.add(new Word("My name is...", "oyaaset..."));
        palabras.add(new Word("How are you feeling?", "michәksәs?"));
        palabras.add(new Word("I’m feeling good.", "kuchi achit"));
        palabras.add(new Word("Are you coming?", "әәnәs'aa?"));
        palabras.add(new Word("Yes, I’m coming.", "hәә’ әәnәm"));
        palabras.add(new Word("Let’s go.", "yoowutis"));
        palabras.add(new Word("Come here.", "ama"));
        palabras.add(new Word("Yes, I’m coming.\n", "hәә’ әәnәm"));

        /**
         * Manera chevere de crear los views de una lista rapido y con memoria reciclandose
         *  ahora con un adaptador custom
         */
        WordAdapter Adapter = new WordAdapter(this, palabras,R.color.category_phrases);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(Adapter);
    }
}

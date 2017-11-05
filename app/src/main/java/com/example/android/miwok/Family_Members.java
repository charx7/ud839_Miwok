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


public class Family_Members extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family__members);
        ArrayList<Word> palabras = new ArrayList<Word>();
        /**
         * Añade la lista de palabras en ingles y miwok
         */
        palabras.add(new Word("father", "әpә"));
        palabras.add(new Word("mother", "әṭa"));
        palabras.add(new Word("son", "angsi"));
        palabras.add(new Word("daughter", "tune"));
        palabras.add(new Word("older brother", "taachi"));
        palabras.add(new Word("younger brother", "chalitti"));
        palabras.add(new Word("older sister", "teṭe"));
        palabras.add(new Word("younger sister", "kolliti"));
        palabras.add(new Word("grandmother", "ama"));
        palabras.add(new Word("grandfather", "paapa"));

        /**
         * Manera chevere de crear los views de una lista rapido y con memoria reciclandose
         *  ahora con un adaptador custom
         */
        WordAdapter Adapter = new WordAdapter(this, palabras);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(Adapter);
    }
}

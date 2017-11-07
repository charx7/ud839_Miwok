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
        palabras.add(new Word("father", "әpә", R.drawable.family_father));
        palabras.add(new Word("mother", "әṭa",R.drawable.family_mother));
        palabras.add(new Word("son", "angsi", R.drawable.family_son));
        palabras.add(new Word("daughter", "tune", R.drawable.family_daughter));
        palabras.add(new Word("older brother", "taachi", R.drawable.family_older_brother));
        palabras.add(new Word("younger brother", "chalitti", R.drawable.family_younger_brother));
        palabras.add(new Word("older sister", "teṭe", R.drawable.family_older_sister));
        palabras.add(new Word("younger sister", "kolliti", R.drawable.family_younger_sister));
        palabras.add(new Word("grandmother", "ama", R.drawable.family_grandmother));
        palabras.add(new Word("grandfather", "paapa", R.drawable.family_grandfather));

        /**
         * Manera chevere de crear los views de una lista rapido y con memoria reciclandose
         *  ahora con un adaptador custom
         */
        WordAdapter Adapter = new WordAdapter(this, palabras,R.color.category_family);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(Adapter);
    }
}

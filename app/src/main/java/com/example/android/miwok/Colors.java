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


public class Colors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);
        ArrayList<Word> palabras = new ArrayList<Word>();
        /**
         * Añade la lista de palabras en ingles y miwok
         */
        palabras.add(new Word("red", "weṭeṭṭi"));
        palabras.add(new Word("green", "chokokki"));
        palabras.add(new Word("brown", "ṭakaakki"));
        palabras.add(new Word("gray", "ṭopoppi"));
        palabras.add(new Word("black", "kululli"));
        palabras.add(new Word("white", "kelelli"));
        palabras.add(new Word("dusty yellow", "ṭopiisә"));
        palabras.add(new Word("mustard yellow", "chiwiiṭә"));

        /**
         * Manera chevere de crear los views de una lista rapido y con memoria reciclandose
         *  ahora con un adaptador custom
         */
        WordAdapter Adapter = new WordAdapter(this, palabras);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(Adapter);
    }
}

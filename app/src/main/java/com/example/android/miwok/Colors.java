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
        palabras.add(new Word("red", "weṭeṭṭi", R.drawable.color_red));
        palabras.add(new Word("green", "chokokki",R.drawable.color_green));
        palabras.add(new Word("brown", "ṭakaakki",R.drawable.color_brown));
        palabras.add(new Word("gray", "ṭopoppi",R.drawable.color_gray));
        palabras.add(new Word("black", "kululli",R.drawable.color_black));
        palabras.add(new Word("white", "kelelli",R.drawable.color_white));
        palabras.add(new Word("dusty yellow", "ṭopiisә",R.drawable.color_dusty_yellow));
        palabras.add(new Word("mustard yellow", "chiwiiṭә",R.drawable.color_mustard_yellow));

        /**
         * Manera chevere de crear los views de una lista rapido y con memoria reciclandose
         *  ahora con un adaptador custom
         */
        WordAdapter Adapter = new WordAdapter(this, palabras,R.color.category_colors);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(Adapter);
    }
}

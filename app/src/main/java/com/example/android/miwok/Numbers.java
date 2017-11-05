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

public class Numbers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        /*
        //**Creado un arreglo de palabras
        String[] cadenaNumeros= new String[10];
        cadenaNumeros[0] = "One";
        cadenaNumeros[1] = "Tow";
        cadenaNumeros[2] = "Three";
        cadenaNumeros[3] = "Four";
        cadenaNumeros[4] = "Five";
        cadenaNumeros[5] = "Six";
        cadenaNumeros[6] = "Seven";
        cadenaNumeros[7] = "Eight";
        cadenaNumeros[8] = "Nine";
        cadenaNumeros[9] = "Ten";
        //para mostrar comportamiento en el log
        Log.v("NumbersActivity","Palabra en el index 0 " + cadenaNumeros[0]);
        old
         */
        ArrayList<Word> palabras = new ArrayList<Word>();

        palabras.add(new Word("one", "lutti"));
        palabras.add(new Word("two", "otiiko"));
        palabras.add(new Word("three", "tolookosu"));
        palabras.add(new Word("four", "oyyisa"));
        palabras.add(new Word("five", "massokka"));
        palabras.add(new Word("six", "tommokaa"));
        palabras.add(new Word("seven", "kenekaku"));
        palabras.add(new Word("eight", "kawinta"));
        palabras.add(new Word("nine", "wo e"));
        palabras.add(new Word("ten", "na aacha"));


        /* Log.v("NumbersActivity", "Palabra en el indice " + palabras.get(0));

        /* Vieja version para agregar los views sin ser dinamicas (memoria fija)
        int i = 0;
        while ( i < numbersList.size()) {
            LinearLayout RootView = (LinearLayout) findViewById(R.id.rootView);
            TextView wordViewNow = new TextView(this);
            wordViewNow.setText(numbersList.get(i));
            RootView.addView(wordViewNow);
            i ++;
        }
        */
        /**
         * Manera chevere de crear los views de una lista rapido y con memoria reciclandose
         *  ahora con un adaptador custom
         */
        WordAdapter Adapter = new WordAdapter(this, palabras);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(Adapter);
    /*
    Codigo viejo sobre los listeners que muestra un widget
    public class NumbersClickListener implements View.OnClickListener{
        @Override
        public void onClick(View view){
            Toast.makeText(view.getContext(), "Open the list of numbers", Toast.LENGTH_SHORT).show();

        }
    }
    */
    }
}

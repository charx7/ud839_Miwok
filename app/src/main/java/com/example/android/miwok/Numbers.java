package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
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

        palabras.add(new Word("one", "lutti", R.drawable.number_one));
        palabras.add(new Word("two", "otiiko", R.drawable.number_two));
        palabras.add(new Word("three", "tolookosu",R.drawable.number_three));
        palabras.add(new Word("four", "oyyisa",R.drawable.number_four));
        palabras.add(new Word("five", "massokka",R.drawable.number_five));
        palabras.add(new Word("six", "tommokaa",R.drawable.number_six));
        palabras.add(new Word("seven", "kenekaku",R.drawable.number_seven));
        palabras.add(new Word("eight", "kawinta", R.drawable.number_eight));
        palabras.add(new Word("nine", "wo e",R.drawable.number_nine));
        palabras.add(new Word("ten", "na aacha",R.drawable.number_ten));


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
        WordAdapter Adapter = new WordAdapter(this, palabras, R.color.category_numbers);
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

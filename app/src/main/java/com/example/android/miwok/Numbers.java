package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
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
        ArrayList<String> numbersList = new ArrayList<String>();
        numbersList.add("One");
        numbersList.add("Two");
        numbersList.add("Three");
        numbersList.add("Four");
        numbersList.add("Five");
        numbersList.add("Six");
        numbersList.add("Seven");
        numbersList.add("Eight");
        numbersList.add("Nine");
        numbersList.add("Ten");
        Log.v("NumbersActivity", "Palabra en el indice " + numbersList.get(0));





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

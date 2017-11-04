package com.example.android.miwok;

import android.view.View;
import android.widget.Toast;
/**
 *Define un evento del tipo listener que implementa metodos mas no esetado heredados
 * de la clase View en este caso se sobreescribe (override el metodo onClick para que salte un
 * mensaje usando el widget Toast
 */

public class NumbersClickListener implements View.OnClickListener{
    @Override
    public void onClick(View view){
        Toast.makeText(view.getContext(),"Abrir la vista de numeros", Toast.LENGTH_SHORT)
                .show();
    }
}

/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);
        /**
         * Crea un nuevo objeto del tipo llamado clicklistener del tipo definido en el
         * constructor que esta en NumbersClickListener usando el constructor
         * NumbersClickListener clickListener = new NumbersClickListener; esta version crea
         * el objeto inline cuando se llama al metodo de la interfaz (old)
         * Encuentra la View que muestra la viste llamada numbers con el metodo find view byid
         */
        TextView numbersView = (TextView) findViewById(R.id.numbers);
        /**
         * Establece un metodo de una interfaz nueva que se va a llamar del objeto OnClickListener
         * y despues se llama al overrride para implementar el compartamiento del metodo OnClick
         * que empieza la actividad number (esto es para no hacer una nueva clase en un archivo
         * separado
         */
        numbersView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent numbersActivity = new Intent(MainActivity.this, Numbers.class);
                startActivity(numbersActivity);
            }
        });
    }

    /**codigo para llamar a otra view haciendo referencia a un xml
    public void openNumbersList(View view){
        Intent numbers = new Intent(this, Numbers.class); /* Hace referencia al .java
        de numbers
        startActivity(numbers);
     }
    **/
}


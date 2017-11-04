package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Numbers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
    }

    public class NumbersClickListener implements View.OnClickListener{
        @Override
        public void onClick(View view){
            Toast.makeText(view.getContext(), "Open the list of numbers", Toast.LENGTH_SHORT).show();

        }
    }
}

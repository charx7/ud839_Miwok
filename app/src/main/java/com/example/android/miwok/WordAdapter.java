package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by Charx on 04/11/2017.
 */

public class WordAdapter extends ArrayAdapter<Word>{

    private int mColorRssourceID;
    //constructor de la clase WordAdapter
    public WordAdapter(Activity context, ArrayList<Word> palabras, int ColorResourceID){
        super(context, 0 , palabras);
        mColorRssourceID = ColorResourceID;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Verifica si la vista existente esta siendo reusada, si no la reinfla con cosas nuevas
        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent ,false);
        }

        // Jala el par de palabras de la clase costum Word de la posicion en la lista
        Word currentWord = getItem(position);

        //Obtiene el ID y modifica la view con la informacion a desplegar correspondiente a palabra
        //en ingles
        TextView englishTextView = (TextView) listItemView.findViewById(R.id.palabraIngles);
        englishTextView.setText(currentWord.getDefaultTranslation());

        //Obtiene el ID y modifica la view con la informacion a desplegar correspondiente a palabra
        //en miwok
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.traduccion);
        miwokTextView.setText(currentWord.getMiwokTranslation());

        //Obtiene el ID del imageview y la modifica con la informacion a desplegar correspondiente
        //Primero verifica si el Word adapter contiene una imagen y si no skipea
        if (currentWord.getMimageResourceId()!= null ) {
            ImageView imageView = (ImageView) listItemView.findViewById(R.id.iconoPalabra);
            imageView.setImageResource(currentWord.getMimageResourceId());
        } else {
            ImageView imageView = (ImageView) listItemView.findViewById(R.id.iconoPalabra);
            imageView.setVisibility(View.GONE);
        }

        //Obtiene el objeto al que se le va a cambiar el color dinamicamente
        View textContainer = listItemView.findViewById(R.id.contenedor_palabra);
        //establece el int que contiene el color
        int color = ContextCompat.getColor(getContext(),mColorRssourceID);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}

package com.example.android.miwok;

/**
 * Created by Charx on 04/11/2017.
 */

public class Word {
    /**
     *  valores del ESTADO de la clase nueva words
     */
    private  String mdefaultTranslation;
    private  String mmikowTranslation;

    /**
     * CONSTRUCTOR de la clase Word
     */

    public Word(String englishWord , String miwokWord){
        mdefaultTranslation = englishWord;
        mmikowTranslation = miwokWord;
    }


    /**
     * METODOS de la clase Word para que saquemos las traducciones
     */
    public String getDefaultTranslation(){
        return mdefaultTranslation;
    }

    public String getMiwokTranslation(){
        return mmikowTranslation;
    }

}

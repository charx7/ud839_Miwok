package com.example.android.miwok;

public class Word {
    /**
     *  valores del ESTADO de la clase nueva words
     */
    private String mdefaultTranslation;
    private String mmikowTranslation;
    private Integer mimageResourceId;

    /**
     * CONSTRUCTOR de la clase Word
     */

    public Word(String englishWord , String miwokWord){
        mdefaultTranslation = englishWord;
        mmikowTranslation = miwokWord;
    }


    public Word(String englishWord , String miwokWord, Integer imageResourceId){
        mdefaultTranslation = englishWord;
        mmikowTranslation = miwokWord;
        mimageResourceId = imageResourceId;
    }

    /**
     * CONSTRUCTOR alterno para que la clase word tenga una imagen
     */

    /**
     * METODOS de la clase Word para que saquemos las traducciones
     */
    public String getDefaultTranslation(){

        return mdefaultTranslation;
    }

    public String getMiwokTranslation(){
        return mmikowTranslation;
    }

    public Integer getMimageResourceId() {
        return mimageResourceId;
    }

}

package com.example.android.miwok;

public class Word {

    private String mDefaultTranslation;


    private String mMiwokTranslation;

    private int mImageResourceId= No_IMAGE_PROVIDED;

    //Constant value that represents no image was provided
    private static  final int No_IMAGE_PROVIDED=-1;

    //Contains 2 parameters
    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    //Contains 3 parameters
    //@mDefaultTranslation is the english word
    //@mMiwokTranslation is the miwok translation of the english word
    //@mImageResourceId is the ID of the icon to display for that category
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId){
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation= miwokTranslation;
        mImageResourceId=imageResourceId;
    }
    public String getmDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getmMiwokTranslation(){

        return mMiwokTranslation;
    }

    public int getmImageResourceId(){
        return mImageResourceId;
    }

    public boolean hasImage(){
        return mImageResourceId!=No_IMAGE_PROVIDED;
    }
}
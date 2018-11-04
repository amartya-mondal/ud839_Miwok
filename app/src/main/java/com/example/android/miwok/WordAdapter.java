package com.example.android.miwok;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import java.util.ArrayList;


public class WordAdapter extends ArrayAdapter<Word> {

    private static final String LOG_TAG= WordAdapter.class.getSimpleName();

    //Resource id for the background color to be used
    private int mColorResourceId;

    public WordAdapter(Activity context, ArrayList<Word> words,int colorResourceId){

        super(context,0,words);
        mColorResourceId=colorResourceId;
    }




    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);

        }
        Word currentWord=getItem(position);
        //Found the English version
        TextView default_translation_text=(TextView) listItemView.findViewById(R.id.default_translation);
        default_translation_text.setText(currentWord.getmDefaultTranslation());

        //Found the miwok translation
        TextView miwok_translation_text=(TextView) listItemView.findViewById(R.id.miwok_translation);
        miwok_translation_text.setText(currentWord.getmMiwokTranslation());

        //Dealing with the image
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.display_image);
        if (currentWord.hasImage()){
            iconView.setImageResource(currentWord.getmImageResourceId());
            iconView.setVisibility(View.VISIBLE);

        }
        else{
            iconView.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color=ContextCompat.getColor(getContext(),mColorResourceId);
        textContainer.setBackgroundColor(color);
        return listItemView;


    }
}


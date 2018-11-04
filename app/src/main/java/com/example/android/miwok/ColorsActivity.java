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

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("brown","lutti",R.drawable.color_brown));
        words.add(new Word("dusty yellow","otiiko",R.drawable.color_dusty_yellow));
        words.add(new Word("gray","tolookosu",R.drawable.color_gray));
        words.add(new Word("green","oyyisa",R.drawable.color_green));
        words.add(new Word("mustard yellow","massokka",R.drawable.color_mustard_yellow));
        words.add(new Word("red","temmokka",R.drawable.color_red));
        words.add(new Word("white","kenekaku",R.drawable.color_white));

        WordAdapter adapter= new WordAdapter(this,words,R.color.category_colors);
        ListView listView = (ListView) findViewById(R.id.list_colors);
        listView.setAdapter(adapter);

    }
}

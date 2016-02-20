package com.example.fsmanji.retrofit;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

/**
 * Created by fsmanji on 2/19/16.
 */
public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ListView listView = new ListView(this);
        setContentView(listView);
    }
}

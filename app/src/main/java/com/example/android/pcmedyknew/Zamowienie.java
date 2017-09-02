package com.example.android.pcmedyknew;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

/**
 * Created by Mateusz Ławniczak on 02.09.2017.
 */

public class Zamowienie extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.formularz);

        EditText editName = (EditText) findViewById(R.id.edit_name);

    }
}

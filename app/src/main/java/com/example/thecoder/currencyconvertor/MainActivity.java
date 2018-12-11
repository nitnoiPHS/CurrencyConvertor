package com.example.thecoder.currencyconvertor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertToThb(View convert)
    {
        EditText euroNum = (EditText)findViewById(R.id.euroNum);
        double euro = Double.parseDouble(euroNum.getText().toString());
        double result = euro*34.5;
        Toast.makeText(this, result + " thb", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convertirDivisa(View vista){
        EditText etUsd = findViewById(R.id.etUsd);
        EditText etBob = findViewById(R.id.etBob);

        try {
            String usd = etUsd.getText().toString();
            String bob = etBob.getText().toString();

            if (TextUtils.isEmpty(bob)){
                float res = Float.parseFloat(usd) * (float)6.94;
                etBob.setText(res+"");
            }
            if (TextUtils.isEmpty(usd)){
                float res = Float.parseFloat(bob) / (float)6.94;
                etUsd.setText(res+"");
            }
        }
        catch (Exception E) {
            Toast.makeText(this, "Error" + E.getMessage(), Toast.LENGTH_LONG).show();
        }
    }
    public void clear(View vista){
        EditText etUsd = findViewById(R.id.etUsd);
        EditText etBob = findViewById(R.id.etBob);

        etUsd.getText().clear();
        etBob.getText().clear();
    }
}

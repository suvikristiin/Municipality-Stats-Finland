package com.example.statsfinland;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private EditText editTextMunicipalityName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        editTextMunicipalityName = findViewById(R.id.editTextMunicipalityName);

    }

    public void onSearcMunicipality(View view) {
        String municipalityName = editTextMunicipalityName.getText().toString();
        MunicipalityData.getInstance().setMunicipalityName(municipalityName);


        Intent intent = new Intent(this, MunicipalityDataActivity.class);
        startActivity(intent);
    }
}
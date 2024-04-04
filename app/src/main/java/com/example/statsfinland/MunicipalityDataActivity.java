package com.example.statsfinland;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MunicipalityDataActivity extends AppCompatActivity {
    TextView municipalityName;
    private MunicipalityData municipalityData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_municipality_data);
        municipalityName = findViewById(R.id.textViewMunicipalityName);

        municipalityName.setText(MunicipalityData.getInstance().getMunicipalityName());
    }
}
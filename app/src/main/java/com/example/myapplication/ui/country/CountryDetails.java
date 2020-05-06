package com.example.myapplication.ui.country;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.myapplication.R;

public class CountryDetails extends AppCompatActivity {

    TextView tvDetailedCountryName, tvDetailedCountryCases, tvDetailedCountryCasesToday, tvDetailedCountryDeaths, tvDetailedCountryDeathsToday,
            tvDetailedCountryRecovered, tvDetailedCountryActive, tvDetailedCountryCritical, tvDetailedCountryTests, tvDetailedCountryTestsPPM;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_details);

        tvDetailedCountryName = findViewById(R.id.tvDetailedCountryName);
        tvDetailedCountryCases = findViewById(R.id.tvDetailedCountryCases);
        tvDetailedCountryCasesToday = findViewById(R.id.tvDetailedCountryCasesToday);
        tvDetailedCountryDeaths = findViewById(R.id.tvDetailedCountryDeaths);
        tvDetailedCountryDeathsToday = findViewById(R.id.tvDetailedCountryDeathsToday);
        tvDetailedCountryRecovered = findViewById(R.id.tvDetailedCountryRecovered);
        tvDetailedCountryActive = findViewById(R.id.tvDetailedCountryActive);
        tvDetailedCountryCritical = findViewById(R.id.tvDetailedCountryCritical);
        tvDetailedCountryTests = findViewById(R.id.tvDetailedCountryTests);

        CovidCountry covidCountry = getIntent().getParcelableExtra("EXTRA_COVID");

        tvDetailedCountryName.setText(covidCountry.getmCovidCountry());
        tvDetailedCountryCases.setText(covidCountry.getmCases());
        tvDetailedCountryCasesToday.setText(covidCountry.getmTodayCases());
        tvDetailedCountryDeaths.setText(covidCountry.getmDeaths());
        tvDetailedCountryDeathsToday.setText(covidCountry.getmTodayDeaths());
        tvDetailedCountryRecovered.setText(covidCountry.getmRecovered());
        tvDetailedCountryActive.setText(covidCountry.getmActive());
        tvDetailedCountryCritical.setText(covidCountry.getmCritical());
        tvDetailedCountryTests.setText(covidCountry.getmTests());



    }
}

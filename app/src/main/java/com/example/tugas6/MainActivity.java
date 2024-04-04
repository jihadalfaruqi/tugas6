package com.example.tugas6;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private CountryAdapter countryAdapter;
    private List<Country> countryList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Isi daftar negara
        countryList = new ArrayList<>();
        countryList.add(new Country("Indonesia", "Deskripsi Indonesia", "4.5", "indo"));
        countryList.add(new Country("United States", "Deskripsi United States", "4.7", "us"));
        countryList.add(new Country("United Kingdom", "Deskripsi UK", "4.0", "uk"));
        countryList.add(new Country("China", "Deskripsi China", "4.2", "cina"));
        countryList.add(new Country("Brazil", "Deskripsi Brazil", "4.3", "brazil"));
        countryList.add(new Country("Australi", "Deskripsi Australi", "3.9", "australi"));
        countryList.add(new Country("India", "Deskripsi India", "3.8", "india"));
        countryList.add(new Country("Italy", "Deskripsi Italy", "3.7", "itali"));
        countryList.add(new Country("Russia", "Deskripsi Russia", "4.4", "rusia"));
        countryList.add(new Country("Germany", "Deskripsi Germany", "4.1", "jerman"));
        countryList.add(new Country("Japan", "Deskripsi Japan", "4.6", "japan"));
        countryList.add(new Country("Canada", "Deskripsi Canada", "3.6", "kanada"));
        countryList.add(new Country("South Korea", "Deskripsi South Korea", "3.5", "korsel"));
        countryList.add(new Country("France", "Deskripsi France", "3.4", "perancis"));
        countryList.add(new Country("Spain", "Deskripsi Spain", "3.3", "spanyol"));

        // Inisialisasi adapter dan set ke RecyclerView
        countryAdapter = new CountryAdapter(this, countryList);
        recyclerView.setAdapter(countryAdapter);
    }
}

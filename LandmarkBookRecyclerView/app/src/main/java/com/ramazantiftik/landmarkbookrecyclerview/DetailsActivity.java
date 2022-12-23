package com.ramazantiftik.landmarkbookrecyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.ramazantiftik.landmarkbookrecyclerview.databinding.ActivityDetailsBinding;

public class DetailsActivity extends AppCompatActivity {

    ActivityDetailsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailsBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        Intent intent=getIntent();
        Landmark selectedLandmark = (Landmark) intent.getSerializableExtra("Landmark");

        binding.nameText.setText("Name: "+selectedLandmark.getName());
        binding.countryText.setText("Country: "+selectedLandmark.getCountry());
        binding.imageView.setImageResource(selectedLandmark.getImage());
    }
}
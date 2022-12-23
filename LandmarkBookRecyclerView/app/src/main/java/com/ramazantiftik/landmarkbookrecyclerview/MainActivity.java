package com.ramazantiftik.landmarkbookrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.View;

import com.ramazantiftik.landmarkbookrecyclerview.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    ArrayList<Landmark> landmarkArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        landmarkArrayList=new ArrayList<Landmark>();

        //adapter
        binding.recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        LandmarkAdapter landmarkAdapter=new LandmarkAdapter(landmarkArrayList);
        binding.recyclerView.setAdapter(landmarkAdapter);

        //datas
        Landmark pisa=new Landmark("Pisa","Italy",R.drawable.pisa);
        Landmark colosseum=new Landmark("Colosseum","Italy",R.drawable.colosseum);
        Landmark eiffel=new Landmark("Eiffel","France",R.drawable.eiffel);
        Landmark london_bridge=new Landmark("London Bridge","United Kingdom",R.drawable.london_bridge);
        Landmark pyramides=new Landmark("Pyramides","Egypt",R.drawable.pyramides);
        Landmark statue_of_liberty=new Landmark("Statue of Liberty","USA",R.drawable.statue_of_liberty);
        Landmark great_wall=new Landmark("The Great Wall of China","China",R.drawable.the_great_wall_of_china);
        landmarkArrayList.add(pisa);
        landmarkArrayList.add(colosseum);
        landmarkArrayList.add(eiffel);
        landmarkArrayList.add(london_bridge);
        landmarkArrayList.add(pyramides);
        landmarkArrayList.add(statue_of_liberty);
        landmarkArrayList.add(great_wall);
    }
}
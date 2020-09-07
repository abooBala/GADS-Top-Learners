package com.example.toplearners;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import java.util.Collection;

public class MainActivity extends AppCompatActivity {

    private TabLayout mtabLayout;
    private ViewPager mViewPager;
    private ViewPagerAdapter mViewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mtabLayout = (TabLayout) findViewById(R.id.tablayout_id);
        mViewPager = (ViewPager) findViewById(R.id.viewpager_id);
        mViewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());

        //Add Fragment
        mViewPagerAdapter.AddFragment(new LearningFragment(), "Learning Leaders");
        mViewPagerAdapter.AddFragment(new SkillFragment(), "Skill IQ Leaders");
        mViewPager.setAdapter(mViewPagerAdapter);
        mtabLayout.setupWithViewPager(mViewPager);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setElevation(0);



    }
}
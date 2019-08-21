package com.ivan.mysubmissiontwo.activity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.ivan.mysubmissiontwo.R;
import com.ivan.mysubmissiontwo.adapter.ViewPagerAdapter;
import com.ivan.mysubmissiontwo.fragment.FistFragment;
import com.ivan.mysubmissiontwo.fragment.LastFragment;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.tabs)
    TabLayout tabLayout;
    @BindView(R.id.vp_tabs)
    ViewPager vpTabs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setupViewPager(vpTabs);
        tabLayout.setupWithViewPager(vpTabs);

        setupTab();
    }

    void setupTab() {
        TextView tvTabOne = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_title_tab, null);
        tvTabOne.setText("First");
        tabLayout.getTabAt(0).setCustomView(tvTabOne);

        TextView tvTabTwo = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_title_tab, null);
        tvTabTwo.setText("Before");
        tabLayout.getTabAt(1).setCustomView(tvTabTwo);
    }

    void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragment(new FistFragment(), "First");
        viewPagerAdapter.addFragment(new LastFragment(), "Last");
        viewPager.setAdapter(viewPagerAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_option, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.option_search:
                Toast.makeText(MainActivity.this, "Search Option", Toast.LENGTH_SHORT).show();
                break;
            case R.id.option_setting:
                Toast.makeText(MainActivity.this, "Setting Option", Toast.LENGTH_SHORT).show();
                break;
        }

        return true;
    }
}
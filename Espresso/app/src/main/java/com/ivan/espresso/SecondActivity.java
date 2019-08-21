package com.ivan.espresso;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView tvResultView;
    public static String EXTRA_INPUT = "extra_input";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Activity Second");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        tvResultView = findViewById(R.id.tv_result_view);
        String input = getIntent().getStringExtra(EXTRA_INPUT);
        tvResultView.setText(input);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}

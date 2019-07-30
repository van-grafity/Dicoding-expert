package com.ivan.myintentapp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MoveWithObjectActivity extends AppCompatActivity {
    @BindView(R.id.tv_object_received)
    TextView tvObjectActivity;
    public static final String EXTRA_PERSON = "extra_person";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_with_object);
        ButterKnife.bind(this);

        Person person = getIntent().getParcelableExtra(EXTRA_PERSON);
        String text = "Name : " + person.getName() + ", \nEmail : " + person.getEmail() + ", \nAge : " + person.getAge() + ", \nCity : " + person.getCity();
        tvObjectActivity.setText(text);
    }
}

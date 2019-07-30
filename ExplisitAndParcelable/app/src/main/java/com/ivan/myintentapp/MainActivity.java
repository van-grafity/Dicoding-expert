package com.ivan.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.btn_move_activity)
    void isMoveActivity() {
                Intent intent = new Intent(MainActivity.this, MoveActivity.class);
                startActivity(intent);
    }

    @OnClick(R.id.btn_move_activity_data)
    void isMoveActivityData() {
        Log.i("to_activity_data","Clicked");
        Intent intent = new Intent(MainActivity.this, MoveWithDataActivity.class);
        intent.putExtra(MoveWithDataActivity.EXTRA_NAME,"Dicoding Academy Boy");
        intent.putExtra(MoveWithDataActivity.EXTRA_AGE,0);
        startActivity(intent);
    }

    @OnClick(R.id.btn_move_activity_object)
    void isMoveActivityObject() {
        Log.i("to_activity_object","Clicked");
        Person person = new Person();
        person.setName("Dicoding Academy");
        person.setAge(26);
        person.setEmail("vanlaserblack@gmail.com");
        person.setCity("Batam, Kepulauan Riau");

        Intent intent = new Intent(MainActivity.this, MoveWithObjectActivity.class);
        intent.putExtra(MoveWithObjectActivity.EXTRA_PERSON, person);
        startActivity(intent);
    }
}

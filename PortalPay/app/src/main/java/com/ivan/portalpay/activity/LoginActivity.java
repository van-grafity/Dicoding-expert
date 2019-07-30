package com.ivan.portalpay.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ivan.portalpay.R;
import com.ivan.portalpay.presenter.LoginPresenter;

public class LoginActivity extends AppCompatActivity {
    LoginPresenter mLoginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(mLoginPresenter.constructLoginView());
    }
}

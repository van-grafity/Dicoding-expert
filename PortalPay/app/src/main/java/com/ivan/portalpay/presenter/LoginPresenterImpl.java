package com.ivan.portalpay.presenter;

import android.view.View;

import com.ivan.portalpay.view.LoginView;

public class LoginPresenterImpl implements LoginPresenter {
    LoginView mLoginView;

    @Override
    public void handleLogin(String username, String password) {
        mLoginView.initializeViewLogin();
    }

    @Override
    public View constructLoginView() {
        return mLoginView.constructLoginView();
    }
}

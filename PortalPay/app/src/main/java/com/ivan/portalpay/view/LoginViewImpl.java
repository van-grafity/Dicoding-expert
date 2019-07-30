package com.ivan.portalpay.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;

import com.ivan.portalpay.R;
import com.ivan.portalpay.presenter.LoginPresenter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LoginViewImpl implements LoginView {
    @BindView(R.id.et_username)
    EditText etUserName;
    @BindView(R.id.et_password)
    View mView;
    Context mContext;
    EditText etPassword;
    LoginPresenter mLoginPresenter;

    @Override
    public View constructLoginView() {
        FrameLayout parent = new FrameLayout(mContext);
        parent.setLayoutParams(new FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        mView = LayoutInflater.from(mContext).inflate(R.layout.activity_login, parent, true);
        ButterKnife.bind(mView);
        return mView;
    }

    @Override
    public void initializeViewLogin() {
        mLoginPresenter.handleLogin(etUserName.getText().toString().trim(), etPassword.getText().toString().trim());
    }
}

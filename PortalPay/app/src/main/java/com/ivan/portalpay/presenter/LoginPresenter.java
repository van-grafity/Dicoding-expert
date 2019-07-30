package com.ivan.portalpay.presenter;

import android.view.View;

public interface LoginPresenter {
    void handleLogin(String username, String password);
    View constructLoginView();
}

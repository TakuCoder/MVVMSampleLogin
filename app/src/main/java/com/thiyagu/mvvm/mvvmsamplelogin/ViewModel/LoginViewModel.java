package com.thiyagu.mvvm.mvvmsamplelogin.ViewModel;

import android.arch.lifecycle.ViewModel;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;

import com.thiyagu.mvvm.mvvmsamplelogin.Interface.LoginCallBack;
import com.thiyagu.mvvm.mvvmsamplelogin.Model.Data;

public class LoginViewModel extends ViewModel {

    private Data data;
    private LoginCallBack loginResultCallBacks;


    public LoginViewModel(LoginCallBack loginResultCallBacks) {

        this.loginResultCallBacks = loginResultCallBacks;

        this.data = new Data();
    }


    public TextWatcher getEmailTextWatcher() {
        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                data.setEmail(editable.toString());
            }
        };

    }


    public TextWatcher getPasswordtextwatcher() {
        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                data.setPassword(editable.toString());
            }
        };

    }

    public void OnLoginClicked(View view) {

        if (data.isValidCredentials()) {

            loginResultCallBacks.OnSuccess("Success");
        } else {

            loginResultCallBacks.OnSuccess("Failure");
        }
    }
}

package com.thiyagu.mvvm.mvvmsamplelogin.ViewModel;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.NonNull;

import com.thiyagu.mvvm.mvvmsamplelogin.Interface.LoginCallBack;


public class LoginViewModelFactory extends ViewModelProvider.NewInstanceFactory {


    private LoginCallBack loginResultCallBacks;


    public LoginViewModelFactory(LoginCallBack loginResultCallBacks) {
        this.loginResultCallBacks = loginResultCallBacks;

    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        return (T) new LoginViewModel(loginResultCallBacks);
    }
}

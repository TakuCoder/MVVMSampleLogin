package com.thiyagu.mvvm.mvvmsamplelogin;

import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.thiyagu.mvvm.mvvmsamplelogin.Interface.LoginCallBack;
import com.thiyagu.mvvm.mvvmsamplelogin.ViewModel.LoginViewModel;
import com.thiyagu.mvvm.mvvmsamplelogin.ViewModel.LoginViewModelFactory;
import com.thiyagu.mvvm.mvvmsamplelogin.databinding.ActivityLoginBinding;

public class ActivityLogin extends AppCompatActivity implements LoginCallBack {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ActivityLoginBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_login);
        activityMainBinding.setViewModel(ViewModelProviders.of(this, new LoginViewModelFactory(this)).get(LoginViewModel.class));
    }

    @Override
    public void OnSuccess(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();
    }

    @Override
    public void OnFailure(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();
    }
}

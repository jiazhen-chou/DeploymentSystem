package com.yeejoin.deloymentsystem.viewmodel;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;

import com.yeejoin.deloymentsystem.data.DataRepository;
import com.yeejoin.deloymentsystem.data.Injection;
import com.yeejoin.deloymentsystem.data.model.entity.Login;

/**
 * Created by maodou on 2017/12/6.
 */

public class LoginViewModel extends AndroidViewModel {
    private DataRepository repository = null;

    public LoginViewModel(@NonNull Application application) {
        super(application);
        repository = Injection.getDataRepository(application);
    }

    public LiveData<Login> login(String username, String password) {
        return repository.login(username,password);
    }

    public LiveData<Login> getLastLogin(){
        return repository.getLastLogin();
    }
}
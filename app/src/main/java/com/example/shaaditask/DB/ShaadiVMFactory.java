package com.example.shaaditask.DB;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.example.shaaditask.ShaadiViewModel;

public class ShaadiVMFactory implements ViewModelProvider.Factory {

    ShaadiRepository repository;
    public ShaadiVMFactory(ShaadiRepository repository){
        this.repository = repository;
    }


    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if(modelClass.isAssignableFrom(ShaadiViewModel.class)){
            return  (T) (Object) new ShaadiViewModel(repository);

        }
        throw new IllegalArgumentException("Unknown View Model class");

    }
    }

package com.example.shaaditask;

import com.example.shaaditask.DB.Example;
import com.example.shaaditask.DB.ShaadiRepository;

import java.util.List;

public class ShaadiViewModel {
    ShaadiRepository repository;
    List<Example> example = repository.examples;

    public ShaadiViewModel(ShaadiRepository repository){
        this.repository=repository;
    }

    public void insert(Example example){
        repository.insert(example);
    }
    public void update(Example example){
        repository.update(example);
    }





}

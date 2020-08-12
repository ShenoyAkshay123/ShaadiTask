package com.example.shaaditask.DB;

import java.util.List;

public class ShaadiRepository {

    private ShaadiDAO dao;
    public ShaadiRepository(ShaadiDAO dao){
        this.dao = dao;
    }

    public List<Example> examples = dao.getAllSubscribers();

    public void  insert(Example example){
        dao.insertSubscriber(example);
    }

    public void update(Example example){
        dao.updateSubscriber(example);
    }

}

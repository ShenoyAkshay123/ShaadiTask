package com.example.shaaditask.DB;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface ShaadiDAO {

    @Insert
     public Long insertSubscriber(Example example);

    @Update
    public void updateSubscriber(Example example);

    @Query(value = "Select * from shaadi_people_info")
    public List<Example> getAllSubscribers();

}

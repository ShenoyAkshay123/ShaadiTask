package com.example.shaaditask.DB;


import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.shaaditask.MainActivity;
import com.example.shaaditask.Model.Example;

import kotlin.jvm.Volatile;

@Database(entities = Example.class, version = 1)
abstract public class ShaadiDatabase extends RoomDatabase {
    public ShaadiDAO dao2;

    @Volatile
    private ShaadiDatabase INSTANCE = null;

    public ShaadiDatabase getInstance(Context context) {
        synchronized(ShaadiDatabase.this){

            ShaadiDatabase instance = INSTANCE;
            if(instance == null){
                instance = Room.databaseBuilder(
                        context,
                        ShaadiDatabase.class,
                        "shaadi_people_info"
                        ).build();
            }
            return instance;
        }

    }

}

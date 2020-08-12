package com.example.shaaditask.DB;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "shaadi_people_info")
public class Example {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    int id;
    @ColumnInfo(name = "age")
    int age;
    @ColumnInfo(name = "name")
    String name;
    @ColumnInfo(name = "email")
    String email;
    @ColumnInfo(name = "phone")
    String phone;
    @ColumnInfo(name = "gender")
    String gender;
    @ColumnInfo(name = "candidate_status")
    String status;





}

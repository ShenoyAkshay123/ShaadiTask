package com.example.shaaditask;

import android.util.Log;

import com.example.shaaditask.Model.Example;
import com.example.shaaditask.Model.Result;

import java.util.List;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ShaadiService {

    @GET("api/")
    Call<Example> getSpecificAlbums(@Query("results") int results);
}

package com.example.shaaditask;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.sqlite.db.SupportSQLiteOpenHelper;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.shaaditask.DB.ShaadiDAO;
import com.example.shaaditask.DB.ShaadiDatabase;
import com.example.shaaditask.DB.ShaadiRepository;
import com.example.shaaditask.DB.ShaadiVMFactory;
import com.example.shaaditask.Model.Example;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    RecyclerView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view = findViewById(R.id.recycle);
        ShaadiService retService = RetrofitInstance.getRetrofitInstance().create(ShaadiService.class);
        Call<Example> callAsync = retService.getSpecificAlbums(10);
        callAsync.enqueue(new Callback<Example>(){
            @Override
            public void onResponse(Call<Example> call, Response<Example> response) {
                Example result = response.body();
                ResultAdapter adapter  = new ResultAdapter(result.getResults(), getApplicationContext());
                view.setAdapter(adapter);
                view.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
//                    ShaadiDAO dao =ShaadiDatabase.getInstance(getApplicationContext()).dao2;
//
//                ShaadiRepository repository = new ShaadiRepository(dao);
//                ShaadiVMFactory factory = new ShaadiVMFactory(repository);
//                ShaadiViewModel viewModel;
//                Log.i(result.getResults().get(0).getEmail(), "Helloooo");

            }
            @Override
            public void onFailure(Call<Example> call, Throwable t) {

            }

        });
    }
}
package com.example.per6.jsontest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {


    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private StrikeAdapter adapter;
    private static final String TAG = "Asdf";
    private ArrayList<Strike> strikes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        strikes = new ArrayList();

        recyclerView = findViewById(R.id.recycler_view);

        layoutManager = new LinearLayoutManager(this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setItemAnimator(new DefaultItemAnimator());

        adapter = new StrikeAdapter(this, strikes);
        recyclerView.setAdapter((RecyclerView.Adapter) adapter);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://api.dronestre.am/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        DataMuseAPI api = retrofit.create(DataMuseAPI.class);

        Call<StrikeResponse> call = api.getStrikes();
        call.enqueue(new Callback<StrikeResponse>() {
            @Override
            public void onResponse(Call<StrikeResponse> call, Response<StrikeResponse> response) {
                Log.d(TAG, "onResponse: "+response.body().strike);
//                strikes.clear();
//                strikes.addAll(response.body().getStrike());
                adapter.setStrikes(response.body().getStrike());
                Log.d(TAG, "onResponse: "  + adapter.getItemCount());
                ((RecyclerView.Adapter)adapter).notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<StrikeResponse> call, Throwable t) {
                Toast.makeText(MainActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();

            }
        });
//        call.enqueue(new Callback<List<Word>> () {
//            @Override
//            public void onResponse(Call<List<Word>> call, Response<List<Word>> response) {
//                List<Word> words = response.body();
//                words.clear();
//                words.addAll(response.body());
////                Log.d(TAG, "onResponse: ");
//                ((RecyclerView.Adapter) adapter).notifyDataSetChanged();
//
//            }
//            @Override
//            public void onFailure(Call<List<Word>> call, Throwable t){
//                Toast.makeText(MainActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();
//            }
//
//
//        });
    }
}

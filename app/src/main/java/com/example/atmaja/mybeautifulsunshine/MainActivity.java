package com.example.atmaja.mybeautifulsunshine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mMainToday;
    private ImageView mMainWeather;
    private TextView mMainWeatherDesc;
    private TextView mMainTemperature;
    private RecyclerView mMainWeatherList;
    private LinearLayoutManager layoutManager;
    private WeatherAdapter mWeatherAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        initViewBaru();

    }


    private void initViewBaru() {
        mMainToday = (TextView) findViewById(R.id.txt_today);
        mMainWeather = (ImageView) findViewById(R.id.img_weather);
        mMainWeatherDesc = (TextView) findViewById(R.id.txt_weather_desc);
        mMainTemperature = (TextView) findViewById(R.id.txt_temperature);
        mMainWeatherList = (RecyclerView) findViewById(R.id.rv_weather_list);

        mMainToday.setText("Minggu");
        mMainWeather.setImageResource(R.mipmap.ic_weather);
        mMainTemperature.setText("32 Derjat");
        mMainWeatherDesc.setText("Petir Siang Bolong");

        layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false);
        mMainWeatherList.setLayoutManager(layoutManager);
        mMainWeatherList.setHasFixedSize(true);

        mWeatherAdapter = new WeatherAdapter();
        mMainWeatherList.setAdapter(mWeatherAdapter);
        //layoutManager = new GridLayoutManager(this, 1, LinearLayoutManager.VERTICAL, false);
    }
}

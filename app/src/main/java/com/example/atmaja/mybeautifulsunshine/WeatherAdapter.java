package com.example.atmaja.mybeautifulsunshine;

import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by atmaja on 13/08/17.
 */

public class WeatherAdapter extends RecyclerView.Adapter<WeatherAdapter.WeatherViewHolder> {

    @Override
    public WeatherViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View contentView = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_weather, parent, false);
        return new WeatherViewHolder(contentView);
    }

    @Override
    public void onBindViewHolder(WeatherViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 100;
    }

    public class WeatherViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private final TextView mWeatherDesc;
        private final ImageView mWeatherImage;
        private final TextView mWeatherDate;
        private final TextView mWeatherTemperature;
        private final CardView mWeatherCardView;

        public WeatherViewHolder(View itemView) {
            super(itemView);
            mWeatherImage = (ImageView) itemView.findViewById(R.id.img_adapter_weather);
            mWeatherDate = (TextView) itemView.findViewById(R.id.txt_adapter_weather_date);
            mWeatherDesc= (TextView) itemView.findViewById(R.id.txt_adapter_weather_desc);
            mWeatherTemperature = (TextView) itemView.findViewById(R.id.txt_adapter_weather_temperature);
            mWeatherCardView = (CardView) itemView.findViewById(R.id.cv_adapter_weather);

            mWeatherCardView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            Intent intent = new Intent(v.getContext(),DetailActivity.class);
            v.getContext().startActivity(intent);
        }
    }
}

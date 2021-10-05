package vn.edu.usth.weather;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class WeatherActivity extends AppCompatActivity {
}
    public static final String TAG = "WeatherActivity";
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        ForecastFragment VTV =  ForecastFragment.newInstance("", "");
        getSupportFragmentManager().beginTransaction().add(
                R.id.container, VTV).commit();
        Log.i("Weather", "onCreate: ");
    }

    private void commit() {
    }
    @Override
    public void onStart()
    {
        super.onStart();
        Log.i("Weather", "onStart: ");
    }
        @Override
        public void onResume() {

// Always call the superclass method first
            super.onResume();
            Log.i("Weather", "onResume: ");
        }
    @Override
    public void onPause() {
        super.onPause();
        Log.i("Weather", "onPause: ");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i("Weather", "onStop: ");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("Weather", "onDestroy: ");
    }
}

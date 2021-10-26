package vn.edu.usth.weather;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.user.weatherapp.R;

public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DetailFragment firstFragment = new DetailFragment();
        getSupportFragmentManager().beginTransaction().add( R.id.container, firstFragment).commit();


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Weather","onStart() called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Weather","onStop() called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Weather","onDestroy() called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Weather","onPause() called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Weather","onResume() called");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        Log.i("Weather","onCreate() called");
    }
}
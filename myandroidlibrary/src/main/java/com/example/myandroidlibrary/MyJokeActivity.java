package com.example.myandroidlibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class MyJokeActivity extends AppCompatActivity {

    public static String JOKE_CONTENT = "JOKE_CONTENT";
    String mJokeString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_joke);

        getSupportActionBar().setTitle("Joke");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent intentFromButtonClick = getIntent();
        if (intentFromButtonClick.hasExtra(JOKE_CONTENT)) {
            mJokeString = intentFromButtonClick.getStringExtra(JOKE_CONTENT);
        }
        TextView jokeTextView = (TextView)findViewById(R.id.jokeTextView);
        jokeTextView.setText(mJokeString);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}

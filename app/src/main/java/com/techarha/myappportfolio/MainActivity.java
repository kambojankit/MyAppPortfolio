package com.techarha.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button spotify, scores, library, build, reader, capstone;

        spotify = (Button) findViewById(R.id.spotify_btn);
        scores = (Button) findViewById(R.id.scores_btn);
        library = (Button) findViewById(R.id.library_btn);
        build = (Button) findViewById(R.id.build_btn);
        reader = (Button) findViewById(R.id.reader_btn);
        capstone = (Button) findViewById(R.id.capstone_btn);

        spotify.setOnClickListener(this);
        scores.setOnClickListener(this);
        library.setOnClickListener(this);
        build.setOnClickListener(this);
        reader.setOnClickListener(this);
        capstone.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onClick(View view) {

        String textData = null;

        switch (view.getId()){
            case R.id.spotify_btn:
                textData = "Spotify";
                break;
            case R.id.scores_btn:
                textData = "Scores";
                break;
            case R.id.library_btn:
                textData = "Library";
                break;
            case R.id.build_btn:
                textData = "Build It Bigger";
                break;
            case R.id.reader_btn:
                textData = "XYZ Reader";
                break;
            case R.id.capstone_btn:
                textData = "Capstone";
                break;

        }

        Toast.makeText(this,"This button will launch my "+ textData + " app!", Toast.LENGTH_SHORT).show();

    }
}

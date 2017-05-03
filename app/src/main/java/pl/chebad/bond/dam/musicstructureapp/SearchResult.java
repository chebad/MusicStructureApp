package pl.chebad.bond.dam.musicstructureapp;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SearchResult extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_result);

        //Receiving a written song tittle.
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        String songTittle = sharedPreferences.getString("songTittle", "No song.");
        TextView textTest = (TextView) findViewById(R.id.text_test);

        textTest.setText(songTittle);
    }
}

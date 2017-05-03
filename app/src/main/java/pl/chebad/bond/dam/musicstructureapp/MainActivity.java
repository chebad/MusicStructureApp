package pl.chebad.bond.dam.musicstructureapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button musicButton, albumsButton, searchButton, rankingButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        musicButton = (Button) findViewById(R.id.music_button);
        albumsButton = (Button) findViewById(R.id.albums_button);
        searchButton = (Button) findViewById(R.id.search_button);
        rankingButton = (Button) findViewById(R.id.ranking_button);

        onButtonClicked(musicButton, MusicActivity.class);
        onButtonClicked(albumsButton, AlbumActivity.class);
        onButtonClicked(searchButton, SearchActivity.class);
        onButtonClicked(rankingButton, Ranking.class);

    }

    /**
     * Simple jumping between activities.
     *
     * @param b Current button.
     * @param c In which activity we want to jump.
     */
    private void onButtonClicked(Button b, final Class c) {
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, c);
                startActivity(intent);
            }
        });
    }
}

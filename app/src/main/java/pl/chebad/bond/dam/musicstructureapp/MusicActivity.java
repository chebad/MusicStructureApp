package pl.chebad.bond.dam.musicstructureapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MusicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);

        ArrayList<List> songs = new ArrayList<>();

        songs.add(new List("Song tittle","Album name",R.drawable.song_icon));
        songs.add(new List("Song tittle","Album name",R.drawable.song_icon));
        songs.add(new List("Song tittle","Album name",R.drawable.song_icon));
        songs.add(new List("Song tittle","Album name",R.drawable.song_icon));
        songs.add(new List("Song tittle","Album name",R.drawable.song_icon));
        songs.add(new List("Song tittle","Album name",R.drawable.song_icon));
        songs.add(new List("Song tittle","Album name",R.drawable.song_icon));

        ListAdapter adapter = new ListAdapter(this,songs);
        ListView listView = (ListView) findViewById(R.id.list_item_music);
        listView.setAdapter(adapter);
    }
}


package pl.chebad.bond.dam.musicstructureapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class AlbumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);

        ArrayList<List> albums = new ArrayList<>();

        albums.add(new List("Album name",R.drawable.album_icon));
        albums.add(new List("Album name",R.drawable.album_icon));
        albums.add(new List("Album name",R.drawable.album_icon));
        albums.add(new List("Album name",R.drawable.album_icon));
        albums.add(new List("Album name",R.drawable.album_icon));
        albums.add(new List("Album name",R.drawable.album_icon));
        albums.add(new List("Album name",R.drawable.album_icon));
        albums.add(new List("Album name",R.drawable.album_icon));

        ListAdapter listAdapter =  new ListAdapter(this, albums);
        ListView listView = (ListView) findViewById(R.id.list_item_albums);

        listView.setAdapter(listAdapter);

    }
}

package pl.chebad.bond.dam.musicstructureapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Ranking extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ranking);

        ArrayList<List> rankingList= new ArrayList<>();

        rankingList.add(new List("Song tittle","Album tittle"));
        rankingList.add(new List("Song tittle","Album tittle"));
        rankingList.add(new List("Song tittle","Album tittle"));
        rankingList.add(new List("Song tittle","Album tittle"));
        rankingList.add(new List("Song tittle","Album tittle"));
        rankingList.add(new List("Song tittle","Album tittle"));
        rankingList.add(new List("Song tittle","Album tittle"));
        rankingList.add(new List("Song tittle","Album tittle"));


        RankingAdapter listAdapter =  new RankingAdapter(this, rankingList);
        ListView listView = (ListView) findViewById(R.id.ranking_list);

        listView.setAdapter(listAdapter);
    }
}

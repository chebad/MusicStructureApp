package pl.chebad.bond.dam.musicstructureapp;

import android.app.Activity;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Damian-Ja on 2017-05-03.
 */

public class RankingAdapter extends ArrayAdapter<List> {


    public RankingAdapter(Activity context, ArrayList<List> rankingList) {
        super(context, 0, rankingList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listRankingView = convertView;
        if (listRankingView == null) {
            listRankingView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_ranking, parent, false);
        }
        List currentList = getItem(position);
        TextView positionItem = (TextView) listRankingView.findViewById(R.id.song_position);
        TextView songTextView = (TextView) listRankingView.findViewById(R.id.ranking_text_view_1);
        TextView albumTextView = (TextView) listRankingView.findViewById(R.id.ranking_text_view_2);
        positionItem.setText(String.valueOf((position + 1)));
        songTextView.setText(currentList.getSongTittle());
        albumTextView.setText(currentList.getAlbumTittle());

        return listRankingView;
    }
}

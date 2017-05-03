package pl.chebad.bond.dam.musicstructureapp;

import android.app.Activity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Damian-Ja on 2017-04-30.
 */

public class ListAdapter  extends ArrayAdapter<List>{


    public ListAdapter(Activity context, ArrayList<List> songs) {
        super(context, 0, songs);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list, parent, false
            );
        }

        List currentList = getItem(position);
        TextView songTextView = (TextView) listItemView.findViewById(R.id.text_view_1);
        TextView albumTextView = (TextView) listItemView.findViewById(R.id.text_view_2);
        albumTextView.setText(currentList.getAlbumTittle());
        if(currentList.getSongTittle().equals("a")){
            songTextView.setVisibility(View.GONE);
            albumTextView.setGravity(Gravity.CENTER_VERTICAL);
        } else {
            songTextView.setText(currentList.getSongTittle());
        }

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        if(currentList.hasImage()){
            imageView.setImageResource(currentList.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        }

        return listItemView;
    }
}

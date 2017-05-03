package pl.chebad.bond.dam.musicstructureapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class SearchActivity extends AppCompatActivity {

    private String songTittle;
    private ImageButton imageButton;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        imageButton = (ImageButton) findViewById(R.id.button_search);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                editText = (EditText) findViewById(R.id.edit_text_field_search);
                songTittle = editText.getText().toString();

                //Checking if edit text is empty. If it's returning error.
                if (TextUtils.isEmpty(songTittle)) {
                    editText.setError("This field cannot be empty!");
                } else {
                    //Passing the name of written song.
                    SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(SearchActivity.this);
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putString("songTittle", songTittle);
                    editor.commit();

                    Intent newIntent = new Intent(SearchActivity.this, SearchResult.class);
                    startActivity(newIntent);
                }
            }
        });
    }
}
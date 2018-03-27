package com.example.user.test1.adapter;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.user.test1.R;
import com.example.user.test1.model.Bird;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/**
 * Created by User on 25/3/2561.
 */

public class BirdListAdapter extends ArrayAdapter<Bird> {

    private Context mContext;
    private int mResource;
    private ArrayList<Bird> mBirdsList;


    public BirdListAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Bird> objects) {
        super(context, resource, objects);

        this.mContext = context;
        this.mResource = resource;
        this.mBirdsList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(mContext);

        View v = inflater.inflate(mResource, null);

        ImageView birdImageView = v.findViewById(R.id.bird_image_view);
        TextView birdNameTextView = v.findViewById(R.id.bird_name_text_view);

        Bird b = mBirdsList.get(position);

        birdNameTextView.setText(b.name);

        AssetManager am = mContext.getAssets();
        if (b.picture != null) {
            try {
                InputStream is = am.open(b.picture);

                Drawable d = Drawable.createFromStream(is, null);
                birdImageView.setImageDrawable(d);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return v;
    }
}

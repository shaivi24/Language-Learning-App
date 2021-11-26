package com.example.miwok;

import android.app.Activity;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import org.w3c.dom.Text;

import java.util.List;

public class WordAdapter extends ArrayAdapter<Word> {

    private int color;

    public WordAdapter(Activity context, List<Word> words, int color) {
        super(context,0, words);
        this.color = color;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v = convertView;
        if (v == null) {
            v = LayoutInflater.from(getContext()).inflate(R.layout.list, parent, false);
        }

        Word w = getItem(position);

        ImageView i = (ImageView) v.findViewById(R.id.i);
        i.setImageResource(w.getId());
        if(w.getId()==0)
            i.setVisibility(View.GONE);

        TextView t1 = (TextView) v.findViewById(R.id.tv1);
        t1.setText(w.getMiwok());

        TextView t2 = (TextView) v.findViewById(R.id.tv2);
        t2.setText(w.getEnglish());

        LinearLayout ll = (LinearLayout) v.findViewById(R.id.ll);
        int c = ContextCompat.getColor(getContext(), color);
        ll.setBackgroundColor(c);

        return v;
    }
}

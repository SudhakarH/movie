package com.example.movie;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView movie1;
    private TextView movie2;
    private TextView movie3;
    private CalendarView cal;
    private RatingBar rate;
    private ImageView pic1;
    private ImageView pic2;
    private ImageView pic3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        movie1 = findViewById(R.id.page);
        movie2 = findViewById(R.id.page2);
        movie3 = findViewById(R.id.page3);
        pic1 = findViewById(R.id.img1);
        pic2 = findViewById(R.id.img2);
        pic3 = findViewById(R.id.img3);
        cal = findViewById(R.id.calen);
        rate = findViewById(R.id.rating);
        cal.setVisibility(View.INVISIBLE);
        rate.setVisibility(View.INVISIBLE);
    }
    public void nextPage1(View view) {
        movie2.setText(" ");
        movie3.setText(" ");
        cal.setVisibility(View.VISIBLE);
        rate.setVisibility(View.VISIBLE);
        pic2.setVisibility(View.INVISIBLE);
        pic3.setVisibility(View.INVISIBLE);
    }
    public void nextPage2(View view) {
        movie1.setText(" ");
        movie3.setText(" ");
        cal.setVisibility(View.VISIBLE);
        rate.setVisibility(View.VISIBLE);
        pic1.setVisibility(View.INVISIBLE);
        pic3.setVisibility(View.INVISIBLE);
    }
    public void nextPage3(View view) {
        movie2.setText(" ");
        movie1.setText(" ");
        cal.setVisibility(View.VISIBLE);
        rate.setVisibility(View.VISIBLE);
        pic1.setVisibility(View.INVISIBLE);
        pic2.setVisibility(View.INVISIBLE);
    }
}

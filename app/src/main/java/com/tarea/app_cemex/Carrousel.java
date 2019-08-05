package com.tarea.app_cemex;

import android.content.Intent;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.MenuItem;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.Toast;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageClickListener;
import com.synnapps.carouselview.ImageListener;

public class Carrousel extends AppCompatActivity {
    //carousel
    private int[] mInts = new int[]{
            R.drawable.img1,R.drawable.img2,R.drawable.img3

    };
    private String[] mImagenesTitle = new String[]{
            "carosel", "image2", "iamgen3"
    };
    //fin

    GridLayout mainGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Carrolusel

        CarouselView carouselView = findViewById(R.id.carrousel);
        carouselView.setPageCount(mInts.length);
        carouselView.setImageListener(new ImageListener() {
            @Override
            public void setImageForPosition(int position, ImageView imageView) {
                imageView.setImageResource(mInts[position]);

            }
        });
        carouselView.setImageClickListener(new ImageClickListener() {
            @Override
            public void onClick(int position) {
                Toast.makeText(Carrousel.this,mImagenesTitle[position],Toast.LENGTH_SHORT).show();
            }
        });

        //fin

        mainGrid = (GridLayout) findViewById(R.id.mainGrid);

        //Set Event
        //setToggleEvent(mainGrid);
    }

    private void setToggleEvent(GridLayout mainGrid) {
        //Loop all child item of Main Grid
        for (int i = 0; i < mainGrid.getChildCount(); i++) {
            //You can see , all child item is CardView , so we just cast object to CardView
            final CardView cardView = (CardView) mainGrid.getChildAt(i);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (cardView.getCardBackgroundColor().getDefaultColor() == -1) {
                        //Change background color
                        cardView.setCardBackgroundColor(Color.parseColor("#FF6F00"));
                        Toast.makeText(Carrousel.this, "State : True", Toast.LENGTH_SHORT).show();

                    } else {
                        //Change background color
                        cardView.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                        Toast.makeText(Carrousel.this, "State : False", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }
}

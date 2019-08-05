package com.tarea.app_cemex;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.ImageView;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageClickListener;
import com.synnapps.carouselview.ImageListener;


/**
 * A simple {@link Fragment} subclass.
 */
public class CarruselFragment extends Fragment {

    //carousel
    private int[] mInts = new int[]{
            R.drawable.img1,R.drawable.img2,R.drawable.img3

    };
    private String[] mImagenesTitle = new String[]{
            "carosel", "image2", "iamgen3"
    };
    //fin

    GridLayout mainGrid;


    public CarruselFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {




        // Inflate the layout for this fragment
         View view = inflater.inflate(R.layout.fragment_carrusel, container, false);





        //Carrolusel



        CarouselView carouselView = view.findViewById(R.id.imagenes_carrusel);
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


                //(CarruselFragment.this,mImagenesTitle[position],Toast.LENGTH_SHORT)
            }
        });

        //fin



        return view;


    }

    }



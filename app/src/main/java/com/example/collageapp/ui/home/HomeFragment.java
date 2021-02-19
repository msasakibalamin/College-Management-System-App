package com.example.collageapp.ui.home;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.collageapp.R;
import com.smarteist.autoimageslider.DefaultSliderView;
import com.smarteist.autoimageslider.IndicatorAnimations;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderLayout;


public class HomeFragment extends Fragment {

    private SliderLayout sliderLayout;
    private ImageView map;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view =  inflater.inflate(R.layout.fragment_home, container, false);

       sliderLayout = view.findViewById(R.id.slider);
       sliderLayout.setIndicatorAnimation(IndicatorAnimations.FILL);
       sliderLayout.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
       sliderLayout.setScrollTimeInSec(1);

       setSliderViews();

       map = view.findViewById(R.id.map);
       map.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               openMap();
           }
       });
       return view;
    }

    private void openMap() {
        Uri uri = Uri.parse("geo:0, 0?q=Dinajpur Polytechnic Institute");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        intent.setPackage("com.google.android.apps.maps");
        startActivity(intent);
    }

    private void setSliderViews() {

        for (int i = 0; i< 5; i++){
            DefaultSliderView sliderView = new DefaultSliderView(getContext());

            switch (i){
                case 0:
                    sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/admin-ecb81.appspot.com/o/slider%2Fdpi.jpg?alt=media&token=17141177-cd24-44e8-be77-72a520bd6e36");
                    break;

                case 1:
                    sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/admin-ecb81.appspot.com/o/slider%2Fgov.jpg?alt=media&token=a83d528c-feb5-4897-a4f8-1fd184c45633");
                    break;

                case 2:
                    sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/admin-ecb81.appspot.com/o/slider%2FPrincipal.jpg?alt=media&token=bd3f369e-c8de-4b0d-98fc-ec6d71fa938d");
                    break;

                case 3:
                    sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/admin-ecb81.appspot.com/o/slider%2Fstudent.jpg?alt=media&token=61671785-f217-412c-83fe-c4b73da001a1");
                    break;

                case 4:
                    sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/admin-ecb81.appspot.com/o/slider%2Faccdmy.jpg?alt=media&token=bebeee0f-3272-4394-afa9-2ce1773bbe6c");
                    break;


            }

            sliderView.setImageScaleType(ImageView.ScaleType.CENTER_CROP);

            sliderLayout.addSliderView(sliderView);
        }
    }
}
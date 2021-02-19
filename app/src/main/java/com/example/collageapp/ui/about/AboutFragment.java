package com.example.collageapp.ui.about;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.collageapp.R;

import java.util.ArrayList;
import java.util.List;

public class AboutFragment extends Fragment {

    private ViewPager viewPager;
    private BanchAdapter adapter;
    private List<BranchModel> list;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_about, container, false);

        list = new ArrayList<>();
        list.add(new BranchModel(R.drawable.ic_computer, "Computer Science","Computer Science and Engineering started in year 2017. At present 1st Shift is 100 students & 2nd Shift is 100 students"));
        list.add(new BranchModel(R.drawable.ic_settings, "Mechanical Production","Mechanical Production and Engineering started in year 2017. At present 1st Shift is 100 students & 2nd Shift is 100 students"));

        adapter = new BanchAdapter(getContext(),list);

        viewPager = view.findViewById(R.id.viewPage);

        viewPager.setAdapter(adapter);

        ImageView imageView = view.findViewById(R.id.collage_image);

        Glide.with(getContext())
                .load("https://firebasestorage.googleapis.com/v0/b/admin-ecb81.appspot.com/o/slider%2Faccdmy.jpg?alt=media&token=bebeee0f-3272-4394-afa9-2ce1773bbe6c")
                .into(imageView);

        return  view;
    }
}
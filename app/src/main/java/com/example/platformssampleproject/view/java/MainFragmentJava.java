package com.example.platformssampleproject.view.java;

import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.platformssampleproject.R;
import com.example.platformssampleproject.view.kotlin.MainActivityKotlin;
import com.example.platformssampleproject.viewmodel.java.MainViewModelJava;

public class MainFragmentJava extends Fragment {

          private MainViewModelJava mViewModel;

          Button button;
          TextView textView;

          Button nextButton;

          public static MainFragmentJava newInstance() {
                    return new MainFragmentJava();
          }

          @Override
          public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                                   @Nullable Bundle savedInstanceState) {
                    return inflater.inflate(R.layout.fragment_main_fragment_java, container, false);
          }

          @Override
          public void onActivityCreated(@Nullable Bundle savedInstanceState) {
                    super.onActivityCreated(savedInstanceState);
                    mViewModel = new ViewModelProvider(this).get(MainViewModelJava.class);

                    button=getView().findViewById(R.id.fragmentButton_java);
                    textView=getView().findViewById(R.id.fragmentTextView_java);
                    nextButton=getView().findViewById(R.id.next);


    button.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
                    textView.setText(mViewModel.getRandomUserdata());
          }
    });

    nextButton.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {
                        Intent intent = new Intent(view.getContext(), MainActivityKotlin.class);
                        getView().getContext().startActivity(intent);
              }
    });
          }

}
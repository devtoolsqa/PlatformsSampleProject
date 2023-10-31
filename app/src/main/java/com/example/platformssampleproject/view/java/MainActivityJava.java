package com.example.platformssampleproject.view.java;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.platformssampleproject.R;

public class MainActivityJava extends AppCompatActivity {

          @Override
          protected void onCreate(Bundle savedInstanceState) {
                    super.onCreate(savedInstanceState);
                    setContentView(R.layout.activity_main_java);
                    FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.fragment_container_view_java, new MainFragmentJava());
                    transaction.addToBackStack(null);
                    transaction.commit();
          }
}
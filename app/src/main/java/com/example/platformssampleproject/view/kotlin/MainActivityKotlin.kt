package com.example.platformssampleproject.view.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.add
import androidx.fragment.app.commit
import com.example.platformssampleproject.R

class MainActivityKotlin : AppCompatActivity((R.layout.activity_main)) {
          override fun onCreate(savedInstanceState: Bundle?) {
                    super.onCreate(savedInstanceState)
                    if (savedInstanceState == null) {

                              // Adds our fragment
                              supportFragmentManager.commit {
                                        setReorderingAllowed(true)
                                        add<MainFragmentKoltin>(R.id.fragment_container_view)
                              }
                    }
          }
}
package com.example.platformssampleproject.viewmodel.kotlin

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.platformssampleproject.model.User

import java.util.Random


class MainViewModelKotlin : ViewModel() {
          private val users=listOf(
                    User("A",1,"M",25),
                    User("B",2,"F",26),
                    User("C",3,"M",30),
                    User("D",4,"M",55),
                    User("E",5,"F",31)
          )
          val uiTextLiveData = MutableLiveData<String>()

          fun getRandomUserData() {
                    val user = users[Random().nextInt(users.size)]

                    uiTextLiveData.postValue("Name : ${user.name} \n Id :${user.id}. Age : ${user.age} \n Sex : ${user.sex}" )
          }
}
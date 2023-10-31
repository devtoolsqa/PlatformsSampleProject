package com.example.platformssampleproject.viewmodel.java;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.platformssampleproject.model.User;

import java.util.ArrayList;
import java.util.Random;

public class MainViewModelJava extends ViewModel {
          // TODO: Implement the ViewModel


 public String getRandomUserdata() {
           ArrayList<User> users = new ArrayList<User>();
           users.add(new User("A", 1, "M", 25));
           users.add(new User("B", 2, "M", 55));
           users.add(new User("C", 3, "M", 35));
           users.add(new User("D", 4, "M", 45));
           users.add(new User("E", 5, "M", 40));
           Random rand = new Random();
           User user=users.get(rand.nextInt(users.size()));
           return "Name "+user.getName()+"\n"+"Age :"+user.getAge()+" \n"+" Sex :"+user.getSex();
 }




}
package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.p1.Test.User;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        User user = new User("Ulug'bek","Gulyamov",21);
        User user2 = new User("Ulug'bek","Gulyamov",21);
        System.out.println(user2);


    }
}
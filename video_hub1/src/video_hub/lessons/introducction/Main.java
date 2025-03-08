package video_hub.lessons.introducction;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //getAge()
       // L1 l1 = new L1();
//        int age = l1.getAge();
//        System.out.print("Your age is: " +age);

//getUserDetail()
//        Object[] userDetail = l1.getUserDetail();
//        String name = (String) userDetail[0];
//        String surname = (String) userDetail[1];
//        int age = (Integer) userDetail[2];
//        System.out.println(name + " " +surname + " " +age);

        //getUser

//        User user = getUser();
//        String name = user.name;
//        String surname = user.surname;
//        int age = user.age;
//       // System.out.println(name + " " + surname + " " +age);
//        System.out.println(user.name + " " + user.surname + " " +user.age);


        User user = new User();
        user.name = "Ulug'bek";
        user.surname = "Gulyamov";
        user.age = 22;
       // System.out.println(user.name + " " + user.surname + " " + user.age);
user.name = "Asror";
user.surname = "Asqarov";
       // System.out.println(user.name + " " + user.surname + " " + user.age);

        System.out.println(user.nameToUpper());
        System.out.println(user.toString());





    }

    public  static User getUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.next();
        System.out.print("Enter your surname: ");
        String surname = scanner.next();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        User user = new User();
        user.name = name;
        user.surname = surname;
        user.age = age;
        return user;
    }




}

package video_hub.lessons.introducction;

import java.util.Scanner;

public class L1 {

    //getAge()
    public int getAge(){
        System.out.print("Enter your age: ");
        int age = new Scanner(System.in).nextInt();
        return age;
    }

  public Object[] getUserDetail(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.next();
      System.out.println("Enter your surname: ");
      String surname = scanner.next();
      System.out.println("Enter your age: ");
int age = scanner.nextInt();
Object[] obj = new Object[3];
obj[0] = name;
obj[1] = surname;
obj[2] = age;
return obj;

  }









}

import practice.*;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

// MyFunction myFunction = new MyFunction() {
//     @Override
//     public boolean test(Integer a) {
//         if(a % 2 == 0){
//             return true;
//         }else {
//             return false;
//         }
//     }
// };
//
//        System.out.println(myFunction.test(12));
//
//
//        Practice2 practice2 = new Practice2() {
//            @Override
//            public boolean test2(String a) {
//                return a.startsWith("998");
//            }
//
//            @Override
//            public boolean test3(String a) {
//                return a.endsWith("35-35");
//            }
//        };
//        System.out.println(practice2.test3("35-35"));
//        System.out.println(practice2.test2("35-35"));


//  MyConsumer myConsumer = new MyConsumer() {
//      @Override
//      public void accept(Integer age) {
//          if(age > 18){
//              System.out.println("Welcome homie!");
//          }else {
//              System.out.println("Get lost!");
//          }
//      }
//  };
//        myConsumer.accept(19);


//        Mysupplier mysupplier = new Mysupplier() {
//            @Override
//            public User get() {
//                Scanner scanner = new Scanner(System.in);
//                System.out.println("Ismingizni kiriting: ");
//                String name = scanner.nextLine();
//                System.out.println("Familiyangizni kritimng: ");
//                String surname = scanner.nextLine();
//                return new User(name, surname);
//
//
//            }
//        };
//        System.out.println(mysupplier.get());


  MyFunction myFunction = new MyFunction() {
      @Override
      public boolean test(Integer a) {
          return false;
      }

      @Override
      public String apply(Integer n) {
          return String.valueOf(n);
      }
  };

        System.out.println(myFunction.apply(123));


    }
}
package tanlash_operatorlari;

public class Main {
    public static void main(String[] args) {


        //todo tanlash operatordan methodlar

        //6

  Tasks tasks = new Tasks();
       int unit = 2;
       double length = 4.4;
       double result = tasks.converToMeters(unit,length);
        if (result != 0) {
            System.out.println("6-misol  \nNatija: " + result);
        }


     //7

int unit2 = 4; // Tonna
    double weight = 2.5; // Og'irlik
    double result2 = tasks.convertToKilograms(unit2, weight);

        if (result != 0) {
        System.out.println("7 - misol Og'irlik kilogrammlarda: " + result2);
    }

//8

        System.out.println("8 - misol  \nNatija ");
        System.out.println(tasks.getDate(1, 2));

      //9

        System.out.println("9 - misol  \nNatija");
        tasks.calculateNextDate(31,12);

//16

        int age = 43;
        System.out.println("16 - Misol \n"  + tasks.ageInWords(age));

        //17

int masala = 17;
        System.out.println("17- Misol \n" +tasks.exercisesInWords(masala));

//18
        int digit = 550;
        System.out.println("18 - Misol \n" +tasks.convertToWords(digit));

//19

        int currentYear = 2025;
        System.out.println("19 - Misol \n" +tasks.findMuchal(currentYear));




    }
}

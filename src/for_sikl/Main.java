package for_sikl;

public class Main {
    public static void main(String[] args) {

        Task2 task2 = new Task2();

        //1
        System.out.println("1 - misol ");
        int k = 4;
        int n = 2;
        task2.printKTimes(k,n);

//2

int a = 5;
int b = 10;
        System.out.println("2 - Misol \n");
        System.out.println(task2.printNumbersAndCount(a, b));

        //3

        System.out.println("3 - Misol \n");
        task2.printNumbersAndCount2(a,b);

//4

        System.out.println("4 - Misol \n");
        double pricePerKg = 3.5;
        task2.printCandyPrices(pricePerKg);

//5

        System.out.println("5 - Misol \n");
        double pricePerKg2 = 3.5;
        task2.printCandyPrices2(pricePerKg2);

     //6

        System.out.println("6 - Misol \n");
        double pricePerKg3 = 10.5; // 1 kg konfet narxi (misol uchun)
        task2.printCandyPrices3(pricePerKg3);


//7

        System.out.println("7 - Misol \n");
         // Tugash qiymati
        int sum = task2.calculateSum(a, b);
        System.out.println("A dan B gacha bo'lgan sonlar yig'indisi: " + sum);

//8

        System.out.println("8 - Misol \n");
        System.out.println(task2.multiplication(1, 3));

        //9

        System.out.println("9 - Misol \n");
        int result = task2.sumOfSquares(1, 2); // Methodni chaqiramiz
        System.out.println("Kvadratlar yig'indisi: " + result);


        //10

        System.out.println("10 - Misol \n");
        int n2 = 5; // Example input
        double result2 = task2.calculateHarmonicSum(n2);
        System.out.println("The harmonic sum for n = " + n2 + " is: " + result2);


//12

        System.out.println("12 - Misol \n");
        int n3 = 5;
        double result3 = task2.calculateProduct(n3);
        System.out.println("Ko'paytma: " + result3);


//13

        System.out.println("13 - Misol \n");
        System.out.println(task2.calculateSum(n3));

        //14
        System.out.println("14 - Misol \n");
        task2.printSquares(n3);


//15

            System.out.println("15 - Misol \n");

            double result4 = task2.power(2, 3);//2 ning 3 - darajasi
            System.out.println(result4);


//16

            System.out.println("16 - Misol \n");
            task2.printPowers(2.0, 5);



            //17
            System.out.println("17 - Misol \n");
            double result5 = task2.power2(2.5, 3);
            System.out.println(result5);

//18
        System.out.println("18 - Misol \n");
        System.out.println("natija : " +task2.calculateSum(5,2.0));

//19

        System.out.println("19 - Misol \n");
        System.out.println("Natija: " +task2.calculateFactorial(3));


        //20

        System.out.println("20 - Misol \n");
        System.out.println("Natija yigindi: " +task2.calculateSum2(2));


//21

        System.out.println("21 - Misol \n");
        System.out.println("Natija: " +task2.calculateSum3(5));


//22


        System.out.println("22 - Misol \n");
        System.out.println("Natija: " +task2.calculateSum4(5,1.0d));


//25

        System.out.println("25 - Misol \n");
        System.out.println("Natija: " +task2.calculateSeries(2.0d,5));

//39

        System.out.println("39 - Misol \n");
        task2.printNumbersInRange(1,5);

        //40


        System.out.println("40 - Misol\n");
task2.printNumbersWithFrequency(1,3);




























    }
}

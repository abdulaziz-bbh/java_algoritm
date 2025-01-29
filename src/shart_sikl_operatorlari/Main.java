package shart_sikl_operatorlari;

public class Main {
    public static void main(String[] args) {


//1

        Task3 task3 = new Task3();
        System.out.println("1 - misol \n");
        System.out.println(task3.findEmptySegment(17, 5));
        System.out.println("2 - misol \n");
        System.out.println(task3.countSegments(17,5));
        System.out.println("3 - misol \n");
        int N = 17;
        int K = 5;
        int[] result = task3.divideWithRemainder(N, K);
        System.out.println("Butun qismi: " + result[0]);
        System.out.println("Qoldiq: " + result[1]);
        System.out.println("4 - misol \n");
        System.out.println(task3.isPowerOfThree(27));
        System.out.println("5 - misol \n");
        int n = 16;
        int k = task3.findExponent(n);
        if (k != -1) {
            System.out.println("n = 2^" + k);
        } else {
            System.out.println("Berilgan n soni 2 ning darajasi emas.");
        }
        System.out.println("6 - misol \n");
        System.out.println(task3.calculateNLL(8));
        System.out.println("7 - misol \n");
        int result2 = task3.findSmallestK(10);
        System.out.println("K: " + result2);
        System.out.println("8 - misol \n");
        System.out.println(task3.findLargestK(10));
        System.out.println("9 - misol \n");
        System.out.println(task3.findSmallestK2(10));
        System.out.println("10 - misol \n");
        System.out.println(task3.findLargestK2(10));
        System.out.println("11 - misol \n");
task3.findSmallestK3(1);
task3.findSmallestK3(0);
        System.out.println("12 - misol \n");
task3.findLargestK3(10);
task3.findLargestK3(20);
        System.out.println("13 - misol \n");
task3.findSmallestK(2.5);
        System.out.println("14 - misol \n");
task3.findMaxK(2.5);
        System.out.println("15 - misol \n");
task3.calculateMonths(100000,5);



    }
}

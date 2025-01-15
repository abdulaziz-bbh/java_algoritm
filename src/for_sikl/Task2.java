package for_sikl;

public class Task2 {

public void printKTimes(int k, int n){
    if(n <= 0){
        System.out.println("n musbat bo'lishi kerak. ");
        return;
    }

    for(int i = 0;i < n;i++){
        System.out.println(k);
    }
}

//2

    public int printNumbersAndCount(int a,int b){
    int count = 0;
    for(int i = a;i <= b;i++){
        System.out.println(i + " ");
        count++;
    }
        System.out.println();
        System.out.println("Jami chiqarilgan sonlar soni: " +count);
return count;
    }


//3

    public  void printNumbersAndCount2(int a, int b) {
        if (a >= b) {
            System.out.println("a soni b dan kichik bo'lishi kerak.");
            return;
        }

        int count = 0;
        System.out.println("Kamayish tartibida sonlar:");
        for (int i = b - 1; i > a; i--) {
            System.out.print(i + " ");
            count++;
        }
        System.out.println("\nChiqarilgan sonlar soni: " + count);
    }


//4

    public  void printCandyPrices(double pricePerKg) {
        System.out.println("Konfet narxlari (1 kg dan 10 kg gacha):");
        for (int i = 1; i <= 10; i++) {
            double totalPrice = i * pricePerKg;
            System.out.printf("%d kg konfet narxi: %.2f\n", i, totalPrice);
        }
    }


//5

    public  void printCandyPrices2(double pricePerKg) {
        System.out.println("Konfet narxlari (0.1 kg dan 1 kg gacha):");
        for (double i = 0.1; i <= 1.0; i += 0.1) {
            double totalPrice = i * pricePerKg;
            System.out.printf("%.1f kg konfet narxi: %.2f\n", i, totalPrice);
        }
    }


    //6

    public  void printCandyPrices3(double pricePerKg) {
        for (double weight = 1.2; weight <= 2.0; weight += 0.2) {
            double totalPrice = weight * pricePerKg;
            System.out.printf("%.1f kg konfet narxi: %.2f so'm\n", weight, totalPrice);
        }
    }

//7

    public static int calculateSum(int a, int b) {
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i;
        }
        return sum;
    }



    //8

    public  long multiplication(int a, int b) {
        long result = 1;
        for (int i = a; i <= b; i++) {
            result *= i;
        }
        return result;
    }

//9

    public  int sumOfSquares(int a, int b) {
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i * i;
        }
        return sum;
    }


//10

public  double calculateHarmonicSum(int n) {
    if (n <= 0) {
        throw new IllegalArgumentException("n must be greater than 0");
    }
    double sum = 0.0;

    for (int i = 1; i <= n; i++) {
        sum += 1.0 / i;
    }

    return sum;
}

//12

    public double calculateProduct(int n) {
        double product = 1.0;
        for (double i = 1.1; i < 1.1 + n * 0.1; i += 0.1) {
            product *= i;
        }
        return product;
    }



//13

    public double calculateSum(int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (i % 2 == 1 ? 1 : -1) * (1.0 + i / 10.0);
        }
        return sum;
    }

//14

    public void printSquares(int n) {
        int sum = 0;


        for (int i = 1; i <= n; i++) {
            sum += (2 * i - 1); // 1 + 3 + 5 + ... formulasi
            System.out.println("Kvadrat: " + sum);
        }
    }

//15

    public  double power(double a, int n) {
        double result = 1;
        for (int i = 1; i <= n; i++) {
            result *= a;
        }
        return result;
    }


//16

    public void printPowers(double a, int n) {
        for (int i = 1; i <= n; i++) {
            double result = Math.pow(a, i); // a ning i-darajasi
            System.out.println(a + " ning " + i + "-darajasi: " + result);
        }
    }

    //17

    public  double power2(double a, int n) {
        double result = 1;
        for (int i = 1; i <= n; i++) {
            result *= a;
        }
        return result;
    }


    //18


    public  double calculateSum(int n, double a) {
        double sum = 0;
        double currentPower = 1;
        int sign = 1;

        for (int i = 1; i <= n; i++) {
            currentPower *= a;
            sum += sign * currentPower;
            sign *= -1;
        }

        return sum;
    }


//19

    public long calculateFactorial(int n){
    long factorial = 1;

    for(int i = 1;i < n;i++){
        factorial *=i;
    }
return factorial;
    }

//20
    public int calculateSum2(int n){
    int sum = 0;
        for (int i = 1; i < n; i++) {
            sum += i * 10 + 1;
        }
        return sum;
    }


    //21

    public  double calculateSum3(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n > 0 bo'lishi kerak");
        }

        double sum = 1.0;
        double factorial = 1.0;

        for (int i = 1; i < n; i++) {
            factorial *= i;
            sum += 1 / factorial;
        }
return sum;

    }


    //22


    public  double calculateSum4(int n, double x) {
        double sum = 1.0;
        double term = 1.0;

        for (int i = 1; i <= n; i++) {
            term *= x / i;
            sum += term;
        }

        return sum;
    }



//24

    public  double calculateSeries(double x, int n) {
        double result = 0.0;
        for (int i = 1; i <= n; i++) {
            double term = Math.pow(-1, i - 1) * Math.pow(x, i) / i;
            result += term;
        }
        return result;
    }

//39

    public  void printNumbersInRange(int A, int B) {
        for (int i = A; i <= B; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

//40

    public  void printNumbersWithFrequency(int A, int B) {
        for (int i = A; i <= B; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
        }
    }















}

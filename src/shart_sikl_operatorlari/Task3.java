package shart_sikl_operatorlari;

public class Task3 {

    //1

    public  int findEmptySegment(int A, int B) {
        if (A <= 0 || B <= 0) {
            throw new IllegalArgumentException("A va B musbat sonlar bo'lishi kerak.");
        }
        int count = 0;
        int remainingLength = A;
        while (remainingLength >= B) {
            remainingLength -= B;
            count++;
        }
        return remainingLength;
    }

    //2


    public int countSegments(int A, int B) {
        if (A <= 0 || B <= 0) {
            throw new IllegalArgumentException("A va B musbat sonlar bo'lishi kerak.");
        }
        int count = 0;
        int remainingLength = A;
        while (remainingLength >= B) {
            remainingLength -= B;
            count++;
        }

        return count;
    }

//3

    public  int[] divideWithRemainder(int N, int K) {
        if (N <= 0 || K <= 0) {
            throw new IllegalArgumentException("N va K musbat sonlar bo'lishi kerak.");
        }
        int quotient = 0;
        int remainder = N;
        while (remainder >= K) {
            remainder -= K;
            quotient++;
        }
        return new int[]{quotient, remainder};
    }

//4

    public String isPowerOfThree(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n musbat bo'lishi kerak.");
        }
        int current = 1;
        while (current < n) {
            current += current + current;
        }
        if (current == n) {
            return "3 ning darajasi";
        } else {
            return "3 ning darajasi emas";
        }
    }


//5

    public int findExponent(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n musbat butun son bo'lishi kerak va 0 dan katta bo'lishi kerak.");
        }
        int k = 0;
        while (n > 1) {
            if (n % 2 != 0) {
                return -1;
            }
            n /= 2;
            k++;
        }
        return k;
    }
//6

    public int calculateNLL(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n 0 yoki undan katta bo'lishi kerak");
        }
        int result = 1;
        int factor = n;
        while (factor > 0) {
            result *= factor;
            factor -= 2;
        }
        if (n % 2 == 0) {
            result *= 2;
        } else {
            result *= 1;
        }
        return result;
    }

    //7

    public int findSmallestK(int n) {
        int k = 1;
        while (k * k <= n) {
            k++;
        }
        return k;
    }

//8


        public int findLargestK(int n) {
            int k = 1;
            while ((k + 1) * (k + 1) <= n) {
                k++;
            }
            return k;
        }


//9

    public int findSmallestK2(int n) {
        int k = 1;
        while (3 * k <= n) {
            k++;
        }
        return k;
    }

    //10

    public int findLargestK2(int n) {
        int k = 1;
        while (3 * (k + 1) <= n) {
            k++;
        }
        return k;
    }

    //11

    public void findSmallestK3(int n) {
        int k = 1;
        int sum = 0;

        while (sum < n) {
            sum += k;
            k++;
        }
        k--;
        System.out.println("Eng kichik k: " + k);
        System.out.println("1 dan " + k + " gacha bo'lgan yig‘indi: " + sum);
    }

//12

    public void findLargestK3(int n) {
        int k = 0;
        int sum = 0;
        while (sum + (k + 1) <= n) { // Yig‘indiga keyingi k qo‘shilganda n dan oshmasa, davom etamiz
            k++;
            sum += k;
        }
        System.out.println("Eng katta k: " + k);
        System.out.println("1 dan " + k + " gacha bo'lgan yig‘indi: " + sum);
    }

//13

    public void findSmallestK(double a) {
        int k = 1;
        double sum = 0.0;
        while (sum < a) {
            sum += 1.0 / k;
            k++;
        }
        k--;
        System.out.println("Eng kichik k: " + k);
        System.out.println("Yig‘indi: " + sum);
    }

    //14
    public void findMaxK(double a) {
        int k = 0;
        double sum = 0;
        while (sum + 1.0 / (k + 1) <= a) {
            k++;
            sum += 1.0 / k;
        }
        System.out.println("Eng katta k: " + k);
        System.out.println("Yig'indi: " + sum);
    }

//15

    public  void calculateMonths(double S, double p) {
        int months = 0;
        double initialAmount = S;
        while (S <= 2 * initialAmount) {
            S += S * p / 100;
            months++;
        }
        System.out.println("Necha oydan keyin boshlang'ich summa 2 martadan ko'p bo'ladi: " + months);
        System.out.println("Hosil bo'lgan summa: " + S);
    }





















}

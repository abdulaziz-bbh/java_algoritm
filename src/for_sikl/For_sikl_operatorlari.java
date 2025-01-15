package for_sikl;

import java.util.Scanner;

public class For_sikl_operatorlari {

    //todo n > 0 dan k ni N marta chiqarish.
    public void for_1() {

                Scanner scanner = new Scanner(System.in);

                System.out.println("k sonini kiriting:");
                int k = scanner.nextInt();

                System.out.println("n sonini kiriting (n > 0):");
                int n = scanner.nextInt();

                if (n > 0) {
                    for (int i = 0; i < n; i++) {
                        System.out.println(k);
                    }
                } else {
                    System.out.println("n soni 0 dan katta bo'lishi kerak.");
                }
                scanner.close();
            }

    //todo a va b sonlari orasidagi barcha butun sonlarni (a va b ni ham) chiqaradi.
    public void for_2() {

                Scanner scanner = new Scanner(System.in);

                System.out.println("a sonini kiriting (a < b):");
                int a = scanner.nextInt();

                System.out.println("b sonini kiriting (a < b):");
                int b = scanner.nextInt();

                if (a < b) {
                    int count = 0;
                    for (int i = a; i <= b; i++) {
                        System.out.println(i);
                        count++;
                    }
                    System.out.println("Chiqarilgan sonlar soni: " + count);
                } else {
                    System.out.println("Xatolik: a soni b sonidan kichik bo'lishi kerak.");
                }
                scanner.close();
            }

    //todo a va b sonlari orasidagi barcha butun sonlarni kamayish tartibida chiqaradi.
    public void for_3() {

                Scanner scanner = new Scanner(System.in);

                System.out.println("a sonini kiriting (a < b):");
                int a = scanner.nextInt();
                System.out.println("b sonini kiriting (a < b):");
                int b = scanner.nextInt();

                if (a < b) {
                    int count = 0;
                    for (int i = b - 1; i > a; i--) {
                        System.out.println(i);
                        count++;
                    }
                    System.out.println("Chiqarilgan sonlar soni: " + count);
                } else {
                    System.out.println("Xatolik: a soni b sonidan kichik bo'lishi kerak.");
                }
                scanner.close();
            }

            //todo konfetning narxini aniqlaydi.
    public void for_4() {

                Scanner scanner = new Scanner(System.in);

                System.out.print("Bir kg konfetning narxini kiriting: ");
                double priceKg = scanner.nextDouble();
                for (int i = 1; i <= 10; i++) {
                    double price = i * priceKg;
                    System.out.println(i + " kg konfet narxi: " + price);
                }
                scanner.close();
            }

            //todo konfetning narxini aniqlaydi(0.1)da
    public void for_5() {

                Scanner scanner = new Scanner(System.in);

                System.out.println("Bir kg konfetning narxini kiriting:");
                double priceKg = scanner.nextDouble();

                for (double i = 0.1; i <= 1.0; i += 0.1) {
                    double price = i * priceKg;
                    System.out.printf("%.1f kg konfet narxi: %.2f\n", i, price);
                }
                scanner.close();
            }

            //todo konfetning narxini aniqlaydi (1.2 dan 2 gacha)
    public void for_6() {

                Scanner scanner = new Scanner(System.in);

                System.out.println("Bir kg konfetning narxini kiriting:");
                double priceKg = scanner.nextDouble();

                for (double i = 1.2; i <= 2.0; i += 0.2) {
                    double price = i * priceKg;
                    System.out.printf("%.1f kg konfet narxi: %.2f\n", i, price);
                }
                scanner.close();
            }

            //todo a dan b gacha sonlar yig'indisi.
    public void for_7() {

                Scanner scanner = new Scanner(System.in);

                System.out.println("a sonini kiriting (a < b):");
                int a = scanner.nextInt();

                System.out.println("b sonini kiriting (a < b):");
                int b = scanner.nextInt();

                if (a < b) {
                    int sum = 0;
                    for (int i = a; i <= b; i++) {
                        sum += i;
                    }
                    System.out.println(a + " dan " + b + " gacha bo'lgan barcha butun sonlar yig'indisi: " + sum);
                } else {
                    System.out.println("Xatolik: a soni b sonidan kichik bo'lishi kerak.");
                }
                scanner.close();
            }

            //todo a dan b gacha sonlar ko'paytmasi.
    public void for_8() {

                Scanner scanner = new Scanner(System.in);

                System.out.println("a sonini kiriting (a < b):");
                int a = scanner.nextInt();

                System.out.println("b sonini kiriting (a < b):");
                int b = scanner.nextInt();

                if (a < b) {
                    long product = 1;
                    for (int i = a; i <= b; i++) {
                        product *= i;
                    }
                    System.out.println(a + " dan " + b + " gacha bo'lgan barcha butun sonlar ko'paytmasi: " + product);
                } else {
                    System.out.println("Xatolik: a soni b sonidan kichik bo'lishi kerak.");
                }
                scanner.close();
            }

            //todo a dan b gacha kvadratlar yig'indisi.
    public void for_9() {

                Scanner scanner = new Scanner(System.in);

                System.out.println("a sonini kiriting (a < b):");
                int a = scanner.nextInt();

                System.out.println("b sonini kiriting (a < b):");
                int b = scanner.nextInt();

                if (a < b) {
                    int sum = 0;
                    for (int i = a; i <= b; i++) {
                        sum += i * i;
                    }
                    System.out.println(a + " dan " + b + " gacha bo'lgan barcha butun sonlar kvadratlarining yig'indisi: " + sum);
                } else {
                    System.out.println("Xatolik: a soni b sonidan kichik bo'lishi kerak.");
                }
                scanner.close();
            }

            //todo n > 0 dan katta bo'sa S = 1 + 1/2, 1/3 ... 1/n yechsin.
    public void for_10() {

                Scanner scanner = new Scanner(System.in);

                System.out.println("n sonini kiriting (n > 0):");
                int n = scanner.nextInt();

                if (n > 0) {
                    double sum = 0;
                    for (int i = 1; i <= n; i++) {
                        sum += 1.0 / i;
                    }
                    System.out.println("Yig'indi S = 1 + 1/2 + 1/3 + ... + 1/" + n + " : " + sum);
                } else {
                    System.out.println("Xatolik: n soni 0 dan katta bo'lishi kerak.");
                }
                scanner.close();
            }

            //todo n > 0 dan katta bo'sa 𝑆= 𝑛2+(𝑛+1)2+(𝑛+2)2+⋯+(2𝑛)2 yechish.
    public void for_11() {

                Scanner scanner = new Scanner(System.in);

                System.out.println("n sonini kiriting (n > 0):");
                int n = scanner.nextInt();

                if (n > 0) {
                    int sum = 0;
                    for (int i = n; i <= 2 * n; i++) {
                        sum += i * i;
                    }
                    System.out.println("Yig'indi S = " + sum);
                } else {
                    System.out.println("Xatolik: n soni 0 dan katta bo'lishi kerak.");
                }
                scanner.close();
            }

            //todo n > 0 dan katta bo'sa S = 1.1 * 1.2 * 1.3...(n ta ko'paytuvchi).
    public void for_12() {

                Scanner scanner = new Scanner(System.in);

                System.out.println("n sonini kiriting (n > 0):");
                int n = scanner.nextInt();

                if (n > 0) {
                    double product = 1.0;
                    for (int i = 1; i <= n; i++) {
                        product *= 1 + i / 10.0;
                    }
                    System.out.println("Ko'paytma S = " + product);
                } else {
                    System.out.println("Xatolik: n soni 0 dan katta bo'lishi kerak.");
                }
                scanner.close();
            }

            //todo 𝑆 = 1.1 − 1.2 + 1.3 − … yig'indisini xisoblash.
    public void for_13() {

                Scanner scanner = new Scanner(System.in);

                System.out.println("n sonini kiriting (n > 0):");
                int n = scanner.nextInt();

                if (n > 0) {
                    double sum = 0;
                    double n2 = 1;
                    for (int i = 1; i <= n; i++) {
                        sum += n2 * (1 + i / 10.0);
                        n2 *= -1;
                    }
                    System.out.println("Yig'indi S = " + sum);
                } else {
                    System.out.println("Xatolik: n soni 0 dan katta bo'lishi kerak.");
                }
                scanner.close();
            }

            //todo n -= 1 + 3 + 5 + ... + (2*n - 1) 1 dan n gacha kvadratlar chiqadi.
    public void for_14() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("n sonini kiriting (n > 0):");
        int n = scanner.nextInt();
        if (n > 0) {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                int term = 2 * i - 1;
                sum += term;
                System.out.println(i + " sonning kvadrati: " + sum);
            }
        } else {
            System.out.println("Xatolik n soni 0 dan katta bo'lishi kerka: ");
            scanner.close();
        }
    }

            //todo a ning n darajasini xisoblaydi.
    public void for_15() {

                Scanner scanner = new Scanner(System.in);

                System.out.println("a sonini kiriting:");
                double a = scanner.nextDouble();

                System.out.println("n butun sonini kiriting (n > 0):");
                int n = scanner.nextInt();

                if (n > 0) {
                    double result = 1.0;
                    for (int i = 0; i < n; i++) {
                        result *= a;
                    }
                    System.out.println("a ning n - darajasi: " + result);
                } else {
                    System.out.println("Xatolik: n soni 0 dan katta bo'lishi kerak.");
                }
                scanner.close();
            }

            //todo a ni n chi darajasigacha chiqarish.
    public void for_16() {

                Scanner scanner = new Scanner(System.in);

                System.out.println("a sonini kiriting:");
                double a = scanner.nextDouble();

                System.out.println("a ni nechinchi darajasigacha chiqarmoqchisiz (n > 0):");
                int n = scanner.nextInt();
                if (n > 0) {
                    double result = 1.0;
                    for (int i = 1; i <= n; i++) {
                        result *= a;
                        System.out.println(a + " ning " + i + " - darajasi: " + result);
                    }
                } else {
                    System.out.println("Xatolik: n soni 0 dan katta bo'lishi kerak.");
                }
                scanner.close();
            }

            //todo a ni n chi darajasigacha yig'indisi bilan chiqarish.
    public void for_17() {

                Scanner scanner = new Scanner(System.in);

                System.out.println("a haqiqiy sonini kiriting:");
                double a = scanner.nextDouble();

                System.out.println("a ni nechinchi darajasigacha chiqarmoqchisiz (n > 0):");
                int n = scanner.nextInt();

                if (n > 0) {
                    double sum = 0.0;
                    double term = 1.0;
                    for (int i = 0; i <= n; i++) {
                        sum += term;
                        System.out.println("a ning " + i + " - darajasi: " + term +
                                "\n a dan " + i + " gacha yig'indisi: " + sum);
                        term *= a;
                    }
                    System.out.println("Yig'indi S = " + sum);
                } else {
                    System.out.println("Xatolik: n soni 0 dan katta bo'lishi kerak.");
                }
                scanner.close();
            }

            //todo n factorial
    public void for_18() {

                Scanner scanner = new Scanner(System.in);

                System.out.println("n sonini kiriting (n > 0):");
                int n = scanner.nextInt();

                if (n > 0) {
                    long factorial = 1;
                    for (int i = 1; i <= n; i++) {
                        factorial *= i;
                    }
                    System.out.println("n! = " + factorial);
                } else {
                    System.out.println("Xatolik: n soni 0 dan katta bo'lishi kerak.");
                }
                scanner.close();
            }

            //todo 1! + 2! + 3! + ... +n! hisoblash
    public void for_19() {

                Scanner scanner = new Scanner(System.in);

                System.out.println("n sonini kiriting (n > 0):");
                int n = scanner.nextInt();

                if (n > 0) {
                    long sum = 0;
                    for (int i = 1; i <= n; i++) {
                        long factorial = 1;
                        for (int j = 1; j <= i; j++) {
                            factorial *= j;
                        }
                        sum += factorial;
                    }
                    System.out.println("Yig'indi S = " + sum);
                } else {
                    System.out.println("Xatolik: n soni 0 dan katta bo'lishi kerak.");
                }
                scanner.close();
            }

            //todo 1 + 1/(1!) + 1/(2!) + 1/(3!) + ... +1/(nl) hisoblash.
    public void for_20() {

                Scanner scanner = new Scanner(System.in);

                System.out.println("n sonini kiriting (n > 0):");
                int n = scanner.nextInt();

                if (n > 0) {
                    double sum = 1.0;
                    double factorial = 1.0;

                    for (int i = 1; i <= n; i++) {
                        factorial *= i;
                        sum += 1.0 / factorial;
                    }
                    System.out.println("Yig'indi S = " + sum);
                } else {
                    System.out.println("Xatolik: n soni 0 dan katta bo'lishi kerak.");
                }
                scanner.close();
            }

            //todo 1 + x + x2 / (2!) + x} / (3!) + ... +x"/(n!) hisoblash
    public void for_21() {

                Scanner scanner = new Scanner(System.in);

                System.out.println("x sonini kiriting:");
                double x = scanner.nextDouble();

                System.out.println("n butun sonini kiriting (n > 0):");
                int n = scanner.nextInt();

                if (n > 0) {
                    double sum = 1.0;
                    double term = 1.0;

                    for (int i = 1; i <= n; i++) {
                        term *= x / i;
                        sum += term;
                    }
                    System.out.println("Yig'indi S = " + sum);
                } else {
                    System.out.println("Xatolik: n soni 0 dan katta bo'lishi kerak.");
                }
                scanner.close();
            }

}

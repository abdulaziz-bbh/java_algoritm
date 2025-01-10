package tanlash_operatorlari;

import java.util.Scanner;
import java.time.LocalDate;
public class Tasks {

        //todo 4 ta fasildi oylari bilan chiqaradi:
        public void fasillar(int son) {

            switch (son) {
                case 1 -> System.out.println("""
                    Qish fasli:\s
                     oylari:\s
                     O'n ikkinchi oy Dekabr deb ataladi:\s
                     Birinchi oy Yanvar deb ataladi:\s
                     Ikkinchi oy Fevral deb ataladi:""");
                case 2 -> System.out.println("""
                    Bahor fasli:\s
                     oylari:\s
                     Uchinchi oy mart deb ataladi:
                     To'rtinchi oy aprel deb ataladi:\s
                     Beshinchi oy may deb ataladi:\s""");
                case 3 -> System.out.println("""
                    Yoz fasli:\s
                     oylari:\s
                     Oltinchi oy iyun deb ataladi:\s
                     Ettinchi oy iyul deb ataladi:\s
                     Sakkizinchi oy avgust deb ataladi:\s""");
                case 4 -> System.out.println("""
                    Yoz fasli:\s
                     oylari:\s
                     To'qqizinchi oy sentyabr deb ataladi:\s
                     O'ninchi oy oktyabr deb ataladi:\s
                     O'n birinchi oy noyabr deb ataladi:\s""");
                default -> System.out.println("1 dan 4 gacha son kiriting: ");
            }
        }

        //todo sonlardi satirlarga aylantiradi:
        public void numberWords(Integer n) {
            if (n <= 0 || n >= 100) {
                System.out.println("Xato! Iltimos, 0 < N < 100 oralig'ida son kiriting: ");
            }
            String words = "";
            switch (n / 10) {
                case 1 -> words += "o'n";
                case 2 -> words += "yigirma";
                case 3 -> words += "o'ttiz";
                case 4 -> words += "qirq";
                case 5 -> words += "ellik";
                case 6 -> words += "oltmish";
                case 7 -> words += "yetmish";
                case 8 -> words += "sakson";
                case 9 -> words += "to'qson";
            }
            switch (n % 10) {
                case 1 -> words += " " + "bir";
                case 2 -> words += " " + "ikki";
                case 3 -> words += " " + "uch";
                case 4 -> words += " " + "to'rt";
                case 5 -> words += " " + "besh";
                case 6 -> words += " " + "olti";
                case 7 -> words += " " + "yetti";
                case 8 -> words += " " + "sakkiz";
                case 9 -> words += " " + "to'qqiz";
            }
            System.out.println(words);
        }

        //todo hafta kunlarini chiqaradi:
        public void weekday(int n) {
            switch (n) {
                case 1 -> System.out.println("Dushanba: ");
                case 2 -> System.out.println("Seshanba: ");
                case 3 -> System.out.println("Chorshanba: ");
                case 4 -> System.out.println("Payshanba: ");
                case 5 -> System.out.println("Juma: ");
                case 6 -> System.out.println("Shanba: ");
                case 7 -> System.out.println("Yakshanba: ");
                default -> System.out.println("1 , 7 oraliqda son kiriting: ");
            }
        }

        //todo 1 dan 5 gacha baholardi chiqaradi:
        public void grades(int k) {
            switch (k) {
                case 1 -> System.out.println("Yomon: ");
                case 2 -> System.out.println("Qoniqarsiz: ");
                case 3 -> System.out.println("Qoniqarli: ");
                case 4 -> System.out.println("Yahshi: ");
                case 5 -> System.out.println("A'lo: ");
                default -> System.out.println("1 dan 5 gacha oraliqda son kiriting: ");
            }
        }

        //todo oyda nechta kun borligini aniqlaydi:
        public void monthDay(int n) {

            switch (n) {
                case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("31 kundan iborat: ");
                case 2 -> System.out.println("28 - 29 kundan iborat: ");
                case 4, 6, 9, 11 -> System.out.println("30 kundan iborat: ");
            }
        }

        //todo manqitiqiy amallar:
        public void mantqAmal() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("A haqiqiy sonini kiriting: ");
            double A = scanner.nextDouble();
            System.out.print("B haqiqiy sonini kiriting: ");
            double B = scanner.nextDouble();

            System.out.println("Amalni tanlang:");
            System.out.println("1 - Qo'shish");
            System.out.println("2 - Ayirish");
            System.out.println("3 - Bo'lish");
            System.out.println("4 - Ko'paytirish");
            int amal = scanner.nextInt();
            double natija;

            switch (amal) {
                case 1:
                    natija = A + B;
                    System.out.println("Natija: " + natija);
                    break;
                case 2:
                    natija = A - B;
                    System.out.println("Natija: " + natija);
                    break;
                case 3:
                    if (B != 0) {
                        natija = A / B;
                        System.out.println("Natija: " + natija);
                    } else {
                        System.out.println("Xato: Nolga bo'lish mumkin emas.");
                    }
                    break;
                case 4:
                    natija = A * B;
                    System.out.println("Natija: " + natija);
                    break;
                default:
                    System.out.println("Xato: Noto'g'ri amal tanlandi.");
            }
            scanner.close();
        }

        //todo uzunliklardi aniqlaydi:
        public void olchashMethod() {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Uzunlik birligini tanlang:");
            System.out.println("1 - Desimetr");
            System.out.println("2 - Kilometr");
            System.out.println("3 - Metr");
            System.out.println("4 - Millimeter");
            System.out.println("5 - Santimet");

            int unit = scanner.nextInt();
            System.out.print("Kesma uzunligini kiriting: ");
            double length = scanner.nextDouble();

            double result = 0;

            switch (unit) {
                case 1 -> result = length / 10;
                case 2 -> result = length * 1000;
                case 3 -> result = length;
                case 4 -> result = length / 1000;
                case 5 -> result = length / 100;
                default -> {
                    System.out.println("Noto'g'ri birlik tanlandiz!");
                    return;
                }
            }
            System.out.printf("Kesma uzunligi metrlarda: %.2f\n", result);

        }

        //todo og'irlik o'lchovlarini kg ga o'zgartirish:
        public void ogirlikMethod() {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Og'irlik birligini tanlang:");
            System.out.println("1 - Kilogramm");
            System.out.println("2 - Milligramm");
            System.out.println("3 - Gramm");
            System.out.println("4 - Tonna");
            System.out.println("5 - Sentner");

            int unit = scanner.nextInt();
            System.out.print("Og'irlik qiymatini kiriting: ");
            double weight = scanner.nextDouble();

            double result = 0;

            switch (unit) {
                case 1 -> result = weight;
                case 2 -> result = weight / 1_000_000;
                case 3 -> result = weight / 1_000;
                case 4 -> result = weight * 1_000;
                case 5 -> result = weight * 100;
                default -> {
                    System.out.println("Noto'g'ri birlik tanlandi!");
                    return;
                }
            }
            System.out.printf("Og'irlik kilogrammlarda: %.2f\n", result);

        }

        //todo Sanani ifodalash
    public void SananiIfodalash() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Kunni kiriting: ");
            int D = scanner.nextInt();
            System.out.print("Oyni kiriting: ");
            int M = scanner.nextInt();

            int[] oylarKuni = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

            if (M < 1 || M > 12 || D < 1 || D > oylarKuni[M - 1]) {
                System.out.println("Noto'g'ri sana kiritildi");
                return;
            }
            int kunlarSoni = 0;
            for (int i = 0; i < M - 1; i++) {
                kunlarSoni += oylarKuni[i];
            }
            kunlarSoni += D;

            System.out.println("Yil: 2025, Sanasi: " + M + "-oyning " +
                    D + "-kuni. Umumiy kunlar: " + kunlarSoni);
            scanner.close();
        }

        //todo kiritilgan sanadan key qancha kun qolganini aniqlaydi.
        public void qolganSana() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Kunni kiriting: ");
            int D = scanner.nextInt();
            System.out.print("Oyni kiriting: ");
            int M = scanner.nextInt();

            int[] oylarKuni = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

            if (M < 1 || M > 12 || D < 1 || D > oylarKuni[M - 1]) {
                System.out.println("Noto'g'ri sana kiritildi");
                return;
            }
            int kunlarsoni = 0;
            for (int i = 0; i < M - 1 ; i++) {
                kunlarsoni += oylarKuni[i];
            }
            kunlarsoni += D;
            int qolgankunlar = 365 - kunlarsoni;
            System.out.println("keyingi qolgan kunlar soni: " + qolgankunlar);
            scanner.close();
        }

}



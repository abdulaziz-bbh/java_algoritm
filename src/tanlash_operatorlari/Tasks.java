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

        //todo Teng tomonli uchburchak.
        public void tengtomonliUchburchak() {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Tengtomonli uchburchakning biror elementini kiriting:");
            System.out.println("1 - Tomon (a)");
            System.out.println("2 - Ichki chizilgan aylananing radiusi (R1)");
            System.out.println("3 - Tashqi chizilgan aylananing radiusi (R2)");
            System.out.println("4 - Yuzasi (S)");

            int tanlov = scanner.nextInt();

            switch (tanlov) {
                case 1:
                    System.out.print("Tomonni kiriting (a): ");
                    double a = scanner.nextDouble();
                    double R1 = a * Math.sqrt(3 / 6);
                    double R2 = 2 * R1;
                    double S = (Math.sqrt(3 / 4)) * a * a;
                    System.out.printf("Ichki chizilgan aylananing radiusi (R1): %.2f\n", R1);
                    System.out.printf("Tashqi chizilgan aylananing radiusi (R2): %.2f\n", R2);
                    System.out.printf("Yuzasi (S): %.2f\n", S);
                    break;

                case 2:
                    System.out.print("Ichki chizilgan aylananing radiusini kiriting (R1): ");
                    R1 = scanner.nextDouble();
                    a = R1 * 6 / Math.sqrt(3);
                    R2 = 2 * R1;
                    S = (Math.sqrt(3 / 4)) * a * a;
                    System.out.printf("Tomon (a): %.2f\n", a);
                    System.out.printf("Tashqi chizilgan aylananing radiusi (R2): %.2f\n", R2);
                    System.out.printf("Yuzasi (S): %.2f\n", S);
                    break;

                case 3:
                    System.out.print("Tashqi chizilgan aylananing radiusini kiriting (R2): ");
                    R2 = scanner.nextDouble();
                    R1 = R2 / 2;
                    a = R1 * 6 / Math.sqrt(3);
                    S = (Math.sqrt(3 / 4)) * a * a;
                    System.out.printf("Tomon (a): %.2f\n", a);
                    System.out.printf("Ichki chizilgan aylananing radiusi (R1): %.2f\n", R1);
                    System.out.printf("Yuzasi (S): %.2f\n", S);
                    break;

                case 4:
                    System.out.print("Yuzani kiriting (S): ");
                    S = scanner.nextDouble();
                    a = Math.sqrt((4 * S) / Math.sqrt(3));
                    R1 = a * Math.sqrt(3 / 6);
                    R2 = 2 * R1;
                    System.out.printf("Tomon (a): %.2f\n", a);
                    System.out.printf("Ichki chizilgan aylananing radiusi (R1): %.2f\n", R1);
                    System.out.printf("Tashqi chizilgan aylananing radiusi (R2): %.2f\n", R2);
                    break;
                default:
                    System.out.println("Noto'g'ri tanlov. Iltimos, 1-4 oralig'ida biror raqam kiriting.");
            }
            scanner.close();
        }

        //todo Karta turlarini chiqarib beradi.
        public void kartaNomlari() {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Karta qiymatini kiriting (6 dan katta yoki teng 14 dan katt yoki teng): ");
            int N = scanner.nextInt();

            System.out.print("Karta turini kiriting (1 - olma, 2 - chillak, 3 - qarg'a, 4 - g'isht): ");
            int M = scanner.nextInt();

            String kartaQiymati = "";
            String kartaTuri = "";

            switch (N) {
                case 6 -> kartaQiymati = "olti";
                case 7 -> kartaQiymati = "yetti";
                case 8 -> kartaQiymati = "sakkiz";
                case 9 -> kartaQiymati = "to'qqiz";
                case 10 -> kartaQiymati = "o'n";
                case 11 -> kartaQiymati = "valet";
                case 12 -> kartaQiymati = "dama";
                case 13 -> kartaQiymati = "girol";
                case 14 -> kartaQiymati = "tuz";
                default -> {
                    System.out.println("Karta qiymati noto'g'ri.");
                    return;
                }
            }
            switch (M) {
                case 1 -> kartaTuri = "olma";
                case 2 -> kartaTuri = "chillak";
                case 3 -> kartaTuri = "qarg'a";
                case 4 -> kartaTuri = "g'isht";
                default -> {
                    System.out.println("Karta turi noto'g'ri.");
                    return;
                }
            }
            System.out.println(kartaQiymati + " - " + kartaTuri);
            scanner.close();
        }

        //todo qancha masala qolganini aniqlaydi.
        public void masalaAniqlovchi() {

            Scanner scanner = new Scanner(System.in);
            System.out.print("10-40 gacha butun sonni kiriting: ");

            int son = scanner.nextInt();

            if (son < 10 || son > 40) {
                System.out.println("Kiritilgan son 10 dan 40 oraliqda bo'lishi kerak.");
            } else {
                String soz = "";

                int birlik = son % 10;
                int onlik = son / 10;

                switch (onlik) {
                    case 1 -> soz += "o'n ";
                    case 2 -> soz += "yigirma ";
                    case 3 -> soz += "o'ttiz ";
                    case 4 -> soz += "qirqta masala";
                    default -> {
                    }
                }
                switch (birlik) {
                    case 1 -> soz += "bitta masala";
                    case 2 -> soz += "ikkita masala";
                    case 3 -> soz += "uchta masala";
                    case 4 -> soz += "to'rta masala";
                    case 5 -> soz += "beshta masala";
                    case 6 -> soz += "oltita masala";
                    case 7 -> soz += "yettita masala";
                    case 8 -> soz += "sakkizta masala";
                    case 9 -> soz += "to'qqizta masala";
                    default -> {
                    }
                }
                System.out.println(soz);
            }
            scanner.close();
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

        //todo Sharq kalendari.
        public void SharqKalendari() {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Yilni kiriting: ");
            int yil = scanner.nextInt();
            int davirYili = (yil - 1984) % 60;

            String[] ranglar = {"Yashil", "Qizil", "Sariq", "Oq", "Qora"};
            String[] hayvonlar = {"Sichqon", "Sigir", "Yo'lbars", "Quyon", "Ajdar",
                    "Ilon", "Ot", "Qo'y", "Maymun", "Tovuq", "It", "To'ng'iz"};

            String rang = ranglar[davirYili % 5];
            String hayvon = hayvonlar[davirYili % 12];

            System.out.println("Yilning muchali: " + rang + " " + hayvon);
            scanner.close();
    }

        //todo Burch aniqlash.
        public void burjAniqlash() {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Kunni kiriting: ");
            int kun = scanner.nextInt();

            System.out.print("Oyni kiriting: ");
            int oy = scanner.nextInt();

            if ((oy == 1 && kun >= 20) || (oy == 2 && kun <= 18)) {
                System.out.println("Qovrg'a (20.1 = 18.2)");
            } else if ((oy == 2 && kun >= 19) || (oy == 3 && kun <= 20)) {
                System.out.println("Baliq (19.2 = 20.3)");
            } else if ((oy == 3 && kun >= 21) || (oy == 4 && kun <= 19)) {
                System.out.println("Qo'y (21.3 = 19.4)");
            } else if ((oy == 4 && kun >= 20) || (oy == 5 && kun <= 20)) {
                System.out.println("Buzoq (20.4 = 20.5)");
            } else if ((oy == 5 && kun >= 21) || (oy == 6 && kun <= 21)) {
                System.out.println("Egizaklar (21.5 = 21.6)");
            } else if ((oy == 6 && kun >= 22) || (oy == 7 && kun <= 22)) {
                System.out.println("Qisqichbaqa (22.6 = 22.7)");
            } else if ((oy == 7 && kun >= 23) || (oy == 8 && kun <= 22)) {
                System.out.println("Arslon (23.7 = 22.8)");
            } else if ((oy == 8 && kun >= 23) || (oy == 9 && kun <= 22)) {
                System.out.println("Parizod (23.8 = 22.9)");
            } else if ((oy == 9 && kun >= 23) || (oy == 10 && kun <= 22)) {
                System.out.println("Tarozi (23.9 = 22.10)");
            } else if ((oy == 10 && kun >= 23) || (oy == 11 && kun <= 22)) {
                System.out.println("Chayon (23.10 = 22.11)");
            } else if ((oy == 11 && kun >= 23) || (oy == 12 && kun <= 21)) {
                System.out.println("O'qotar (23.11 = 21.12)");
            } else if ((oy == 12 && kun >= 22) || (oy == 1 && kun <= 19)) {
                System.out.println("Echki (22.12 = 19.1)");
            } else {
                System.out.println("Noto'g'ri sana");
            }
        }



}



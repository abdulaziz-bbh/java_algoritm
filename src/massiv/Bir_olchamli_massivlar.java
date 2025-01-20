package massiv;

import java.util.ArrayList;
import java.util.Collections;

public class Bir_olchamli_massivlar {


        public void array_1(int[] array) {

            int lastElement = array[array.length - 1];
            int result = 0;
            int zero = array[0];
            for (int i = 0; i < lastElement; i++) {
                if (array[zero] > lastElement) {
                    zero = array[i];
                }
                else {
                    result = zero;
                    break;
                }
            }
            System.out.println(result);
        }

        public void array_2(int[] array) {

                    int firstElement = array[0];
                    int lastElement = array[array.length - 1];
                    int resultIndex = 0;

                    for (int i = array.length - 1; i >= 0; i--) {
                        if (array[i] < lastElement && array[i] > firstElement) {
                            resultIndex = i;
                            break;
                        }
                    }
        System.out.println("Oxirgi elementdan kichik va dastlabki elementdan katta bo'lgan oxirgi element indeks: " + resultIndex);


        }

        //todo K va L orasidagini xisoblash
        public void array_3(int[] array) {

                    int K = 2;
                    int L = 5;
                    if (L < array.length) {
                        int sum = 0;
                        for (int i = K; i <= L; i++) {
                            sum += array[i];
                        }
                    System.out.println("Massivning K va L indekslari orasidagi elementlar yig'indisi: " + sum);
                    } else {
                    System.out.println("Xatolik: K va L indekslari massiv chegarasidan " +
                            "chiqmasligi kerak va K <= L bo'lishi kerak.");
                    }
                }

        //todo K va L oraliqdagi o'rta arifmetik topish
        public void array_4(int[] array) {

                    int K = 1;
                    int L = 4;

                    if (L < array.length) {
                        int sum = 0;
                        int count = 0;

                        for (int i = K; i <= L; i++) {
                            sum += array[i];
                            count++;
                        }
                        double average = (double) sum / count;
                        System.out.println("Massivning K va L indekslari orasidagi elementlar o'rta arifmetigi: " + average);
                    } else {
                        System.out.println("Xatolik: K va L indekslari massiv chegarasidan" +
                                " chiqmasligi kerak va K <= L bo'lishi kerak.");
                    }
                }

        //todo K va L orasidangi elementlardan tashqari elementlar yig'indisi:
        public void array_5(int[] array) {

            int k = 2;
            int l = 4;
            int result = 0;
            if(l < array.length) {
                int sum = 0;
                int sum2 = 0;
                for (int i = k; i <= l; i++) {
                    sum += array[i];
                }
                for (int j : array) {
                    sum2 += j;
                }
                result = sum2 - sum;
            }
            System.out.println("K va L orasidangi elementlardan tashqari elementlar yig'indisi: " + result);
        }

        //todo K va L orasidangi elementlardan tashqari elementlar o'rta arifmetigi:
        public void array_6(int[] array) {

            int k = 2;
            int l = 4;
            double average = 0;

            if(l < array.length) {
                int count = 0;
                int sum = 0;
               for (int i = 0; i < array.length;i++) {
                   if(i < k || i > l) {
                       sum += array[i];
                       count++;
                   }
               }
                average = (double) sum / count;
            }
            System.out.println("K va L orasidangi elementlardan tashqari elementlar o'rta arifmetigi: " + average);
        }

        //todo ayirma yoki 0 chiqaradi.
        public void array_7(int[] array) {

                    if (array.length < 2) {
                        System.out.println(0);
                        return;
                    }
                    int farq = array[1] - array[0];
                    boolean arifmetik = true;
                    for (int i = 1; i < array.length - 1; i++) {
                        if (array[i + 1] - array[i] != farq) {
                            arifmetik = false;
                            break;
                        }
                    }
                    if (arifmetik) {
                        System.out.println(farq);
                    } else {
                        System.out.println(0);
                    }
                }

        //todo massiv nechiga farq qilganini ko'rsatadi
        public void array_8(int[] array) {

                    if (array.length < 2) {
                        System.out.println(0);
                        return;
                    }
                    double nisbat = (double) array[1] / array[0];
                    boolean geometric = true;

                    for (int i = 1; i < array.length - 1; i++) {
                        if ((double) array[i + 1] / array[i] != nisbat) {
                            geometric = false;
                            break;
                        }
                    }
                    if (geometric) {
                        System.out.println(nisbat);
                    } else {
                        System.out.println(0);
                    }
                }

        //todo birinchi ketma ketlikdi buzgan elementni chiqaradi.
        public void array_9(int[] array) {

            int firstE = array[0] % 2;
            boolean bl = false;
            int index = 0;

            for (int i = 1; i < array.length; i++) {
                int ketmaket = array[i] % 2;
                if(ketmaket == firstE) {
                    bl = true;
                    index = i;
                    break;
                }
                firstE = ketmaket;
            }
            if (bl) {
                System.out.println("Birinchi ketma ketlikdi buzgan element: " + index);
            }
            else {
                System.out.println(0);
            }
        }

        //todo Birinchi ketma ketlikdi buzgan element musbat manfiy.
        public void array_10(int[] array) {

                    boolean bl = false;
                    int index = 0;

                    for (int i = 1; i < array.length; i++) {
                        if ((array[i - 1] >= 0 && array[i] >= 0) || (array[i - 1] < 0 && array[i] < 0)) {
                            bl = true;
                            index = i;
                            break;
                        }
                    }
                    if (bl) {
                        System.out.println("Ketma-ketlikni buzgan birinchi element indeks: " + index);
                    } else {
                        System.out.println(0);
                    }
                }

        //todo Massivdagi juft sonlardi ichidagi eng kichigi:
        public void array_11(int[] array) {

            int zero = array[0];
            for (int j = zero; j < array.length; j++) {
                if (array[j] % 2 == 0) {
                    if (zero > array[j]) {
                        zero = array[j];
                    }
                }
            }
            System.out.println("Massivdagi juft sonlardi ichidagi eng kichigi: " + zero);
        }

        //todo Massivdagi toq sonlardi ichidagi eng kattasi:
        public void array_12(int[] array) {
            int zero = array[0];
            for(int i = zero; i < array.length; i++) {
                if(array[i] % 2 != 0) {
                    if(zero < array[i]) {
                        zero = array[i];
                    }
                }
            }
            System.out.println("Massivdagi toq sonlardi ichidagi eng kattasi: " + zero);
        }

        //todo o'ng tomondagidan katta bo'lgan indexlardi va ulardi sonini chiqaradi.
        public void array_13(int[] array) {

                    int count = 0;
                    StringBuilder index = new StringBuilder();

                    for (int i = 0; i < array.length - 1; i++) {
                        if (array[i] > array[i + 1]) {
                            index.append(i).append(" ");
                            count++;
                        }
                    }
                    System.out.println("Indekslar: " + index.toString().trim());
                    System.out.println("Elementlar soni: " + count);
                }

        //todo chap qo'shnisidan katta bo'lgan indexlar va ularning sonini kamayish tartibida.
        public void array_14(int[] array) {
            int count = 0;
            ArrayList<Integer> index = new ArrayList<>();

            for (int i = 1; i < array.length; i++) {
                if (array[i] > array[i - 1]) {
                    index.add(i);
                    count++;
                }
            }
            index.sort(Collections.reverseOrder());
            System.out.println("Indekslar: " + index.toString().trim());
            System.out.println("Elementlar soni: " + count);
        }

        //todo lokal minimum elementi indeksini chiqaruchi programma.
        public void array_15(int[] array) {

                    int localMinIndex = -1;
                    if (array.length >= 3) {
                        for (int i = 1; i < array.length - 1; i++) {
                            if (array[i] < array[i - 1] && array[i] < array[i + 1]) {
                                localMinIndex = i;
                                break;
                            }
                        }
                    }
                    if (localMinIndex != -1) {
                        System.out.println("Birinchi uchragan lokal minimum elementi indeks: " + localMinIndex);
                    } else {
                        System.out.println("Massivda lokal minimum elementi topilmadi.");
                    }
                }

        //todo
        public void array_16(int[] array) {
            int localMaxIndex = -1;
            if(array.length >= 3) {
                for (int i = 1; i < array.length - 1; i++) {
                    if(array[i] > array[i - 1] && array[i] > array[i + 1] || i < array[i]) {
                        localMaxIndex = i;
                            break;
                    }
                }
            }
            if (localMaxIndex != -1) {
                System.out.println("Oxirgi uchragan lokal maksimum indeks: " + localMaxIndex);
            }
            else {
                System.out.println("Massivda lokal maksimum topilmadi.");
            }
        }


}

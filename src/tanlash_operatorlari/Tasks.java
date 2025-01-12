package tanlash_operatorlari;

import java.lang.invoke.SwitchPoint;

public class Tasks {

    //6

    public  double converToMeters(int unit,double length){
        double result = 0;
        switch(unit){
            case 1: //disemetr
                result = length * 0.01;
                break;
            case 2://Kilometr
                result = length * 1000;
                break;
            case 3://metr
                result = length;
                break;
            case 4://millimetr
                result = length * 0.001;
                break;
            case 5://santimetr
                result = length * 0.01;
                break;
            default:
                System.out.printf("Xato: notog'ri birlik kiritildi! ");
                break;
        }
return result;
    }







//7

public  double convertToKilograms(int unit,double weight){
        double result = 0;

        switch (unit){
            case 1: //Kilogram
                result = weight;
                break;
            case 2: //milligram
                result = weight * 0.000001;
                break;
            case 3: //gram
                result = weight * 0.001;
                break;
            case 4: //tonna
                result = weight * 1000;
                break;
            case 5: //santiner
                result = weight * 100;
                break;
            default:
                System.out.printf("Xato: notog'ri birlik kiritildi! ");
                break;
        }
return result;
}






//8

    public  String getDate(int day,int month){

        int daysInMonth = 0;

        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
             daysInMonth = 31;
             break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = 31;
                break;
            case 2:
                daysInMonth = 28;
                break;
            default:
                System.out.printf("Xato: Oy 1 dan 12 gacha bo'lishi kerak.");

        }

if(day < 1 || day > daysInMonth){
    return "Xato: " +month + "-oyda " + day + " lun mavjud emas. ";
}

String monthName;
switch (month){

    case 1: monthName  = "Yanvar";break;
    case 2: monthName  = "Fevral";break;
    case 3: monthName  = "Mart";break;
    case 4: monthName  = "Aprel";break;
    case 5: monthName  = "May";break;
    case 6: monthName  = "Iyun";break;
    case 7: monthName  = "Iyul";break;
    case 8: monthName  = "Avgust";break;
    case 9: monthName  = "Sentabr";break;
    case 10: monthName  = "Oktabr";break;
    case 11: monthName  = "Noyabr";break;
    case 12: monthName  = "Dekabr";break;
    default: monthName = "Xato"; break;
}

return  "Sana: " + day + " " + monthName;

    }


//9

    public  void calculateNextDate(int D, int M) {
        int nextDay = D + 1;
        int nextMonth = M;
        int daysInMonth = 0;

        switch (M) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                daysInMonth = 31;
                break;
            case 4: case 6: case 9: case 11:
                daysInMonth = 30;
                break;
            case 2:
                daysInMonth = 28; // Kabisa bo'lmagan yil
                break;
            default:
                System.out.println("Noto'g'ri oy kiritildi.");
                return;
        }

        if (nextDay > daysInMonth) {
            nextDay = 1;
            nextMonth++;
        }

        if (nextMonth > 12) {
            nextMonth = 1;
        }

        System.out.println("Keyingi sana: " + nextDay + "/" + nextMonth);
    }


//

    public String ageInWords(int age){
        if(age < 20 || age > 69){
            return "Faqat 20 dan 69 gacha yoshlar qo'llab-quvvatlanadi. ";
        }

        String result = "";
        int tens = age / 10;
        int ones = age % 10;

//onlik qismi

        switch (tens){
            case 2:
                result += "Yigirma";
                break;
            case 3:
                result +="O'ttiz";
            case 4:
                result += "Qiriq";
                break;
            case 5:
                result +="Ellik";
            case 6:
                result += "Oltmish";
        }

        //birlik qismi

        switch (ones){
            case 1:
                result += " bir";
                break;
            case 2:
                result += " ikki";
                break;
            case 3:
                result += " uch";
                break;
            case 4:
                result += " to'rt";
                break;
            case 5:
                result += " besh";
                break;
            case 6:
                result += " olti";
                break;
            case 7:
                result += " yetti";
                break;
            case 8:
                result += " sakkiz";
                break;
            case 9:
                result += " to'qqiz";
                break;
        }
result += " yosh";
        return result;
    }

//17

    public String exercisesInWords(int masala){

        if(masala < 10 || masala > 40){
            return "Faqat 10 dan 40 gacha masalalar qo'llab-quvvatlanadi.";
        }
        String result = "";
        int tens = masala / 10;
        int ones = masala % 10;

        switch (tens){
            case 1:
                result += "O'n";
                break;
            case 2:
                result += "Yigirma";
                break;
            case 3:
                result += "O'ttiz";
                break;
            case 4:
                result += "Qiriq";
                break;
        }


        switch (ones){
            case 1:
                result += " bir";
                break;
            case 2:
                result += " ikki";
                break;
            case 3:
                result += " uch";
                break;
            case 4:
                result += " to'rt";
                break;
            case 5:
                result += " besh";
                break;
            case 6:
                result += " olti";
                break;
            case 7:
                result += " yetti";
                break;
            case 8:
                result += " sakkiz";
                break;
            case 9:
                result += " to'qqiz";
                break;
        }
       result += " masala";
        return result;
    }




//18

   public String convertToWords(int number){
        if(number < 100 || number > 999){
            return "Faqat 100-999 gacha sonlarni kiritsangiz bo'ladi. ";
        }

        StringBuilder words = new StringBuilder();

        int hundreds = number / 100;
        int remainder = number % 100;
        int tens = remainder / 10;
        int ones = remainder % 10;

        switch (hundreds){
            case 1: words.append("bir yuz");break;
            case 2: words.append("ikki yuz");break;
            case 3: words.append("uch yuz");break;
            case 4: words.append("to'rt yuz");break;
            case 5: words.append("besh yuz");break;
            case 6: words.append("olti yuz");break;
            case 7: words.append("yetti yuz");break;
            case 8: words.append("sakkiz yuz");break;
            case 9: words.append("to'qqiz yuz");break;
        }

        if(remainder != 0){
            words.append(" ");

            switch (tens){
                case 1:words.append("o'n");break;
                case 2:words.append("yigirma");break;
                case 3:words.append("o'ttiz");break;
                case 4:words.append("qiriq");break;
                case 5:words.append("ellik");break;
                case 6:words.append("o'ltmish");break;
                case 7:words.append("yettmish");break;
                case 8:words.append("sakkason");break;
                case 9:words.append("to'qson");break;
            }

            if (ones > 0){
words.append(" ");

switch (ones){
    case 1:words.append("bir");break;
    case 2:words.append("ikki");break;
    case 3:words.append("uch");break;
    case 4:words.append("to'rt");break;
    case 5:words.append("besh");break;
    case 6:words.append("olti");break;
    case 7:words.append("yetti");break;
    case 8:words.append("sakkiz");break;
    case 9:words.append("to'qqiz");break;
}
            }
        }
return words.toString();
   }


   //19

    public  String findMuchal(int year) {
        // Ranglar va hayvonlar indekslari
        int rangIndex;
        int hayvonIndex;

        // 1984 yilni davrning boshi deb qabul qilamiz
        int asosiyYil = 1984;

        // Yillar farqini hisoblash
        int farq = year - asosiyYil;

        // Rang va hayvon indekslarini aniqlash
        rangIndex = (farq % 10 + 10) % 10 / 2; // Ranglar har 2 yilda bir marta takrorlanadi
        hayvonIndex = (farq % 12 + 12) % 12; // Hayvonlar har 12 yilda bir marta takrorlanadi

        // Rangni aniqlash
        String rang;
        switch (rangIndex) {
            case 0: rang = "Yashil"; break;
            case 1: rang = "Qizil"; break;
            case 2: rang = "Sariq"; break;
            case 3: rang = "Oq"; break;
            case 4: rang = "Qora"; break;
            default: rang = "Noma'lum"; break;
        }

        // Hayvonni aniqlash
        String hayvon;
        switch (hayvonIndex) {
            case 0: hayvon = "Sichqon"; break;
            case 1: hayvon = "Sigir"; break;
            case 2: hayvon = "Yo'lbars"; break;
            case 3: hayvon = "Quyon"; break;
            case 4: hayvon = "Ajdar"; break;
            case 5: hayvon = "Ilon"; break;
            case 6: hayvon = "Ot"; break;
            case 7: hayvon = "Qo'y"; break;
            case 8: hayvon = "Maymun"; break;
            case 9: hayvon = "Tovuq"; break;
            case 10: hayvon = "It"; break;
            case 11: hayvon = "To'ng'iz"; break;
            default: hayvon = "Noma'lum"; break;
        }

        // Natijani qaytarish
        return rang + " " + hayvon + " yili";
    }











}

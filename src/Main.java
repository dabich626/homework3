public class Main {
        public static void main(String[] args) {
            task1();
            task2();
            task3();
            task4();
            task5();
            task6();
            task7();
            task8();
        }

    private static void task8() {
            int mahaPay = 67760;
                    int denisPay = 83690;
                    int khristinaPay = 76230;
            float onePercentOfMahaPay = (float)67760 / 100;
            float onePercentOfDenisPay = (float)83690 / 100;
            float onePercentOfKhristinaPay = (float)76230 / 100;
            float newMashaPay = (float)onePercentOfMahaPay * 10 + (float)mahaPay;
            float newDenisPay = (float)onePercentOfDenisPay * 10 + (float)denisPay;
            float newKhristinaPay = (float)onePercentOfKhristinaPay * 10 + (float)khristinaPay;
        System.out.println("новая зарплата маши ровняется " + newMashaPay + ", новая зарплата дениса " + newDenisPay + ", а новая зарплата кристины будет " + newKhristinaPay);
int mashaPayInYear = mahaPay * 12;
int denisPayInYear = denisPay * 12;
int khristinaPayInYear = khristinaPay * 12;
int newMashaPayInYear = (int)newMashaPay * 12;
int newDenisPayInYear = (int)newDenisPay * 12;
int newKhristinaPayInYear = (int)newKhristinaPay * 12;
int payDifferenceInYearForMasha = newMashaPayInYear - mashaPayInYear;
int payDifferenceInYearForDenis = newDenisPayInYear - denisPayInYear;
int payDifferenceInYearForKhristina = newKhristinaPayInYear - khristinaPayInYear;
        System.out.println("маша теперь получает " + newMashaPay + " рублей, годовой доход вырос на " + payDifferenceInYearForMasha + " рублей");
        System.out.println("денис теперь получает " + newDenisPay + " рублей, годовой доход вырос на " + payDifferenceInYearForDenis + " рублей");
        System.out.println("кристина теперь получает " + newKhristinaPay + " рублей, годовой доход вырос на " + payDifferenceInYearForKhristina + " рублей");



    }

    private static void task7() {
            short extraWeightInGrams = 7 * 1000;
            int daysForWeightLoss = extraWeightInGrams / 250;
            int daysForWeightLoss2 = extraWeightInGrams / 500;
        System.out.println(daysForWeightLoss + "дней понадобится спорцмену для похудения при сбросе веса на 250 грамм в день и " + daysForWeightLoss2 + "дней при сбросе на 500");
    }

    private static void task6() {
            byte oneBananaWeight = 80;
            byte milkWeight = 105;
            byte iceCreamWeight = 100;
            byte eggWeight = 70;
            int totalBananaWeight = oneBananaWeight * 5;
            int totalMilkWeight = milkWeight * 2;
            int totalIceCreamWeight = iceCreamWeight * 2;
            int totalEggsWeight = eggWeight * 4;
            int breakfastWeight = totalBananaWeight + totalEggsWeight + totalMilkWeight + totalIceCreamWeight;
        System.out.println(breakfastWeight);
        float breakfastWeightInKg = (float)breakfastWeight / 1000;
        System.out.println(breakfastWeightInKg);
        System.out.println("вес завтра в граммах составит" + breakfastWeight + "а в коллиграммах" + breakfastWeightInKg);
    }

    private static void task5() {
            short totalPaintBanks = 120;
            int claasroomCoast = totalPaintBanks / 6;
        System.out.println(claasroomCoast);
        short whitePaintForOneClassroom = 2;
        short brownPaintForOneClaasroom = 4;
        int totalBrownPaintBanks = brownPaintForOneClaasroom * claasroomCoast;
        int totalWhitePaintBanks = whitePaintForOneClassroom * claasroomCoast;
        System.out.println("в школе где" + claasroomCoast +"классов нужно" + totalWhitePaintBanks + "банок белой краски и" + totalBrownPaintBanks + "банок коричневой");

    }

    private static void task4() {
            byte bottleCoastFor2Mins = 16;
            byte timeCoastfor16Bottles = 2;
            int bottleCoastFor20Mins = bottleCoastFor2Mins * 10;
        System.out.println("за 20 минут машина произвела" + bottleCoastFor20Mins + "бутылок");
        int bottelsForMin = bottleCoastFor2Mins / timeCoastfor16Bottles;
        System.out.println(bottelsForMin);
        int minsInOneDay = 60 * 24;
        int bottlesForDay = minsInOneDay * bottelsForMin;
        System.out.println("в сутки машина произведет" + bottlesForDay + "бутылок");
        int minsIn3Days = minsInOneDay * 3;
        int bottlesFor3Days = minsIn3Days * bottelsForMin;
        System.out.println("за три дня машина произведет" + bottlesFor3Days + "бутылок");
        long minsInMouth = minsInOneDay * 31;
        long bottleForMonth = minsInMouth * bottelsForMin;
        System.out.println("за месяц машина произведет" + bottleForMonth + "бутылок");
    }

    private static void task3() {
            byte ludmilaStudents = 23;
                    byte annaStudents = 27;
                    byte ekaterinaStudents = 30;
                    short sheetsNumber = 480;
                    int totalStudents = ludmilaStudents + annaStudents + ekaterinaStudents;
        System.out.println(totalStudents);
        int sheetsForOne = sheetsNumber / totalStudents;
        System.out.println(" на каждого ученика рассчитано" + sheetsForOne + "листов бумаги");

    }

    public static void task1 () {
            byte greenSnakeLength = 100;
            short blueSnakeLegth = 500;
            int redSnakeLegth = 42000;
            long yellowSnakeLeght = 1000000000;
            System.out.println("значение переменной  greenSnakeLength с типом byte равно" + greenSnakeLength);
            System.out.println("значение переменной  blueSnakeLegth с типом short равно" + blueSnakeLegth);
            System.out.println("значение переменной  redSnakeLength с типом  int равно" + redSnakeLegth);
            System.out.println("значение переменной  yellowSnakeLength с типом long равно" + yellowSnakeLeght);
            float puppleSnakelegth = 2.15f;
            double blackSnakeLegth = 14.5555d;
            System.out.println("значение переменной  purpleSnakeLength с типом float равно" + puppleSnakelegth);
            System.out.println("значение переменной  blackSnakeLength с типом long равно" + blackSnakeLegth);

        }

        public static void task2 () {
            float one = 27.12f;
            long two = 987678965549L;
            float tree = 2.786f;
            short four = 569;
            short five = - 159;
            short six = 27897;
            byte seven = 67;



        }
    }
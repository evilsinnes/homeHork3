public class Main {
    public static void main(String[] args) {
        //задача 1
        int time = 10000000;
        byte book = -120;
        short litrs = 20000;
        long list = 22222222;
        float mass = 0.123456f;
        double speed = 1.23456789;
        System.out.println("Значение переменной " + "с типом int равно " + time);
        System.out.println("Значение переменной " + "с типом byte " + "равно " + book);
        System.out.println("Значение переменной " + "с типом short равно " + litrs);
        System.out.println("Значение переменной " + "с типом long равно " + list);
        System.out.println("Значение переменной " + "с типом float равно " + mass);
        System.out.println("Значение переменной " + "с типом double равно " + speed);
        //задача 2
        float cat = 27.12f;
        long dog = 987678965549L;
        double tigers = 2.786;
        int cows = 569;
        short ticket = -159;
        long capCoffee = 27897;
        byte cart = 67;
        // задача 3
        int totallist = 480;
        byte oneClassPupel = 23;
        byte twoClassPupel = 27;
        byte threeClassPupel = 30;
        int totalPupel = oneClassPupel + twoClassPupel + threeClassPupel;
        int listForOnePupel = totallist / totalPupel;
        System.out.println("на каждого ученика рассчитано " + listForOnePupel + " листов бумаги");
        //задача 4
        int bottle = 16;
        int timeWork = 2;
        int bottlePerMinute = bottle / timeWork;
        int timeWork1 = 20;
        int bottleIn20Minut = timeWork1 * bottlePerMinute;
        System.out.println("За " + timeWork1 + " минут машина произвела " + bottleIn20Minut + " штук бутылок");
        int hrPerMin = 60;
        int timeWork2 = 1;
        int oneDayPerHr = 24;
        int minutInOneDay = timeWork2 * oneDayPerHr * hrPerMin;
        int bottleInOneday = minutInOneDay * bottlePerMinute;
        System.out.println("За " + timeWork2 + " сутки" + " машина произвела " + bottleInOneday + " штук бутылок");
        int timeWork3 = 3;
        int minutInThreeDays = timeWork3 * oneDayPerHr * hrPerMin;
        int bottleInThreeDays = minutInThreeDays * bottlePerMinute;
        System.out.println("За " + timeWork3 + " дня машина произвела " + bottleInThreeDays + " штук бутылок");
        int timeWork4 = 1;
        int monthPerDay = 30;
        int minutInMonth = monthPerDay * minutInOneDay;
        int bottleInMonth = minutInMonth * bottlePerMinute;
        System.out.println("За " + timeWork4 + " месяц машина произвела " + bottleInMonth + " штук бутылок");
        //задача 5
        int totalPot = 120;
        int whitePotOnClass = 2;
        int brownPotOnClass = 4;
        int totalPotOnClass = whitePotOnClass + brownPotOnClass;
        int classRoom = totalPot / totalPotOnClass;
        int whitePot = classRoom * whitePotOnClass;
        int brownPot = classRoom * brownPotOnClass;
        System.out.println("В школе, где " + classRoom + " классов, нужно " + whitePot + " банок белой краски и " + brownPot + " банок коричневой краски");
        //задача 6
        byte bananas = 5;
        byte weightBanana = 80;
        int milkMl = 200;
        double mlPerGm = 105 / 100D;
        int iceCream = 2;
        int weightIceCream = 100;
        int egg = 4;
        int weightEgg = 70;
        int grPerKg = 1000;
        double weightBreakfastGr = bananas * weightBanana + iceCream * weightIceCream + egg * weightEgg + milkMl * mlPerGm;
        double weightBreakfastKg = (double) weightBreakfastGr / grPerKg;
        System.out.println("Вес спортзавтрака " + weightBreakfastGr + " г");
        System.out.println("Вес спортзатрака " + weightBreakfastKg + " кг");
        //задача 7
        int loseWeightKg = 7;
        int loseWeightGr = loseWeightKg * grPerKg;
        int loseWeightInDayMin = 250;
        int loseWeightInDayMax = 500;
        double averageLoseWeight = (loseWeightInDayMax + loseWeightInDayMin) / 2D;
        int dayLose250 = loseWeightGr / loseWeightInDayMin;
        System.out.println("Если спортсмен будет терять каждый день 250 г, то на похудение уйдет " + dayLose250 + " дней");
        int dayLose500 = loseWeightGr / loseWeightInDayMax;
        System.out.println("Если спортсмен будет терять каждый день 500 г, то на похудение уйдет " + dayLose500 + " дней");
        double averageDayLose = loseWeightGr / averageLoseWeight;
        System.out.println("Среднее количество дней для похудения " + averageDayLose);
        //Задача 8
        int MashaPay = 67760;
        int DenisPay = 83690;
        int KristinaPay = 76230;
        int monthInYear = 12;
        double percent10 = 1.1;
        int MashaPayInYear = MashaPay * monthInYear;
        int DenisPayInYear = DenisPay * monthInYear;
        int KristinaPayInYear = KristinaPay * monthInYear;
        int newMashaPay = (int) (MashaPay * percent10);
        int newMashaPayinYear = newMashaPay * monthInYear;
        int upPayInYearMasha = newMashaPayinYear - MashaPayInYear;
        System.out.println("Маша теперь получает " + newMashaPay + " рублей. Годовой доход вырос на " + upPayInYearMasha + "рублей");
        int newDenicPay = (int) (DenisPay * percent10);
        int newDenicPayinYear = newDenicPay * monthInYear;
        int upPayInYearDenic = newDenicPayinYear - DenisPayInYear;
        System.out.println("Маша теперь получает " + newDenicPay + " рублей. Годовой доход вырос на " + upPayInYearDenic + "рублей");
        int newKristinaPay = (int) (KristinaPay * percent10);
        int newKristinaPayinYear = newKristinaPay * monthInYear;
        int upPayInYearKristina = newKristinaPayinYear - KristinaPayInYear;
        System.out.println("Маша теперь получает " + newKristinaPay + " рублей. Годовой доход вырос на " + upPayInYearKristina + "рублей");
    }
}
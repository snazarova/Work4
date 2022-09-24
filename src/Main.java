public class Main {
    public static void main(String[] args) {
        // task1
        int a = 200;
         byte b = 100;
         short c = 1000;
         long d = 1000000L;
         float e = 2.457564F;
         double h = 1.87665554443;
         boolean ring = a > 100;

        System.out.println("Значение переменной a с типом int равно " + a);
        System.out.println("Значение переменной b стипом byte равно " + b);
        System.out.println("Значение переменной c с типом short равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("значение переменной e  с типом float равно " + e);
        System.out.println("Значение переменной h с типом double равно " + h);

        // task2
        double value = 27.12;
        long time = 987678965549L;
        float number = 2.786F;
        boolean catWeight = value < 15;
        short apple = 569;
        short length = -159;
        int price = 27897;
        byte pen = 67;

        // task3
        short studentsOfTeacher1 = 23;
        short studentsOfTeacher2 = 27;
        short studentsOfTeacher3 = 30;
        short allSheets = 480;
        int allStudents = studentsOfTeacher2 + studentsOfTeacher1 + studentsOfTeacher3;
        int sheetsFor1Student = allSheets / allStudents;
        System.out.println("Всего листов на одного студента " + sheetsFor1Student + " шт");

        // task4
        int capacity = 16 / 2;
        int capacity20Min = capacity * 20;
        int capacityDay = capacity * 24 * 60;
        int capacityFor3Day = capacityDay * 3;
        int capacityForMonth = capacityDay * 30;
        System.out.println("За 20 минут машина произвела бутылок " + capacity20Min + " шт");
        System.out.println("За сутки машина произвела бутылок " + capacityDay + " шт");
        System.out.println("За 3 дня машина произвела бутылок " + capacityFor3Day + " шт");
        System.out.println("За месяц машина произвела бутылок " + capacityForMonth + " шт");

        // task5
        int allPot = 120;
        int witePot = 2;
        int brownPot = 4;
        int potFor1Class = witePot + brownPot;
        int allClass = allPot / potFor1Class;
        int allWitePot = allClass * witePot;
        int allBrownPot = allClass * brownPot;
        System.out.println("В школе, где" + allClass + " классов, нужно" + allWitePot + " банок белой краски и " + allBrownPot +" банок коричневой краски");

        // task6
        float grInKg = 1000F;
        int allBananas = 5;
        int allMilk = 2;
        int allIceCream = 2;
        int allEgg = 4;
        int bananaWeight = 80;
        int milkWeight = 105;
        int iceCreamWeight = 100;
        int eggWeight = 70;
        int allWeight = (allBananas * bananaWeight) + (allMilk * milkWeight) + (allIceCream * iceCreamWeight) + (allEgg * eggWeight);
        float allWeightKg = allWeight / grInKg;
        System.out.println("Вес спорт завтрака в граммах - " + allWeight + " вес в кг составляет" + allWeightKg);

        // task7
        int neeedLooseKg = 7;
        int GrInKg = 1000;
        float needLooseGr = neeedLooseKg * grInKg;
        int minToLoose = 250;
        int maxToLoose = 500;
        float minDay = needLooseGr * minToLoose;
        float maxDay = needLooseGr * maxToLoose;
        float avrDay = (minDay + maxDay) / 2;
        System.out.println("Минимальное количество дней для похудения " + minDay + " . Максимальное количество дней" + maxDay);
        System.out.println("Среднее количество дней " + avrDay);

        // task8
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        int percent = 10;
        float newSalary = 1 + (percent / 100F);
        float mashaNewSalary = masha * newSalary;
        float mashaSalaryDifference = (mashaNewSalary - masha) * 12;
        float denisNewSalary = denis * newSalary;
        float denisSalaryDifference = (denisNewSalary - denis) * 12;
        float kristinaNewSalary = kristina * newSalary;
        float kristinaSalaryDifference = (kristinaNewSalary - kristina) * 12;
        System.out.println("После повышения зп маша будет получать " + mashaNewSalary + "руб, разница между годовыми доходами составит" + mashaSalaryDifference);
        System.out.println("После повышения зп Денис будет получать " + denisNewSalary + "руб, разница между годовым доходом " + denisSalaryDifference);
        System.out.println("После повышения зп кристина получит " + kristinaNewSalary + " руб, разница между годовым доходом " + kristinaSalaryDifference);










    }
}
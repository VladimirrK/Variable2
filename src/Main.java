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

    public static void task1() {
        System.out.println("Задача 1");
        int apples = 186500;
        System.out.println("Значение переменной apples с типом int равно " + apples + " шт");
        byte pears = 114;
        System.out.println("Значение переменной pears с типом byte равно " + pears + " шт");
        short plums = 14620;
        System.out.println("Значение переменной plums с типом short равно " + plums + " шт");
        long nuts = 264985L;
        System.out.println("Значение переменной nuts с типом long равно " + nuts + " шт");
        float tangerines = 2.4f;
        System.out.println("Значение переменной tangerines с типом float равно " + tangerines + " кг");
        double watermelons = 3.485;
        System.out.println("Значение переменной watermelons с типом double равно " + watermelons + " кг");
    }

    public static void task2() {
        System.out.println("Задача 2");
        float a = 27.12f;
        long b = 987678965549L;
        double c = 2.786;
        short d = 569;
        short e = -159;
        int f = 27897;
        byte g = 67;
        System.out.println(" " + a + " " + b + " " + c + " " + d + " " + e + " " + f + " " + g + " ");
    }

    public static void task3() {
        System.out.println("Задача 3");
        byte LP = 23;
        byte AC = 27;
        byte EA = 30;
        short sheets = 480;
        int sheetsToEach = sheets / (LP + AC + EA);
        System.out.println("На каждого ученика рассчитано " + sheetsToEach + " листов бумаги");
    }

    public static void task4() {
        System.out.println("Задача 4");
        byte machinePerformance = 8;
        int a = machinePerformance * 20;
        System.out.println("За 20 минут машина произвела " + a + " штук бутылок");
        int b = machinePerformance * 1440;
        System.out.println("За сутки машина произвела " + b + " штук бутылок");
        int c = machinePerformance * 4320;
        System.out.println("За 3 дня машина произвела " + c + " штук бутылок");
        int d = machinePerformance * 43200;
        System.out.println("За 1 месяц машина произвела " + d + " штук бутылок");
    }

    public static void task5() {
        System.out.println("Задача 5");
        short totalCans = 120;
        byte forOneClassWhite = 2;
        byte forOneClassBrown = 4;
        int numberOfClasses = totalCans / (forOneClassWhite + forOneClassBrown);
        int totalWhite = numberOfClasses * forOneClassWhite;
        int totalBrown = numberOfClasses * forOneClassBrown;
        System.out.println("В школе, где " + numberOfClasses + " классов, нужно " + totalWhite + " банок белой краски и " + totalBrown + " банок коричневой краски");
    }
    public static void task6() {
        System.out.println("Задача 6");
        short bananas = 80 * 5;
        short milk = 105 * 2;
        short iceCream = 100 * 2;
        short eggs = 70 * 4;
        int breakfast = bananas + milk + iceCream + eggs;
        float kg = breakfast / 1000f;
        System.out.println("Вес завтрака " + breakfast + " грамм " + kg + " килограмм");
    }
    public static void task7() {
        System.out.println("Задача 7");
        short reset = 7000;
        int min = reset / 250;
        System.out.println("если спортсмен будет терять каждый день по 250 грамм, на похудение уйдет " + min + " дней");
        int max = reset / 500;
        System.out.println("если спортсмен будет терять каждый день по 500 грамм, на похудение уйдет " + max + " дней");
        int average = (min + max) / 2;
        System.out.println("в среднем может потребоваться " + average + " дней");
    }
    public static void task8() {
        System.out.println("Задача 8");
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        int annualM1 = masha * 12;
        int annualD1 = denis * 12;
        int annualK1 = kristina * 12;
        float increaseM = annualM1 * 0.1f;
        float increaseD = annualD1 * 0.1f;
        float increaseK = annualK1 * 0.1f;
        float annualM2 = increaseM + annualM1;
        float annualD2 = increaseD + annualD1;
        float annualK2 = increaseK + annualK1;
        float salaryM = annualM2 / 12f;
        float salaryD = annualD2 / 12f;
        float salaryK = annualK2 / 12f;
        float differenceM = annualM2 - annualM1;
        float differenceD = annualD2 - annualD1;
        float differenceK = annualK2 - annualK1;
        System.out.println("Маша теперь получает " + salaryM + " рублей. Годовой доход вырос на " + differenceM + " рублей");
        System.out.println("Денис теперь получает " + salaryD + " рублей. Годовой доход вырос на " + differenceD + " рублей");
        System.out.println("Кристина теперь получает " + salaryK + " рублей. Годовой доход вырос на " + differenceK + " рублей");
    }
}
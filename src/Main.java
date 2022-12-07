public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
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
    }
}
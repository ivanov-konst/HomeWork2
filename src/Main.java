public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
// Задача 1
        byte bananas = 10;
        short aples = 200;
        int oranges = 250;
        long wotermelon = 350L;
        float lemons = 2.5f;
        double grape = 3.5;

// Задача 2
        float boxerOne = 78.2f;
        float boxerTwo = 82.7f;
        float totalWeight = boxerOne + boxerTwo;
        System.out.println("общий весь боксеров " +totalWeight+ " кг");

        float WeightDifference = boxerTwo - boxerOne;
        System.out.println("разница в весе " +WeightDifference+ " кг");

// Задача 3
        byte bananas_ = 5;
        short milk = 200;
        byte icecreames = 2;
        byte egs = 4;
        int bananasSummWeight = bananas_ * 80;
        int milkSummWeight = 105*2;
        int icecreamesSummWeight = icecreames * 100;
        int egsSummWeight = egs * 70;
        int productSummWeight = bananasSummWeight + milkSummWeight + icecreamesSummWeight + egsSummWeight;
        System.out.println("итого " +productSummWeight+ " грамм");
        float productSummWeightKg = productSummWeight / 1000f;
        System.out.println("итого " +productSummWeightKg+ " кг");

// Задача 4
        int FinalResult = 7 * 1000;
        int minResultOneDays = 250;
        int maxResultOneDays = 500;
        int maxDays = FinalResult / minResultOneDays;
        System.out.println("минимальное количество дней " +maxDays+ "");
        int minDays = FinalResult / maxResultOneDays;
        System.out.println("максимальное количество дней " +minDays+ "");
        int averageDays =  (maxDays + minDays) / 2;
        System.out.println("среднее количество дней " +averageDays+ "");

// Задача 5
        int SalaryMasha = 67760;
        int SalaryDenis = 83690;
        int SalaryKristina = 76230;
        int SalaryMasha10 = (SalaryMasha * 10) / 100 + SalaryMasha;
        int SalaryDenis10 = (SalaryDenis * 10) / 100 + SalaryDenis;
        int SalaryKristina10 = (SalaryKristina * 10) / 100 + SalaryKristina;
        System.out.println("ЗП Маши с учетом увеличения " +SalaryMasha10+ " рублей");
        System.out.println("ЗП Дениса с учетом увеличения " +SalaryDenis10+ " рублей");
        System.out.println("ЗП Кристины с учетом увеличения " +SalaryKristina10+ " рублей");
        int SalaryMashaOneYear = SalaryMasha * 12;
        int SalaryDenisOneYear = SalaryDenis * 12;
        int SalaryKristinaOneYear = SalaryKristina * 12;
        System.out.println("ЗП Маши в год до увеличения " +SalaryMashaOneYear+ " рублей");
        System.out.println("ЗП Дениса в год до увеличения " +SalaryDenisOneYear+ " рублей");
        System.out.println("ЗП Кристины в год до увеличения " +SalaryKristinaOneYear+ " рублей");
        int SalaryMashaOneYear10 = SalaryMasha10 * 12;
        int SalaryDenisOneYear10 = SalaryDenis10 * 12;
        int SalaryKristinaOneYear10 = SalaryKristina10 * 12;
        System.out.println("ЗП Маши в год с учетом увеличения " +SalaryMashaOneYear10+ " рублей");
        System.out.println("ЗП Дениса с учетом увеличения " +SalaryDenisOneYear10+ " рублей");
        System.out.println("ЗП Кристины в год с учетом увеличения " +SalaryKristinaOneYear10+ " рублей");
        int SalaryDifferenceMashaOneYear = SalaryMashaOneYear10 - SalaryMashaOneYear;
        int SalaryDifferenceDenisOneYear = SalaryDenisOneYear10 - SalaryDenisOneYear;
        int SalaryDifferenceKristinaOneYear = SalaryKristinaOneYear10 - SalaryKristinaOneYear;
        System.out.println("Разница в год ЗП Маши учетом увеличения " +SalaryDifferenceMashaOneYear+ " рублей");
        System.out.println("Разница в год ЗП Дениса учетом увеличения " +SalaryDifferenceDenisOneYear+ " рублей");
        System.out.println("Разница в год ЗП Кристины учетом увеличения " +SalaryDifferenceKristinaOneYear+ " рублей");


// Задача 6
        byte a = 12;
        byte b = 27;
        byte c = 44;
        byte d = 15;
        byte e = 9;
        int result =  a * (b + (c - d * e));
        System.out.println("Результат " +result+ "");
        int resultTwo = a * (b + (c - d * e)) * -1;
        System.out.println("Результат два " +resultTwo+ "");

// Задача 7 ( в условиях задачи перменные называются "a" и "b", но так как в проекте уже используются такие - изменены на "a1" и "b1")

        int a1 = 5;
        int b1 = 7;
        a1 = a1 * b1;
        b1 = a1 / b1;
        a1 = a1 / b1;
        System.out.println("новое значение для a = " +a1);
        System.out.println("новое значение для b = " +b1);


// задача 8
        int a5 = 489;
        int b5 = (a5 / 10) % 10;
        System.out.println("цифра, которая находится в центре значения переменной а = " +b5);
    }
}
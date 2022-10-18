package lesson10;

import org.w3c.dom.ls.LSOutput;

public class lesson10 {
    public static void main(String[] args) {
        //Домашняя работа 1
        System.out.println("Домашняя работа");
        //Задание 1,2,3
        System.out.println("Задание 1,2,3");
        int[] expenses = new int[30];
        expenses[0] = 100000;
        expenses[1] = 105000;
        expenses[2] = 110000;
        expenses[3] = 115000;
        expenses[4] = 120000;
        expenses[5] = 125000;
        expenses[6] = 130000;
        expenses[7] = 135000;
        expenses[8] = 140000;
        expenses[9] = 145000;
        expenses[10] = 150000;
        expenses[11] = 155000;
        expenses[12] = 160000;
        expenses[13] = 165000;
        expenses[14] = 170000;
        expenses[15] = 175000;
        expenses[16] = 180000;
        expenses[17] = 185000;
        expenses[18] = 190000;
        expenses[19] = 195000;
        expenses[20] = 200000;
        expenses[21] = 168000;
        expenses[22] = 152000;
        expenses[23] = 111000;
        expenses[24] = 186000;
        expenses[25] = 114000;
        expenses[26] = 125000;
        expenses[27] = 199000;
        expenses[28] = 133000;
        expenses[29] = 121000;
        int monthlyExpenses = (expenses[0] + expenses[1] + expenses[2] + expenses[3] + expenses[4] + expenses[5] + expenses[6] + expenses[7] + expenses[8] + expenses[9] + expenses[10] + expenses[11] + expenses[12] + expenses[13] + expenses[14] + expenses[15] + expenses[16] + expenses[17] + expenses[18] + expenses[19] + expenses[20] + expenses[21] + expenses[22] + expenses[23] + expenses[24] + expenses[25] + expenses[26] + expenses[27] + expenses[28] + expenses[29]);
        System.out.println("Сумма трат за месяц составила " + monthlyExpenses + " рублей");

        int maxSpendingPerDay = 100;
        for (int i = 0; i < expenses.length; i++) {
            if (expenses[i] > maxSpendingPerDay) {
                maxSpendingPerDay = expenses[i];
            }
        }
        int minSpendingPerDay = 250000;
        for (int i = 0; i < expenses.length; i++) {
            if (expenses[i] < minSpendingPerDay) {
                minSpendingPerDay = expenses[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSpendingPerDay + " рублей.Максимальная сумма трат за день составила " + maxSpendingPerDay + " рублей");

        double averageAmount = (monthlyExpenses/30);
        System.out.println("Средняя сумма трат за месяц составила " + averageAmount + " рублей");

        //Задание 4
        System.out.println("Задание 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }



    }
}

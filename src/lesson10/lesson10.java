package lesson10;

import org.w3c.dom.ls.LSOutput;

public class lesson10 {
    public static void main(String[] args) {
        //Домашняя работа 1
        System.out.println("Домашняя работа");
        //Задание 1,2,3
        System.out.println("Задание 1,2,3");
        int many = 0;
        for (int i : arr) {
            many = (many + i); // Общая трата за 15 лет!
        }
            System.out.println(many);

        int maxSpendingPerDay = 100000;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxSpendingPerDay) {
                maxSpendingPerDay = arr[i];
            }
        }
        int minSpendingPerDay = 200000;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minSpendingPerDay) {
                minSpendingPerDay = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSpendingPerDay + " рублей.Максимальная сумма трат за день составила " + maxSpendingPerDay + " рублей");


        double averageAmount = (many / 5475);
        System.out.println("Средняя сумма трат за месяц составила " + averageAmount + " рублей");

        //Задание 4
        System.out.println("Задание 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
        static int[] arr = generateRandomArray();
        public static int[] generateRandomArray() {
            java.util.Random random = new java.util.Random();
            int[] arr = new int[5475]; // дней за 15 лет
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i] = random.nextInt(100_000) + 100_000);
            }
            return arr;
        }
    }

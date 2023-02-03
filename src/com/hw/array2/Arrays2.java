package com.hw.array2;

public class Arrays2 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
//      Вариант с циклом for
        int maxSpending = arr[0];
        int minSpending = arr[0];
        String text1 = "Максимальная сумма трат за день составила ";
        String text2 = " рублей";
        String text3 = "Минимальная сумма трат за день составила ";
        for (int i = 0; i < arr.length; i++) {
            final int current = arr[i];
            if (current < minSpending) {
                minSpending = current;
            }
            if (current > maxSpending) {
                maxSpending = current;
            }
        }
        System.out.println(text1 + maxSpending + text2);
        System.out.println(text3 + minSpending + text2);
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();
        double amount = 0;
        String text1 = "Средняя сумма трат за месяц составила ";
        String text2 = " рублей";
        for (int i : arr) {
            amount += i;
        }
        double averageAmount = amount / arr.length;
        System.out.println(text1 + averageAmount + text2);
    }

    public static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}

package com.hw.array2;

public class Arrays2 {
    public static void main(String[] args) {
        task1();
        task2();
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
        int maxSpending = 0;
        int minSpending = -1;
        String text1 = "Максимальная сумма трат за день составила ";
        String text2 = " рублей";
        String text3 = "Минимальная сумма трат за день составила ";
        for (int i = 0; i < arr.length; i++) {
            final int current = arr[i];
            if (current > maxSpending) {
                maxSpending = current;
            }
        }
        System.out.println(text1 + maxSpending + text2);
//      Вариант с for each
        for (final int current : arr) {
            if (current > maxSpending) {
                maxSpending = current;
            }
        }
        System.out.println(text1 + maxSpending + text2);
//      Вариант с циклом for
        for (int i = 0; i < arr.length - 1; i++) {
            final int current = arr[i];
            final int next = arr[i + 1];
            if (current > next) {
                minSpending = next;
            }
        }
        System.out.println(text3 + minSpending + text2);
    }
}

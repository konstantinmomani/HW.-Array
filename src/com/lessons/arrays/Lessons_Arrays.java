package com.lessons.arrays;

public class Lessons_Arrays {
    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] rack = new int[4];
        rack[0] = 12;
        rack[1] = 9;
        rack[2] = 11;
        rack[3] = 10;
        int[] rack2 = new int[4];
        rack2[0] = 12;
        rack2[1] = 9;
        rack2[2] = 11;
        rack2[3] = 10;
        boolean rackAreEqual = true;
        rackAreEqual = rack.length == rack2.length;
        if (rackAreEqual) {
            for (int i = 0; i < rack.length; i++) {
                if (rack[i] != rack2[i]) {
                    rackAreEqual = false;
                }
            }
        }
        if (rackAreEqual) {
            System.out.println("Стелажи равны");
        } else {
            System.out.println("Стелажи разные");
        }
        int sum = 0;
        for (int index = 0; index < rack.length; index++) {
            sum += rack[index];
        }
        System.out.println(sum);
        int sum2 = 0;
        for (int element : rack) {
            sum2 += element;
        }
        System.out.println(sum2);
        int max = -1;
        for (int i = 0; i < rack.length; i++) {
            final int current = rack[i];
            if (current > max) {
                max = current;
            }
        }
        System.out.println(max);
        for (final int current : rack) {
            if (current > max) {
                max = current;
            }
        }
        System.out.println(max);
        for (int i = 0; i < rack.length - 1 && rack[i + 1] != 0; i++) {
            System.out.println(rack[i + 1] - rack[i]);
        }
    }
}
package com.hw.array1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        task123();
    }

    public static void task123() {
        System.out.println("Задача1");
        int[] numbers = new int [3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        for (int i = 0; i < numbers.length; i++) {
            if (i < numbers.length - 1) {
                System.out.print(numbers[i] + ", ");
            } else {
                System.out.print(numbers[i] + "\n");
            }
        }
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(numbers[i] + ", ");
            } else {
                System.out.print(numbers[i] + "\n");
            }
        }
        double[] numbers2 = {1.57, 7.654, 9.986};
        for (int i = 0; i < numbers2.length; i++) {
            if (i < numbers2.length - 1) {
                System.out.print(numbers2[i] + ", ");
            } else {
                System.out.print(numbers2[i] + "\n");
            }
        }
        for (int i = numbers2.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(numbers2[i] + ", ");
            } else {
                System.out.print(numbers2[i] + "\n");
            }
        }
        String[] namesOfMonth = new String[12];
        namesOfMonth[0] = "January";
        namesOfMonth[1] = "February";
        namesOfMonth[2] = "March";
        namesOfMonth[3] = "April";
        namesOfMonth[4] = "May";
        namesOfMonth[5] = "June";
        namesOfMonth[6] = "July";
        namesOfMonth[7] = "August";
        namesOfMonth[8] = "September";
        namesOfMonth[9] = "October";
        namesOfMonth[10] = "November";
        namesOfMonth[11] = "December";
        for (int i = 0; i < namesOfMonth.length; i++) {
            if (i < namesOfMonth.length - 1) {
                System.out.print(namesOfMonth[i] + ", ");
            } else {
                System.out.print(namesOfMonth[i] + "\n");
            }
        }
        for (int i = namesOfMonth.length - 1; i >=0; i--) {
            if (i > 0) {
                System.out.print(namesOfMonth[i] + ", ");
            } else {
                System.out.println(namesOfMonth[i]);
            }
        }

    }
}
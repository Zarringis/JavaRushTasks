package com.javarush.task.pro.task05.task0506;

import java.util.Scanner;

/* 
Минимальное из N чисел
*/
//TODO тестирование не прошло
public class Solution {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        Scanner console = new Scanner(System.in);
        int N = console.nextInt();
        array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = console.nextInt(); // заполняем массив элементами
        }
        for (int i = 0; i < N; i++) {
            System.out.println(array[i]); // выводит массив
        }
        int min = array[0];

        for (int i = 0; i < N; i++) {
            if (array[i] < min)
                min = array[i];
        }
        System.out.println(min);
    }
}

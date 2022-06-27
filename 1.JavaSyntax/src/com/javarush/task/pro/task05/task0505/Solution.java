package com.javarush.task.pro.task05.task0505;

import java.util.Scanner;

/* 
Reverse
*/
public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int[] array;
        int N = console.nextInt();
        if (N <= 0)
            return; //выйти из текущего метода
        array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = console.nextInt(); // заполняет массив элементами
        }

        if (N % 2 == 0)
            for (int l = array.length - 1; l >= 0; l--) {
                System.out.println(array[l]); //выводит в обратном порядке
            }
        else
            for (int i = 0; i < N; i++) {
                System.out.println(array[i]); // выводит массив в порядке ввода
            }
    }
}

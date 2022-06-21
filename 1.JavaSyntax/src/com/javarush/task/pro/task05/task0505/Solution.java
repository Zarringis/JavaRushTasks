package com.javarush.task.pro.task05.task0505;

import java.util.Scanner;

/* 
Reverse
*/
//TODO как вывести в обратном порядке
public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int [] array;
        int N = console.nextInt();
        array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = console.nextInt(); // заполняет массив элементами
        }
        for (int i = 0; i < N; i++) {
            if (N % 2 == 1)
            System.out.println(array[i]); // выводит массив в порядке ввода
            else
                for (int l = 0; l < N; l++){
                    array[l] = N - l;
                    System.out.println(array[l]); //нужно вывести в обратном порядке
                }
        }

    }
}

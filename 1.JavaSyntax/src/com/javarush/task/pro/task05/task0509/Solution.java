package com.javarush.task.pro.task05.task0509;

/* 
Таблица умножения
*/

public class Solution {

    public static int[][] MULTIPLICATION_TABLE = new int[10][10];

    public static void main(String[] args) {

        for (int i = 0; i < MULTIPLICATION_TABLE.length; i++) {

            for (int a = 0; a < MULTIPLICATION_TABLE.length; a++) {
                MULTIPLICATION_TABLE[i][a] = (a + 1) * (i + 1);
            }
        }
        for (int i = 0; i < MULTIPLICATION_TABLE.length; i++) {

            for (int a = 0; a < MULTIPLICATION_TABLE.length; a++) {
                System.out.print(MULTIPLICATION_TABLE[i][a] + " ");
            }
            System.out.println();
        }
    }
}


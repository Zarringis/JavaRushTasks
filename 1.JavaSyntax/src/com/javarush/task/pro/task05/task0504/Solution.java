package com.javarush.task.pro.task05.task0504;

/* 
Объединяем массивы
*/
public class Solution {
    public static int[] firstArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    public static int[] secondArray = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
    public static int[] resultArray;

    public static void main(String[] args) {
        resultArray = new int[firstArray.length + secondArray.length];
        int add = 0;
        for (int i = 0; i < firstArray.length; i++) {
            resultArray[i] = firstArray[i];
            add++; //значения элементов массива firstArray скопированы в массив resultArray
        }
        for (int l = 0; l < secondArray.length; l++) {
            resultArray[add++] = secondArray[l]; //в массив resultArray присвоили значения элементов массива secondArray
        }
        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i] + ", "); //вывод в консоль все значения массива resultArray
        }
    }
}

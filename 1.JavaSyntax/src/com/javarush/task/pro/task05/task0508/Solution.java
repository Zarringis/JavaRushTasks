package com.javarush.task.pro.task05.task0508;

import java.util.Scanner;

/* 
Удаляем одинаковые строки
*/

public class Solution {
    public static String[] strings;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        strings = new String[6];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = input.nextLine(); //заполняет массив элементами
        }
        for (int i = 0; i < strings.length; i++) {  //обработка?
            String current = strings[i]; //временная переменная для сравнения
            if (current != null) {
                for (int j = i + 1; j < strings.length; j++) {
                    if (strings[j] != null) { //сравнивает элемент массива с другим элеметом
                        if (current.equals(strings[j])) {
                            strings[i] = null;
                            strings[j] = null;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < strings.length; i++) { //выводит
            System.out.print(strings[i] + ", ");
        }
    }
}

package com.epam.Marina_Tsytsoeva.java.lesson1.task1;

import java.util.Arrays;

/**
 * @author  Marina Tsytsoeva
 * Lesson1.task1.version4
 */

public class RandMassiv {
    public static void main(String[] args) {
        RandMassiv app = new RandMassiv();
        app.utroenie();
    }

//В массиве целых чисел утроить каждый положительный элемент, который стоит перед отрицательным
    public void utroenie() {
        int[] arr = new int[20];
//Инициализация массива
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int) (Math.random() * 21) - 10);
        }
//Вывод элементов массива на экран
        System.out.println(Arrays.toString(arr));
// Утроение положительных элементов, которые стоят перед отрицательными
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] >= 0 & arr[i + 1] < 0) {
                arr[i] = arr[i] * 3;
            }
        }
//Вывод результата
        System.out.println(Arrays.toString(arr));
    }

}
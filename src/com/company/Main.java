package com.company;
import java.util.HashSet;
//Варіант 25 -> 5
//Завдання: 1,2,8,11,19
class TasksOfLab1 {
//Завдання 1
//Розробіть метод, який дозволяє знайти спільні елементи двох диапазонів цілих чисел, та вивести їх на екран
//Приклад: діапазон з 5 до 11 та діапазон з 18 до 9. Спільні елементи - 9,10,11
    public void commonElem(int l1, int r1, int l2, int r2) {
        //[l1, r1], [l2, r2]
        //Перший діапазон
        int firstLeftBoundary = Math.min(l1, r1);
        int firstRightBoundary = Math.max(l1, r1);
        //Другий діапазон
        int secondLeftBoundary = Math.min(l2, r2);
        int secondRightBoundary = Math.max(l2, r2);
        if ((firstLeftBoundary < secondRightBoundary || firstRightBoundary > secondLeftBoundary)) {
            int finalLeft = Math.max(firstLeftBoundary,secondLeftBoundary );
            int finalRight = Math.min(firstRightBoundary,secondRightBoundary);
            for (int i = finalLeft; i <= finalRight; i++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
        else {
            System.out.println("Ranges don`t intersect");
        }
    }
//Завдання 2
//Розробіть метод, який виводить на екран спільні елементи будь яких двох 2-вимірних масивів int[][]
//Результат роботи методу не повинин залежити від того чи є масив регулярним, чи ірегулярним(ступенчатим).
    public void commonElemInArrays(int[][] arr1, int[][] arr2) {
        //Використовуємо HashSet для виводу значень без повторів
        HashSet<Integer> commonElements = new HashSet<Integer>();
        for(int [] innerArray : arr1) {
            for(int element : innerArray){
                //Порівняння елементів першого масиву з усіма елементами другого масиву
                if(findCommon(arr2, element)) commonElements.add(element);
            }
        }
        for(int i : commonElements) System.out.print(i + " ");
    }
    //private, тому що використовується лише всередені методу commonElemInArrays
    private boolean findCommon(int[][]arr, int value) {
        for(int [] innerArray : arr){
            for(int element : innerArray){
                if(element == value) return true;
            }
        }
        return false;
    }
//Завдання 8
//Створіть метод, який підраховує кількість однакових чисел у будь якому масиві int[]. Приклад [1,7,3,9,34,3,7]
//Результат:
//1-1
//7-2
//3-2
//9-1
//34-1
    public void sameCounter(int[] arr){
        int counter;
        for(int i = 0; i < arr.length; i++){
            counter = 0;
            for(int element : arr){
                if(arr[i] == element) counter++;
            }
            System.out.println(arr[i] + "-" + counter );
        }
    }
//Завдання 11
//Створіть метод, який знаходить суму цифр будь якого числа int
    public void sumOfDigits(int number){
        int sum = 0;
        System.out.print("Number: " + number);
        while(number != 0){
            sum += number % 10;
            number = number / 10;
        }
        System.out.println(" Sum of digits: " + sum);
    }
//Завдання 19
//Створіть метод, який перевертає будь яке слово. Наприклад - на вході травень на виході ьневарт
    public void wordBackwards(String word) {
        System.out.println("Word: " + word);
        int wordLength = word.length();
        String result = "";
        for (int i = 0; i < wordLength; i++) {
            result = word.charAt(i) + result;
        }
        System.out.println("Word backwards: " + result);
    }
}

public class Main {
    public static void main(String[] args) {
        TasksOfLab1 lab1 = new TasksOfLab1();
        System.out.println("TASK 1");
        System.out.println("Common elements:");
        lab1.commonElem(5,11,18, 9);
        System.out.println("TASK 2");
        System.out.println("Common elements:");
        int[][] arr1 = {{11, 5, 6},{3, 12, 24}};
        int[][] arr2 = {{5, 4},{1, 3, 1}};
        lab1.commonElemInArrays(arr1, arr2);
        System.out.println("\nTASK 8");
        int[] arr3 = {1, 7, 3, 9, 34, 3, 7};
        lab1.sameCounter(arr3);
        System.out.println("TASK 11");
        lab1.sumOfDigits(123);
        System.out.println("TASK 19");
        lab1.wordBackwards("травень");
    }
}
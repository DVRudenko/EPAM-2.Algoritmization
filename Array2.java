package by.epam.algorithmization.array2;
// 2.	Дана последовательность действительных чисел a1 ,а2,..., аn.
// Заменить все его члены, большие данного Z, этим числом. Подсчитать количество замен.
//

import java.util.*;

public class Main {

    public static void main(String[] args) {

        int n;
        float z;
        int replaceNumber=0;


        Scanner in = new Scanner (System.in);

        // вводим число N и проверяем корректность вводимых данных
        do {
            System.out.println("Введите натуральное число элементов массива N");
            while (!in.hasNextInt()) {
                System.out.println("Введите корректное число"); //введено не число типа int
                in.next();
            }
            n = in.nextInt();
        } while (n <= 0); // проверяем, что n положительное


        float [] a = new float [n]; // инициализируем массив размером N и заполняем его числами от 0 до 100

        for (int i=0; i<a.length; i++){
            a[i]= (float) (Math.random()*100);
        }

        // вводим число K и проверяем корректность вводимых данных
        do {
            System.out.println("Введите действительное число Z");
            while (!in.hasNextFloat()) {
                System.out.println("Введите корректное число"); //введено не число типа float
                in.next();
            }
            z = in.nextFloat();
        } while (z <= 0); // проверяем, что z положительное

        System.out.println("Исходный массив");
        for (float i:a) {
            System.out.printf(i+",");
        }

        for (int i=0; i<a.length; i++){
            if (a[i]>z) {
                a[i]=z;
                replaceNumber++;
            }
        }

        System.out.println("\nИзмененный массив");
        for (float i:a) {
            System.out.printf(i+",");
        }
        System.out.println("\nЧисло замен-"+replaceNumber);
    }
}



package by.epam.algorithmization.big_array3;


// 3.	Дана матрица.
// Вывести k-ю строку и p-й столбец матрицы


import java.util.Scanner;


public class BigArray3 {

    public static void main(String[] args) {

        System.out.println("Введите число строк массива");

        int n=enterIntNumber(1,20);       // вводим натуральное N>0

        System.out.println("Введите число столбцов массива");
        int m=enterIntNumber(1,20);

        //int n=4; //это для отладки
        //int m=7; //это для отладки

        int [][] a = new int [n][m]; // инициализируем массив размером NхМ

        fillDimensionArray (a, 10);		// заполняем массив числами от 0 до 9

        System.out.println("Исходный массив");
        printDimensionArray (a);      //  и выводим его на печать

        System.out.print("Номер строки массива. ");
        n=enterIntNumber(1,a.length);       // вводим натуральное N>0

        System.out.print("Номер столбца массива. ");
        m=enterIntNumber(1,a[0].length);       // вводим натуральное N>0

        System.out.print("Строка - ");


        for (int i:a[m-1]) {
            System.out.print(i+" "); //выводим строку
        }

        System.out.print("\nСтолбец - ");

        for (int i=0; i<a.length; i++) {
            System.out.print(a[i][n]+" "); //выводим столбец
        }

    }



    public static int enterIntNumber (int min, int max){// метод запрашивает натуральное число и проверяет его на корректность
        Scanner in = new Scanner (System.in);
        int n;
        // вводим число N и проверяем корректность вводимых данных
        do {
            System.out.println("Введите натуральное число от "+min+" до "+max);
            while (!in.hasNextInt()) {
                System.out.println("Введите корректное число"); //введено не число типа int
                in.next();
            }
            n = in.nextInt();
        } while (n < min|| n>max); // проверяем, что n в диапазоне

        return n;

    }


    public static void fillDimensionArray (int[][] a, int max) {   //заполняет массив случайными целыми числами до max
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a [i].length; j++) {
                a[i][j] = (int) (Math.random() * max);
            }
        }

    }


    public static void printDimensionArray(int[][] a) {        // печатает двумерный массив
        for (int[] row : a) {
            for (int i : row) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }

    }






}
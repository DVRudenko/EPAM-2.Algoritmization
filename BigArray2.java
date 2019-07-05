package by.epam.algorithmization.big_array2;

// Массивы массивов 2.	Дана квадратная матрица.
// Вывести на экран элементы, стоящие на диагонали


import java.util.Scanner;


public class BigArray3 {

    public static void main(String[] args) {

        System.out.println("Введите число строк квадратного массива");

        int n=enterIntNumber(1,20);       // вводим натуральное N>0

        //int n=5; //это для отладки
        
        int [][] a = new int [n][n]; // инициализируем массив размером NхМ

        fillDimensionArray (a, 10);		// заполняем массив числами от 0 до 9

        System.out.println("Исходный массив");
        printDimensionArray (a);      //  и выводим его на печать

        
        System.out.print("Главная диагональ-");
        for (int i = 0; i < a.length; i ++) {
                System.out.print(a[i][i]+"\t"); //выводим
        }

        System.out.print("\nПобочная диагональ-");
        for (int i = 0; i < a.length; i ++) {
            System.out.print(a[i][a.length-i-1]+"\t"); //выводим
        }


    }


    public static int enterIntNumber(int min, int max) {// метод запрашивает натуральное число и проверяет его на корректность
        Scanner in = new Scanner(System.in);
        int n;
        // вводим число N и проверяем корректность вводимых данных
        do {
            System.out.println("Введите натуральное число>0");
            while (!in.hasNextInt()) {
                System.out.println("Введите корректное число"); //введено не число типа int
                in.next();
            }
            n = in.nextInt();
        } while (n < min || n>max); // проверяем, что n в диапазоне

        return n;

    }


    public static void fillDimensionArray(int[][] a, int max) {   //заполняет массив случайными целыми числами до max
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
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
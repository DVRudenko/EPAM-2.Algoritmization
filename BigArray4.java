package by.epam.algorithmization.big_array4;


// 4.	Сформировать квадратную матрицу порядка n по заданному образцу(п - четное):


import java.util.Scanner;


public class BigArray4 {

    public static void main(String[] args) {

        System.out.println("Введите число строк квадратного массива, мы увеличим их в 2 раза");

        int n=enterIntNumber(1,20);       // вводим натуральное N>от 1 до 20

        //int n=3; //это для отладки

        int [][] a = new int [n*2][n*2]; // инициализируем массив размером N*2хN*2


        for (int i=0; i<a.length; i+=2) { // заполняем массив по схеме
            for (int j=0; j<a[0].length; j++) {
                a[i][j]=j+1;
                a[i+1][j]=a[i].length-j;
            }
        }

        System.out.println("Получившийся массив");
        printDimensionArray (a);      //  и выводим его на печать

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

     public static void printDimensionArray(int[][] a) {        // печатает двумерный массив
        for (int[] row : a) {
            for (int i : row) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }

    }






}
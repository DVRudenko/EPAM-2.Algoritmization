package by.epam.algorithmization.big_array6;


// 6.	Сформировать квадратную матрицу порядка n по заданному образцу(п - четное):


import java.util.Scanner;


public class BigArray6 {

    public static void main(String[] args) {

        System.out.println("Введите число строк квадратного массива, мы увеличим их в 2 раза");

        int n=enterIntNumber(1,20);       // вводим натуральное N>0

        //int n=3; //это для отладки

        int [][] a = new int [n*2][n*2]; // инициализируем массив размером N*2хN*2


        for (int i=0; i<a.length/2; i++) { // заполняем массив по схеме
            for (int j=i; j<a[0].length-i; j++) {
                a[i][j]=1;                  //сверху
                a[a.length-i-1][j]=1;       //снизу
            }
        }

        System.out.println("Получившийся массив");
        printDimensionArray (a);      //  и выводим его на печать

    }

    /* метод запрашивает натуральное число и проверяет его на корректность
    */

    public static int enterIntNumber (int min, int max){
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
    /* метод печатает двумерный массив
    */

    public static void printDimensionArray(int[][] a) {
        for (int[] row : a) {
            for (int i : row) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }

    }






}
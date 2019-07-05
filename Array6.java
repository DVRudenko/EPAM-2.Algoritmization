package by.epam.algorithmization.array6;
// 6.	Задана последовательность N вещественных чисел.
// Вычислить сумму чисел, порядковые номера которых являются простыми числами.

import java.util.Scanner;

public class Main {


    // метод поиска простых чисел перебором. True - если простое
    public static boolean isPrime(int a) {

        for (int i=2; i<a/2; i++){
           if (a%i==0) {
               return false;
            }
        }
        return true;
    }

    // метод ввода числа и проверка его на

    public static int enterIntNumber (){
        Scanner in = new Scanner (System.in);
        int n;
         // вводим число N и проверяем корректность вводимых данных
        do {
            System.out.println("Введите натуральное число элементов массива N");
            while (!in.hasNextInt()) {
                System.out.println("Введите корректное число"); //введено не число типа int
                in.next();
            }
            n = in.nextInt();
        } while (n <= 0); // проверяем, что n положительное

        return n;

    }


    public static void printIntArray (int a[]) {        //инициализирует и печатает массив

        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100);
        }

        System.out.println("Исходный массив");
        for (int i : a) {
            System.out.print(i + ",");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int n;
        float result=0;



        n=enterIntNumber();       // вводим натуральное N

        int [] a = new int [n]; // инициализируем массив размером N и заполняем его числами от 0 до 99

        printIntArray (a);        // заполняем массив и выводим на печать

        for (int i=0; i<a.length; i++){
            if (isPrime(i)){
                result+=a[i];
            }
        }
         
        System.out.println("Сумма="+result);


    }
}



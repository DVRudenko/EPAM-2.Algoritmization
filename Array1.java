package by.epam.algorithmization.array1;
// 1.	В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К
//

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int n;
        int k;
        int result=0;


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


        int [] a = new int [n]; // инициализируем массив размером N и заполняем его целыми числами от 1 до 100

        for (int i=0; i<a.length; i++){
            a[i]= (int) (Math.random()*100)+1;
        }

        // вводим число K и проверяем корректность вводимых данных
        do {
            System.out.println("Введите кратное натуральное число К");
            while (!in.hasNextInt()) {
                System.out.println("Введите корректное число"); //введено не число типа int
                in.next();
            }
            k = in.nextInt();
        } while (k <= 0); // проверяем, что k положительное

        for (int i=0; i<a.length; i++){
            if (a[i]%k==0) {
                result+=a[i];
            }
        }

        System.out.println("Для массива из чисел");
        for (int i:a) System.out.print(i+",");
                System.out.println("\nСумма элементов кратная "+k+" равна "+result);

    }
}



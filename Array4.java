package by.epam.algorithmization.array4;
// 4.	Даны действительные числа а1 ,а2,..., ап.
// Поменять местами наибольший и наименьший элементы.
//

import java.util.*;

public class Main {

    public static void main(String[] args) {

        int n;
        int maxPosition=0;
        int minPosition=0;
        float temp;



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


        float [] a = new float [n]; // инициализируем массив размером N и заполняем его числами от -50 до 49

        for (int i=0; i<a.length; i++){
            a[i]= (float) (Math.random()*100)-50;
        }

        System.out.println("Исходный массив");
        for (float i:a) {
            System.out.printf(i+",");
        }

        //перебираем массив и находим максимальное и минимальноые числа
        for (int i=1; i<a.length; i++){
            maxPosition=a[i]>a[maxPosition]?maxPosition=i:maxPosition;
            minPosition=a[i]<a[minPosition]?minPosition=i:minPosition;

            }
        temp=a[maxPosition];
        a[maxPosition]=a[minPosition];
        a[minPosition]=temp;

        System.out.println("\nЗаменили "+a[maxPosition]+" на "+a[minPosition]);

        System.out.println("Измененный массив");
        for (float i:a) {
            System.out.printf(i+",");
        }
        
    }
}



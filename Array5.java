package by.epam.algorithmization.array5;
// 5.	Даны целые числа а1 ,а2,..., ап.
// Вывести на печать только те числа, для которых ai > i
//

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	
	int n;

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


        int [] a = new int [n]; // инициализируем массив размером N и заполняем его числами от 0 до 99

        for (int i=0; i<a.length; i++){
            a[i]= (int) (Math.random()*100);
        }

        System.out.println("Исходный массив");
        for (int i:a) {
            System.out.printf(i+",");
        }

        System.out.println("\nЧисла ai>i");

        //перебираем массив и печатаем числа удовлетворяющие условию
        for (int i=0; i<a.length; i++) {
            if (a[i] > i) {
                System.out.print(a[i] + ",");
            }
        }
    }
}



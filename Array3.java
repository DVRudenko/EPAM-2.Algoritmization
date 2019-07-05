package by.epam.algorithmization.array3;
// 3.	Дан массив действительных чисел, размерность которого N. 
// Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов

import java.util.Scanner;

public class Main {

 public static void main(String[] args) {

     int n;
     //float z;
     int positive=0;
     int negative=0;
     int nullitive=0;


     Scanner in = new Scanner (System.in);

     // вводим число N и проверяем корректность вводимых данных
		do {
			System.out.println("Введите натуральное число элементов массива N");
			while (!in.hasNextInt()) {
				System.out.println("Введите корректное число"); // введено не число типа int
				in.next();
			}
			n = in.nextInt();
		} while (n <= 0); // проверяем, что n положительное

		int[] a = new int[n]; // инициализируем массив размером N и заполняем его числами от -50 до +49

		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 100) - 50;
		}

		System.out.println("Исходный массив");
		for (int i : a) {
			System.out.printf(i + ",");
		}

		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0) {
				positive++;
			} else if (a[i] < 0) {
				negative++;
			} else {
				nullitive++;
			}
		}

		System.out.println("\nПоложительных чисел-" + positive);
		System.out.println("Отрицательных чисел-" + negative);
		System.out.println("Нулевых-" + nullitive);
	}
}



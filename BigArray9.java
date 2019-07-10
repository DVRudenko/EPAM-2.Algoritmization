package by.epam.algorithmization.big_array9;
/*
 * 9.	Задана матрица неотрицательных чисел. 
 * Посчитать сумму элементов в каждом столбце. 
 * Определить, какой столбец содержит максимальную сумму
 */

import java.util.Scanner;

public class BigArray9 {

	public static void main(String[] args) {

        
		System.out.print("Введите число строк массива. ");
        int m=enterIntNumber(1,20);
        
        System.out.print("Введите число столбцов массива. "); 
        int n=enterIntNumber(1,20);       // вводим натуральное N от 1 до 20
		

        //int m=3, n=6; //это для отладки

        int [][] array = new int [m][n]; // инициализируем массив размером MхN

        fillDimensionArray (array,20);	// заполняем массив элементами от 0 до 20
        
        System.out.println("Исходный массив");
        printDimensionArray (array);      //  и выводим его на консоль
        
        System.out.println("Столбец с максимальной суммой - "
        +(getMaxColumnSum (array)+1)+"-й"); //с учетом номера, начиная с 1-го

    }
	
	/**
	 * Основной метод задачи
	 * возвращает колонку с максимальной суммой
	 * 
	 * @param a - двумерный массив тип int
	 * @result - нумер колонки начиная с 0
	 */
	
	public static int getMaxColumnSum (int[][] a) {
		int maxSum=0;
		int maxColNumber=0;
		int sum;
		for (int j = 0; j < a[0].length; j++) { // перебираем столбцы
			sum=0;
			for (int i=0; i<a.length; i++ ) { //перебираем сумму по столбцам
				sum+=a[i][j];
			}
			if (sum>maxSum) {
				maxSum=sum;
				maxColNumber=j;
			}
		}
		return maxColNumber;
	}
	
	/** 
	 * метод запрашивает натуральное число и проверяет его на попадание в границы
	 * 
	 * @param min минимальная граница (включительно)
	 * @param max максимальная граница (включительно)
	 * @result введеное натуральное число
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
    /** 
     * выводит на консоль двумерный массив
     * 
     * @param a двумерный массив
     * 
    */

    public static void printDimensionArray(int [][] a) {
        for (int[] row : a) {
            for (int i : row) {
                System.out.print(i+"\t");//выведем через табуляцию
                
            }
            System.out.println();
        }

    }

 /**
  *  заполняет массив случайными целыми числами от 0 до max 
  *  
  *  @param a двумерный массив
  *  @param max максимальный размер элемента (включительно)
  */
   
    public static void fillDimensionArray (int[][] a, int max) {   
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a [i].length; j++) {
                a[i][j] = (int) (Math.random() * max)+1;
            }
        }

    }
 
}
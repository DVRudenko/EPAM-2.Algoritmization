package by.epam.algorithmization.array8;


// Одномерные массивы 8.	Дана последовательность целых чисел a1,a2,•••,an. 
// Образовать новую последовательность, выбросив из исходной те члены, которые равны min( a1, a2, •, an).


import java.util.Scanner;


public class Main {

	 public static void main(String[] args) {

	        int n;
	        int min; 
	        	        
	        
	        
	        
	        n=enterIntNumber();       // вводим натуральное N
	        int [] a = new int [n]; // инициализируем массив размером N 
	        fillIntArray (a, 10);		// заполняем массив числами от 0 до 10
	        
	       // n=15;												// это для отладки
	      // int [] a = {1, 10, -1, 2, -5, -3, 18, 4, -3, 10, 1, 10, -5, -3, 1};    // это для отладки
	        
	        System.out.print("Исходный ");
	        printIntArray (a);      //  и выводим его на печать
	        
    
	 
	
	

	        int minCount = 0;
	        
	        min=minIntArray(a); //находим минимальное в массиве

	        for (int value : a) { // находим количество его повторов
	            if (value == min) {
	                minCount++;
	            }
	        }

	        int[] result = new int[a.length - minCount]; //создаем новый массив длинной (N-кол-во повторов)

	        int i = 0;
	        
	        	for (int j : a) {
	                if (j > min) {
	                    result[i++] = j;
	                }
	            }
	        
	       
	 	System.out.print("Новый ");
	 	printIntArray (result);      //  и выводим его на печать
	    	 
	 }	 
	 
	 

 public static int enterIntNumber (){// метод запрашивает натуральное число и проверяет его на корректность
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


 public static void fillIntArray (int[] a, int max) {   //заполняет массив случайными целыми числами до max
 	for (int i = 0; i < a.length; i++) {
         a[i] = (int) (Math.random() * max);
 	}
 }
 
 
 public static void printIntArray (int[] a) {        // печатает массив
     
     System.out.println("массив");
     for (int i : a) {
         System.out.print(i + ";");
     }
     System.out.println();
 }
 
 public static int minIntArray (int[]a) {//минимальный элемент массива
 
 	int min=a[0];
     
 	for (int i:a) { 
 		if (i <min){
         min=i;
 		}
 	}
 	return min;
 }
}
package by.epam.algorithmization.array10;


// Массивы 10.	Дан целочисленный массив с количеством элементов п.
// Сжать массив, выбросив из него каждый второй элемент (освободившиеся элементы заполнить нулями). 
// Примечание. Дополнительный массив не использовать.


import java.util.Scanner;


public class Array10 {

	 public static void main(String[] args) {

	        
	        int n=enterIntNumber();       // вводим натуральное N>1 иначе смысла нет в задаче
	        int [] a = new int [n]; // инициализируем массив размером N 
	        fillIntArray (a, 10);		// заполняем массив числами от 0 до 9
	        
	        // int [] a = {1, 10, -1, 2, -5, -3, 18, 4, -3, 10, 1, 10};    // это для отладки
	        // int [] a = {1, 10, -1, 2, -5, -3, 18, 4, -3, 10, 1, 10, 11};    // это для отладки
	        
	        System.out.print("Исходный ");
	        printIntArray (a);      //  и выводим его на печать
	        
	        int arrayEnd=(a.length+1)/2; // находим "середину" для прогона
	        
	        for (int i=1; i<arrayEnd; i++) { //сдвигаем нечетные элементы влево
	        	a[i]=a[i*2];
	        }
	        
	        for (int i=arrayEnd;i<a.length; i++) { //остальное заполняем нулями
	        	a[i]=0;
	        }
	        System.out.print("Сжатый ");
		 	printIntArray (a);      //  выводим сжатый на печать	
	         
	       
	 	
	    	 
	 }	 
	 
	 

 public static int enterIntNumber (){// метод запрашивает натуральное число и проверяет его на корректность
     Scanner in = new Scanner (System.in);
     int n;
      // вводим число N и проверяем корректность вводимых данных
     do {
         System.out.println("Введите натуральное число элементов массива N>0");
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
 
 
}
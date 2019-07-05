package by.epam.algorithmization.big_array1;


// 1.	Дана матрица. Вывести на экран все нечетные столбцы, 
// у которых первый элемент больше последнего


import java.util.Scanner;


public class BigArray1 {

	 public static void main(String[] args) {

		 	System.out.println("Введите число строк массива");
	        
		 	int n=enterIntNumber();       // вводим натуральное N>0 
	       
		 	System.out.println("Введите число столбцов массива");
		 	int m=enterIntNumber();
	        
		 	//int n=4; //это для отладки
		 	//int m=7; //это для отладки
		 			
		 	
	        int [][] a = new int [n][m]; // инициализируем массив размером NхМ 
	        
	        fillDimensionArray (a, 10);		// заполняем массив числами от 0 до 9
	        
	               
	        System.out.println("Исходный массив");
	        printDimensionArray (a);      //  и выводим его на печать
	        System.out.println("Результат");
	        
	        boolean flag;
	        for (int j=0; j<a[0].length; j+=2) {
	        	flag=false;
	        	if (a[0][j]>a[a.length-1][j]) { //проверяем 1-й и последний элемент столбца
	        		printRow(a, j);
	        		flag=true;
	        	}
	        	if (flag) {
	        		System.out.println((j+1)+"-й столбец"); //выводим номер столбца
	        	}
	        }
	        
   	 
	 }	 
	 
	 

 public static int enterIntNumber (){// метод запрашивает натуральное число и проверяет его на корректность
     Scanner in = new Scanner (System.in);
     int n;
      // вводим число N и проверяем корректность вводимых данных
     do {
         System.out.println("Введите натуральное число>0");
         while (!in.hasNextInt()) {
             System.out.println("Введите корректное число"); //введено не число типа int
             in.next();
         }
         n = in.nextInt();
     } while (n <= 0); // проверяем, что n положительное

     return n;

 }


 public static void fillDimensionArray (int[][] a, int max) {   //заполняет массив случайными целыми числами до max
 	for (int i = 0; i < a.length; i++) {
 		for (int j = 0; j < a [i].length; j++) {
         a[i][j] = (int) (Math.random() * max);
 		}
 	}
 		
 }
 
 
 public static void printDimensionArray (int[][] a) {        // печатает двумерный массив
	 for (int i = 0; i < a.length; i++) {
	 		for (int j = 0; j < a [i].length; j++) {
	 			System.out.print(a [i][j] + "\t");
	 		}
	 		System.out.println();
	}     
 	
 }
 
 public static void printRow (int [][] a, int r) { //печатает столбец r двумерного массива a
	 for (int i=0; i<a.length; i++) {
		 System.out.println (a[i][r]);
	 }
 }
 
 
 
 
 
}
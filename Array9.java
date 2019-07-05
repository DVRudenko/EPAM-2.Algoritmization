package by.epam.algorithmization.array9;
// ќдномерные массивы 9.	¬ массиве целых чисел с количеством элементов n найти наиболее часто встречающеес€ число. 
// ≈сли таких чисел несколько, то определить наименьшее из них.



import java.util.Scanner;

public class Main {

	 public static void main(String[] args) {

	        int n;
	        int maxRepeat=1; 
	        int repeat;	        
	        
	        
	        
	        n=enterIntNumber();       // вводим натуральное N
	        int [] a = new int [n]; // инициализируем массив размером N 
	        fillIntArray (a, 10);		// заполн€ем массив числами от 0 до 10
	        
	       // n=15;												// это дл€ отладки
	      // int [] a = {1, 10, -1, 2, -5, -3, 18, 4, -3, 10, 1, 10, -5, -3, 1};    // это дл€ отладки
	        
	        System.out.print("»сходный ");
	        printIntArray (a);      //  и выводим его на печать
	        
	        int max=a[0]; 

	        for(int i=0;i<a.length;i++) { 
	           		
	        	repeat=0;
	        	for(int j=0;j<a.length;j++) {
	           				
	        			if(a[i]==a[j]) {
	        				repeat++;
	        			}
	        				      
	        			if(((maxRepeat == repeat) && (max > a[i])) || (maxRepeat < repeat)) //выбираем наименьшее из частых или самое частое
	        				{
	        				max=a[i]; 
	        				maxRepeat=repeat; 
	        				}
	        				
	           	}		
	        }
	        
	        System.out.print("ћинимальное из часто встречающихс€="+max+". ¬стречаетс€ "+maxRepeat+" раз");
	        
	 }
	       
	

    public static int enterIntNumber (){// метод запрашивает натуральное число и провер€ет его на корректность
        Scanner in = new Scanner (System.in);
        int n;
         // вводим число N и провер€ем корректность вводимых данных
        do {
            System.out.println("¬ведите натуральное число элементов массива N");
            while (!in.hasNextInt()) {
                System.out.println("¬ведите корректное число"); //введено не число типа int
                in.next();
            }
            n = in.nextInt();
        } while (n <= 0); // провер€ем, что n положительное

        return n;

    }


    public static void fillIntArray (int[] a, int max) {   //заполн€ет массив случайными целыми числами до max
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

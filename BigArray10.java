package by.epam.algorithmization.big_array;
/*
 * 10.	Найти положительные элементы главной диагонали квадратной матрицы
 */

import java.util.Scanner;

public class BigArray10 {

	public static void main(String[] args) {

        
		System.out.print("Введите размер квадратной матрицы. ");
        
        int n=enterIntNumber(1,20);       // вводим натуральное N от 1 до 20
		

        //int m=3, n=6; //это для отладки

        int [][] array = new int [n][n]; // инициализируем массив размером MхN

        fillDimensionArray (array,-20,20);	// заполняем массив элементами от -20 до 20
        
        System.out.println("Исходный массив");
        printDimensionArray (array);      //  и выводим его на консоль
        
        System.out.println("Положительные элементы главной диагонали:");
        printPositiveMainDiagonal (array);
        
    }
	
	/**
	 * Основной метод задачи
	 * выводит положительные элементы главной диагонали
	 * 
	 * @param a - двумерный массив тип int
	 * 
	 */
	
	public static void printPositiveMainDiagonal (int[][] a) {
		for (int i=0; i<a.length; i++ ) { //перебираем главную диагональ
			
			if (a[i][i]>0) {
				System.out.print(a[i][i]+" ");
			}
		}
		
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
 

    /**
     *  перегруженный метод
     *  заполняет двумерный массив случайными целыми числами от min до max 
     *  
     *  @param a двумерный массив
     *  @param min минимальный размер элемента (включительно)
     *  @param max максимальный размер элемента (включительно)
     */
      
       public static void fillDimensionArray (int[][] a, int min, int max) {   
           int range=max-min+1;
    	   for (int i = 0; i < a.length; i++) {
               for (int j = 0; j < a [i].length; j++) {
                   a[i][j] = (int) (Math.random()*range-max);
               }
           }

       }
    
}
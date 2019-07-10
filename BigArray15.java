package by.epam.algorithmization.big_array;


// 15.	Найдите наибольший элемент матрицы и заменить все нечетные элементы на него


import java.util.Scanner;


public class BigArray15 {

    public static void main(String[] args) {

        int[][] array = new int[6][7]; // инициализируем массив размером MхN
        fillDimensionArray (array,20);// заполняем массив
        System.out.println("Исходный массив");
        printDimensionArray(array);      //  и выводим его на консоль
        
        int maxArray=findMaxArray(array);    
        System.out.println("Максимальный элемент массива-"+maxArray);
        changeOddArray(array, maxArray);
        
        System.out.println("Новый массив");
        printDimensionArray(array);      //  и выводим его на консоль

    }

    /**
     * Основной метод задачи
     * меняет нечетные элементы матрицы на макисимум
     *
     * @param a - двумерный массив типа int
     * @param max - число на которое меняются нечетные элементы
     */
    
    public static void changeOddArray(int[][] a, int max) {
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a[i].length; j++) {
				if (a[i][j]%2==1) {
					a[i][j]=max;
				}
				
			}
		}
		
	}

	/**
     * Основной метод задачи
     * находит максимальный элемент матрицы
     *
     * @param a - двумерный массив типа int
     * @result максимальный элемент
     */

    public static int findMaxArray(int[][] a) {
        int max=a[0][0];
        for (int[] row : a) {
            for (int i : row) {
                if (i>max){
                	max=i;
                }
                
            }
        }
        return max;
    }


	/** 
	 * запрашивает целое число и проверяет его на попадание в границы
	 * 
	 * @param min минимальная граница (включительно)
	 * @param max максимальная граница (включительно)
	 * @result введеное целое число
    */

    public static int enterIntNumber (int min, int max){
        Scanner in = new Scanner (System.in);
        int n;
        // вводим число N и проверяем корректность вводимых данных
        do {
            System.out.println("Введите целое число от "+min+" до "+max);
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
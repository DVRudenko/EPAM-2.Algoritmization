package by.epam.algorithmization.big_array;
/*
 * 11.	Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в которых число 5 встречается три и более раз.
import java.util.Scanner;
*/

public class BigArray11 {

	public static void main(String[] args) {

        
        int [][] array = new int [10][20]; // инициализируем массив размером MхN

        fillDimensionArray (array,15);	// заполняем массив элементами от 0 до +15
        
        System.out.println("Исходный массив");
        printDimensionArray (array);      //  и выводим его на консоль
        
        System.out.println("Строки, где число 5 встречается 3 и более  раз");
        printRow (array);
        
    }
	
	/**
	 * Основной метод задачи
	 * выводит cтроки, где число 5 встречается более 3-х раз
	 * или выдает сообщение, что таких строк нет
	 * 
	 * @param a - двумерный массив тип int
	 * 
	 */
	
	public static void printRow (int[][] a) {
		int count;
		boolean flag=false;
		for (int i=0; i<a.length; i++ ) { //перебираем строки
			count=0;
			for (int j=0; j<a[i].length; j++)
			if (a[i][i]==5) {
				count++;
			}
			if (count>=3) {
				flag=true;
				System.out.print("\nстрока-"+(i+1)+": ");
				for (int row:a[i]) {
					System.out.print(row+" ");
				}
			}
		}
		
		if (!flag) {
			 System.out.println("Нет таких строк");
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
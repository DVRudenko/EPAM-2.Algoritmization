package by.epam.algorithmization.big_array8;


/*
 * 8.	В числовой матрице поменять местами два столбца любых столбца, 
 * т. е. все элементы одного столбца поставить на соответствующие им позиции другого, 
 * а его элементы второго переместить в первый. 
 * Номера столбцов вводит пользователь с клавиатуры
 */



import java.util.Scanner;


public class BigArray8 {

	public static void main(String[] args) {

        
		System.out.println("Введите число строк массива");
        int m=enterIntNumber(1,20);
        
        System.out.println("Введите число столбцов массива"); 
        int n=enterIntNumber(1,20);       // вводим натуральное N от 1 до 20
		

        //int m=7, n=5; //это для отладки

        int [][] array = new int [m][n]; // инициализируем массив размером MхN

        fillDimensionArray (array,10);	// заполняем массив от 0 до 9
        
        System.out.println("Исходный массив");
        printDimensionArray (array);      //  и выводим его на печать
        
        
        System.out.println("Введите первый столбец");
        int firstN=enterIntNumber(1,array[0].length);
        
        System.out.println("Введите второй столбец");
        int secondN=enterIntNumber(1,array[0].length);
        
        if (firstN==secondN) {
        	System.out.println("Номера столбцов совпадают, масссив не изменился");
        }
        else {
        	firstN--;
        	secondN--;
        	swapColumn (array,firstN, secondN);
        }
        
        System.out.println("Новый массив");
        printDimensionArray (array);      //  и выводим его на печать
        

    }

	
	/*
	 * Основной метод задачи
	 * меняет столбцы местами
	 */
	
	public static void swapColumn(int[][] a, int col1, int col2) {

		for (int i = 0; i < a.length; i++) { // заполняем массив по схеме
			int swap;
			swap = a[i][col1];
			a[i][col1] = a[i][col2];
			a[i][col2] = swap;

		}
	}
	
		
	
	
	/* 
	 * метод запрашивает натуральное число и проверяет его на корректность
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
    /* 
     * метод печатает двумерный массив
    */

    public static void printDimensionArray(int [][] a) {
        for (int[] row : a) {
            for (int i : row) {
                System.out.print(i+"\t");//выведем через табуляцию
                
            }
            System.out.println();
        }

    }

 /*
  *  метод заполняет массив случайными целыми числами до max (не включая)
  */
   
    public static void fillDimensionArray (int[][] a, int max) {   
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a [i].length; j++) {
                a[i][j] = (int) (Math.random() * max);
            }
        }

    }
 
 
 
}
package by.epam.algorithmization.big_array7;


// 7.	7.	Сформировать квадратную матрицу порядка N по правилу 



import java.util.Scanner;


public class BigArray7 {

	public static void main(String[] args) {

        System.out.println("Введите размер квадратного массива");

        int n=enterIntNumber(1,20);       // вводим натуральное N от 1 до 20

        //int n=5; //это для отладки

        float [][] a = new float [n][n]; // инициализируем массив размером NхN

        fillArray (a);	// заполняем массив согласно заданию
        
        System.out.println("Получившийся массив");
        printDimensionArray (a);      //  и выводим его на печать
        
        System.out.println("Число положительных элементов-"+calcPositive (a));

    }

	
	/*
	 * Основной метод задачи
	 * заполняет массив по заданной формуле
	 */
	
	public static void fillArray(float[][] a) {
	
		for (int i = 0; i < a.length; i++) { // заполняем массив по схеме
			for (int j = 0; j < a[0].length; j++) {
				a[i][j] = (float) Math.sin(((i+1)*(i+1)-(j+1)*(j+1))/a.length); // сама формула, аргумент в радианах
				
			}
		}
	}
	
	/*
	 * Второй метод задачи
	 * возвращает количество положительных элементов в массиве
	 */
	
	private static int calcPositive(float[][] a) {
		int positiveNumber=0;
		for (float[] row : a) {
            for (float i : row) {
                if (i>0) {
                	positiveNumber++;
                }
            }
		}
            return positiveNumber;
		
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

    public static void printDimensionArray(float [][] a) {
        for (float[] row : a) {
            for (float i : row) {
                System.out.printf("%.3f",i);//выведем с точностью 3 знака
                System.out.print("\t");
            }
            System.out.println();
        }

    }

 
 
 
 
 
}
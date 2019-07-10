package by.epam.algorithmization.big_array;
/*
 * 12.	Отсортировать строки матрицы по возрастанию и убыванию значений элементов
*/

public class BigArray12 {

	public static void main(String[] args) {
		
		int [][] array = new int [5][10]; // инициализируем массив размером MхN

        fillDimensionArray (array,20);	// заполняем массив элементами от 0 до +15
        
        System.out.println("Исходный массив");
        printDimensionArray (array);      //  и выводим его на консоль
        
        sortRowAscend (array);
        
        System.out.println("Осортированный по возрастанию в строках массив");
        printDimensionArray (array);      // выводим его на консоль
        
        sortRowDescend (array);
        System.out.println("Осортированный по убыванию в строках массив");
        printDimensionArray (array);      // выводим его на консоль
        
    }
	
	/**
	 * Основной метод задачи
	 * сортирует cтроки по возрастанию методом "пузырька"
	 * 
	 * @param a - двумерный массив типа int
	 * 
	 */
	
	public static void sortRowAscend (int[][] a) {
		int min;
		int minPos;
		int temp;
		
		for (int i=0; i<a.length; i++ ) { //перебираем все строки
			
			for (int j=0; j<a[i].length; j++) { //перебираем значения в строке
				min=a[i][j];
				minPos=j;
				for (int x=j; x<a[i].length;x++) { //находим минимум и запоминаем его
					if (a[i][x]<min) {
						min=a[i][x];
						minPos=x;
					}
				}
				temp=a[i][j];			//ставим минимум первым 
				a[i][j]=min;
				a[i][minPos]=temp;
				
			}
		}
	}
	
	/**
	 * Основной метод задачи
	 * сортирует cтроки по возрастанию методом "пузырька"
	 * 
	 * @param a - двумерный массив типа int
	 * 
	 */
	
	public static void sortRowDescend (int[][] a) {
		int max;
		int maxPos;
		int temp;
		 
		for (int i=0; i<a.length; i++ ) { //перебираем все строки
			
			for (int j=0; j<a[i].length; j++) { //перебираем значения в строке
				max=a[i][j];
				maxPos=j;
				for (int x=j; x<a[i].length;x++) { //находим минимум и запоминаем его
					if (a[i][x]>max) {
						max=a[i][x];
						maxPos=x;
					}
				}
				temp=a[i][j];			//ставим минимум первым 
				a[i][j]=max;
				a[i][maxPos]=temp;
				
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
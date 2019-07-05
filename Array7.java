package by.epam.algorithmization.array7;
// 7. ƒаны действительные числа a, a, Х Х Х, а . 
// Ќайти max(a1 + а2n,а2 + а2n-1 и...,аn + аn+1)


import java.util.Scanner;

public class Main {

	 public static void main(String[] args) {

	        int n;
	        float max;



	        n=enterIntNumber();       // вводим натуральное N

	        float [] a = new float [n*2]; // инициализируем массив размером N*2 

	        printFloatArray (a);        // заполн€ем массив числами от 0 до 99 и выводим на печать
	        
	        max=a[0]+a[2*(n-1)];

	        for (int i=1; i<n; i++){ //перебираем до половинной длинны массива
	            if (a[i] + a[2 * (n - i)] > max){
	                max=(a[i] + a[2 * (n - i)]);
	            }
	        }
	         
	        System.out.println("ћаксимум="+max);
	       

	    }
  
	
	
	// метод ввода натурального числа и проверка его на корректность

    public static int enterIntNumber (){
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


    public static void printFloatArray (float[] a) {        //инициализирует и печатает массив

        for (int i = 0; i < a.length; i++) {
            a[i] = (float) (Math.random() * 100);
        }

        System.out.println("»сходный массив");
        for (float i : a) {
            System.out.print(i + ";");
        }
        System.out.println();
    }

   
}


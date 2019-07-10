package by.epam.algorithmization.sort;


// 15.	Построить магический квадрат


import java.util.Scanner;



public class ArraySort3 {

    public static void main(String[] args) {



                int [] array = new int [30]; // инициализируем массив размером 30

                fillArray (array,20);	// заполняем массив элементами от 0 до +20

                System.out.println("Исходный массив");
                printArray (array);      //  и выводим его на консоль

                sortArraySelectDescent (array);


                System.out.println("Осортированный по убыванию массив");
                printArray (array);      // выводим его на консоль






    }

    /**
     * Основной метод задачи
     * сортирует массив по убыванию методом "выбора"
     *
     * @param a -  массив типа int
     *
     */

    public static void sortArraySelectDescent (int[] a) {
        int max;
        int maxPos;
        int temp;

        for (int i=0; i<a.length; i++) { //перебираем все значения в столбце
                max=a[i];
                maxPos=i;
                for (int x=i; x<a.length;x++) { //находим максимум и запоминаем его
                    if (a[x]>max) {
                        max=a[x];
                        maxPos=x;
                    }
                }
                temp=a[i];			//ставим максимум первым
                a[i]=max;
                a[maxPos]=temp;

            }
        }






    /**
     * метод запрашивает натуральное число и проверяет его на попадание в границы
     *
     * @param min минимальная граница (включительно)
     * @param max максимальная граница (включительно)
     * @result введеное натуральное число
     */

    public static int enterIntNumber(int min, int max) {
        Scanner in = new Scanner(System.in);
        int n;
        // вводим число N и проверяем корректность вводимых данных
        do {
            System.out.println("Введите натуральное число от " + min + " до " + max);
            while (!in.hasNextInt()) {
                System.out.println("Введите корректное число"); //введено не число типа int
                in.next();
            }
            n = in.nextInt();
        } while (n < min || n > max); // проверяем, что n в диапазоне

        return n;
    }

    /**
     * выводит на консоль  массив
     *
     * @param a двумерный массив
     */

    public static void printArray(int[] a) {
        for (int i : a) {
                System.out.print(i + "\t");//выведем через табуляцию

            }
            System.out.println();
        }

            /**
             *  заполняет массив случайными целыми числами от 0 до max
             *
             *  @param a  массив
             *  @param max максимальный размер элемента (включительно)
             */

            public static void fillArray (int[] a, int max) {
                for (int i = 0; i < a.length; i++) {

                        a[i] = (int) (Math.random() * max)+1;
                }

            }
}
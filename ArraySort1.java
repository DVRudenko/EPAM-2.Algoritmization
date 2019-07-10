package by.epam.algorithmization.sort;

// 1.	Заданы два одномерных массива с различным количеством элементов и натуральное число k.
// Объединить их в один массив, включив второй массив между k-м и (k+1) - м элементами первого,
// при этом не используя дополнительный массив



import java.util.Scanner;

public class ArraySort4 {

    public static void main(String[] args) {


        System.out.println("Введите размер первого массива");
        int ar1 =enterIntNumber (1,20);

        System.out.println("Введите размер второго массива");
        int ar2 =enterIntNumber (1,20);

        int [] array1 = new int [ar1]; // инициализируем массив 1
        fillArray (array1,20);	// заполняем массив элементами от 0 до +20
        System.out.println("Исходный первый массив");
        printArray (array1);      //  и выводим его на консоль

        int [] array2 = new int [ar2]; // инициализируем массив 2
        fillArray (array2,20);	// заполняем массив элементами от 0 до +20
        System.out.println("Исходный второй массив");
        printArray (array2);      //  и выводим его на консоль

        System.out.println("Введите элемент первого массива К с которого начнется вставка. Отсчет начинаем с 1.");
        int k =enterIntNumber (1,array1.length); // проверяем К на корректность

        System.out.println("Новый массив");
        printArray (insertArray (array1, array2, k));      // выводим новый массив на консоль





    }

    /**
     * Основной метод задачи
     * вставляет один массив в другой
     *
     * @param ar1      -  первый массив типа int
     * @param ar2      -  второй массив типа int
     * @param position -  позиция в первом массиве типа int
     */

    public static int [] insertArray(int [] ar1, int [] ar2, int position) {

        if (position<0||position>ar1.length) {   //проверка индекса на всякий случай
            return ar1;
        }

        int [] ar3 = new int [ar1.length+ar2.length];

        for (int i=0; i<position; i++){             // заполняем до к из первого массива
            ar3 [i]=ar1[i];
        }

        for (int i=0; i<ar2.length; i++){       // заполняем из второго массива
            ar3 [i+position]=ar2[i];
         }

        for (int i=position; i<ar1.length; i++){  // заполяем от к+1 из первого массива
            ar3 [i+ar2.length]=ar1[i];
        }

        return ar3;
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
package by.epam.algorithmization.sort;

// 2.	Даны две последовательности a < а2 <... < а и b < b2 <... < b .
// Образовать из них новую последовательность
// чисел так, чтобы она тоже была неубывающей



import java.util.Scanner;

public class ArraySort3 {

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

        System.out.println("Формируем новую последовательность по возрастанию");

        printArray (sortArraySelectAscend (addArray(array1, array2)));      // выводим новый массив на консоль

    }

    /**
     * Основной метод задачи
     * соединяет первый массив с другим
     *
     * @param ar1      -  первый массив типа int
     * @param ar2      -  второй массив типа int
     * @result соединенный массив
     *
     */

    public static int [] addArray(int [] ar1, int [] ar2) {

        int [] ar3 = new int [ar1.length+ar2.length];

        for (int i=0; i<ar1.length; i++){             // заполняем до первого массива
            ar3 [i]=ar1[i];
        }

        for (int i=0; i<ar2.length; i++){       // заполняем из второго массива
            ar3 [i+ar1.length]=ar2[i];
         }

        return ar3;
    }

    /**
     * Основной метод задачи
     * сортирует массив по возрастанию методом "выбора"
     *
     * @param a -  массив типа int
     * @result отсортированный массив
     */

    public static int [] sortArraySelectAscend (int[] a) {
        int min;
        int minPos;
        int temp;

        for (int i=0; i<a.length; i++) { //перебираем все значения в столбце
            min=a[i];
            minPos=i;
            for (int x=i; x<a.length;x++) { //находим минимум и запоминаем его
                if (a[x]<min) {
                    min=a[x];
                    minPos=x;
                }
            }
            temp=a[i];			//меняем минимум с текущим
            a[i]=min;
            a[minPos]=temp;

        }
        return a;
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
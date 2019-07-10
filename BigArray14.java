package by.epam.algorithmization.big_array;


// 14.	Сформировать случайную матрицу m x п, состоящую из нулей и единиц,
// причем в каждом столбце число единиц равно номеру столбца


import java.util.Scanner;


public class BigArray14 {

    public static void main(String[] args) {

        int[][] array = new int[6][7]; // инициализируем массив размером MхN

        fillRandomArray(array);    // заполняем массив

        System.out.println("Получившийся массив");

        printDimensionArray(array);      //  и выводим его на консоль

    }

    /**
     * Основной метод задачи
     * заполняет массив по условию задачи
     *
     * @param a - двумерный массив типа int
     */

    public static void fillRandomArray(int[][] a) {
        int count;
        int i;
        for (int j = 0; j < a[0].length; j++) { //перебираем все столбцы
            count = 0;
            i=0;
            do {

            		//перебираем значения в столбце
                    if (a[i][j] == 0) {
                        a[i][j] = (int) (Math.random() * 2);
                        if (a[i][j] == 1) {
                            count++;                //подсчитываем кол-во 1 в столбце

                        }
                    }
                i++;
                if (i==a.length) {				//если прошли весь столбец, то повторим еще раз
                	i=0;
                }
            }
            while (count < j+1 && count < a.length); //пока не достигнем номера столбца  или его длинны (если строк меньше чем столбцов)

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
     * выводит на консоль двумерный массив
     *
     * @param a двумерный массив
     */

    public static void printDimensionArray(int[][] a) {
        for (int[] row : a) {
            for (int i : row) {
                System.out.print(i + "\t");//выведем через табуляцию

            }
            System.out.println();
        }

    }


}
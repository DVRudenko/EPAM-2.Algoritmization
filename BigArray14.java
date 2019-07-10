package by.epam.algorithmization.big_array;


// 14.	������������ ��������� ������� m x �, ��������� �� ����� � ������,
// ������ � ������ ������� ����� ������ ����� ������ �������


import java.util.Scanner;


public class BigArray14 {

    public static void main(String[] args) {

        int[][] array = new int[6][7]; // �������������� ������ �������� M�N

        fillRandomArray(array);    // ��������� ������

        System.out.println("������������ ������");

        printDimensionArray(array);      //  � ������� ��� �� �������

    }

    /**
     * �������� ����� ������
     * ��������� ������ �� ������� ������
     *
     * @param a - ��������� ������ ���� int
     */

    public static void fillRandomArray(int[][] a) {
        int count;
        int i;
        for (int j = 0; j < a[0].length; j++) { //���������� ��� �������
            count = 0;
            i=0;
            do {

            		//���������� �������� � �������
                    if (a[i][j] == 0) {
                        a[i][j] = (int) (Math.random() * 2);
                        if (a[i][j] == 1) {
                            count++;                //������������ ���-�� 1 � �������

                        }
                    }
                i++;
                if (i==a.length) {				//���� ������ ���� �������, �� �������� ��� ���
                	i=0;
                }
            }
            while (count < j+1 && count < a.length); //���� �� ��������� ������ �������  ��� ��� ������ (���� ����� ������ ��� ��������)

        }
    }


    /**
     * ����� ����������� ����������� ����� � ��������� ��� �� ��������� � �������
     *
     * @param min ����������� ������� (������������)
     * @param max ������������ ������� (������������)
     * @result �������� ����������� �����
     */

    public static int enterIntNumber(int min, int max) {
        Scanner in = new Scanner(System.in);
        int n;
        // ������ ����� N � ��������� ������������ �������� ������
        do {
            System.out.println("������� ����������� ����� �� " + min + " �� " + max);
            while (!in.hasNextInt()) {
                System.out.println("������� ���������� �����"); //������� �� ����� ���� int
                in.next();
            }
            n = in.nextInt();
        } while (n < min || n > max); // ���������, ��� n � ���������

        return n;
    }

    /**
     * ������� �� ������� ��������� ������
     *
     * @param a ��������� ������
     */

    public static void printDimensionArray(int[][] a) {
        for (int[] row : a) {
            for (int i : row) {
                System.out.print(i + "\t");//������� ����� ���������

            }
            System.out.println();
        }

    }


}
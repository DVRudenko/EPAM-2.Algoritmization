package by.epam.algorithmization.big_array9;
/*
 * 9.	������ ������� ��������������� �����. 
 * ��������� ����� ��������� � ������ �������. 
 * ����������, ����� ������� �������� ������������ �����
 */

import java.util.Scanner;

public class BigArray9 {

	public static void main(String[] args) {

        
		System.out.print("������� ����� ����� �������. ");
        int m=enterIntNumber(1,20);
        
        System.out.print("������� ����� �������� �������. "); 
        int n=enterIntNumber(1,20);       // ������ ����������� N �� 1 �� 20
		

        //int m=3, n=6; //��� ��� �������

        int [][] array = new int [m][n]; // �������������� ������ �������� M�N

        fillDimensionArray (array,20);	// ��������� ������ ���������� �� 0 �� 20
        
        System.out.println("�������� ������");
        printDimensionArray (array);      //  � ������� ��� �� �������
        
        System.out.println("������� � ������������ ������ - "
        +(getMaxColumnSum (array)+1)+"-�"); //� ������ ������, ������� � 1-��

    }
	
	/**
	 * �������� ����� ������
	 * ���������� ������� � ������������ ������
	 * 
	 * @param a - ��������� ������ ��� int
	 * @result - ����� ������� ������� � 0
	 */
	
	public static int getMaxColumnSum (int[][] a) {
		int maxSum=0;
		int maxColNumber=0;
		int sum;
		for (int j = 0; j < a[0].length; j++) { // ���������� �������
			sum=0;
			for (int i=0; i<a.length; i++ ) { //���������� ����� �� ��������
				sum+=a[i][j];
			}
			if (sum>maxSum) {
				maxSum=sum;
				maxColNumber=j;
			}
		}
		return maxColNumber;
	}
	
	/** 
	 * ����� ����������� ����������� ����� � ��������� ��� �� ��������� � �������
	 * 
	 * @param min ����������� ������� (������������)
	 * @param max ������������ ������� (������������)
	 * @result �������� ����������� �����
    */

    public static int enterIntNumber (int min, int max){
        Scanner in = new Scanner (System.in);
        int n;
        // ������ ����� N � ��������� ������������ �������� ������
        do {
            System.out.println("������� ����������� ����� �� "+min+" �� "+max);
            while (!in.hasNextInt()) {
                System.out.println("������� ���������� �����"); //������� �� ����� ���� int
                in.next();
            }
            n = in.nextInt();
        } while (n < min|| n>max); // ���������, ��� n � ���������

        return n;
    }
    /** 
     * ������� �� ������� ��������� ������
     * 
     * @param a ��������� ������
     * 
    */

    public static void printDimensionArray(int [][] a) {
        for (int[] row : a) {
            for (int i : row) {
                System.out.print(i+"\t");//������� ����� ���������
                
            }
            System.out.println();
        }

    }

 /**
  *  ��������� ������ ���������� ������ ������� �� 0 �� max 
  *  
  *  @param a ��������� ������
  *  @param max ������������ ������ �������� (������������)
  */
   
    public static void fillDimensionArray (int[][] a, int max) {   
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a [i].length; j++) {
                a[i][j] = (int) (Math.random() * max)+1;
            }
        }

    }
 
}
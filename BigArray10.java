package by.epam.algorithmization.big_array;
/*
 * 10.	����� ������������� �������� ������� ��������� ���������� �������
 */

import java.util.Scanner;

public class BigArray10 {

	public static void main(String[] args) {

        
		System.out.print("������� ������ ���������� �������. ");
        
        int n=enterIntNumber(1,20);       // ������ ����������� N �� 1 �� 20
		

        //int m=3, n=6; //��� ��� �������

        int [][] array = new int [n][n]; // �������������� ������ �������� M�N

        fillDimensionArray (array,-20,20);	// ��������� ������ ���������� �� -20 �� 20
        
        System.out.println("�������� ������");
        printDimensionArray (array);      //  � ������� ��� �� �������
        
        System.out.println("������������� �������� ������� ���������:");
        printPositiveMainDiagonal (array);
        
    }
	
	/**
	 * �������� ����� ������
	 * ������� ������������� �������� ������� ���������
	 * 
	 * @param a - ��������� ������ ��� int
	 * 
	 */
	
	public static void printPositiveMainDiagonal (int[][] a) {
		for (int i=0; i<a.length; i++ ) { //���������� ������� ���������
			
			if (a[i][i]>0) {
				System.out.print(a[i][i]+" ");
			}
		}
		
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
 

    /**
     *  ������������� �����
     *  ��������� ��������� ������ ���������� ������ ������� �� min �� max 
     *  
     *  @param a ��������� ������
     *  @param min ����������� ������ �������� (������������)
     *  @param max ������������ ������ �������� (������������)
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
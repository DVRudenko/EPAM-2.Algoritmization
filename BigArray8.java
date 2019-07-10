package by.epam.algorithmization.big_array8;


/*
 * 8.	� �������� ������� �������� ������� ��� ������� ����� �������, 
 * �. �. ��� �������� ������ ������� ��������� �� ��������������� �� ������� �������, 
 * � ��� �������� ������� ����������� � ������. 
 * ������ �������� ������ ������������ � ����������
 */



import java.util.Scanner;


public class BigArray8 {

	public static void main(String[] args) {

        
		System.out.println("������� ����� ����� �������");
        int m=enterIntNumber(1,20);
        
        System.out.println("������� ����� �������� �������"); 
        int n=enterIntNumber(1,20);       // ������ ����������� N �� 1 �� 20
		

        //int m=7, n=5; //��� ��� �������

        int [][] array = new int [m][n]; // �������������� ������ �������� M�N

        fillDimensionArray (array,10);	// ��������� ������ �� 0 �� 9
        
        System.out.println("�������� ������");
        printDimensionArray (array);      //  � ������� ��� �� ������
        
        
        System.out.println("������� ������ �������");
        int firstN=enterIntNumber(1,array[0].length);
        
        System.out.println("������� ������ �������");
        int secondN=enterIntNumber(1,array[0].length);
        
        if (firstN==secondN) {
        	System.out.println("������ �������� ���������, ������� �� ���������");
        }
        else {
        	firstN--;
        	secondN--;
        	swapColumn (array,firstN, secondN);
        }
        
        System.out.println("����� ������");
        printDimensionArray (array);      //  � ������� ��� �� ������
        

    }

	
	/*
	 * �������� ����� ������
	 * ������ ������� �������
	 */
	
	public static void swapColumn(int[][] a, int col1, int col2) {

		for (int i = 0; i < a.length; i++) { // ��������� ������ �� �����
			int swap;
			swap = a[i][col1];
			a[i][col1] = a[i][col2];
			a[i][col2] = swap;

		}
	}
	
		
	
	
	/* 
	 * ����� ����������� ����������� ����� � ��������� ��� �� ������������
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
    /* 
     * ����� �������� ��������� ������
    */

    public static void printDimensionArray(int [][] a) {
        for (int[] row : a) {
            for (int i : row) {
                System.out.print(i+"\t");//������� ����� ���������
                
            }
            System.out.println();
        }

    }

 /*
  *  ����� ��������� ������ ���������� ������ ������� �� max (�� �������)
  */
   
    public static void fillDimensionArray (int[][] a, int max) {   
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a [i].length; j++) {
                a[i][j] = (int) (Math.random() * max);
            }
        }

    }
 
 
 
}
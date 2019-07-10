package by.epam.algorithmization.big_array;
/*
 * 11.	������� 10x20 ��������� ���������� ������� �� 0 �� 15. ������� �� ����� ���� ������� � ������ �����, � ������� ����� 5 ����������� ��� � ����� ���.
import java.util.Scanner;
*/

public class BigArray11 {

	public static void main(String[] args) {

        
        int [][] array = new int [10][20]; // �������������� ������ �������� M�N

        fillDimensionArray (array,15);	// ��������� ������ ���������� �� 0 �� +15
        
        System.out.println("�������� ������");
        printDimensionArray (array);      //  � ������� ��� �� �������
        
        System.out.println("������, ��� ����� 5 ����������� 3 � �����  ���");
        printRow (array);
        
    }
	
	/**
	 * �������� ����� ������
	 * ������� c�����, ��� ����� 5 ����������� ����� 3-� ���
	 * ��� ������ ���������, ��� ����� ����� ���
	 * 
	 * @param a - ��������� ������ ��� int
	 * 
	 */
	
	public static void printRow (int[][] a) {
		int count;
		boolean flag=false;
		for (int i=0; i<a.length; i++ ) { //���������� ������
			count=0;
			for (int j=0; j<a[i].length; j++)
			if (a[i][i]==5) {
				count++;
			}
			if (count>=3) {
				flag=true;
				System.out.print("\n������-"+(i+1)+": ");
				for (int row:a[i]) {
					System.out.print(row+" ");
				}
			}
		}
		
		if (!flag) {
			 System.out.println("��� ����� �����");
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
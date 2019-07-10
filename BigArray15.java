package by.epam.algorithmization.big_array;


// 15.	������� ���������� ������� ������� � �������� ��� �������� �������� �� ����


import java.util.Scanner;


public class BigArray15 {

    public static void main(String[] args) {

        int[][] array = new int[6][7]; // �������������� ������ �������� M�N
        fillDimensionArray (array,20);// ��������� ������
        System.out.println("�������� ������");
        printDimensionArray(array);      //  � ������� ��� �� �������
        
        int maxArray=findMaxArray(array);    
        System.out.println("������������ ������� �������-"+maxArray);
        changeOddArray(array, maxArray);
        
        System.out.println("����� ������");
        printDimensionArray(array);      //  � ������� ��� �� �������

    }

    /**
     * �������� ����� ������
     * ������ �������� �������� ������� �� ���������
     *
     * @param a - ��������� ������ ���� int
     * @param max - ����� �� ������� �������� �������� ��������
     */
    
    public static void changeOddArray(int[][] a, int max) {
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a[i].length; j++) {
				if (a[i][j]%2==1) {
					a[i][j]=max;
				}
				
			}
		}
		
	}

	/**
     * �������� ����� ������
     * ������� ������������ ������� �������
     *
     * @param a - ��������� ������ ���� int
     * @result ������������ �������
     */

    public static int findMaxArray(int[][] a) {
        int max=a[0][0];
        for (int[] row : a) {
            for (int i : row) {
                if (i>max){
                	max=i;
                }
                
            }
        }
        return max;
    }


	/** 
	 * ����������� ����� ����� � ��������� ��� �� ��������� � �������
	 * 
	 * @param min ����������� ������� (������������)
	 * @param max ������������ ������� (������������)
	 * @result �������� ����� �����
    */

    public static int enterIntNumber (int min, int max){
        Scanner in = new Scanner (System.in);
        int n;
        // ������ ����� N � ��������� ������������ �������� ������
        do {
            System.out.println("������� ����� ����� �� "+min+" �� "+max);
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
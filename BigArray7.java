package by.epam.algorithmization.big_array7;


// 7.	7.	������������ ���������� ������� ������� N �� ������� 



import java.util.Scanner;


public class BigArray7 {

	public static void main(String[] args) {

        System.out.println("������� ������ ����������� �������");

        int n=enterIntNumber(1,20);       // ������ ����������� N �� 1 �� 20

        //int n=5; //��� ��� �������

        float [][] a = new float [n][n]; // �������������� ������ �������� N�N

        fillArray (a);	// ��������� ������ �������� �������
        
        System.out.println("������������ ������");
        printDimensionArray (a);      //  � ������� ��� �� ������
        
        System.out.println("����� ������������� ���������-"+calcPositive (a));

    }

	
	/*
	 * �������� ����� ������
	 * ��������� ������ �� �������� �������
	 */
	
	public static void fillArray(float[][] a) {
	
		for (int i = 0; i < a.length; i++) { // ��������� ������ �� �����
			for (int j = 0; j < a[0].length; j++) {
				a[i][j] = (float) Math.sin(((i+1)*(i+1)-(j+1)*(j+1))/a.length); // ���� �������, �������� � ��������
				
			}
		}
	}
	
	/*
	 * ������ ����� ������
	 * ���������� ���������� ������������� ��������� � �������
	 */
	
	private static int calcPositive(float[][] a) {
		int positiveNumber=0;
		for (float[] row : a) {
            for (float i : row) {
                if (i>0) {
                	positiveNumber++;
                }
            }
		}
            return positiveNumber;
		
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

    public static void printDimensionArray(float [][] a) {
        for (float[] row : a) {
            for (float i : row) {
                System.out.printf("%.3f",i);//������� � ��������� 3 �����
                System.out.print("\t");
            }
            System.out.println();
        }

    }

 
 
 
 
 
}
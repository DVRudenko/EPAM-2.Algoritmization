package by.epam.algorithmization.big_array1;


// 1.	���� �������. ������� �� ����� ��� �������� �������, 
// � ������� ������ ������� ������ ����������


import java.util.Scanner;


public class BigArray1 {

	 public static void main(String[] args) {

		 	System.out.println("������� ����� ����� �������");
	        
		 	int n=enterIntNumber();       // ������ ����������� N>0 
	       
		 	System.out.println("������� ����� �������� �������");
		 	int m=enterIntNumber();
	        
		 	//int n=4; //��� ��� �������
		 	//int m=7; //��� ��� �������
		 			
		 	
	        int [][] a = new int [n][m]; // �������������� ������ �������� N�� 
	        
	        fillDimensionArray (a, 10);		// ��������� ������ ������� �� 0 �� 9
	        
	               
	        System.out.println("�������� ������");
	        printDimensionArray (a);      //  � ������� ��� �� ������
	        System.out.println("���������");
	        
	        boolean flag;
	        for (int j=0; j<a[0].length; j+=2) {
	        	flag=false;
	        	if (a[0][j]>a[a.length-1][j]) { //��������� 1-� � ��������� ������� �������
	        		printRow(a, j);
	        		flag=true;
	        	}
	        	if (flag) {
	        		System.out.println((j+1)+"-� �������"); //������� ����� �������
	        	}
	        }
	        
   	 
	 }	 
	 
	 

 public static int enterIntNumber (){// ����� ����������� ����������� ����� � ��������� ��� �� ������������
     Scanner in = new Scanner (System.in);
     int n;
      // ������ ����� N � ��������� ������������ �������� ������
     do {
         System.out.println("������� ����������� �����>0");
         while (!in.hasNextInt()) {
             System.out.println("������� ���������� �����"); //������� �� ����� ���� int
             in.next();
         }
         n = in.nextInt();
     } while (n <= 0); // ���������, ��� n �������������

     return n;

 }


 public static void fillDimensionArray (int[][] a, int max) {   //��������� ������ ���������� ������ ������� �� max
 	for (int i = 0; i < a.length; i++) {
 		for (int j = 0; j < a [i].length; j++) {
         a[i][j] = (int) (Math.random() * max);
 		}
 	}
 		
 }
 
 
 public static void printDimensionArray (int[][] a) {        // �������� ��������� ������
	 for (int i = 0; i < a.length; i++) {
	 		for (int j = 0; j < a [i].length; j++) {
	 			System.out.print(a [i][j] + "\t");
	 		}
	 		System.out.println();
	}     
 	
 }
 
 public static void printRow (int [][] a, int r) { //�������� ������� r ���������� ������� a
	 for (int i=0; i<a.length; i++) {
		 System.out.println (a[i][r]);
	 }
 }
 
 
 
 
 
}
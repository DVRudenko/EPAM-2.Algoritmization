package by.epam.algorithmization.array10;


// ������� 10.	��� ������������� ������ � ����������� ��������� �.
// ����� ������, �������� �� ���� ������ ������ ������� (�������������� �������� ��������� ������). 
// ����������. �������������� ������ �� ������������.


import java.util.Scanner;


public class Array10 {

	 public static void main(String[] args) {

	        
	        int n=enterIntNumber();       // ������ ����������� N>1 ����� ������ ��� � ������
	        int [] a = new int [n]; // �������������� ������ �������� N 
	        fillIntArray (a, 10);		// ��������� ������ ������� �� 0 �� 9
	        
	        // int [] a = {1, 10, -1, 2, -5, -3, 18, 4, -3, 10, 1, 10};    // ��� ��� �������
	        // int [] a = {1, 10, -1, 2, -5, -3, 18, 4, -3, 10, 1, 10, 11};    // ��� ��� �������
	        
	        System.out.print("�������� ");
	        printIntArray (a);      //  � ������� ��� �� ������
	        
	        int arrayEnd=(a.length+1)/2; // ������� "��������" ��� �������
	        
	        for (int i=1; i<arrayEnd; i++) { //�������� �������� �������� �����
	        	a[i]=a[i*2];
	        }
	        
	        for (int i=arrayEnd;i<a.length; i++) { //��������� ��������� ������
	        	a[i]=0;
	        }
	        System.out.print("������ ");
		 	printIntArray (a);      //  ������� ������ �� ������	
	         
	       
	 	
	    	 
	 }	 
	 
	 

 public static int enterIntNumber (){// ����� ����������� ����������� ����� � ��������� ��� �� ������������
     Scanner in = new Scanner (System.in);
     int n;
      // ������ ����� N � ��������� ������������ �������� ������
     do {
         System.out.println("������� ����������� ����� ��������� ������� N>0");
         while (!in.hasNextInt()) {
             System.out.println("������� ���������� �����"); //������� �� ����� ���� int
             in.next();
         }
         n = in.nextInt();
     } while (n <= 0); // ���������, ��� n �������������

     return n;

 }


 public static void fillIntArray (int[] a, int max) {   //��������� ������ ���������� ������ ������� �� max
 	for (int i = 0; i < a.length; i++) {
         a[i] = (int) (Math.random() * max);
 	}
 }
 
 
 public static void printIntArray (int[] a) {        // �������� ������
     
     System.out.println("������");
     for (int i : a) {
         System.out.print(i + ";");
     }
     System.out.println();
 }
 
 
}
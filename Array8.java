package by.epam.algorithmization.array8;


// ���������� ������� 8.	���� ������������������ ����� ����� a1,a2,���,an. 
// ���������� ����� ������������������, �������� �� �������� �� �����, ������� ����� min( a1, a2, �, an).


import java.util.Scanner;


public class Main {

	 public static void main(String[] args) {

	        int n;
	        int min; 
	        	        
	        
	        
	        
	        n=enterIntNumber();       // ������ ����������� N
	        int [] a = new int [n]; // �������������� ������ �������� N 
	        fillIntArray (a, 10);		// ��������� ������ ������� �� 0 �� 10
	        
	       // n=15;												// ��� ��� �������
	      // int [] a = {1, 10, -1, 2, -5, -3, 18, 4, -3, 10, 1, 10, -5, -3, 1};    // ��� ��� �������
	        
	        System.out.print("�������� ");
	        printIntArray (a);      //  � ������� ��� �� ������
	        
    
	 
	
	

	        int minCount = 0;
	        
	        min=minIntArray(a); //������� ����������� � �������

	        for (int value : a) { // ������� ���������� ��� ��������
	            if (value == min) {
	                minCount++;
	            }
	        }

	        int[] result = new int[a.length - minCount]; //������� ����� ������ ������� (N-���-�� ��������)

	        int i = 0;
	        
	        	for (int j : a) {
	                if (j > min) {
	                    result[i++] = j;
	                }
	            }
	        
	       
	 	System.out.print("����� ");
	 	printIntArray (result);      //  � ������� ��� �� ������
	    	 
	 }	 
	 
	 

 public static int enterIntNumber (){// ����� ����������� ����������� ����� � ��������� ��� �� ������������
     Scanner in = new Scanner (System.in);
     int n;
      // ������ ����� N � ��������� ������������ �������� ������
     do {
         System.out.println("������� ����������� ����� ��������� ������� N");
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
 
 public static int minIntArray (int[]a) {//����������� ������� �������
 
 	int min=a[0];
     
 	for (int i:a) { 
 		if (i <min){
         min=i;
 		}
 	}
 	return min;
 }
}
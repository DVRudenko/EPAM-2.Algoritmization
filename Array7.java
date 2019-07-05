package by.epam.algorithmization.array7;
// 7. ���� �������������� ����� a, a, � � �, � . 
// ����� max(a1 + �2n,�2 + �2n-1 �...,�n + �n+1)


import java.util.Scanner;

public class Main {

	 public static void main(String[] args) {

	        int n;
	        float max;



	        n=enterIntNumber();       // ������ ����������� N

	        float [] a = new float [n*2]; // �������������� ������ �������� N*2 

	        printFloatArray (a);        // ��������� ������ ������� �� 0 �� 99 � ������� �� ������
	        
	        max=a[0]+a[2*(n-1)];

	        for (int i=1; i<n; i++){ //���������� �� ���������� ������ �������
	            if (a[i] + a[2 * (n - i)] > max){
	                max=(a[i] + a[2 * (n - i)]);
	            }
	        }
	         
	        System.out.println("��������="+max);
	       

	    }
  
	
	
	// ����� ����� ������������ ����� � �������� ��� �� ������������

    public static int enterIntNumber (){
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


    public static void printFloatArray (float[] a) {        //�������������� � �������� ������

        for (int i = 0; i < a.length; i++) {
            a[i] = (float) (Math.random() * 100);
        }

        System.out.println("�������� ������");
        for (float i : a) {
            System.out.print(i + ";");
        }
        System.out.println();
    }

   
}


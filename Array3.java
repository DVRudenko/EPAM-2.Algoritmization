package by.epam.algorithmization.array3;
// 3.	��� ������ �������������� �����, ����������� �������� N. 
// ����������, ������� � ��� �������������, ������������� � ������� ���������

import java.util.Scanner;

public class Main {

 public static void main(String[] args) {

     int n;
     //float z;
     int positive=0;
     int negative=0;
     int nullitive=0;


     Scanner in = new Scanner (System.in);

     // ������ ����� N � ��������� ������������ �������� ������
		do {
			System.out.println("������� ����������� ����� ��������� ������� N");
			while (!in.hasNextInt()) {
				System.out.println("������� ���������� �����"); // ������� �� ����� ���� int
				in.next();
			}
			n = in.nextInt();
		} while (n <= 0); // ���������, ��� n �������������

		int[] a = new int[n]; // �������������� ������ �������� N � ��������� ��� ������� �� -50 �� +49

		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 100) - 50;
		}

		System.out.println("�������� ������");
		for (int i : a) {
			System.out.printf(i + ",");
		}

		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0) {
				positive++;
			} else if (a[i] < 0) {
				negative++;
			} else {
				nullitive++;
			}
		}

		System.out.println("\n������������� �����-" + positive);
		System.out.println("������������� �����-" + negative);
		System.out.println("�������-" + nullitive);
	}
}



package by.epam.algorithmization.big_array;
/*
 * 13.	������������� ������� ������� �� ����������� � �������� �������� ���������.
*/

public class BigArray13 {

	public static void main(String[] args) {
		
		int [][] array = new int [10][5]; // �������������� ������ �������� M�N

        fillDimensionArray (array,20);	// ��������� ������ ���������� �� 0 �� +15
        
        System.out.println("�������� ������");
        printDimensionArray (array);      //  � ������� ��� �� �������
        
        sortColumnAscend (array);
        
        System.out.println("�������������� �� ����������� � �������� ������");
        printDimensionArray (array);      // ������� ��� �� �������
        
        sortRowDescend (array);
        System.out.println("�������������� �� �������� � �������� ������");
        printDimensionArray (array);      // ������� ��� �� �������
        
    }
	
	/**
	 * �������� ����� ������
	 * ��������� ������� �� ����������� ������� "������"
	 * 
	 * @param a - ��������� ������ ���� int
	 * 
	 */
	
	public static void sortColumnAscend (int[][] a) {
		int min;
		int minPos;
		int temp;
		
		for (int j=0; j<a[0].length; j++ ) { //���������� ��� �������
			
			for (int i=0; i<a.length; i++) { //���������� �������� � �������
				min=a[i][j];
				minPos=i;
				for (int x=i; x<a.length;x++) { //������� ������� � ���������� ���
					if (a[x][j]<min) {
						min=a[x][j];
						minPos=x;
					}
				}
				temp=a[i][j];			//������ ������� ������ 
				a[i][j]=min;
				a[minPos][j]=temp;
				
			}
		}
	}
	
	/**
	 * �������� ����� ������
	 * ��������� c����� �� �������� ������� "������"
	 * 
	 * @param a - ��������� ������ ���� int
	 * 
	 */
	
	public static void sortRowDescend (int[][] a) {
		int max;
		int maxPos;
		int temp;
		
		
			for (int j=0; j<a[0].length; j++ ) { //���������� ��� �������
				
				for (int i=0; i<a.length; i++) { //���������� �������� � �������
					max=a[i][j];
					maxPos=i;
					for (int x=i; x<a.length;x++) { //������� ������� � ���������� ���
						if (a[x][j]>max) {
							max=a[x][j];
							maxPos=x;
						}
					}
					temp=a[i][j];			//������ ������� ������ 
					a[i][j]=max;
					a[maxPos][j]=temp;
					
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
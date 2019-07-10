package by.epam.algorithmization.big_array;
/*
 * 12.	������������� ������ ������� �� ����������� � �������� �������� ���������
*/

public class BigArray12 {

	public static void main(String[] args) {
		
		int [][] array = new int [5][10]; // �������������� ������ �������� M�N

        fillDimensionArray (array,20);	// ��������� ������ ���������� �� 0 �� +15
        
        System.out.println("�������� ������");
        printDimensionArray (array);      //  � ������� ��� �� �������
        
        sortRowAscend (array);
        
        System.out.println("�������������� �� ����������� � ������� ������");
        printDimensionArray (array);      // ������� ��� �� �������
        
        sortRowDescend (array);
        System.out.println("�������������� �� �������� � ������� ������");
        printDimensionArray (array);      // ������� ��� �� �������
        
    }
	
	/**
	 * �������� ����� ������
	 * ��������� c����� �� ����������� ������� "��������"
	 * 
	 * @param a - ��������� ������ ���� int
	 * 
	 */
	
	public static void sortRowAscend (int[][] a) {
		int min;
		int minPos;
		int temp;
		
		for (int i=0; i<a.length; i++ ) { //���������� ��� ������
			
			for (int j=0; j<a[i].length; j++) { //���������� �������� � ������
				min=a[i][j];
				minPos=j;
				for (int x=j; x<a[i].length;x++) { //������� ������� � ���������� ���
					if (a[i][x]<min) {
						min=a[i][x];
						minPos=x;
					}
				}
				temp=a[i][j];			//������ ������� ������ 
				a[i][j]=min;
				a[i][minPos]=temp;
				
			}
		}
	}
	
	/**
	 * �������� ����� ������
	 * ��������� c����� �� ����������� ������� "��������"
	 * 
	 * @param a - ��������� ������ ���� int
	 * 
	 */
	
	public static void sortRowDescend (int[][] a) {
		int max;
		int maxPos;
		int temp;
		 
		for (int i=0; i<a.length; i++ ) { //���������� ��� ������
			
			for (int j=0; j<a[i].length; j++) { //���������� �������� � ������
				max=a[i][j];
				maxPos=j;
				for (int x=j; x<a[i].length;x++) { //������� ������� � ���������� ���
					if (a[i][x]>max) {
						max=a[i][x];
						maxPos=x;
					}
				}
				temp=a[i][j];			//������ ������� ������ 
				a[i][j]=max;
				a[i][maxPos]=temp;
				
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
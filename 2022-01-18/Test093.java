/*=====================
  �����	�� ����
=======================*/

// �迭�� �迭(2���� �迭)

/*
  1   2   3   4   10
  5   6   7   8   26
  9  10  11  12   42
 13  14  15  16   58
 28  32  36  40  136
*/

public class Test093
{
	public static void main(String[] args)
	{
		int [][] arr = new int[5][5];
		int n = 1;
		int sum1=0;//���ε��� 
		int sum2=0;//���ε���
		/* 
		for (int i = 0;i<arr.length ;i++ )
		{   
			for (int j =0;j<arr[i].length ;j++ )
			{
				arr[i][j] = n;
				n++;
				if (j==4) // ���� ����
					arr[i][4]=(arr[i][0]+arr[i][1]+arr[i][2]+arr[i][3]);	// �� �밡�ٷ� ǰ
				if (i==4) // ���� ����
					arr[4][j]=(arr[3][j]+arr[2][j]+arr[1][j]+arr[0][j]); 	
			}
			n--;
		}*/
		/* //�ٸ��� Ǯ���� ��
		for (int i=0;i<5 ;i++ )
		{
			for (int j=0;j<4 ;j++ )
			{
				arr[i][j]=n; // 0 1 2 3 ���� ���� 4�� ����... 
				n++;
				sum1 +=arr[i][j]; //0 1 2 3 ������ ����
				arr[i][4]=sum1;	 // 4��°��  ���� �־��� (������ 0��)
			}
			sum1 = 0;// ���ϸ� ���� ����� �� ������
		}
		for (int i=0;i<5 ;i++ ) // ���η� �迭�� ���? �ؼ� ���Ҳ���(���� ��� �ƴϰ�)
		{						// ���� ������ ���� 
			for (int j=0;j<4 ;j++ ) //0 1 2 3 ���� �ؼ� ���Ҳ��ϱ� 4
			{
				sum2 += arr[j][i]; // �迭 ji�� ���η� �ٲٰ� �յ��� sum2�� ����
				arr[4][i] = sum2; // 4��° �� ���� ���� sum2 �� ����
			}
			sum2 = 0;		  
		}*/

		//�� ���� Ǭ��
		n = 0;
		for (int i=0;i<arr.length-1 ;i++)
		{
			
			for (int j =0;j<arr[i].length-1 ;j++ )
			{
				n++;
				arr[i][j] = n;
				
				arr[i][arr[i].length-1] += arr[i][j]; // arr[i][4] > ������
				arr[arr.length-1][j] += arr[i][j];	//	arr [4][j] > ������
				arr[arr.length-1][arr[i].length-1] += arr[i][j]; // arr[4][4]
			}
		}
		//��� ����
		for (int i = 0;i<arr.length ;i++ )
		{
			for (int j = 0;j<arr[i].length ; j++)
			{
				System.out.printf("%4d",arr[i][j]);
		    }
			System.out.println();
		}
	}
}
/*
   1   2   3   4  10
   5   6   7   8  26
   9  10  11  12  42
  13  14  15  16  58
  28  32  36  40 136
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
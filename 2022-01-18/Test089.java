/*=====================
  �����	�� ����
=======================*/

// �迭�� �迭(2���� �迭)

// �迭�� �迭(������ �迭) �� Ȱ���Ͽ�
// ���� �� ���� �����͸� ��ҷ� ���ϴ� �迭�� �����ϰ�
// �� ����� ����ϴ� ���α׷��� �����Ѵ�

//���࿹)
/*
	1 2 3 4 5	i = 0
	2 3 4 5 6	i = 1
	3 4 5 6 7	i = 2
	4 5 6 7 8   i = 3
	5 6 7 8 9	i = 4
*/
public class Test089
{
	public static void main(String[] args)
	{
		// ���� Ǭ Ǯ��
		/*int [][] arr = new int[5][5];
		int n = 1;

		for (int i = 0;i<arr.length ;i++ )
		{
			for (int j =0;j<arr[i].length ;j++ )
			{
				arr[i][j] = n;
				n++;
			}
			n -= 4;
		}

		for (int i = 0;i<arr.length ;i++ )
		{
			for (int j = 0;j<arr[i].length ; j++)
			{
				System.out.printf("%3d",arr[i][j]);
		    }
			System.out.println();
		}*/

		// ���� Ǭ Ǯ��
		int [][] arr = new int[5][5];
		int n = 1;

		for (int i = 0;i<arr.length ;i++ )
		{   
			n = 1 + i; // n�� ���� ���� ���� �ʱ�ȭ.. ���� �� ����..
			for (int j =0;j<arr[i].length ;j++ )
			{
				arr[i][j] = n;
				n++;
			}
		}

		for (int i = 0;i<arr.length ;i++ )
		{
			for (int j = 0;j<arr[i].length ; j++)
			{
				System.out.printf("%3d",arr[i][j]);
		    }
			System.out.println();
		}

	}

}
/*
  1  2  3  4  5
  2  3  4  5  6
  3  4  5  6  7
  4  5  6  7  8
  5  6  7  8  9
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
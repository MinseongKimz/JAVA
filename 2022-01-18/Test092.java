/*=====================
  �����	�� ����
=======================*/

// �迭�� �迭(2���� �迭)

// �迭�� �迭(������ �迭) �� Ȱ���Ͽ�
// ���� �� ���� �����͸� ��ҷ� ���ϴ� �迭�� �����ϰ�
// �� ����� ����ϴ� ���α׷��� �����Ѵ�


/*
  E  J  O  T  Y         5x5 �迭
  D  I  N  S  X		    �������� ���η� ���� [j] [i] �÷� �����				
  C  H  M  R  W			A ���� B C D 1�� �����ؼ� �ٲٸ� �ɵ�
  B  G  L  Q  V			n = 65��(A) �����ؼ� 1 �� ������Ű��
  A  F  K  P  U			�� �Ŀ� ������ �迭�� (char)n ���� �־��ָ�
						��ȯ�� ������ �� �ϴ�.
  */
public class Test092
{
	public static void main(String[] args)
	{
		char [][] arr = new char[5][5]; 
		int n = 65; // char n = 'A'; 
		
		for (int i=0;i<5 ;i++ )
		{
			for (int j=0;j<5 ;j++ )  // for(int j=4; j>=0; j--)  4 3 2 1 0 ���ҽ�Ű�� �ݺ���
			{
				arr[4-j][i]= (char)n; // arr[j][i]=(char)n;
				n++;
			}
		}
		for (int i = 0;i<arr.length ;i++ )
		{
			for (int j = 0;j<arr[i].length ; j++)
			{
				System.out.printf("%3c",arr[i][j]);
		    }
			System.out.println();
		}
	}
}
/*
  E  J  O  T  Y
  D  I  N  S  X
  C  H  M  R  W
  B  G  L  Q  V
  A  F  K  P  U
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
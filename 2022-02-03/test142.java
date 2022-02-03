/*=================================
  ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
===================================*/

// StringTokenizer Ŭ����
/*
��	StringTokenizer Ŭ������ 
	���ڿ� �Ľ�(parsing)�� ���� ������ �����ϴ� Ŭ������
	�Ľ�(parsing)�ϰ��� �ϴ� ���ڿ��� ���ڷ� �޾� �����ϴµ�,
	���⿡�� �Ľ�(parsing)�̶� �ϳ��� ���ڿ��� ���� ���ڿ���
	������ �۾��� �ǹ��ϰ� �Ǹ�, �� �� ������ ������ �Ǵ� ���ڿ���
	��ū(token)�̶�� �Ѵ�.

	StringTokenizer Ŭ������ ����ϱ� ���ؼ���
	java.util ��Ű���� StringTokenizer�� import �ؾ� �Ѵ�.

	StringTokenizer Ŭ������ ȣȯ���� �����ϴ� �������� 
	���� �����ǰ� ������ ���ڿ��� �Ľ�(parsing)�ϱ� ���ؼ���
	StringŬ������ split() �޼ҵ峪 java.util.regex ��Ű���� ����� ���� �����ϰ� �ִ�.

��	������
 -  ����
 	StringTokenizer(String str)
	StringTokenizer(String str, String delim)
	StringTokenizer(String str, String delim, boolean returnDelims)
	��	�־��� ���ڿ� str�� �ܾ�� �и��ϴ� ��ü�� �����ϸ�
		����(����)���ڴ� delim�� ���Ե� ���ڷ� ó���ϰ� �ȴ�.
		���� returnDelims �� true �̸� 
		���� ���ڵ� �и��� �����ͷ� ó���ϰ� �ȴ�.
*/
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class test142
{
	public static void main(String[] args) throws IOException
	{
		String strTemp;
		String[] strArr;
		int n;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("�Ľ��� ���ڿ� �Է�(�ĸ� ����) : ");
		strTemp = br.readLine();
		//-- "���,����,�ٳ���,�丶��"

		//StringTokenizer Ŭ���� �ν��Ͻ� ����
		StringTokenizer st = new StringTokenizer(strTemp, ",");
		//--strTemp �� ��� ���ڿ���...("���,����,�ٳ���,�丶��")
		//-- ��,���� �����ڷ�....


		// st�� ��countTokens()�� �޼ҵ� ȣ��
		// ��int countTokens()��
		// : �Ľ̵� ���ڿ��� ������ ����(��ȯ)�Ѵ�.
		strArr = new String[st.countTokens()];
		//					======= 4 ��ȯ == 
		// �� strArr = new String[4];
		
		n = 0;

		while (st.hasMoreTokens()) // 0:true 1:true 2:true 3:true 4:false
 			strArr[n++] = st.nextToken();
			// strArr[0] = "���";
			// strArr[1] = "����"; 
			// strArr[2] = "�ٳ���"; 
			// strArr[3] = "�丶��"; 
			// �״��� ���� ���ڿ��� ������ hasMoreTokens �� false �� ��ȯ
			// while�� ����..

		// st.hasMoreTokens() : st�� ���� ��ū�� ������ true ������ false�� ��ȯ, Ȯ�θ� �� ��� �̵� x
		// st.nextToken() : ��带 �̵�, ���ҵ� ���� ��ū�� ������. 

		System.out.print("�Ľ̵� ��ū (���ڿ�) : " );
		for (String str: strArr)
			System.out.print(str + " ");
		System.out.println();
	}
}
/*
�Ľ��� ���ڿ� �Է�(�ĸ� ����) : ���,����,�ٳ���,�丶��
�Ľ̵� ��ū (���ڿ�) : ��� ���� �ٳ��� �丶��
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
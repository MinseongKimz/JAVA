//���� �� 
//�� ���� �Է� :
//�� �ڸ� ���� �Է� :

//�Է��� ���� : 
//�Է��� ���� : 
import java.io.IOException;

public class Test017_2
{
	public static void main(String[] args) throws IOException
	{
		char ch;
		int a ; 

		System.out.print("�� ���� �Է� :" );
		ch = (char)System.in.read();

		// �Է´�⿭�� �����ִ� \r, \n�� ��ŵ�ؾ���.
		System.in.skip(2);
		// �Ű����� 2�� ���� �� ���߸� �����ʰ� �ǳʶ�


		System.out.print("�� �ڸ� ���� �Է� :");//....????????
		a = System.in.read();
		a -= 48;

		System.out.println();
		System.out.printf("�Է��� ���� : %c \n",ch);
		System.out.printf("�Է��� ���� : %d \n",a);

	}
}
/*
���� ���
�� ���� �Է� :A
�� �ڸ� ���� �Է� :3

�Է��� ���� : A
�Է��� ���� : 3
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
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
		System.in.skip(2);
		
		System.out.print("�� �ڸ� ���� �Է� :");//....????????
		a = System.in.read() ;

	
		System.out.printf("�Է��� ���� : %c \n",ch);
		System.out.printf("�Է��� ���� : %d \n",a);

	}
}
//실행 예 
//한 문자 입력 :
//한 자리 정수 입력 :

//입력한 문자 : 
//입력한 정수 : 
import java.io.IOException;

public class Test017_2
{
	public static void main(String[] args) throws IOException
	{
		char ch;
		int a ; 

		System.out.print("한 문자 입력 :" );
		ch = (char)System.in.read();
		System.in.skip(2);
		
		System.out.print("한 자리 정수 입력 :");//....????????
		a = System.in.read() ;

	
		System.out.printf("입력한 문자 : %c \n",ch);
		System.out.printf("입력한 정수 : %d \n",a);

	}
}
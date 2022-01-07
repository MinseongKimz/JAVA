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

		// 입력대기열에 남아있는 \r, \n을 스킵해야함.
		System.in.skip(2);
		// 매개변수 2에 의해 두 글잘르 읽지않고 건너띔


		System.out.print("한 자리 정수 입력 :");//....????????
		a = System.in.read();
		a -= 48;

		System.out.println();
		System.out.printf("입력한 문자 : %c \n",ch);
		System.out.printf("입력한 정수 : %d \n",a);

	}
}
/*
실행 결과
한 문자 입력 :A
한 자리 정수 입력 :3

입력한 문자 : A
입력한 정수 : 3
계속하려면 아무 키나 누르십시오 . . .
*/
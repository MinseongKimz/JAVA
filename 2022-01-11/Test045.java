/*==========================================
  ■■■ 실행 흐름의 컨트롤(제어문) ■■■
============================================*/
// switch문 실습

//사용자로부터 임의의 두 정수와 연산자를 입력 받아 
// 해당 연산자의 처리 결과를 출력하는 프로그램을 구현한다.
//단 스위치문을 활용하여 처리할 수 있도록 하며.
// 연산결과는 편의상 정수 형태로 처리할 수 있도록 한다.

//실행예) 
// 첫 번째 정수 입력 : 3
// 두 번째 정수 입력 : 17
// 연산자 입력[+ - * /] : -

// >> 3 -17 = -14
// 계속하려면 아무키나 누르세요.



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test045
{
	public static void main(String[] args) throws IOException
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a, b, result = 0;
		char c;

		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("연산자 입력[+ - * /] : ");
		c = (char)System.in.read();

		switch (c)
		{
		case '+': result = a + b; break;
		case '-': result = a - b; break;
		case '*': result = a * b; break;
		case '/': result = a / b; break;
		default : return;       // return 의 의미 : 값의 반환 (특정한 값. return만 단독으로 쓰이진 않음)
								//                  메소드 종료 → 여기선 main() 메소드 종료 → 프로그램 종료
		}

		System.out.printf("\n>> %d  %c  %d  =  %d\n",a, c, b, result);
	}
}
/*
첫 번째 정수 입력 : 2
두 번째 정수 입력 : 3
연산자 입력[+ - * /] : +

>> 2  +  3  =  5
계속하려면 아무 키나 누르십시오 . . .
*/
/*==========================================
  ■■■클래스와 인스턴스 ■■■
============================================*/

// 사용자로부터 임의의 두 정수와 연산자를 입력받아
// 해당 연산을 수행하는 프로그램을 구현한다.
// 단, 클래스와 인스턴스의 개념을 활용하여 작성항ㄹ 수 있도록 한다.

//실행 예)
// 임의의 두 정수 입력(공백 구분) : 10 5
// 임의의 연산자 입력(+ - * /) : +
// >> 10 + 5 = 15
// 계속하려면 아무 키나 누르세요...

import java.util.Scanner;
import java.io.IOException;

class Calculate
{
	int a, b;
	char c;

	//입력 메소드
	void input() throws IOException
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("임의의 두 정수 입력(공백 구분) : ");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.print("임의의 연산자 입력(+ - * /) : ");
		c= (char)System.in.read();
	}

	int cal()
	{
		int d=0;

		if (c == '+')
		{
			d = a + b;
		}
		else if (c == '-')
		{
			d = a - b;
		}
		else if (c == '*')
		{
			d = a * b;
		}
		else if (c == '/')
		{
			d = a / b;
		}
		return d;
	}

	
	void print(int result)
	{
		System.out.printf("%d  %c  %d  = %d\n",a,c,b, result);
	}

}
public class Test075
{
	public static void main(String[] args) throws IOException
	{
		int re;
		Calculate ca = new Calculate();
		ca.input();
		re =ca.cal();
		ca.print(re);
	}
}
/* 실행결과
임의의 두 정수 입력(공백 구분) : 123
-2
임의의 연산자 입력(+ - * /) : -
123  -  -2  = 125
계속하려면 아무 키나 누르십시오 . . .
*/
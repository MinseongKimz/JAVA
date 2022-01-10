/*==========================================
  ■■■ 실행 흐름의 컨트롤(제어문) ■■■
============================================*/

//if ~ else 문 실습

//사용자로부터 임의의 두 정수와 연산자를 입력받아
// 해당 연산자의 연산처리 결과를 출력하는 프로그램을 구현한다.
// 단, if 조건문을 활용하여 처리할 수 있도록 하며,
// 연산 결과는 편의상 정수 기반으로 처리될 수 있도록 한다.

// 실행 예)
// 첫 번째 정수 입력 : 
// 두 번째 정수 입력 :
// 연산자 입력[+ - * /] : 

// x + x = x

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test038
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

		if (c == '+')
		{
			result = a + b;
		}
		else if (c == '-')
		{
			result = a - b;
		}
		else if (c == '*')
		{
			result = a * b;
		}
		else if (c == '/')
		{
			result = a / b;		
		}
		else
		{
			System.out.println("\n연산자를 다시 확인해 주세요");
		}

		System.out.printf("\n%d  %c  %d  =  %d \n",a, c, b, result);
		
	}
}
/*
첫 번째 정수 입력 : 23
두 번째 정수 입력 : 4
연산자 입력[+ - * /] : /

23  /  4  =  5

계속하려면 아무 키나 누르십시오 . . .
*/
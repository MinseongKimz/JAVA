/*==========================================
  ■■■ 실행 흐름의 컨트롤(제어문) ■■■
============================================*/

//if ~ else 문 실습

// 사용자로부터 임의의 정수 세 개를 입력받아
// 작은 수에서 큰 수 순으로 출력하는 프로그램을 구현한다.

//실행 예)
// 첫 번째 정수 입력 : 7
// 두 번째 정수 입력 : 70
// 세 번째 정수 입력 : 42

// >> 정렬 결과 : 7 42 70
// 계속하려면 아무키나 누르세요...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test039
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a, b, c;

		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("세 번째 정수 입력 : ");
		c = Integer.parseInt(br.readLine());

			//나올수 있는 순서
			//abc, acb, bac, bca, cab, cba
		if (a > b)   
		{
			a=a^b;
			b=b^a;
			a=a^b;
		}
		if (b > c)   // b = 2 , c = 1						
		{
			b=b^c;
			c=c^b;
			b=b^c;
		}
		if (a > b) // a = 2, b = 1                            
		{
			a=a^b;
			b=b^a;
			a=a^b;
		}
		
		System.out.printf("\n 정렬 결과 : %d, %d, %d\n",a,b,c);
	

		/*
		System.out.print("네 번째 정수 입력 : ");
		d = Integer.parseInt(br.readLine());

		if (a>b)
		{
			t = a;
			a = b;
			b = t;
		}
		if (b>c)
		{
			t = b;
			b = c;
			c = t;
		}

		if (c>d)
		{
			t = c;
			c = d;
			d = t;
		}
		if (a>b)
		{
			t = a;
			a = b;
			b = t;
		}
		if (a>c)
		{
			t = a;
			a = c;
			c = t;
		}
		if (b>c)
		{
			t = b;
			b = c;
			c = t;
		}

		System.out.printf("\n 정렬 결과 : %d, %d, %d, %d\n",a,b,c,d);
		//정수 4개 정렬 
		*/
	}
}
/*
첫 번째 정수 입력 : 432
두 번째 정수 입력 : 1
세 번째 정수 입력 : 23

 정렬 결과 : 1, 23, 432
계속하려면 아무 키나 누르십시오 . . .
*/
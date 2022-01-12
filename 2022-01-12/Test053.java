/*==========================================
  ■■■ 실행 흐름의 컨트롤(제어문) ■■■
============================================*/
// 반복문(while) 실습

// 사용자로부터 임의의 정수를 입력 받아
// 입력받은 정수가 소수인지 아닌지를 판별하여 
// 결과를 출력하는 프로그램을 만든다.
// 1은 소수 아님

// 실행 예 ) 
// 임의의 정수 입력 : 10
// 10 → 소수 아님

// 임의의 정수 입력 : 11
// 11 → 소수

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test053
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n, i = 2; // 1은 소수가 아니고
					  // 1부터 나누기 시작하면 
					  // 무조건 나눠지기 때문에 2부터 시작

		System.out.print("임의의 정수 입력 : ");
		n = Integer.parseInt(br.readLine());
		boolean prime = true; // 소수인지 아닌지 받기 위한 boolean형 

		if (n==1) // 1은 소수가 아니기 때문에 그냥 하나 만들어줌
		{
			System.out.printf("%d는 소수 아님\n",n);
			return;
		}
		while (i<n) 
		{
			if (n%i==0)
			{   
				prime = false; // 밑에 소수일때 출력문을 출력시키지 않음.
				System.out.printf("%d는 소수 아님\n",n);
				break;
			}
			else 
			{
				i++;
			}
		}
		if (prime) // n이 저 while문을 통과 못했다면 
		{          // prime은 true 이기 때문에 소수라 판단
			System.out.printf("%d는 소수\n",n); // 소수라는 출력문을 실행
		}
	}
}

/*
임의의 정수 입력 : 7789
7789는 소수
계속하려면 아무 키나 누르십시오 . . .

임의의 정수 입력 : 1
1는 소수 아님
계속하려면 아무 키나 누르십시오 . . .

임의의 정수 입력 : 7788
7788는 소수 아님
계속하려면 아무 키나 누르십시오 . . .

*/
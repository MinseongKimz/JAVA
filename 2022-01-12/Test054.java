/*==========================================
  ■■■ 실행 흐름의 컨트롤(제어문) ■■■
============================================*/
// 반복문(while) 실습

// 사용자로부터 임의의 두 정수를 입력받아
// 작은 수 부터 큰 수 까지의 합을 수하여
// 결과를 출력하는 프로그램을 구현한다.

// 실행 예) 
// 첫 번째 정수 입력 : 10
// 두 번째 정수 입력 : 20
// >>10 ~ 20 까지의 합 : xxxx

// 첫 번째 정수 입력 :
// 두 번째 정수 입력 : 2
//>> 2~10 까지의 합 : xx

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test054
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int i = 0; //while 문 증감 하기 위한 변수
		int a, b; // 입력받을 변수
		int sum = 0; // a 에서 b 까지 합

		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());

		if (a > b) // 입력받은  두 수의 크기 비교 및 자리 바꿈
		{
			a = a^b;
			b = b^a;
			a = a^b;
		}

		i += a; // i 의 시작값을 a로 맞춤 루프의 시작을 a로 하고 a++ 하면 안되는게
				// 최종 출력 구문에 a 가 들어가고 a 값이 루프를 통해 바뀌기 때문에.
		while (i<=b)
		{
			sum += i;
			i++;
		}
		System.out.printf("%d ~ %d 까지의 합 : %d\n", a,b,sum);
	}
}
/* 실행 결과
첫 번째 정수 입력 : 20
두 번째 정수 입력 : 30
20 ~ 30 까지의 합 : 275
계속하려면 아무 키나 누르십시오 . . .

첫 번째 정수 입력 : 11
두 번째 정수 입력 : 2
2 ~ 11 까지의 합 : 65
계속하려면 아무 키나 누르십시오 . . .

첫 번째 정수 입력 : 6
두 번째 정수 입력 : 6
6 ~ 6 까지의 합 : 6
계속하려면 아무 키나 누르십시오 . . .

*/
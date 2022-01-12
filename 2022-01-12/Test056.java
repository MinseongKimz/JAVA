/*==========================================
  ■■■ 실행 흐름의 컨트롤(제어문) ■■■
============================================*/
// 반복문(while) 실습

// 사용자로부터 원하는 단(구구단)을 입력받아
// 해당하는 구구단을 출력하는 프로그램을 구현한다.
// 단 1~9단 사이의 수를 입력받은 상황이 아니라면
// 이에대한 안내를 한 후 프로그램을 종료 할 수 있도록 처리한다.

// 실행 예)
// 원하는 단(구구단) 입력 : 7
// 7 * 1 = 7
// 7 * 2 = 14
//  ...
// 7 * 9 = 63
// 계속하려면 아무키나 누르세요...

// 원하는 단(구구단) 입력 : 17
// 1부터 9까지의 정수만 입력이 가능합니다.
// 계속하려면 아무키나 누르세요...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test056
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//변수 선언
		int num; // 입력 받을 수
		int i = 1;  // 증감
		int g;  // 곱셈 결과
		
		System.out.print("원하는 단(구구단) 입력 : ");
		num = Integer.parseInt(br.readLine());

		if (num <= 9 && num> 0)
		{
			while (i <= 9)
			{
				g = num * i;
				System.out.printf(" %d * %d = %d\n",num,i,g); 
				i++;
			}
		}
		else 
		{
			System.out.println("1부터 9까지의 정수만 입력이 가능합니다.");
			return;
		}
	}
}
/*
원하는 단(구구단) 입력 : 3
 3 * 1 = 3
 3 * 2 = 6
 3 * 3 = 9
 3 * 4 = 12
 3 * 5 = 15
 3 * 6 = 18
 3 * 7 = 21
 3 * 8 = 24
 3 * 9 = 27
계속하려면 아무 키나 누르십시오 . . .

원하는 단(구구단) 입력 : 11
1부터 9까지의 정수만 입력이 가능합니다.
계속하려면 아무 키나 누르십시오 . . .
*/
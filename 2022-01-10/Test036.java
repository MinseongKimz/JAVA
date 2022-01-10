/*==========================================
  ■■■ 실행 흐름의 컨트롤(제어문) ■■■
============================================*/

//if ~ else 문 실습

// 사용자로부터 임의의 정수를 입력받아
//다음과 같은 판별 결과를 출력하는 프로그램을 구현한다.

// 2의 배수/ 3의 배수/ 2와 3의 배수/ 2와 3의 배수 아님

//실행 예) 
// 임의의 정수 입력 : 4
// 4 → 2의 배수
//계속하려면 아무키나 누르세요...

// 임의의 정수 입력 : 9
// 9 → 3의 배수
//계속하려면 아무키나 누르세요...

// 임의의 정수 입력 : 6
// 6 → 2와 3의 배수
//계속하려면 아무키나 누르세요...

// 임의의 정수 입력 : 17
// 17 → 2와 3의 배수 아님
//계속하려면 아무키나 누르세요...

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test036
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n;
		
		System.out.print("임의의 정수 입력 : ");
		n = Integer.parseInt(br.readLine());


		if (n%2!=0 && n%3!=0)
		{
			System.out.printf("%d → 2와 3의 배수 아님\n",n);
		}
		else if (n%2==0 && n%3==0)
		{
			System.out.printf("%d → 2와 3의 배수\n",n);
		}
		else if (n%2==0)
		{
			System.out.printf("%d → 2의 배수\n",n);
		}
		else if (n%3==0)
		{
			System.out.printf("%d → 3의 배수\n",n);
		}
	
	}
}
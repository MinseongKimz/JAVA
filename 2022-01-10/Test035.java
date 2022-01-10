/*==========================================
  ■■■ 실행 흐름의 컨트롤(제어문) ■■■
============================================*/

//if ~ else 문 실습

// 1. 프로그램을 작성할 때 주어진 조건에 따라
//    분기 방향을 정하기 위해 사용하는 제어문에는
//    if문, if ~ else 문, 조건연산자, 복합 if 문
//    swich문이 잇다

// 2. if 문은 if 다음의 조건이 참일 경우,
//    특정 문장을 수행하고자 할 때 사용되는 구문이다.

// 정수를 입력받아 홀수/ 짝수 판별하는 프로그램을 구현한다.
// 단, 단일 if구문을 사용한다.
//홀수 짝수 0

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Test035
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n; 

		System.out.print("임의의 정수 입력 : ");
		n = Integer.parseInt(br.readLine());
		/*
		if (n%2==0)
		{
			System.out.printf("%d는 짝수\n",n);
		}

		else if (n%2!=0)
		{
			System.out.printf("%d는 홀수\n",n);
		}
		else
		{
			System.out.println(n + "은 0");   // 이건 0을 걸러 낼 수 가 없음.
												 거르러면 0거르기가 짝수보다 먼저 입력되야함.
		}
		*/									// 조건문을 구성할 때에는 항상 조건의 구성 순서에 유의해야한다.

											//※ 조건문 구성과정에서는 이외의 영역(else)을 
		/*									// 업무에 포함된 내용으로 처리하는 것은 바람직하지 않을 경우가 있다.
											// 가급적이면 업무에 포함되지 않는 내용을
											// 이외의 영역(else)에서 처리할 수 있도록 하자.

										
		if (n %2!=0)
		{
			System.out.printf("%d는 홀수\n",n);	
		}
		else if (n ==0)
		{
			System.out.println(n + "은 0");
		}
		else 
			System.out.printf("%d는 짝수\n",n);
		*/
		
		String result;                          // 이 코드에서 먼저 result가 초기화 되지 않았고
												// if문 내에서 조건에 따라 선언된다. 
		if (n==0)								// 하지만 자바에서 우리가 if문을 어떻게 쓰던 else 가 없다면
		{										// 모든 경우의수 를 채우지 않았다고 판단. 에러가 난다.
			result = "영";						// if문 밖에서 변수의 초기화가 이루어지거나 		
		}										// else를 통해서 모든 경우를 포함시켜야 한다.
		else if (n%2 ==0)
		{
			result = "짝수";				    // if~else 구문의 중첩구문은
		}										// 반드시 else로 끝나야 하는 것이 아니다.
		else if (n%2 !=0)						// 다만, 출력해야 할 구문을 처리하는 과정에서
		{										// 문제가 발생하지 않는 구문으로 작성해야 한다.
			result = "홀수";
		}
		else
			result = "판정불가";

		System.out.println(n + " → " + result);    
		
	}
}

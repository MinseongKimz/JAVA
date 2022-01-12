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

//※수업시간 같이 푼 풀이.(Test053은 내가 푼풀이)

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test053_2
{	
	//주요 변수 선언

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	int num; // 사용자의 입력값을 담아낼 변수
	int n = 2; //입력값을 대상으로 나눗셈 연산을 수행할 변수
			   //2부터 1씩 증가 입력값-1 까지 증가하면서 나눔
			   //ex) 입력값 27 > n : 2 3 4 5 ... 26


	//연산 및 처리
	System.out.print("임의의 정수 입력 : ");
	num = Integer.parsInt(br.readLine());

	boolean flag = true; // num은 소수일 것이다 라는 플래그를 세움. 

	while (n<num)
	{
		// n으로 num이 나누어 떨어지는지 확인.
		if (num%n==0)
		{
			//소수 아니다.
			flag = false; //num은 소수 아니다.
			break; //멈춘다 (그리고 빠져나간다)
		}

		n++;
	}

	//결과 출력 (출력전에 확인할 것→ num값이 1인지 아닌지 확인)
	if (flag && num!=1)
	{
		System.out.printf("%d는 소수\n",num);
	}
	else 
	{
		System.out.printf("%d는 소수 아님\n",num);
	}

	












}
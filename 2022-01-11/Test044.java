/*==========================================
  ■■■ 실행 흐름의 컨트롤(제어문) ■■■
============================================*/
// switch문 실습

// 사용자로부터  1 부터 3 까지의 정수 중 하나를 입력받아
// 입력 받은 정수만큼의 별문자(★)가 출력되는 프로그램을 작성한다.
// 단, 두 가지 방법으로 구현할 수 있도록 한다.

//① switch 문의 일반 모델을 사용한다.
//② switch 문의 기본 모델을 사용하되 break를 딱 한번 사용

//실행 예)
//임의의 정수 입력(1~3): 3
//★★★
//계속하려면 아무키나...

//임의의 정수 입력(1~3): 4
//입력 오류~!!!
//계속하려면 아무키나...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test044
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num;
		
		System.out.print("임의의 정수 입력(1~3): ");
		num = Integer.parseInt(br.readLine());

		/*switch (num)
		{
		case 3: 
			System.out.println("★★★"); break;
		case 2: 
			System.out.println("★★"); break;
		case 1: 
			System.out.println("★"); break;
		default : 
			System.out.println("입력 오류~!!!"); break;
		}*/
		/*
		String star = "";
		switch (num)
		{
		
		case 3:
			star += "★"; 
		case 2: 
			star += "★"; 
		case 1: 
			star += "★"; System.out.println(star); break;
		default : 
			System.out.println("입력 오류~!!!");
		// 뭔가 누적하는 거라면 += 관계 대입 연산자를 생각하자..
	*/
		switch (num)
			{
				case 3: System.out.print("★");
				case 2: System.out.print("★");
				case 1: System.out.print("★"); break;
				default :System.out.print("입력 오류~!!!"); 
			}
			System.out.println();
	}
}

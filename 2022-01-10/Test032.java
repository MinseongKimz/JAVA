/*===========================================
■■■ 연 산 자 (Operater) ■■■
=============================================*/
// 조건 연산자 == 삼항 연산자

// 사용자로부터 임의의 연도를 입력받아
// 입력받은 연도가.. 윤년인지 평년인지 판별하여
// 그 결과를 출력하는 프로그램을 구현한다.
// 단, 입력은 BufferedReader의 readLine() 을 활용하고
// 조건 연산자를 활용하여 연산을 수행할 수 있도록 한다.

// 실행 예)
// 임의의 연도 입력 : 2000
// 2000년 → 윤년
// 계속하려면 아무키나 누르세요...
// 임의의 연도 입력 : 2012
// 2012년 →  윤년
// 계속하려면 아무키나 누르세요...

// 임의의 연도 입력 : 2022
// 2022 → 평년
// 계속하려면 아무키나 누르세요...


//윤년 4년에 한번 366일 (그러나 100년에 한번씩은 365 그대로)
//400년마다 한번씩은 윤년 적용

// 즉 입력받은 수가 4의 배수 이면서 100의 배수가 아니고, 400의 배수면 윤년 
// 나머지는 평년 

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test032
{
	public static void main(String[] args) throws IOException
	{
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	
	int year;
	String strResult;

	System.out.print("임의의 연도 입력 : ");
	
	year = Integer.parseInt(br.readLine());

	strResult = (year % 4 == 0  && year % 100 != 0) || year % 400 == 0 ? "윤년" : "평년";
	// 막힌 부분: != 같지 않다 를 생각 못해서. 중첩을 많이해서 더 헷갈림
	// != 같지않다. 라는 걸 기억하자.
	System.out.printf("%d → %s\n" ,year,strResult); 


	}

}
/*
임의의 연도 입력 : 100
100 → 평년
계속하려면 아무 키나 누르십시오 . . .

*/
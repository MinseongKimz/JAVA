/*===========================================
■■■ 연 산 자 (Operater) ■■■
=============================================*/
// 조건 연산자 == 삼항 연산자

//사용자로부터 임의의 정수를 입력받아
// 입력받은 정수가 양수인지 음수인지 0인지를 구분하여
//이 결과를 출력하는 프로그램을 구현한다.
//단 이때 BufferedReader 의 readLine()을 통해 넘겨 받을 수 있도록 한다.
// 또한 조건 연산자( 삼항 연산자를) 활용 하여 기능을 구현할 수 있도록 한다.

// 실행 예)
// 임의의 정수 입력 : 
// ?? → 음수 양수

// 임의의 정수 입력 : 0
// 0 → 영

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test030
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n;
		String strResult;
		System.out.print("임의의 정수 입력 : ");
		n = Integer.parseInt(br.readLine());

		strResult = (n > 0) ? "양수": (n == 0 ? "영" : "음수") ;

		System.out.println();
		System.out.printf("%d → %s%n",n, strResult);

	}
}
/* 
임의의 정수 입력 : 3

3 → 양수
계속하려면 아무 키나 누르십시오 . . .

임의의 정수 입력 : 0

0 → 영
계속하려면 아무 키나 누르십시오 . . .

임의의 정수 입력 : -32

-32 → 음수
계속하려면 아무 키나 누르십시오 . . .


*/
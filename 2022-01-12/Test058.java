/*==========================================
  ■■■ 실행 흐름의 컨트롤(제어문) ■■■
============================================*/

// 반복문 (do ~ while) 실습

// 사용자로부터 여러 개의 양의 정수를 입력받고,
// 그 합을 계산하여 출력하는 프로그램을 작성한다.
// 단,-1이 입력되는 순간 
// 입력을 중지하고 그동한 입력된 
// 정수의 합을 출력해주는 프로그램 구현
// 즉, -1을 입력 중지 커맨드로 활용한다.
// do ~ while 문을 활용하여 문제를 해결해 보자.

// 실행 예)
// 1번째 정수 입력(-1은 종료): 10
// 2번째 정수 입력(-1은 종료): 5
// 3번째 정수 입력(-1은 종료): 8
// 4번째 정수 입력(-1은 종료): 9
//	   :
// n번째 정수 입력(-1은 종료): -1

// >> 현재까지 입력된 정수의 합 : XXX
// 계속하려면 아무 키나 누르세요...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test058
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i = 1;
		int num;// 받을 정수
		int sum=0; // 합 저장소
		do
		{
			System.out.printf(" %d번째 정수 입력(-1은 종료) : ", i);
			num = Integer.parseInt(br.readLine());
			sum += num;
			i++;
		}
		while(num!=-1);
		System.out.println(">> 현재까지 입력된 정수의 합 : " + (sum+1));
	}
}
/*
 1번째 정수 입력(-1은 종료) : 1
 2번째 정수 입력(-1은 종료) : 2
 3번째 정수 입력(-1은 종료) : 3
 4번째 정수 입력(-1은 종료) : 4
 5번째 정수 입력(-1은 종료) : -1
>> 현재까지 입력된 정수의 합 : 10
계속하려면 아무 키나 누르십시오 . . .

*/
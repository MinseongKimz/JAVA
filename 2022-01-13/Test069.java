/*==========================================
  ■■■ 실행 흐름의 컨트롤(제어문) ■■■
============================================*/

//return 실습

//	break 키워드가 지니는 의미
// 멈춘다 + (그리고 빠져나간다)

//	continue 
//(뒷부분 무시하고) + 계속해라~

//	return 이 지니는 2가지 의미
//	1. 값의 반환
//  2. 메소드 종료

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test069
{
	public static void main(String[] args) throws IOException
    {  
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		int n, s;
		System.out.print("임의의 정수 입력(10이상) : ");
		n = Integer.parseInt(br.readLine());

		if (n <10)
		{
			System.out.println("10 이상의 정수를 입력해야 합니다.");
			return; // return 단독 사용 = 메소드 종료
					// 여기선 main() 메소드 종료 → 프로그램 종료
		}
		s = 0;
		for (int i =1;i<=n ;i++ )
		{
			s+=i;
		}
		System.out.println("결과 : " + s);
	}
}
/*
임의의 정수 입력(10이상) : 2
10 이상의 정수를 입력해야 합니다.
계속하려면 아무 키나 누르십시오 . . .

임의의 정수 입력(10이상) : 123
결과 : 7626
계속하려면 아무 키나 누르십시오 . . .


*/
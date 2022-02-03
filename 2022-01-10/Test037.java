/*==========================================
  ■■■ 실행 흐름의 컨트롤(제어문) ■■■
============================================*/

//if ~ else 문 실습

//  ○ 과제
//  → 카페에 업로드 
//  사용자로부터 임의의 연도를 입력받아
//  입력받은 연도가 .... 윤년인지 평년인지 판별하여
// 그 결과를 출력하는 프로그램을 구현한다.
// 단, 입력은 BufferedReader의 readLine() 을 활용하고
// if 조건문을 활용하여 연산을 수행할 수 있도록 한다. 

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test037
{
	public static void main(String[] args) throws IOException
	{
		//BufferedReader 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int year; // 사용자에게 받을 임의의 연도

		//안내문 실행
		System.out.print("임의의 연도 입력 : ");

		//readLine() 정수형으로 받기위한 Integer.parseInt
		year = Integer.parseInt(br.readLine());

		

		//제어문
		if ((year%4==0&&year%100!=0)||(year % 400 == 0)) //윤년은 4년에 한번, 하지만 100년마다는 평년, 
		{												 //또 400년마다는 윤년임.
			System.out.printf("\n%d년은 윤년입니다.\n",year);
														 //그래서 4로 나눠떨어지는 년도와 100으로 나누어떨어지지 않는 년도
		}												 //두 조건 모두 해당되는 년도와 400으로 나누어 떨어지는 년도 둘중 하나만 해당되도
														 //윤년이기 때문에 ||으로 묶어줌.
		else 
		{
			System.out.printf("\n%d년은 평년입니다.\n",year);						
														 //위에 해당하지 않는 년도는 평년이다.
		}		

	}
}
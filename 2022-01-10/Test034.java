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
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test034
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a;
		System.out.print("숫자 입력 : ");
		a = Integer.parseInt(br.readLine());

		

		if (a % 2 ==0)
			System.out.printf("%d는 짝수\n",a);

		if (a % 2 == 1)
			System.out.printf("%d는 홀수\n",a);
		
	}
}
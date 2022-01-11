/*==========================================
  ■■■ 실행 흐름의 컨트롤(제어문) ■■■
============================================*/
// 반복문(while) 실습

// 1 부터 100까지의 정수중에서 
// 짝수들의 합을 계산하여 결고 ㅏ값을 출력하는 프로그램을 구현한다.
// 단, 조건문을 사용하지 않도록 하며,
// while 반복문을 활용하여 작성할 수 있도록한다.

//실행 예)
// 1 부터 100까지의 수중 짝수의 합: xx
// 계속하려면 아무키나...

public class Test047
{
	public static void main(String[] args)
	{
		int i = 1;
		int sum = 0;

		while(i<=100)
		{	i++;
			sum += i;
			i++;
		}
		System.out.println(" 1 부터 100까지의 수중 짝수의 합: " + sum);
	}
}
/* 실행 결과 
 1 부터 100까지의 수중 짝수의 합: 2550
계속하려면 아무 키나 누르십시오 . . .
*/

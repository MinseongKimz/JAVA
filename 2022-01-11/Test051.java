/*==========================================
  ■■■ 실행 흐름의 컨트롤(제어문) ■■■
============================================*/
// 반복문(while) 실습

// 1/2 + 2/3 +3/4+ ..... + 9/10 의 연산 처리 결과를 출력하는 프로그램을 구현한다.
// 실행 예
// 연산결과 : xxx(<= 실수기반)


public class Test051
{
	public static void main(String[] args)
	{
		int n=1;
		double s = 0.0;

		while (n<=9)
		{
			s = (double)n/(n+1);
			n++;
		}
		System.out.println("연산 결과 : " + s);
	}
}
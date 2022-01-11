/*==========================================
  ■■■ 실행 흐름의 컨트롤(제어문) ■■■
============================================*/
// 반복문(while) 실습

//1부터 100 까지 정수 중에서
// 짝수와 홀수 끼리 구분해서 모두 더함
//그리고 결과값을 출력
//while 문을 사용할 수 있도록 하며
//조건 구문은 if 조건문을 사용하여 작성할 수 있도록 한다.
public class Test048
{
	public static void main(String[] args)
	{
		int n = 1;
		int even = 0;
		int odd = 0;

		while (n<=100)
		{
			if (n%2==0)
			{
				even += n;
				n++;
			}
			else 
			{
				odd += n;
				n++;
			}
		}
		System.out.println("짝수의 합 : "+even);
		System.out.println("홀수의 합 : "+odd);
	} 
}
/*
짝수의 합 : 2550
홀수의 합 : 2500
계속하려면 아무 키나 누르십시오 . . .
*/
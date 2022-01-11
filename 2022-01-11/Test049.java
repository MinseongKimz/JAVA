/*==========================================
  ■■■ 실행 흐름의 컨트롤(제어문) ■■■
============================================*/
// 반복문(while) 실습

//실행 예)
//1 부터 100 까지 정수의 합 : 5050
//1 부터 100 까지 짝수의 합 : 2550
//1 부터 100 까지 홀수의 합 : 5050

public class Test049
{
	public static void main(String[] args)
	{
		int n = 1;
		int sum=0,even=0,odd=0;

		while(n<=100)
		{
			sum += n;
			if (n%2==0)
			{
				even += n;
				n++;
			}
			else
			{
				odd +=n;
				n++;
			}
		}
		System.out.println("1부터 100까지 정수의 합 : " + sum);
		System.out.println("1부터 100까지 짝수의 합 : " + even);
		System.out.println("1부터 100까지 홀수의 합 : " + odd);

	}
}
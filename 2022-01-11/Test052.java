/*==========================================
  ■■■ 실행 흐름의 컨트롤(제어문) ■■■
============================================*/
// 반복문(while) 실습

// 1 * 2 * 3 * 4 *....*10

//연산결과 : 
public class Test052
{
	public static void main(String[] args)
	{
		int n=0, result=1;

		while (n<10)
		{
			n++;
			result *= n;
		}
		System.out.println(">> " + result);
	}

}
/*
>> 3628800
계속하려면 아무 키나 누르십시오 . . .
*/
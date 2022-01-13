/*==========================================
  ■■■ 메소드의 재귀 호출 ■■■
============================================*/

public class InfRecul
{
	public static void main(String[] args)
	{
		showHi(10);	
	}
	public static void showHi(int cnt)
	{   	
		/*
		System.out.println("Hi~");
		showHi(cnt--);
		if(cnt ==1)
			return;
		*/  // 이 구문은 StackOverflowError 가 나온다.

		System.out.println("Hi~");
		if (cnt == 1)
		{
			return ; 
		}
		showHi(--cnt);	// cnt-- 를 하게되면 호출 후 감소라 의미가 없다. //10에서 10 호출후 9로 바뀌는데 그럼 또 10호출문이 9를 줄이고....
	}					// 그리고 if문보다 앞에 놔버리면 호출후 검사라 검사하기도 전에 호출이 이루어진다.
						//평생 검사할 일이 없어진다. 그러므로 검사 먼저 수행한 후 호출이 필요하다.
}    
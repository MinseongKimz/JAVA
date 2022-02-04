/*=================================
  ■■■ 예외(Exception)처리 ■■■
===================================*/

// Test153.java 파일과 비교~~!!

class Demo
{
	private int value;

	public void setValue(int value)
	{
		if (value<=0)
			return;

		this.value = value;
	}

	public int getValue()
	{
		return value;
	}
}


public class Test152
{
	public static void main(String[] args)
	{
		Demo ob = new Demo();
		ob.setValue(-3);
		int result = ob.getValue();
		System.out.println(result);
	}
}
/*
0
계속하려면 아무 키나 누르십시오 . . .
*/
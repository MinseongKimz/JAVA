/*=================================
  ■■■ 예외(Exception)처리 ■■■
===================================*/

// 다른 예외 다시 던지기


public class Test155
{
	public int getValue(int value) throws Exception //⑦ 예외2 던지기 
	{
		int a = 0;

		try
		{
			a = getData(-2); // ③예외1 여기로 떨어져 예외 발생

			
		}
		catch (Exception e)	// ④ 위에 예외1 잡기
		{
			// ⑤ 예외1 처리
			System.out.println("printStackTrace....");
			e.printStackTrace();

			// ⑥ 예외 2 정의
			throw new Exception("Value가 음수입니다.");
		}
		return a;
		
	}
	
	public int getData(int data) throws Exception			//② 예외1 던지기
	{
		if (data < 0)
		{
			throw new Exception("data가 0보다 작습니다!!"); //① 예외1 정의 
		}
		return data + 10;
	}


	public static void main(String[] args)
	{
		Test155 ob = new Test155();

		try
		{
			int a = ob.getValue(-2);	 // ⑧ 예외2 발생 
			System.out.println("a : " + a);
		}
		catch (Exception e)	// ⑨ 예외 2 잡기
		{	
			//⑩ 예외2 처리
			System.out.println("printStackTrace....");
			e.printStackTrace();
		}
	}
}
/*
printStackTrace....
java.lang.Exception: data가 0보다 작습니다!!
        at Test155.getData(Test155.java:37)
        at Test155.getValue(Test155.java:16)
        at Test155.main(Test155.java:49)
printStackTrace....
java.lang.Exception: Value가 음수입니다.
        at Test155.getValue(Test155.java:27)
        at Test155.main(Test155.java:49)
계속하려면 아무 키나 누르십시오 . . .
*/
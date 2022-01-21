/*=================================================
  ■■■ 메소드 중복정의(Method Overloading) ■■■
===================================================*/

/*
○  메소드 오버로딩의 개요
	메소드 오버로딩(Method Overloading)이란
	메소드가 처리하는 기능은 같고
	메소드 괄호 속에 오는인수(인자, 매개변수, 파라미터)의 갯수가 다르거나
	자료형(Data Type)이 다른 경우
	메소드의 이름을 동일한 이름으로 부여하여 메소드를 정의할 수 있도록 
	문법적으로 허용하게 되는데
	이를 메소드 오버로딩이라 한다.
*/



public class Test105
{
	public static void main(String[] args)
	{
		//drawLine(); // 인스턴스 생성 하던가 아니면 드로우라인 메소드를
					  // static을 붙혀 주던가
		drawLine();
		//====================
		drawLine('-');
		//--------------------
		drawLine('<');
		//<<<<<<<<<<<<<<<<<<<<
		drawLine('+',30);
		//++++++++++++++++++++++++++++++
		drawLine('x',40);
		//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx

	}

	// 선을 그리는 메소드 정의
	public static void drawLine()
	{
		System.out.println("====================");
	}

	public static void drawLine(char c) // 윗 메소드랑 정확히 동일한 이름에 메소드
	{									// 매개변수로 선의 모양을 받아 출력할 꺼임
		for (int i=0;i<20 ;i++ )		// 윗 메소드는 매개변수를 안받고 
		{								// 아래는 매개변수를 받는 차이를 둠
			System.out.print(c);
		}
		System.out.println();
	}

	public static void drawLine(char c, int n) // 위에랑 비교해서 매개변수 하나 추가
	{										   // 숫자 받아서 그걸로 길이 조절 할꺼임
		for (int i=0;i<n ;i++ )
		{
			System.out.print(c);
		}
		System.out.println();
	}
}
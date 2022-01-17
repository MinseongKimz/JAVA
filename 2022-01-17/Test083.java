/*=====================
  ■■■배	열 ■■■
=======================*/

// 배열의 선언과 초기화
// 배열의 기본적 활용

// 『char』 자료형의 배열을 만들어
// 그 배열의 각 방에 알파벳 대문자를 채우고
// 채워진 그 배열의 전체 요소를 출력하는 프로그램을 구현한다
// 단, 채우는 구문과 출력하는 구문은 따로 분리하여 처리한다.

//실행 예)
// A B C D E F G .... W X Y Z
//계속하려면 아무 키나 누르세요.

public class Test083
{
	public static void main(String[] args)
	{	
		// 배열의 크기 A ~ Z 까지 26개 있음 
		char[] arr = new char[26];
		
		// 반복문을 사용해서 배열에 채울거임.
		for (int i = 0;i<arr.length ;i++ )
		{	
			// 배열[i번째] = 문자형(숫자 + 65) ... 0번째 루프 65 = A 25번째 루프 25+65=90=Z
			arr[i] = (char)(i+65);
		}
		// 출력구문 
		for (int i = 0;i<arr.length ;i++ )
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
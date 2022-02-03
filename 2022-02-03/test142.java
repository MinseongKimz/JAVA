/*=================================
  ■■■ 자바의 주요(중요) 클래스 ■■■
===================================*/

// StringTokenizer 클래스
/*
○	StringTokenizer 클래스는 
	문자열 파싱(parsing)을 위한 정보를 제공하는 클래스로
	파싱(parsing)하고자 하는 문자열을 인자로 받아 생성하는데,
	여기에서 파싱(parsing)이란 하나의 문자열을 여러 문자열로
	나누는 작업을 의미하게 되며, 이 때 나누는 단위가 되는 문자열을
	토큰(token)이라고 한다.

	StringTokenizer 클래스를 사용하기 위해서는
	java.util 패키지의 StringTokenizer를 import 해야 한다.

	StringTokenizer 클래스는 호환성을 유지하는 목적으로 
	보관 유지되고 있으며 문자열을 파싱(parsing)하기 위해서는
	String클래스의 split() 메소드나 java.util.regex 패키지를 사용할 것을 권장하고 있다.

○	생성자
 -  원형
 	StringTokenizer(String str)
	StringTokenizer(String str, String delim)
	StringTokenizer(String str, String delim, boolean returnDelims)
	→	주어진 문자열 str을 단어로 분리하는 객체를 생성하며
		공백(구분)문자는 delim에 포함된 문자로 처리하게 된다.
		만약 returnDelims 가 true 이면 
		구분 문자도 분리된 데이터로 처리하게 된다.
*/
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class test142
{
	public static void main(String[] args) throws IOException
	{
		String strTemp;
		String[] strArr;
		int n;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("파싱할 문자열 입력(컴마 구분) : ");
		strTemp = br.readLine();
		//-- "사과,딸기,바나나,토마토"

		//StringTokenizer 클래스 인스턴스 생성
		StringTokenizer st = new StringTokenizer(strTemp, ",");
		//--strTemp 를 대상 문자열로...("사과,딸기,바나나,토마토")
		//-- 『,』를 구분자로....


		// st의 『countTokens()』 메소드 호출
		// 『int countTokens()』
		// : 파싱된 문자열의 갯수를 리턴(반환)한다.
		strArr = new String[st.countTokens()];
		//					======= 4 반환 == 
		// → strArr = new String[4];
		
		n = 0;

		while (st.hasMoreTokens()) // 0:true 1:true 2:true 3:true 4:false
 			strArr[n++] = st.nextToken();
			// strArr[0] = "사과";
			// strArr[1] = "딸기"; 
			// strArr[2] = "바나나"; 
			// strArr[3] = "토마토"; 
			// 그다음 값은 문자열에 없으니 hasMoreTokens 가 false 를 반환
			// while문 종료..

		// st.hasMoreTokens() : st에 남은 토큰가 있으면 true 없으면 false를 반환, 확인만 함 헤드 이동 x
		// st.nextToken() : 헤드를 이동, 분할된 다음 토큰을 가져옴. 

		System.out.print("파싱된 토큰 (문자열) : " );
		for (String str: strArr)
			System.out.print(str + " ");
		System.out.println();
	}
}
/*
파싱할 문자열 입력(컴마 구분) : 사과,딸기,바나나,토마토
파싱된 토큰 (문자열) : 사과 딸기 바나나 토마토
계속하려면 아무 키나 누르십시오 . . .
*/
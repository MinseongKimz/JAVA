/*===========================================
■■■ 자바 기본 프로그래밍 ■■■
=============================================*/

// 변수와 자료형 
// 자바의 기본 입출력 : BufferedReader 클래스

//그전까진 정해진것만 계산하고 출력하는걸 만들었다.
//이번엔 사용자가 준 값으로 무언가를 해보자.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException; 


public class Test014
{
	public static void main(String[] args) throws IOException //(짬통으로 던져드림)
	{
		
		//키보드 장착(생성)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//------------------------------------
		//		문자입력을 읽어드리는 장치      --------------------
		//									    바이트 →문자 번역기 -----------
		//															 바이트 입력값.
		//주요 변수 선언
		int r;      // 반지름
		final double  PI = 3.141592;
		double a, b;       // a= 넓이 b= 둘레

		//연산 및 처리
		//[1] 사용자에게 안내메시지 띠우기.
		System.out.print("원의 반지름 입력 : ");
		
		//[2] 사용자가 입력한 값을 받아 반지름 r에 담기

		//r= br.readLine();        근데 BufferedReader 의 readLind()은 문자열 반환하는데?
		//예를들어 r = br.readLine(); 80입력햇다 치면   ... >  r = "80"; 이럼 안되...
		// 이때 Integer.parseInt()를 쓴다 숫자모양의 문자열을 숫자로 반환해줌

		//r = Interger.parseInt(br.readLine());   ,,,<80 입력
		//r = Interger.parseInt("80");
		//r = 80;

		//Integer.parseInt("80) ..> 80
		// -- 매개변수로 넘겨받은 문자열 데이터를 정수형으로 변환	
		// 단, 이때 넘겨받은 문자열 데이터는 숫자모양(NumberFormat)이어야 한다.

		r = Integer.parseInt(br.readLine());
		//-- 사용자가 입력한 값을 BufferedReader(br)의  readLine()
		//	 메소드를 활용하여 문자열 형태로 읽어들인 후
		//   그 값을 Integer.parseInt() 를 통해 숫자형(정수형)으로 변환한 후
		//   정수 형태의 반지름 변수 r 에 담아내기.

		// 스트림을 배우기전에 흐름을 대충 배웠다.
		// 그때 이해하기 쉽도록...
		
		//[3] 넓이 및 둘레 계산 
		a = r * r * PI;
		b = r * 2 * PI;


		// 최종 결과 출력
		System.out.println(">> 넓이 : " +a);
		System.out.println(">> 둘레 : " +b);

		//System.out.printf("반지름이 %d인 원의 넓이는 %.4f이며, \n둘레는 %.4f입니다.\n", r, a, b);
		//반지름이 23인 원의 넓이는 1661.9022이며,
		//둘레는 144.5132입니다.
		
	}
}		
/* 출력 결과
원의 반지름 입력 : 23
>> 넓이 : 1661.902168
>> 둘레 : 144.51323200000002
계속하려면 아무 키나 누르십시오 . . .
*/
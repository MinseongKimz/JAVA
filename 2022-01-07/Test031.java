/*===========================================
■■■ 연 산 자 (Operater) ■■■
=============================================*/
// 조건 연산자 == 삼항 연산자

//사용자로부터 임의의 문자를 하나 입력받아
// 대문자면 소문자로, 소문자면 대문자로 
// 알파벳이 아닌 기타 문자이면 그 문자 그대로 출력하는 
// 프로그램을 구현한다.

// 실행 예
// 한 문자 입력 : A
// A → a 
// 계속하시려면 아무 키나 누르세요...

// 한 문자 입력 : b
// b → B
// 계속하시려면 아무 키나 누르세요...

// 한 문자 입력 : 7
//  7 → 7
// 계속하시려면 아무 키나 누르세요...

// A : 65 a : 97             32차이 



import java.io.IOException;


public class Test031
{
	public static void main(String[] args) throws IOException
	{
		char a;
		char b;
	
		System.out.print("한 문자 입력 : ");
	
		a = (char)System.in.read();
		
	
		b= a>='A'&& a <='Z' ? (char)(a+32) : (a>='a'&& a<='z' ? (char)(a-32):a);
		System.out.printf(" %c → %c " , a, b);
 
	}
}
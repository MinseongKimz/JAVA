/*
*작성한날 : 2022.01.05
*작 성 자 : 김민성
*파일이름 : Test006.java
*작성목적 : 수업. 변수와 자료형,키워드와 식별자
*/
// 변수와 자료형
// 키워드와 식별자

public class Test006
{
	public static void main(String[] args)
	{
		double height = 172.8;
		int age = 27;
		char degree = 'A';

		System.out.println(height);
		System.out.println(age);
		System.out.println(degree);
		//--->172.8
		//	  27
		//    A

		String name = "김민성";
		//String name = "김X" ; 
		//--- 스코프 영역 안에서 변수명은 식별자. name 이 중복이기때문에 X_
		//String #name = "김xx";
		//-- 변수명에 시작은 특수문자로 x 가능한: $,_ 하지만
		//   함부로 사용x, 팀이나 그룹내에 규칙이 정해져 따르는것이 중요.


		// int tel = 01012341234; 가능? > 불가능
		// 자바에서 숫자를 다룰 때 0으로 시작하면 진법이 바뀜.
		// 문자열로 컨트롤 하자.
		String tel = "01012341234";
		String 주소 = "인천 계양구";	// 가능? 가능하긴 한데.. JAVA가 문법적으로 허용한거긴 한데
										// 실무적인 측면에서 접근한다면 절대로 한글로 변수명을 지으면 안된다!



		System.out.println(name);
		//----> 김민성
		System.out.println(tel);
		//----> 01012341234
		System.out.println(주소);
		//----> 인천 계양구



	}
}
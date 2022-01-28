/*=================================
  ■■■ 자바의 주요(중요) 클래스 ■■■
===================================*/

// String 클래스

public class Test139
{
	public static void main(String[] args)
	{
		String s = "seoul korea";
		System.out.println(s);
		//--==>>seoul korea

		// ○ 문자열 추출
		System.out.println(s.substring(6,9));
		// kor

		//※	『String.substring(s, e)』
		//		String 문자열을 대상으로
		//		s번째에서.. e-1 번째까지 추출
		//		단 인덱스는 0부터 시작

		System.out.println(s.substring(7));
		// orea

		// ※	『String.substring(s)』
		//		String 문자열을 대상으로
		//		s 번째에서... 끝까지 추출
		//		(즉 문자열이 가진 길이 만큼)

		// ○ 문자열의 데이터  값 비교
		System.out.println(s.equals("seoul korea")); // true	
		System.out.println(s.equals("seoul Korea")); // false k가 대문자.

		System.out.println(s.equalsIgnoreCase("seoul Korea"));
		// true  대소문자 구분 안하는 메소드

		//○ 찾고자 하는 대상 문자열(s)에
		//	 『kor』 문자열이 존재할까?
		//	 존재한다면... 그 위치는 어떻게 될까?

		//"seoul korea"
		System.out.println(s.indexOf("kor"));
		//6     6번째 인덱스 에 존재
		
		System.out.println(s.indexOf("ea"));
		// 9

		System.out.println(s.indexOf("e"));
		// 1

		System.out.println(s.indexOf("tt"));
		// -1 못찾음 
		// 존재하지 않을 경우 음수를 반환하게 된다.(-1)

		// ○ 대상 문자열(s)이 『rea』로 끝나는지 여부확인
		//		(true/false)

		System.out.println(s.endsWith("rea")); //true
		System.out.println(s.endsWith("oul")); //false

		//○ 찾고자 하는 대상 문자열(s)에
		//   『e』문자열이 존재할까?
		//	존재한다면 그 위치는 어떻게 될까?
		//	(단, 뒤에서부터 검사.)

		// seoul korea
		System.out.println(s.indexOf("e"));  // 1번째 인덱스
		System.out.println(s.indexOf("o")); // 2
		System.out.println(s.lastIndexOf("e"));
		// 9 번째 인덱스 부터.. 뒤에서부터 찾는다. 여기선 korea의 e
		System.out.println(s.lastIndexOf("o"));
		// 7 (korea의 o)

		// ○ 대상 문자열(s) 중
		//	『6』번째 인덱스 위치의 문자는?

		// seoul korea

		System.out.println(s.charAt(6));
		//--==> k
		//System.out.println(s.charAt(22)); // 범위를 넘어 가버림
		// 런타임 에러 StringIndexOutOfBoundsException

		// ○대상 문자열(s) 과 비교 문자열 『seoul corea』
		//	 어떤 문자열이 더 큰가? → 문자열에 대한 크기 비교
		//	 두 문자열이 같다면 → 0
		//   두 문자열이 다르다면 → 차이 확인(사전식 배열)
		//	 
		
		System.out.println(s.compareTo("seoul korea")); // 0 : 차이 없음
		System.out.println(s.compareTo("seoul corea")); // 8 : c와 k 가 다른데 cdefghihk 8만큼 차이

		// ○ 대상 문자열(s) 중'
		//	  해당 문자열을 찾아서 원하는 형태로 수정

		s = "우리나라 대한민국 대한독립 만세";
		s = s.replaceAll("대한","자주");
		System.out.println("처리결과: " + s);
		//처리결과: 우리나라 자주민국 자주독립 만세

		// ○ 공백 제거 
		s  = "          사         랑          ";
		System.out.println("|||" + s + "|||");
		//|||          사         랑          |||
		
		System.out.println("|||" + s.trim() + "|||");
		//|||사         랑|||
		// 양쪽 가장자리 공백 제거 

		System.out.println("|||" + s.replaceAll(" ","") + "|||");
		//|||사랑|||

		// "30"
		int temp = Integer.parseInt("30");
		System.out.printf("%d\n",temp);
		//30
		s = Integer.toString(30);
		System.out.printf("%s\n",s);
		//30   // 문자열임

		int n = 2345678;
		System.out.printf("%d\n",n); //2345678
		System.out.format("%d\n",n); //2345678

		s = String.format("%d",n); // "2345678"을 만들어라
		System.out.printf("%s\n",s); //2345678

		s = String.format("%,d\n",n);//%,d 점 찍어주는것 "2,345,678" 만들어라
		System.out.printf("%s\n",s); //2,345,678
		
		String[] strArr = "기본,열정,배려".split(",");

		for (String str:strArr )
			System.out.print(str + " ");
		System.out.println();
		//기본 열정 배려




	}
}
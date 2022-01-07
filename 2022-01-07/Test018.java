/*===========================================
■■■ 자바 기본 프로그래밍 ■■■
=============================================*/

// 자바의 기본 입출력: System.out.printf() 

public class Test018
{
	public static void main(String[] args)
	{
		System.out.print("AAA");
		System.out.print("BBB");
		System.out.print("CCC\n");   // \n 개행
		
		System.out.println();  // 개행

		//System.out.print();  컴파일 에러
		System.out.printf("12345678"); //인자값 없더라도 print처럼 동작
		System.out.printf("12345678\n"); //개행도 동작
		System.out.printf("12345678%n"); //frintf 에선 %n도 개행동작
		//System.out.printf(); 비우면 컴파일 에러
		System.out.printf("%d + %d = %d \n",10, 20,30);

		System.out.printf("%d\n", 123);
		System.out.printf("%10d\n", 123); // 공간확보 10자리 비우고 뒤에 3자리부터 채움 : 7자리 띄고 123
		System.out.printf("%8d\n",1234);
		System.out.printf("%010d\n",1234);//010 : 10칸 확보하고 채우고 남은자리 0으로 채움
		//123
        //		   123
	    //	    1234
        //  0000001234


		System.out.printf("%+d\n",365);//양수 표현  +365
		System.out.printf("+%d\n",365);//둘다 가능
		
		System.out.printf("%d\n",+365); // 그냥 365

		//System.out.printf("%-d\n",365);  런타임 에러
		System.out.printf("-%d\n",365); //-365
		System.out.printf("%d\n",-365); // -365

		//System.out.printf("%d\n",'A'); 런타임 에러 정수형태 넣자..%c..
		System.out.printf("%c\n",'a');
		//System.out.printf("%c=n",'abc'); 런타임 에러 문자열형태 %s
		System.out.printf("%s\n" ,"abcd");

		System.out.printf("%h\n", 365); //365의 16진수 표현 :16d (HEX)
		System.out.printf("%o\n", 24);  // 24의 8진수 표현 : 30  (OCT)

		System.out.printf("%b\n", true); //boolean형 true
		System.out.printf("%b\n", false); // false
		System.out.printf("%.2f\n", 123.23);// 실수형 표현 %.nf	소숫점 아래 n만큼 표현
		System.out.printf("%.2f\n",123.235);// 2자리까지 표현 하지만 5가 반올림되 123.24출력;

		System.out.printf("%8.2f\n", 123.236);//정수처럼 8자리 확보후 소수점 아래 2자리까지 표현
											  //이러면 2칸 띄고 123.24

		System.out.printf("%2.2f\n", 123.236);//공간보다 확보를 못햇으면 걍 2.f이건 무시되고 걍 나옴
											  //123.24 출력
		}

}
/*출력 결과
AAABBBCCC

1234567812345678
12345678
10 + 20 = 30
123
       123
    1234
0000001234
+365
+365
365
-365
-365
a
abcd
16d
30
true
false
123.23
123.24
  123.24
123.24
계속하려면 아무 키나 누르십시오 . . .
*/
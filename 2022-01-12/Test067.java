/*==========================================
  ■■■ 실행 흐름의 컨트롤(제어문) ■■■
============================================*/

// break 실습

//다음과 같은 처리가 이루어 지는 프로그램을 구현한다.
//단, 입력받은 정수는 1~ 100 범위 안에서만
//가능하도록 작성한다.

//실행예)
//임의의 정수 입력 : -10

//임의의 정수 입력 : 0

//임의의 정수 입력 : 2022

//임의의 정수 입력 : 10
//>> 1 ~ 10 까지의 합 : 55
//계속하시겠습니까(Y/N)? : y

// 임의의 정수 입력 : 100
//>> 1 ~100까지의 합 : 5050
//계속하시겠습니까(Y/N)? : N
//계속하려면 아무키나 누르세요... → 프로그램 종료


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test067
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n, s, i;
		// n : 사용자 입력값을 담아둘 변수
		// s : 누적합 연산 결과
		// i : 반복문 위한 증감 연산
		char ch; // 프로세스를 계속 진행 할지 말지의 여부를 담아둘 변수		
		
		while(true)
		{
			do
			{
				System.out.print("임의의 정수 입력 : ");
				n = Integer.parseInt(br.readLine());
			}
			while (n<1 || n>100);
		
			//테스트 (확인)
			//System.out.print("유요한 정수 입력");

			s = 0; // while true 문때문에 s 초기화 안하면 계속 누적됨
				   // 그러니깐 루프 안에다 초기화 시켜줌	
			for (i=1; i<=n; i++)
			{
				s += i;
			}
			System.out.printf("1 ~ %d 까지의 합 : %d\n" ,n,s);

			System.out.print("계속하시겠습니까(Y/N)? : ");
			ch = (char)System.in.read();

			//그만할래 의사표현 하려면
			//반복문을 멈추고 빠져나갈 수 있는 처리 사용자에게 Y / N 
			//if (ch=='N' || ch=='n') N 또는 n 입력한거 맞음?
			if(ch!='Y' && ch!='y')	//Y 또는 y 입력한거 아닌게 확실? →약간 실무적인 내용						  	
			{
				//반복문 탈출 코드 작성 필요
				break;//멈춘다 (그리고 빠져나간다)
			}//end if 
			System.in.skip(2);@
		}//end while
		
	}//end main
}//end class
	
		/*
		// 내 풀이.. break 쓰질 않았다..1~100 사이 범위도 안넣엇다. 
		//변수 선언

		char x;
		int num;// 입력 받을 수
		int sum = 0; //1부터 받은 수까지 더할
		boolean a = true;

		do
		{
			System.out.print("임의의 정수 입력 : ");
			num = Integer.parseInt(br.readLine());
			
			for (int i = 0;i<=num ;i++ )
			{
				sum += i;
			}
			System.out.printf("1 ~ %d 까지의 합 : %d\n" ,num,sum); 
			System.out.print("계속하시겠습니까(Y/N)? : ");
			x = (char)System.in.read();
			System.in.skip(2);

			if (x=='y' || x=='Y')
			{
			a = true;
			}
			else if (x=='n' || x=='N')
			{
			a = false;
			} 

		}
		while (a == true);      
		*/
/*
임의의 정수 입력 : 10
1 ~ 10 까지의 합 : 55
계속하시겠습니까(Y/N)? : Y
임의의 정수 입력 : 32
1 ~ 32 까지의 합 : 528
계속하시겠습니까(Y/N)? : Y
임의의 정수 입력 : 23
1 ~ 23 까지의 합 : 276
계속하시겠습니까(Y/N)? : y
임의의 정수 입력 : 123
임의의 정수 입력 : 12
1 ~ 12 까지의 합 : 78
계속하시겠습니까(Y/N)? : n
계속하려면 아무 키나 누르십시오 . . .

*/
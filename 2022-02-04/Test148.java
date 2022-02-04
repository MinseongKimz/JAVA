/*=================================
  ■■■ 자바의 주요(중요) 클래스 ■■■
===================================*/

// Random 클래스
/*
○	java.util.Random 클래스는
	
	여러 형태의 난수를 발생시켜 제공하는 클래스이다.
	Math 클래스의 정적 메소드인 random() 메소드도
	난수를 제공하는 메소드 이지만
	0.0~1.0 사이의 실수 형태만 발생하게 되므로
	필요한 여러 형태의 난수를 만들어 내기 위해서는
	추가적인 연산을 수행해야 한다.
	그래서 자바는 여러 형태의 난수를 발생시켜주는
	전용 클래스인 Random 클래스를 별도로 제공하고 있다.
*/

// 로또 번호 생성기 (난수 발생 프로그램)

// 프로그램이 실행되면 기본적으로 로또를 
// 5게임 수행하는 프로그램을 구현한다.

// 실행 예) 
// 3 5 12 24 31 41 
// 1 2  8 36 41 42
// 4 9 11 13 22 30
// 4 10 23 43 32 34
// 5  4 32 34 54 23
// 계속하려면 아무 키나 누르세요..

import java.util.Random;

class Lotto
{
	int arr[] = new int[6]; // 로또번호 6개 

	Random rd = new Random();

	
	void Ran()
	{
		for (int i = 0;i<arr.length ;i++ )
		{
			while (true) // 무한 반복
			{
				arr[i] = rd.nextInt(45)+1;

				boolean flag = true;

				for (int j =0;j<i ;j++ )
				{
					if (arr[i]==arr[j]) // 만약 중복이라면 
					{
						flag = false; // flag를 false 로 바꾸고
						break; // if 문을 빠져나감
					}	
				}	
				if (flag) // 위에서 false 이면 while문을 못 빠져나감
					break;// 그래서 다시 돌림 
						  // 그래서 중복이 없다면 false가 아닐것이기 때문에 
			}			  // flag 가 true 라면 무한 while문을 빠져나가게 된다.
		}				  // 그 후 for문 다시 도는 구조
		
		/*
		for (int i = 0;i<arr.length ;i++ ) // 로또번호 6개
		{
			arr[i] = rd.nextInt(45)+1; // 1~45 랜덤 숫자 

			for (int j=0; j<i ; j++) // i 보다 1 크게 
			{
				if (arr[i]==arr[j])
					i--;
			}
		}*/
		
		/*
		①
		i = 0 일때
		arr[0] = 랜덤숫자
		
		②
		i = 1 일때
		arr[i=1]= 랜덤숫자,  arr[j는 0]일때 과 비교
		만약 같다면 i--로 인해 ① i=0 으로 아니라면 계속 진행
	
		③
		i = 2 일때
		arr[2]에 랜덤숫자 넣고 arr[j는 1]일때 과 비교 
		만약 같다면 i--로 인해 ② i=1으로 아니라면 계속 진행
		:
		:
		이런식으로 인덱스 5까지 진행! 
		이러면 중복 없이 배열에 랜덤숫자 대입 가능 
		*/

		for (int i=0;i<arr.length ;i++ ) // 배열의 정렬(Test109)
		{	
			for (int j=i+1;j<arr.length ;j++ )
			{
				if (arr[i]>arr[j])
				{
					 arr[i]= arr[i]^arr[j];
					 arr[j]= arr[j]^arr[i];
					 arr[i]= arr[i]^arr[j]; // 비트연산을 이용한 순서바꾸기
				}
			}
			System.out.printf("%2d ",arr[i]); // 출력
		}
	}
}

public class Test148
{
	public static void main(String[] args)
	{
		Lotto lotto = new Lotto();

		// 기본 5게임
		for (int i =1 ; i<=5; i++ ) // 5게임 할꺼임
		{
			System.out.printf("%d 게임 : ",i);
			// 로또 게임 수행
			lotto.Ran();
			System.out.println();// 개행
		}
	}
}
/*
1 게임 :  1 11 27 34 39 40
2 게임 :  6 28 30 31 39 43
3 게임 :  1 13 26 28 33 40
4 게임 :  5  8 19 37 39 45
5 게임 : 17 26 27 33 40 41
계속하려면 아무 키나 누르십시오 . . .

*/
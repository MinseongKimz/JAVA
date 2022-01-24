/*==================================
  ■■■ 정렬(Sort) 알고리즘 ■■■
====================================*/
/*
○	정렬	
	: 데이터를 특정한 규칙(기준)에 맞게 순서대로 나열(오름차순, 내림차순)
○	정렬의 목적
	: 데이터 처리 과정의 편의성이나 가독성을 높이기 위함
	  → 보기좋게... 검색하기 위함

○	정렬의 종류
	: 선택 정렬, 버블 정렬, 삽입 정렬, 힙 정렬, 퀵 정렬, 쉘 정렬, ....

*/

// 선택 정렬(Selection Sort)

// 실행 예)
// Source Data : 52 42 12 62 60
// Sorted Data : 12 42 52 60 62
public class Test109
{
	public static void main(String[] args)
	{
		
		int [] a = {52, 42, 12, 62, 60};
		
		/*
		42 52 12 62 60
		== --
		12 52 42 62 60
		==    -- 
		12 52 42 62 60
		==       --
		12 52 42 62 60
		==          --
		-----------------1회전 끝
		12 42 52 62 60
		   == --		
		12 42 52 62 60
		   ==    --   
		12 42 52 62 60
		   ==       --
		-----------------2회전 끝
		12 42 52 62 60
			  == --
		12 42 52 62 60 
			  ==    --
		-----------------3회전 끝
		12 42 52 60 62
				 == -- 
		-----------------4회전 끝
		*/


		// 향상된 for문(foreach 구문)// 
		// 콜론 뒤부터 작성
		/*
		for(각 요소의 자료형 이름	: 자료구조)
		{
			
		}*/
		System.out.print("Source Data :");
		for( int n: a)
			System.out.print(n + " ");
		System.out.println();

		/*
		for (int i=0;i<a.length ;i++ ) 
		{
			for (int j=i+1;j<a.length ;j++ )
			{
				if (a[i]>a[j])
				{
					 /*
					 int temp = a[i];
					 a[i] = a[j];
					 a[j] = temp; 

					 a[i]= a[i]^a[j];
					 a[j]= a[j]^a[i];
					 a[i]= a[i]^a[j]; // 비트연산을 이용한 순서바꾸기
				}
			}
		}*/


		//Selection Sort (같이 품)
		for (int i=0;i<a.length-1 ;i++ ) //웅~ 기준은 차피 마지막까지 안감
		{
			for (int j=i+1;j<a.length;j++ )//쑝~
			{
				if (a[i]>a[j]) // 기준이 비교보다 크다면 (오름차순 정렬) // if(a[i]<a[j]) 하면 내림차순 될것
				{
					// 자리 바꾸기
					a[i]= a[i]^a[j];
					a[j]= a[j]^a[i];
					a[i]= a[i]^a[j]; // 비트연산을 이용한 순서바꾸기
				}
			}
		}
			
		System.out.print("Sorted Data :");

		for( int n: a)
			System.out.print(n + " ");
		System.out.println();
	}
}
/*
Source Data :52 42 12 62 60
Sorted Data :12 42 52 60 62
계속하려면 아무 키나 누르십시오 . . .
*/
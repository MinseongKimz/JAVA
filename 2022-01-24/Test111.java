/*==================================
  ■■■ 정렬(Sort) 알고리즘 ■■■
====================================*/
// 향상된 버블정렬 (Bubble Sort)

// ※	앞에서 본 Selection Sort(Test109)나 Bubble Sort(Test110) 의 성능은 같다.
//		(→ 반복의 횟수로 성능 추정)
//		하지만, 향상된 Bubble Sort는 대상 데이터의 구조에 따라서
//		일반 Bubble Sort 나 Selection Sort 보다 성능이 좋을 수 있다.

// 원본 데이터 :	61 15 20 22 30
//					15 20 22 30 61 - 1회전(스왑 발생 → true) → 다음 회전 진행 O
//					15 20 22 30 61 - 2회전(스왑 발생 → false) → 다음 회전 진행 x

// 1회전 수행... 2회전 수행.. 을 해보았더니 
// 2회전 수행때 스왑이 전혀 발생하지 않았기 때문에
// 불필요한 추가 연산(더 이상의 회전)은 무의미한 것으로 판단하여
// 수행하지 않는다.

// 실행 예)
// Source Data : 10 60 20 30 40
// Sorted Data : 10 20 30 40 50

public class Test111
{
	public static void main(String[] args)
	{
		int[] a = {10, 50, 20, 30, 40};
		/*
		10 50 20 30 40
		== --
		10 20 50 30 40
		   == --
		10 20 30 50 40
			  == --   
	    10 20 30 40 50
				 == --
		----------------1회전 종료 → 스왑 발생 
		10 20 30 40 50
		== --
		10 20 30 40 50
		   == -- 
		10 20 30 40 50
		      == --
		----------------2회전 종료 → 스왑 발생 x 
			  X
			  X
		----------------3회전 X
			  X
		----------------4회전 X		  
		*/
		System.out.print("Source Data :");
		for( int n: a)
			System.out.print(n + " ");
		System.out.println();


		// 생각할 점.. 스왑 발생 → true.. 
			/*
			boolean check;
			for (int i=1;i<a.length ;i++ )
			{	
				check = false;
				for (int j=0;j<a.length-i ;j++)
				{
					if (a[j]>a[j+1])
					{
						
						a[j]= a[j]^a[j+1];
						a[j+1]= a[j+1]^a[j];
						a[j]= a[j]^a[j+1]; // 비트연산을 이용한 순서바꾸기

						check = true; // 자리 바꿈이 일어나면 true로 바꾸고 
					}				  // for문이 멈추지 않게 해줌
				}
				if (check==false) //if문 돌았는데 check가 false로 유지되면 
					break;		  // 자리바꿈이 일어나지 않았기 때문에
			}*/					  // 반복문을 중지 시킨다..

			// 같이 푼 내용
			int pass = 0;
			boolean flag;

			// 향상된 버블 정렬 구현
			do
			{
				flag = false;
				pass++;

				for (int i =0;i<a.length-pass ;i++ ) // for 하나 더쓸꺼 없이 하나씩 줄이면 되니깐..
				{
					if (a[i]>a[i+1])
					{
						a[i] = a[i]^ a[i+1];
						a[i+1] = a[i+1]^ a[i];
						a[i] = a[i] ^ a[i+1];

						flag = true;
						//-- 단 한번이라도 스왑(자리바꿈)일어나면
						// flag 변수는  true로 변경
					}
				}
			}
			while (flag); 
			// flag 변수가 false 라는 것은
			// 회전이 구분적으로 발생하는 동안 스왑이 일어나지 않은 경우로
			// 더이상 반복문 수행은 무의미한 것으로 판단 가능!
			

		System.out.print("Sorted Data :");

		for( int n: a)
			System.out.print(n + " ");
		System.out.println();

		
	}
}
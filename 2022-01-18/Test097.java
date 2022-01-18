/*=====================
  ■■■배	열 ■■■
=======================*/

// 배열과 난수 처리(※ Random 클래스 활용)

// 사용자로부터 임의의 정수를 입력받아
// 그 정수의 갯수 만큼 난수(1~100)를 발생 시켜서 배열에 담고
// 배열에 담긴 데이터 중에서 가장 큰값과 작은 값을
// 선택해서 결과를 출력하는 프로그램을 구현한다. 


// 실행 예)
// 발생시킬 난수의 갯수 입력 : 10
// 

import java.util.Scanner;
import java.util.Random;

public class Test097
{
	public static void main(String[] args)
	{	
		// Scanner 인스턴스 생성
		Scanner sc = new Scanner(System.in);
		
		//안내 메세지 출력
		System.out.print("발생 시킬 난수의 갯수 입력 : ");
		int size = sc.nextInt();
		// size 변수에 담아낸 수만큼의 배열방 만들기
		// (배열 선언 및 메모리 할당)
		int[] arr = new int[size];

		// 무작위 정수(난수)를 발생시키기 위해서는 
		// 난수 발생 전용 객체가 필요하다.
		// → 『java.util.Random』
		// Random 인스턴스 생성
		Random rd = new Random();

		// ※ Random 클래스의 『nextInt()』
		// 0 ~ 『매개변수』 로 넘겨받은 정수 n-1 까지의 수중 무작위
		// 정수(난수) 1개를 발생 시킨다.
		//    rd.nextInt(10)       0~9 까지 중 1가지 난수 발생  

		for (int i=0;i<size;i++)
			arr[i] =rd.nextInt(100)+1; // 1~100	

		int max = arr[0];
		int min = arr[0];

		//--rd.nextInt(100) → 0 ~ 99 까지의 무작위 정수 1개 발생
		
		//테스트 → 구성된 배열의 전체 요소 출력
		/*
		for (int i=0;i<arr.length ;i++ )
			System.out.printf("%4d", arr[i]);
		System.out.println();
		*/

		for (int i =1 ;i<arr.length ; i++)
		{
			if (max<arr[i]) // 만약 i 번째 배열에 든 값이 max 보다 크다면
				max = arr[i]; //i 번째 배열에 든 값을 max에 대입
			if (min>arr[i])
				min = arr[i];
		}
		System.out.println("발생한 난수");
		for (int i=0;i<arr.length ;i++ )
			System.out.printf("%d  ", arr[i]);
		System.out.println();
		System.out.printf("가장 큰 값 : %d , 가장 작은 값 : %d\n",max,min);
	}
}

/*
발생 시킬 난수의 갯수 입력 : 6
발생한 난수
17  13  6  59  97  65
가장 큰 값 : 97 , 가장 작은 값 : 6
계속하려면 아무 키나 누르십시오 . . .*/
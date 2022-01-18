/*=====================
  ■■■배	열 ■■■
=======================*/

// 배열의 배열(2차원 배열)

// 배열의 배열(다차원 배열) 을 활용하여
// 다음 과 같은 데이터를 요소로 취하는 배열을 구성하고
// 그 결과를 출력하는 프로그램을 구현한다

/*
	1 2 3 4 5	i = 0
	5 1 2 3 4	i = 1
	4 5 1 2 3	i = 2
	3 4 5 1 2   i = 3
	2 3 4 5 1	i = 4
*/

public class Test090
{
	public static void main(String[] args)
	{
		/* 내가 푼 풀이 
		int [][] arr = new int[5][5];
		int n = 1;

		for (int i = 0;i<arr.length ;i++ )
		{   
			for (int j =0;j<arr[i].length ;j++ ) //1 2 3 4 5 하게 만들고
			{
				arr[i][j] = n;
				n++;
				if (n > 5) // 6이 된다면 1로 다시 바꾸고
					n = 1;
			}
			n = arr[i][4]; //j루프가 끝나면 시작점을 j루프 마지막 껄로 시작
		}
		*/
		int [][] arr = new int[5][5];
		for (int i=0; i<arr.length ;i++ )
		{									  //j =i로 벌어지는 일
			for (int n =1, j =i; n<=5 ; n++ ) //i=0		00 01 02 03 04
			{								  //i=1		11 12 13 14 10	
				arr[i][j] = n;				  //i=2		22 23 24 20 21
				j++;						  //i=3		33 34 30 31 32
				if (j==5)					  //i=4		44 40 41 42 43
				{
					j=0;
				}
			}
		}

		for (int i = 0;i<arr.length ;i++ )
		{
			for (int j = 0;j<arr[i].length ; j++)
			{
				System.out.printf("%3d",arr[i][j]);
		    }
			System.out.println();
		}
		

	}
}
/*
  1  2  3  4  5
  5  1  2  3  4
  4  5  1  2  3
  3  4  5  1  2
  2  3  4  5  1
계속하려면 아무 키나 누르십시오 . . .

*/
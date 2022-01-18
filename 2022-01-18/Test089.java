/*=====================
  ■■■배	열 ■■■
=======================*/

// 배열의 배열(2차원 배열)

// 배열의 배열(다차원 배열) 을 활용하여
// 다음 과 같은 데이터를 요소로 취하는 배열을 구성하고
// 그 결과를 출력하는 프로그램을 구현한다

//실행예)
/*
	1 2 3 4 5	i = 0
	2 3 4 5 6	i = 1
	3 4 5 6 7	i = 2
	4 5 6 7 8   i = 3
	5 6 7 8 9	i = 4
*/
public class Test089
{
	public static void main(String[] args)
	{
		// 내가 푼 풀이
		/*int [][] arr = new int[5][5];
		int n = 1;

		for (int i = 0;i<arr.length ;i++ )
		{
			for (int j =0;j<arr[i].length ;j++ )
			{
				arr[i][j] = n;
				n++;
			}
			n -= 4;
		}

		for (int i = 0;i<arr.length ;i++ )
		{
			for (int j = 0;j<arr[i].length ; j++)
			{
				System.out.printf("%3d",arr[i][j]);
		    }
			System.out.println();
		}*/

		// 같이 푼 풀이
		int [][] arr = new int[5][5];
		int n = 1;

		for (int i = 0;i<arr.length ;i++ )
		{   
			n = 1 + i; // n을 루프 돌때 마다 초기화.. 나는 걍 뺏다..
			for (int j =0;j<arr[i].length ;j++ )
			{
				arr[i][j] = n;
				n++;
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
  2  3  4  5  6
  3  4  5  6  7
  4  5  6  7  8
  5  6  7  8  9
계속하려면 아무 키나 누르십시오 . . .
*/
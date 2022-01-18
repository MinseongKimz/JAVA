/*=====================
  ■■■배	열 ■■■
=======================*/

// 배열의 배열(2차원 배열)

/*
  1   2   3   4   10
  5   6   7   8   26
  9  10  11  12   42
 13  14  15  16   58
 28  32  36  40  136
*/

public class Test093
{
	public static void main(String[] args)
	{
		int [][] arr = new int[5][5];
		int n = 1;
		int sum1=0;//가로덧셈 
		int sum2=0;//세로덧셈
		/* 
		for (int i = 0;i<arr.length ;i++ )
		{   
			for (int j =0;j<arr[i].length ;j++ )
			{
				arr[i][j] = n;
				n++;
				if (j==4) // 가로 덧셈
					arr[i][4]=(arr[i][0]+arr[i][1]+arr[i][2]+arr[i][3]);	// 걍 노가다로 품
				if (i==4) // 세로 덧셈
					arr[4][j]=(arr[3][j]+arr[2][j]+arr[1][j]+arr[0][j]); 	
			}
			n--;
		}*/
		/* //다르게 풀었을 때
		for (int i=0;i<5 ;i++ )
		{
			for (int j=0;j<4 ;j++ )
			{
				arr[i][j]=n; // 0 1 2 3 까지 돌고 4는 없다... 
				n++;
				sum1 +=arr[i][j]; //0 1 2 3 까지를 더함
				arr[i][4]=sum1;	 // 4번째에  값을 넣어줌 (원래는 0임)
			}
			sum1 = 0;// 안하면 다음 행까지 또 누적됨
		}
		for (int i=0;i<5 ;i++ ) // 세로로 배열을 출력? 해서 더할꺼임(실제 출력 아니고)
		{						// 값만 따오기 위해 
			for (int j=0;j<4 ;j++ ) //0 1 2 3 까지 해서 더할꺼니깐 4
			{
				sum2 += arr[j][i]; // 배열 ji로 세로로 바꾸고 합들을 sum2에 저장
				arr[4][i] = sum2; // 4번째 에 없던 값에 sum2 를 대입
			}
			sum2 = 0;		  
		}*/

		//다 같이 푼거
		n = 0;
		for (int i=0;i<arr.length-1 ;i++)
		{
			
			for (int j =0;j<arr[i].length-1 ;j++ )
			{
				n++;
				arr[i][j] = n;
				
				arr[i][arr[i].length-1] += arr[i][j]; // arr[i][4] > 가로합
				arr[arr.length-1][j] += arr[i][j];	//	arr [4][j] > 세로합
				arr[arr.length-1][arr[i].length-1] += arr[i][j]; // arr[4][4]
			}
		}
		//출력 구문
		for (int i = 0;i<arr.length ;i++ )
		{
			for (int j = 0;j<arr[i].length ; j++)
			{
				System.out.printf("%4d",arr[i][j]);
		    }
			System.out.println();
		}
	}
}
/*
   1   2   3   4  10
   5   6   7   8  26
   9  10  11  12  42
  13  14  15  16  58
  28  32  36  40 136
계속하려면 아무 키나 누르십시오 . . .
*/
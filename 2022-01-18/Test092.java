/*=====================
  ■■■배	열 ■■■
=======================*/

// 배열의 배열(2차원 배열)

// 배열의 배열(다차원 배열) 을 활용하여
// 다음 과 같은 데이터를 요소로 취하는 배열을 구성하고
// 그 결과를 출력하는 프로그램을 구현한다


/*
  E  J  O  T  Y         5x5 배열
  D  I  N  S  X		    역순으로 세로로 시작 [j] [i] 꼴로 만들듯				
  C  H  M  R  W			A 시작 B C D 1씩 증가해서 바꾸면 될듯
  B  G  L  Q  V			n = 65로(A) 시작해서 1 씩 증가시키자
  A  F  K  P  U			그 후에 문자형 배열에 (char)n 값을 넣어주면
						변환이 가능할 듯 하다.
  */
public class Test092
{
	public static void main(String[] args)
	{
		char [][] arr = new char[5][5]; 
		int n = 65; // char n = 'A'; 
		
		for (int i=0;i<5 ;i++ )
		{
			for (int j=0;j<5 ;j++ )  // for(int j=4; j>=0; j--)  4 3 2 1 0 감소시키는 반복문
			{
				arr[4-j][i]= (char)n; // arr[j][i]=(char)n;
				n++;
			}
		}
		for (int i = 0;i<arr.length ;i++ )
		{
			for (int j = 0;j<arr[i].length ; j++)
			{
				System.out.printf("%3c",arr[i][j]);
		    }
			System.out.println();
		}
	}
}
/*
  E  J  O  T  Y
  D  I  N  S  X
  C  H  M  R  W
  B  G  L  Q  V
  A  F  K  P  U
계속하려면 아무 키나 누르십시오 . . .
*/
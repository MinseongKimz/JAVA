/*===========================================
■■■ 연 산 자 (Operater) ■■■
=============================================*/
// 비트 단위 연산

// 비트 단위 연산자 xor 연산자를 통해
// 두 변수에 담겨있는 내용(값) 바꾸기
public class Test026
{
	public static void main(String[] args)
	{
		int x =20, y =23;
		//int temp; //임시저장소

		System.out.printf(" x > %d, y > %d\n", x,y);
		/*
		temp = x;
		x = y;
		y = temp;
		*/ 
		
		x = x^y; //....1    『xor을 이용해 값 바꾸기.』
		y = y^x; //....2
		x = x^y; //....3   


		System.out.printf(" x > %d, y > %d\n", x,y);


			/*	ex)  input : x = 1010 y= 1101

				1.  x:1010	2.  y:1101	3.  x:0111
					y:1101		x:0111		y:1010
				-------------------------------------	
					x:0111		y:1010		x:1101
					
					output : x = 1101 y= 1010		*/		

	}
}
/*
 x > 20, y > 23
 x > 23, y > 20
계속하려면 아무 키나 누르십시오 . . .
*/
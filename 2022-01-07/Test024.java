/*===========================================
■■■ 연 산 자 (Operater) ■■■
=============================================*/
// 비트 단위 연산



public class Test024
{
	public static void main(String[] args)
	{
		int a = 10, b= -10;

		System.out.printf("~a : %d%n",~a);
		System.out.printf("~b : %d%n",~b);
		//~a : -11
		//~b : 9
	}

}

/*
a= 000001010
	   ↓
           ~a
   111110101  : -11
+  000001011  : 11
--------------------
 1 000000000  : 0  -11 맞음


b = -10 → 10 의 비트열 00001010
				   반전 11110101
			         +1 11110110 > -10

	11110110 : -10
~b= 00001001 :      9  맞음 
    
*/
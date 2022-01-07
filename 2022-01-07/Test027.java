/*===========================================
■■■ 연 산 자 (Operater) ■■■
=============================================*/
// 비트 단위 연산

public class Test027
{
	public static void main(String[] args)
	{
		int x = 128; //00000000 00000000 00000000 100000000

		System.out.printf("x << 3 : %d%n", x<<3);
		System.out.printf("x * 8 : %d%n", x*8);
		//x << 3 : 1024
		//x * 8 : 1024
		// 결론적으로 x<<n = x * 2^n 

		System.out.printf("x >> 3 : %d%n", x>>3);
		System.out.printf("x / 8  : %d%n", x/8);
		//x >> 3 : 16
		//x / 8  : 16
		// 결론적으로 x>>n = x / 2^n
		System.out.printf("x << 24 : %d%n", x<<24);	
		//x << 24 : -2147483648 
		// 10000000 00000000 00000000 0000000
		System.out.printf("x << 25: %d%n", x<<25);
		System.out.printf("x << 31: %d%n", x<<31);
		//x << 25: 0
		//x << 25: 0
		System.out.printf("x << 32: %d%n", x<<32);
		// x << 32: 128 비트가 한바퀴 돌아가버림



	}
}
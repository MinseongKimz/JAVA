/*===========================================
���� �ڹ� �⺻ ���α׷��� ����
=============================================*/

// �ڹ��� �⺻ �����: System.out.printf() 

public class Test018
{
	public static void main(String[] args)
	{
		System.out.print("AAA");
		System.out.print("BBB");
		System.out.print("CCC\n");   // \n ����
		
		System.out.println();  // ����

		//System.out.print();  ������ ����
		System.out.printf("12345678"); //���ڰ� ������ printó�� ����
		System.out.printf("12345678\n"); //���൵ ����
		System.out.printf("12345678%n"); //frintf ���� %n�� ���ൿ��
		//System.out.printf(); ���� ������ ����
		System.out.printf("%d + %d = %d \n",10, 20,30);

		System.out.printf("%d\n", 123);
		System.out.printf("%10d\n", 123); // ����Ȯ�� 10�ڸ� ���� �ڿ� 3�ڸ����� ä�� : 7�ڸ� ��� 123
		System.out.printf("%8d\n",1234);
		System.out.printf("%010d\n",1234);//010 : 10ĭ Ȯ���ϰ� ä��� �����ڸ� 0���� ä��
		//123
        //		   123
	    //	    1234
        //  0000001234


		System.out.printf("%+d\n",365);//��� ǥ��  +365
		System.out.printf("+%d\n",365);//�Ѵ� ����
		
		System.out.printf("%d\n",+365); // �׳� 365

		//System.out.printf("%-d\n",365);  ��Ÿ�� ����
		System.out.printf("-%d\n",365); //-365
		System.out.printf("%d\n",-365); // -365

		//System.out.printf("%d\n",'A'); ��Ÿ�� ���� �������� ����..%c..
		System.out.printf("%c\n",'a');
		//System.out.printf("%c=n",'abc'); ��Ÿ�� ���� ���ڿ����� %s
		System.out.printf("%s\n" ,"abcd");

		System.out.printf("%h\n", 365); //365�� 16���� ǥ�� :16d (HEX)
		System.out.printf("%o\n", 24);  // 24�� 8���� ǥ�� : 30  (OCT)

		System.out.printf("%b\n", true); //boolean�� true
		System.out.printf("%b\n", false); // false
		System.out.printf("%.2f\n", 123.23);// �Ǽ��� ǥ�� %.nf	�Ҽ��� �Ʒ� n��ŭ ǥ��
		System.out.printf("%.2f\n",123.235);// 2�ڸ����� ǥ�� ������ 5�� �ݿø��� 123.24���;

		System.out.printf("%8.2f\n", 123.236);//����ó�� 8�ڸ� Ȯ���� �Ҽ��� �Ʒ� 2�ڸ����� ǥ��
											  //�̷��� 2ĭ ��� 123.24

		System.out.printf("%2.2f\n", 123.236);//�������� Ȯ���� �������� �� 2.f�̰� ���õǰ� �� ����
											  //123.24 ���
		}

}
/*��� ���
AAABBBCCC

1234567812345678
12345678
10 + 20 = 30
123
       123
    1234
0000001234
+365
+365
365
-365
-365
a
abcd
16d
30
true
false
123.23
123.24
  123.24
123.24
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
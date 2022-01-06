/*===========================================
���� �ڹ� �⺻ ���α׷��� ����
=============================================*/

// ������ �ڷ��� 
// �ڹ��� �⺻ ����� : BufferedReader Ŭ����

//�������� �������͸� ����ϰ� ����ϴ°� �������.
//�̹��� ����ڰ� �� ������ ���𰡸� �غ���.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException; 


public class Test014
{
	public static void main(String[] args) throws IOException //(«������ �����帲)
	{
		
		//Ű���� ����(����)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//------------------------------------
		//		�����Է��� �о�帮�� ��ġ      --------------------
		//									    ����Ʈ �湮�� ������ -----------
		//															 ����Ʈ �Է°�.
		//�ֿ� ���� ����
		int r;      // ������
		final double  PI = 3.141592;
		double a, b;       // a= ���� b= �ѷ�

		//���� �� ó��
		//[1] ����ڿ��� �ȳ��޽��� ����.
		System.out.print("���� ������ �Է� : ");
		
		//[2] ����ڰ� �Է��� ���� �޾� ������ r�� ���

		//r= br.readLine();        �ٵ� BufferedReader �� readLind()�� ���ڿ� ��ȯ�ϴµ�?
		//������� r = br.readLine(); 80�Է��޴� ġ��   ... >  r = "80"; �̷� �ȵ�...
		// �̶� Integer.parseInt()�� ���� ���ڸ���� ���ڿ��� ���ڷ� ��ȯ����

		//r = Interger.parseInt(br.readLine());   ,,,<80 �Է�
		//r = Interger.parseInt("80");
		//r = 80;

		//Integer.parseInt("80) ..> 80
		// -- �Ű������� �Ѱܹ��� ���ڿ� �����͸� ���������� ��ȯ	
		// ��, �̶� �Ѱܹ��� ���ڿ� �����ʹ� ���ڸ��(NumberFormat)�̾�� �Ѵ�.

		r = Integer.parseInt(br.readLine());
		//-- ����ڰ� �Է��� ���� BufferedReader(br)��  readLine()
		//	 �޼ҵ带 Ȱ���Ͽ� ���ڿ� ���·� �о���� ��
		//   �� ���� Integer.parseInt() �� ���� ������(������)���� ��ȯ�� ��
		//   ���� ������ ������ ���� r �� ��Ƴ���.

		// ��Ʈ���� �������� �帧�� ���� �����.
		// �׶� �����ϱ� ������...
		
		//[3] ���� �� �ѷ� ��� 
		a = r * r * PI;
		b = r * 2 * PI;


		// ���� ��� ���
		System.out.println(">> ���� : " +a);
		System.out.println(">> �ѷ� : " +b);

		//System.out.printf("�������� %d�� ���� ���̴� %.4f�̸�, \n�ѷ��� %.4f�Դϴ�.\n", r, a, b);
		//�������� 23�� ���� ���̴� 1661.9022�̸�,
		//�ѷ��� 144.5132�Դϴ�.
		

	}
}		
/* ��� ���
���� ������ �Է� : 23
>> ���� : 1661.902168
>> �ѷ� : 144.51323200000002
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
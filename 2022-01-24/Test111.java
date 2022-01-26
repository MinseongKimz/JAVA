/*==================================
  ���� ����(Sort) �˰����� ����
====================================*/
// ���� �������� (Bubble Sort)

// ��	�տ��� �� Selection Sort(Test109)�� Bubble Sort(Test110) �� ������ ����.
//		(�� �ݺ��� Ƚ���� ���� ����)
//		������, ���� Bubble Sort�� ��� �������� ������ ����
//		�Ϲ� Bubble Sort �� Selection Sort ���� ������ ���� �� �ִ�.

// ���� ������ :	61 15 20 22 30
//					15 20 22 30 61 - 1ȸ��(���� �߻� �� true) �� ���� ȸ�� ���� O
//					15 20 22 30 61 - 2ȸ��(���� �߻� �� false) �� ���� ȸ�� ���� x

// 1ȸ�� ����... 2ȸ�� ����.. �� �غ��Ҵ��� 
// 2ȸ�� ���ට ������ ���� �߻����� �ʾұ� ������
// ���ʿ��� �߰� ����(�� �̻��� ȸ��)�� ���ǹ��� ������ �Ǵ��Ͽ�
// �������� �ʴ´�.

// ���� ��)
// Source Data : 10 60 20 30 40
// Sorted Data : 10 20 30 40 50

public class Test111
{
	public static void main(String[] args)
	{
		int[] a = {10, 50, 20, 30, 40};
		/*
		10 50 20 30 40
		== --
		10 20 50 30 40
		   == --
		10 20 30 50 40
			  == --   
	    10 20 30 40 50
				 == --
		----------------1ȸ�� ���� �� ���� �߻� 
		10 20 30 40 50
		== --
		10 20 30 40 50
		   == -- 
		10 20 30 40 50
		      == --
		----------------2ȸ�� ���� �� ���� �߻� x 
			  X
			  X
		----------------3ȸ�� X
			  X
		----------------4ȸ�� X		  
		*/
		System.out.print("Source Data :");
		for( int n: a)
			System.out.print(n + " ");
		System.out.println();


		// ������ ��.. ���� �߻� �� true.. 
			/*
			boolean check;
			for (int i=1;i<a.length ;i++ )
			{	
				check = false;
				for (int j=0;j<a.length-i ;j++)
				{
					if (a[j]>a[j+1])
					{
						
						a[j]= a[j]^a[j+1];
						a[j+1]= a[j+1]^a[j];
						a[j]= a[j]^a[j+1]; // ��Ʈ������ �̿��� �����ٲٱ�

						check = true; // �ڸ� �ٲ��� �Ͼ�� true�� �ٲٰ� 
					}				  // for���� ������ �ʰ� ����
				}
				if (check==false) //if�� ���Ҵµ� check�� false�� �����Ǹ� 
					break;		  // �ڸ��ٲ��� �Ͼ�� �ʾұ� ������
			}*/					  // �ݺ����� ���� ��Ų��..

			// ���� Ǭ ����
			int pass = 0;
			boolean flag;

			// ���� ���� ���� ����
			do
			{
				flag = false;
				pass++;

				for (int i =0;i<a.length-pass ;i++ ) // for �ϳ� ������ ���� �ϳ��� ���̸� �Ǵϱ�..
				{
					if (a[i]>a[i+1])
					{
						a[i] = a[i]^ a[i+1];
						a[i+1] = a[i+1]^ a[i];
						a[i] = a[i] ^ a[i+1];

						flag = true;
						//-- �� �ѹ��̶� ����(�ڸ��ٲ�)�Ͼ��
						// flag ������  true�� ����
					}
				}
			}
			while (flag); 
			// flag ������ false ��� ����
			// ȸ���� ���������� �߻��ϴ� ���� ������ �Ͼ�� ���� ����
			// ���̻� �ݺ��� ������ ���ǹ��� ������ �Ǵ� ����!
			

		System.out.print("Sorted Data :");

		for( int n: a)
			System.out.print(n + " ");
		System.out.println();

		
	}
}
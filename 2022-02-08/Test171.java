/*=====================================================
  ■■■ 컬렉션 프레임워크 (Collection Framework)■■■
=======================================================*/

// Set → HashSet, TreeSet
// - 순서 없음. 
// - 중복을 허용하지 않는 구조(기본)

/*
○	TreeSet<E> 클래스
	
	java.util.TreeSet<E> 클래스는
	Set 인터페이스를 상속한 SortedSet 인터페이스를 구현한 클래스로
	데이터를 추가하면 데이터들이 자동으로 오름차순 정렬된다.

	자동정렬이 포함되어있으니까 메모리소비가 심하고 좀 덜쓰게 됨.
	적은양의 데이터를 쓸대면 사용하지만 많은양의 데이터에선 안씀 성능떨어짐
*/

// VO	→ Value Object				값을 격납
// DTO	→ Data Transfer Object		VO와 DTO는 거의 같은 개념으로 씀(실무에서는)
// DAO	→ Data Access Object

import java.util.TreeSet;
import java.util.Iterator;
import java.util.Comparator;

class GradeVO
{
	private String hak;
	private String name;
	private int kor, eng, mat;
	

	// 생성자(사용자 정의 생성자 → 5개 매개변수)
	GradeVO(String hak, String name, int kor, int eng, int mat)
	{
		this.hak = hak;  // 학번
		this.name = name; // 이름
		this.kor = kor;  // 국어점수
		this.eng = eng;  // 영어점수
		this.mat = mat; // 수학점수
	}

	// 생성자(사용자 정의 생성자 → 매개변수가 없는 생성자)
	// 매개변수가 존재하는 생성자를 사용자 정의 생성자로 구성했기 때문에
	// default 생성자가 생기지 않기 때문에 따로 정의
	GradeVO()
	{}

	// getter/setter 구성
	public String getHak()
	{
		return hak;
	}

	public void setHak(String hak)
	{
		this.hak = hak;		
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;		
	}

	public int getKor()
	{
		return kor;
	}

	public void setKor(int kor)
	{
		this.kor = kor;		
	}

	public int getEng()
	{
		return eng;
	}

	public void setEng(int eng)
	{
		this.eng = eng;		
	}

	public int getMat()
	{
		return mat;
	}

	public void setMat(int mat)
	{
		this.mat = mat;		
	}

	// 추가 메소드 정의 (총점 산출)
	int getTot()
	{
		return kor + eng + mat;
	}

}

class MyComparator<T> implements Comparator<T> // GraveVO로 만든 객체끼리 비교하기 위한 클래스
{
	// 비교 메소드 재정의
	@Override
	public int compare(T o1, T o2)
	{
		GradeVO s1 = (GradeVO)o1;
		GradeVO s2 = (GradeVO)o2;

		// 학번 기준(오름차순)
		//return Integer.parseInt(s1.getHak()) - Integer.parseInt(s2.getHak());

		// 학번 기준(내림차순)
		//return Integer.parseInt(s2.getHak()) - Integer.parseInt(s1.getHak());

		// 총점 기준 (오름차순)
		//return s1.getTot() - s2.getTot();
		// 총점 기준 (내림차순)
		//return s2.getTot() - s1.getTot();

		// 이름기준(오름차순)
		//return s1.getName().compareTo(s2.getName()); 
		// 문자열 비교 = 문자열.compareTo(비교문자열)

		// 이름기준(내림차순)
		return s2.getName().compareTo(s1.getName()); 
	}
}

public class Test171
{
	public static void main(String[] args)
	{
		// TreeSet 자료구조 인스턴스 생성
		TreeSet<String> set = new TreeSet<String>();

		// TreeSet 자료구조 set에 요소추가 → add();
		set.add("슬램덩크");
		set.add("하울의움직이는성");
		set.add("하이큐");
		set.add("토이스토리");
		set.add("알라딘");
		set.add("코코");
		set.add("심슨");
		set.add("스파이더맨");
		set.add("어드벤쳐타임");
		set.add("짱구는못말려");
		set.add("포켓몬스터");
		set.add("원피스");

		// Iterator 를 활용한 set요소 전체 출력
		Iterator<String> it	=set.iterator();	
		while (it.hasNext())
			System.out.print(it.next()+" ");
		System.out.println();
		//--==>> 스파이더맨 슬램덩크 심슨 알라딘 어드벤쳐타임 원피스 짱구는못말려 코코 토이스토리 포켓몬스터 하울의움직이는성 하이큐
		// 오름차순으로 정렬되었다.

		//TreeSet 자료구조 인스턴스 생성
		//TreeSet<GradeVO> set2 = new TreeSet<GradeVO>();
		TreeSet<GradeVO> set2 = new TreeSet<GradeVO>(new MyComparator<GradeVO>());
		//트리셋의 기본적인 정렬기준을 우리가 만든 정렬 기준
		//MyComparator 으로 재정의해서 썼기 때문에
		

		set2.add(new GradeVO("2201123", "김민성", 90, 80, 70));
		set2.add(new GradeVO("2201124", "박현지", 91, 81, 71));
		set2.add(new GradeVO("2201125", "이윤태", 98, 79, 77));
		set2.add(new GradeVO("2201141", "정은정", 96, 86, 76));
		set2.add(new GradeVO("2201135", "김상기", 99, 82, 72));

		Iterator<GradeVO> it2 =set2.iterator();	

		/*
		while(it2.hasNext())
			System.out.print(it2.next() +  " " );
		System.out.println();
		//--==> 에러발생 (런타임 에러)
		// Exception in thread "main" java.lang.ClassCastException:
		// GradeVO cannot be cast to java.lang.Comparable (객체끼리 비교할 게 없다..) 
		//  →TreeSet클래스에 compare 메소드 오버라이딩  + 문번호 155 수정 
			
		//--==>>GradeVO@15db9742 GradeVO@6d06d69c GradeVO@7852e922 GradeVO@4e25154f GradeVO@70dea4e
		*/
		
		while (it2.hasNext())
		{
			GradeVO vo = it2.next();
			System.out.printf("%7s %7s %d %d %d %4d\n",vo.getHak(), vo.getName(), vo.getKor(),
				vo.getEng(), vo.getMat(),vo.getTot());
		}
		System.out.println();
		/*
		2201123     김민성 90 80 70  240
		2201124     박현지 91 81 71  243
		2201125     이윤태 98 79 77  254
		2201135     김상기 99 82 72  253
		2201141     정은정 96 86 76  258
		*/
		/* (학번기준 내림차순)
		2201141     정은정 96 86 76  258
		2201135     김상기 99 82 72  253
		2201125     이윤태 98 79 77  254
		2201124     박현지 91 81 71  243
		2201123     김민성 90 80 70  240
		*/
		/* (총점기준 오름차순)
		2201123     김민성 90 80 70  240
		2201124     박현지 91 81 71  243
		2201135     김상기 99 82 72  253
		2201125     이윤태 98 79 77  254
		2201141     정은정 96 86 76  258
		*/
		/*(총점기준 내림차순)
		2201141     정은정 96 86 76  258
		2201125     이윤태 98 79 77  254
		2201135     김상기 99 82 72  253
		2201124     박현지 91 81 71  243
		2201123     김민성 90 80 70  240
		*/
		/* (이름기준 오름차순)
		2201123     김민성 90 80 70  240
		2201135     김상기 99 82 72  253
		2201124     박현지 91 81 71  243
		2201125     이윤태 98 79 77  254
		2201141     정은정 96 86 76  258
		*/
		/*(이름기준 내림차순)
		2201141     정은정 96 86 76  258
		2201125     이윤태 98 79 77  254
		2201124     박현지 91 81 71  243
		2201135     김상기 99 82 72  253
		2201123     김민성 90 80 70  240
		*/

	}
}
package a_datatype;

public class Ex03_연습 
{

	public static void main(String[] args) 
	{
		
		int kor;				//	국어점수 변수 선언
		int eng;				//	영어점수 변수 선언
		
		kor = 91;				//	국어점수 변수에 91점 지정
		eng = 100;				//	국어점수 변수에 100점 지정
		
		int total;				//	총점 변수 선언
		total = kor + eng;		//	총점 계산하기
		
		System.out.println("총점 : " + total);				// 총점 출력
		
		// ------------------------------
		double avg;				//	평균 변수 선언
		avg = total / 2;		//	평균 계산하기
		System.out.println("평균 : " + avg);					// 평균 출력
		
		// 191 / 2 = 95.5
		// 정수형끼리 연산한 결과는 정수형 (자바의 특성)

	}

}

package a_datatype;

/* 
 *  [ 참고 ] 자료형
 * 		
 * 		1.	기본형
 * 			` 논리형 :  boolean
 * 			
 * 			` 문자형 : char(2B)
 * 			` 정수형 : byte(1B), short(2B), int(4B), long(8B)
 * 			` 실수형 : float(4B), double(8B)
 * 
 * 		2.	참조형 : 배열, 클래스
 * 
 * 
 *	[ 기본 ]
 *			변수의 자료형과 값의 자료형이 일치해야한다.
 *
 * 	[ 참고 ]
 * 			변수의 자료형과 값의 자료형이 안 맞는 경우
 * 			
 * 			` 변수의 자료형 > 값의 자료형 : 자동해결
 *			` 변수의 자료형 < 값의 자료형 : 자료형 변경 ( casting )
 * 
 */

public class Ex04_Casting 
{

	public static void main(String[] args) 
	{
		float f;		// 4B
		// f=3.6;		// 에러 발생
		f = (float)3.6;
		System.out.println("f = " + f);
		
		double d;		// 8B
		d = 100;		// 공간(8B) = 4B 값
		System.out.println("d = " + d);
		
		// 정수형 변수 i에 36.99 라는 실수값을 대입하고 출력
		int i;
		i = (int)36.99;
		System.out.println("i = " + i);
		
		//int su;
		//su = 10000000000; 		//값의 크기가 자료형의 크기보다 커서 에러
		
		long big;
		big = 10000000000L;			// 정수형 변수 long 사용시 변수값 뒤에 L을 붙여야 한다
		System.out.println("큰수 = " + big);
	}

}

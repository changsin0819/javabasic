package a_datatype;

/*
 *  자바에서 콘솔 입력받는 방법
 *  
 *   - java.util.Scanner 클래스 이용
 *   
 *   - 정수형 입력시 : nextInt()
 *   - 실수형 입력시 : nextDouble()
 *   - 문자열 입력시 : next() / nextLine()
 *  
 */

import java.util.*;
	// 자바의 라이브러리 패키지의 클래스나 사용자의 다른 패키지 안의 클래스를 사용할때
	// import 명령어를 사용하여 클래스 이름으로 사용할 수 있게 해준다

public class Ex09_Scanner 
{

	public static void main(String[] args) 
	{
		int kor, eng, math, total, avg; 	// 국어, 영어, 수학, 총점, 평균 변수선언
		
		// 국어, 영어, 수학 점수 입력받기
		Scanner input = new Scanner(System.in);
		System.out.println("국어점수 입력 : ");
		kor = input.nextInt();
		System.out.println("영어점수 입력 : ");
		eng = input.nextInt();
		System.out.println("수학점수 입력 : ");
		math = input.nextInt();
		
		// 국어, 영어, 수학 점수 출력하기
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		
		// 총점 구해서 출력하기
		total = kor + eng + math;
		System.out.println("총점 : " + total);
		
		// 평균 구해서 출력하기
		avg = total/3;
		System.out.println("평균 : " + avg);
		
	}

}

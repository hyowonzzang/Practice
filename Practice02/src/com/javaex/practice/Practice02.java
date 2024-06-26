/*[Ex01.java]
다음 중 에러가 발생하는 문장은 
(1) If ( i=0 ) {....}
(2) If ( j<10 ) {...}
(3) switch( 'A' ){....}
(4) switch( 100 ){...}
(5) switch( "A" ){...}
(6) if ( name == "홍길동" )

[Ex02.java]
다음 중 switch 문에서 조건식에 넣을 수 있는 데이터 타입은?
(1) boolean
(2) char
(3) byte
(4) short
(5) int
(6) long
(7) float
(8) double
(9) String

[Ex03.java]
다음 코드는 오류가 있습니다. 오류의 내용을 찾고 올바르게 수정하여 코딩해 보세요.

[Ex04.java]
다음 코드는 오류가 있습니다. 오류의 내용을 찾고 올바르게 수정하여 코딩해 보세요.

[Ex05.java]
아래와 같이 작성된 코드가 있다.
보기와 같은 형식으로 나이가 입력되었을 때 결과값을 예상하여 작성해 보세요

보기)

(1)15일 때 결과
(2)19일 때 결과
(3)20일 때 결과
(4)21일 때 결과
(5)100일 때 결과

[Ex06.java]
나이를 입력 받아 19세이상 65세 미만이면 "1번그룹" 그 이외에는 "2번그룹"으로 출력하는 프로그램을
작성하세요.

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("나이를 입력해주세요\n나이: ");
		int age = scanner.nextInt();
		
		if (age>=19 && age<65) {
			System.out.println("1번그룹 입니다.");
		}	else	{
			System.out.println("2번그룹 입니다.");
		}
		
		scanner.close();
		
	}

}

[Ex07.java]
나이를 입력 받아 아래와 같이 입장료가 출력되도록 프로그램을 작성하세요

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("나이를 입력해주세요\n나이: ");
		int age = scanner.nextInt();
		
		if (age >=20) {
			System.out.println("성인//5000원입니다.");
		}
		else if (age >=17)	{
			System.out.println("고등학생//4000원입니다.");
		}
		else if (age >=14)	{
			System.out.println("중학생//3000원 입니다.");
		}
		else if (age >=8)	{
			System.out.println("초등학생//2000원 입니다.");
		}
		else	{
			System.out.println("취학전아동//무료입니다.");
		}
		scanner.close();
		
	}

}

[Ex08.java]
사용자로 키와 몸무게를 입력 받아 BMI을 계산한 후에 저체중, 정상체중, 과체중을 구분하여 출력하
프로그램을 작성하세요. (정상체중의 범위는 18.5 <= BMI <= 24.9)

BMI =
체중(kg)
키(m)2


[Ex09.java]
아래의 조건과 같이 출력되도록 프로그램을 작성하세요
⚫ 태어난 년도를 입력 받습니다.
⚫ 나이는 생일과 관계없이 계산됩니다. 올해2023년, 2020년생 ➔ 3살 (2023-2020 = 3)
⚫ 15세미만의 경우와 65세이상인 경우에는 "(나이)살 무료예방접종 대상자 입니다" 메시지를 출력합
니다.
⚫ 이외의 경우에는 " (나이)살 무료예방접종 대상자가 아닙니다" 메시지를 출력합니다.

[Ex10.java]
두개의 숫자를 입력 받아 큰 수와 작은 수를 분류하여 출력하세요

[Ex11.java]
두 개의 정수를 입력 받아 큰 수를 작은 수로 나눈 몫과 나머지를 출력하는 프로그램을 작성하세요

[Ex12.java]
숫자(정수) 3개를 입력받아 가장 작은 수를 출력하세요

[Ex13.java]
두 개의 정수를 입력 받은 후에 작은 수가 큰 수의 약수인지 확인하는 프로그램을 작성하세요.
(0은 입력하지 않습니다.)

[Ex14.java]
사번(양의정수)을 입력하면 팀을 확인할 수 있는 프로그램을 작성하세요.
⚫ 팀은 A팀, B팀, C팀 3개의 팀으로 구성합니다.
⚫ 사번을 3으로 나누어서 나머지가 0이면 A팀, 1이면 B팀, 2이면 C팀 으로 구분합니다.
(사번 0은 고려하지 않습니다.)

[Ex15.java]
아래와 같은 계산기 프로그램을 작성하세요.
⚫ 기호, 숫자1, 숫자2 순서로 입력 받습니다.
⚫ 기호는 ( + - * / ) 4가지 입니다.
⚫ 입력된 내용으로 계산하여 결과값을 출력합니다.
⚫ 나눗셈의 경우 분모가 0이면 “계산할 수 없습니다” 를 출력합니다.

[Ex16.java]
다음과 같이 정의되는 함수의 함수 값을 계산해보자

f(x) = {
x
3 − 9x + 2 , x ≤ 0 (x가 0보다 작거나 같으면 이식을 사용)
7x + 2 , x > 0 (x가 0보다 크면 이식을 사용)

[Ex17.java]
다음과 같이 수익을 입력 받아 소득세를 계산하는 프로그램을 작성하세요
⚫ 세금계산법
⚫ 0원이상 1000만원 이하인 경우 tax: 0.09*수익
⚫ 1000만원 초과 4000만원 이하인 경우 tax: 1000*0.09 + 0.18*(수익-1000)
⚫ 4000만원 초과 8000만원 미만인 경우 tax: 1000*0.09 + 3000*0.18 + 0.27*(수익-4000)
⚫ 8000만원 이상인 경우 tax: 1000*0.09 + 3000*0.18 + 4000*0.27 + 0.36*(수익-8000)

[Ex18.java]
알파벳을 입력 받아 자음 모음을 구분하세요.
⚫ switch~case문을 사용합니다.
⚫ 영문 소문자 이외의 입력 값은 고려하지 않습니다.

[Ex19.java]
아래의 조건과 같이 출력되도록 프로그램을 작성하세요
⚫ 태어난 년도를 입력 받습니다.
⚫ 나이는 생일과 관계없이 계산됩니다. 올해2023년, 2020년생 ➔ 3살 (2023-2020 = 3)
⚫ 15세미만의 경우와 65세이상인 경우에는 "(나이)살 무료예방접종 대상자 입니다" 메시지를 출력
⚫ 이외의 경우에는 " (나이)살 무료예방접종 대상자가 아닙니다" 메시지를 출력합니다.

[Ex20.java]
알파벳을 입력 받아 자음 모음을 구분하세요.
⚫ if~else문을 사용합니다.
⚫ 영문 소문자 이외의 입력 값은 고려하지 않습니다.

[Ex21.java] --
사번(양의정수)을 입력하면 팀을 확인 할 수 있는 프로그램을 작성하세요.
⚫ 팀은 A팀, B팀, C팀 3개의 팀으로 구성합니다.
⚫ 사번을 3으로 나누어서 나머지가 0이면 A팀, 1이면 B팀, 2이면 C팀 으로 구분합니다.
⚫ 사번 0번을 입력하면 "잘못된 사번입니다." 라고 출력하세요.

[Ex22.java]
숫자(정수) 3개를 입력 받아 가장 큰 수를 출력하세요

다음페이지 계속

[Ex23.java]
아래의 조건과 같이 출력되도록 프로그램을 작성하세요
⚫ 태어난 년도를 입력 받습니다.
⚫ 나이는 생일과 관계없이 계산됩니다. 올해2023년, 2020년생 ➔ 3살 (2023-2020 = 3)
⚫ 성인(20세 이상) 이면 무료료 건강검진을 받을 수 있습니다.
⚫ 짝수해 태어난 사람은 올해가 짝수해 이면 검사대상이고 올해가 홀수해 이면 검사대상이 아닙니다.
(홀수해 태어난 사람이 올해가 홀수해 이면 검사대상 올해가 짝수해 이면 검사대상이 아닙니다.)
⚫ 40세 이상의 경우에는 암 검사도 무료료 검사 받을 수 있습니다.

20세미만 건강검진대상 아닐 때 20세이상, 건강검진받는해, 40세미만 암검사X

20세이상, 건강검진받는해, 40세이상 암검사O

20세이상, 건강검진받는해X
*/


/*

[문제] Ex01 아래의 코드를 실행하면 출력결과에 오류가 발생한다. 오류 수정 후 출력결과를 예상하고 코드로
확인해 보세요. 결과: 22

	public static void main(String[] args) {
		
		int[]intArray = new int[5];
		intArray[0] = 3;
		intArray[1] = 7;
		intArray[2] = 12;
		
		int result = 0;
		
		for (int i =0; i < intArray.length; i++) {
			result = result + intArray[i];
		}
		System.out.println(result);

	}
}

[문제] Ex02 double 형 배열 을 작성하고 1.2, 3.3, 6.7 값을 순서대로 입력하고 아래와 같이 출력되도록 for문
을 작성하세요.

public static void main(String[] args) {

		double[] scores = new double[3];
		scores[0] = 6.7;
		scores[1] = 3.3;
		scores[2] = 1.2;
		for (int i = 0; i < scores.length; i++)
			System.out.printf("%.1f" + "%n", scores[i]);

	}
}

[문제] Ex03 아래코드의 출력 값을 예상하고 코드로 확인해 보세요.

20
6
10

[문제] Ex04 다음 주어진 배열 데이터를 이용하여 3의 배수의 개수와 배수의 합을 아래와 같이 출력하는 프로
그램을 작성하세요.

public static void main(String[] args) {

		int[] data = new int[] { 1, 3, 5, 8, 9, 11, 15, 19, 18, 20, 30, 33, 31};
		int[] data2 = new int[10];
		int sum = 0 , j =0;
		for (int i = 0; i < data.length; i++) {

			if (data[i] % 3 == 0) {
				data2[j]=data[i];
				sum += data2[j++];
				
				
			}
			
			
			
		}
		System.out.println("주어진 배열에서 3의 배수의 갯수 =>"+j);
		System.out.println("주어진 배열에서 3의 배수의 합 =>"+sum);
		
	}
}

[문제] Ex05 5개의 숫자를 키보드로 입력 받아 평균을 구하는 프로그램을 작성하세요.




*/
package Recursion;
//데이터파일로부터 n개의 정수 읽어오기

import java.util.Scanner;

public class RecursionEx01 {
	
	public static void readFrom(int n, int [] data, Scanner in) {
		if (n==0)
			return;
		else {
			readFrom(n-1, data, in);
			data[n-1] = in.nextInt();
		}
	}
}

/*
 * 모든 순환함수는 반복문(iteration)으로 변경 가능
 * 그 역도 성립함. 즉 모든 반복문은 recursion으로 표현 가능함.
 * 순환함수는 복잡한 알고리즘을 단순하고 알기쉽게 표현하는 것을 가능하게 함
 * 하지만 함수 호출에 따른 오버헤드가 있음 (매개변수 전달, 액티베이션 프레임 생성 등)
 */

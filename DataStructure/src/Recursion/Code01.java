package Recursion;
//Recursion = 순환함수 = 재귀함수 : 자기 자신을 호출하는 함수. 종료 조건이 없으면 무한 루프에 빠진다.


public class Code01 {
	public static void main(String[] args) {
		func();	//StackOverflowError(잘못된 재귀호출-종료 조건 없는 재귀함수 사용시) 발생
	}
	
	public static void func() {
		System.out.println("Hello...");
		func();
	}
}


package Recursion;
//Factorial: n!

public class Factorial01 {
	public static void main(String[] args) {
		System.out.println(factorial(5));
	}
	
	public static int factorial(int n) {
		if (n==0)
			return 1;
		else
			return n*factorial(n-1);
	}
}

// factorial(int n)은 음이 아닌 정수 n에 대하여 n!을 올바로 계산한다.
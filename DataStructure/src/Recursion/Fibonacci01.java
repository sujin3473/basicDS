package Recursion;
//피보나치 수열 구하기

public class Fibonacci01 {
	public static void main(String[] args) {
		System.out.println(fibonacci(2));
	}
	
	public static int fibonacci(int n) {
		if (n<2)
			return n;
		else
			return fibonacci(n-1) + fibonacci(n-2);
	}
}

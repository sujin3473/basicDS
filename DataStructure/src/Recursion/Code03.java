package Recursion;
// 1~n까지의 합을 구하기

public class Code03 {
	public static void main(String[] args) {
		int result = func(4);
		System.out.println(result);
	}
	
	public static int func(int n) {
		if (n==0)
			return 0;
		else {
			return n + func(n-1);
		}	
	}
}


//Factorial: n!
//
//0! = 1
//n! = nx(n-1)! 	n>0
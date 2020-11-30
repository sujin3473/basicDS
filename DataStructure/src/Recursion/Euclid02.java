package Recursion;
//Euclid Method 더 단순한 버전

public class Euclid02 {
	public static void main(String[] args) {
		System.out.println(gcd(5,3));
	}
	
	public static int gcd(int m, int n) {
		if (n==0) 
			return m;		
		else
			return gcd(n, m%n);
	}

}

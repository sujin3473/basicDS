package Recursion;
//최대공약수: Euclid Method

public class Euclid01 {
	public static void main(String[] args) {
		System.out.println(gcd(5,3));
	}
	
	public static int gcd(int m, int n) {
		if (m<n) {
			int tmp=m; m=n; n=tmp;	//swap m and n
		}
		if (m%n==0)
			return n;
		else
			return gcd(n, m%n);
	}

}

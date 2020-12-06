package Recursion;
//암시적(implicit) 매개변수를 명시젹(explicit) 매개변수로 바꾸어라.

//순차 탐색(Sequential Search)
public class SequentialSearch {
	
	public static void main(String[] args) {
		int[] data = {0, 3, 5, 9};
		int target = 3;
		int n = 4;
		System.out.println(search(data, n, target));		
	}
	
	//암시적 매개변수(0)
	static int search(int[] data, int n, int target) {
		for (int i=0; i<n; i++) 
			if (data[i]==target)
				return i;
			return -1;
	}
	//이 함수의 미션은 data[0] ~ data[n-1] 사이에서 target을 검색하는 것이다.
	//하지만 검색 구간의 시작 인덱스 0은 보통 매개변수에서 생략한다. 즉 암시적 매개변수이다.
}

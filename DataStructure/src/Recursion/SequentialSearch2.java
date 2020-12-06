package Recursion;
//암시적(implicit) 매개변수를 명시젹(explicit) 매개변수로 바꾸어라.

//순차 탐색(Sequential Search)
public class SequentialSearch2 {
	
	public static void main(String[] args) {
		int[] data = {0, 3, 5, 9};
		int target = 9;
		System.out.println(search(data, 0, 3, target));		
	}
	
	static int search(int[] data, int begin, int end, int target) {
		if(begin>end)	//data 갯수 0개인 경우
			return -1;
		else if (target==data[begin])
			return begin;
		else
			return search(data, begin+1, end, target);
	}
	//이 함수의 미션은 data[begin] ~ data[end] 사이에서 target을 검색하는 것이다.
	//즉 검색구간의 시작점을 명시적(explicit)으로 지정한다.
}

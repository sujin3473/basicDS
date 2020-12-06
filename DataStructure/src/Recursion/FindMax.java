package Recursion;

public class FindMax {
	
	int findMax(int[] data, int begin, int end) {
		if (begin==end)
			return data[begin];
		else
			return Math.max(data[begin], findMax(data, begin+1, end));
	}
	//이 함수의 미션은 data[begin]에서 data[end] 사이에서 최대값을 찾아 반환하는 것이다.
	//begin<=end 라고 가정한다.
}

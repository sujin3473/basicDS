package Recursion;


public class BinarySearch {
	
	//items[begin] ~ items[end]에서 target을 찾기.
	public static int binarySearch(String[] items, String target, int begin, int end) {
		if (begin>end)
			return -1;
		else {
			int middle = (begin+end)/2;
			int compResult = target.compareTo(items[middle]);
			if (compResult == 0)
				return middle;
			else if (compResult<0)
				return binarySearch(items, target, begin, middle-1);
			else
				return binarySearch(items, target, middle+1, end);
		}
		
	}

	//A.ComparTo(B) : 문자열 A와 B를 비교하여 같으면 0, A가 B보다 크면 양수, A가 B보다 작으면 음수를 반환. 
}

import java.lang.reflect.Array;
import java.util.Arrays;

public class PracticeProblem {

	public static void main(String args[]) {
		
	}
	
	public static int[] compareSearch(int[] a, int b) {
		Arrays.sort(a);
		int seq = -1;
		int bin = 0;
		for (int i = 0; i < a.length; i++) {
			seq = i + 1;
			if (a[i] == b) {	
				break;
			}
		}

		int left = 0;
		int right = a.length - 1;
		int mid;
		while(left <= right) {
			mid = (left + right) / 2;
			if (b == a[mid]) {
				bin++;
				left = right + 1;
			}
			else if (b > a[mid]) {
				left = mid + 1;
				bin++;
			}
			else {
				right = mid - 1;
				bin++;
			}
		}
		int[] output = new int[]{seq, bin};
		return output;
	}

	public static int[] compareStringSearch(String[] a, String b) {
		Arrays.sort(a);
		int seq = -1;
		int bin = 0;
		for (int i = 0; i < a.length; i++) {
			seq = i + 1;
			if (a[i] == b) {
				break;
			}
		}
		int left = 0;
		int right = a.length - 1;
		int mid;
		while(left <= right) {
			mid = (left + right) / 2;
			if (a[mid].compareTo(b) == 0) {
				bin++;
				left = right + 1;
			}
			else if (a[mid].compareTo(b) < 0) {
				left = mid + 1;
				bin++;
			}
			else {
				right = mid - 1;
				bin++;
			}
		}
		int[] output = {seq, bin};
		return output;
	}
}

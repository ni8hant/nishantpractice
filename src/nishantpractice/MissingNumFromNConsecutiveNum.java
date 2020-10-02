package nishantpractice;

public class MissingNumFromNConsecutiveNum {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 8, 9, 10, 11, 12 };
		int num = findMissingNum(arr);
		System.out.println(num);

		int result = getMissingNumberSecondApproch(arr);
		System.out.println(result);
	}

	private static int findMissingNum(int[] arr) {
		int total, sum = 0;
		int n = arr.length;
		total = (n + 1) * (n + 2) / 2;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		return total - sum;
	}

	private static int getMissingNumberSecondApproch(int[] arr) {
		int total = 1;
		for (int i = 2; i <= arr.length+1 ; i++) {
			total = total + i;
			total = total - arr[i-2];
		}
		return total;
	}
}

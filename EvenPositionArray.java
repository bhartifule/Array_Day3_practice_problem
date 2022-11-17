package Array_Day3_Assingment;

public class EvenPositionArray {
	public static void main(String[] args) {
		int arr[]=new int[] {1,2,3,4,5,6,7,8};
		for(int i =0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("Even position Elements in array are :");
		for(int i=1;i<arr.length;i=i+2) {
			System.out.println(arr[i]);
		}
	}
}

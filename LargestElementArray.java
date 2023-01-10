package Array_Day3_Assingment.Day3;

import java.util.Scanner;

public class LargestElementArray {
	public static void main(String[] args) {
		int a[] = new int[5];
		int max;
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter Array");
		for(int i=0;i<5;i++) {
			a[i]= scan.nextInt();
		}
		max=a[0];
		for(int i=1;i<5;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println("Maximum Element "  + max);
	}
}

package Array_Day3_Assingment;

import java.util.Scanner;

public class ReverseOrderArray {
	public static void main(String[] args) {
		int a[]=new int[5];
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the Array");
		
         for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
			}
		System.out.println("array elements");
		for(int i=0;i<a.length;i++) 
		{
			System.out.println(a[i]+" ");
		}
		System.out.println("Array Reverse Element");
		for(int i=a.length-1;1>=0;i--) 
		{
			System.out.println(a[i]+" ");
		}
	}
}

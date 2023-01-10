package Array_Day3_Assingment.Day3;

import java.util.Scanner;

public class FrequencyArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Size of Array");
		int n = scan.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];
		int c=0;
		for(int i=0;i<n;i++) {
			a[i]=scan.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			c=1;
			if(a[i]!=-1) {
				for(int j=i+1;j<n;j++)
				{
					if(a[i]== a[j]) {
						c=c+1;
						a[j]=-1;
					}
				}
				b[i]=c;
			}
		}
		for(int i=0;i<n;i++) {
			if(a[i]!=-1) {
				System.out.println(a[i]+ " : "+ b[i]);
			}
		}
	}
	

}

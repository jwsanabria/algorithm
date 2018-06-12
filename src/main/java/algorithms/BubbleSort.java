package algorithms;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Integer[] array=new Integer[n];
		for(int i=0; i<n; i++) {
			array[i] = in.nextInt();
		}
		bubbleSort(array);
		for(int j=0;j<n; j++) {
			System.out.print(array[j] + " ");
		}
		
		
	}
	
	static void bubbleSort(Integer[] ar) {
		for(int i = 0; i<ar.length;i++) {
			for(int j = ar.length-1; j>i; j--) {
				if(ar[j]<ar[j-1]) {
					int temporal = ar[j-1];
					ar[j-1]=ar[j];
					ar[j]=temporal;
				}
			}
		}
		
	}
}

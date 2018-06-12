package algorithms;

import java.util.Scanner;

public class InsertionSort {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Integer[] array=new Integer[n];
		for(int i=0; i<n; i++) {
			array[i] = in.nextInt();
		}
		insertionSort(array);
		for(int j=0;j<n; j++) {
			System.out.print(array[j] + " ");
		}
		
		
	}
	
	static void insertionSort(Integer[] ar) {
		for(int i = 1; i<ar.length; i++) {
			int valor = ar[i];
			int j=i-1;
			while(j>=0 && ar[j]>valor) {
				ar[i]=ar[j];
				ar[j]=valor;
				j--;
			}
			
		}
				
	}
}

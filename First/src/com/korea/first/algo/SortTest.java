package com.korea.first.algo;

public class SortTest {

	public static void main(String[] args) {
		int[] arr = {5, 60, 20, 3, 9, 11, 34};

		print(arr);
		
//		sort(arr);
		
//		print(arr);
		
//		sortReverse(arr);
		
		bubbleSort(arr);
		
//		print(arr);
	}
	
	public static void bubbleSort(int[] arr) {
		int tmp = 0;
		int cycleCount = 1;
		for(int i = arr.length - 1 ; i >= 0 ; i--) {
			for(int j = 0; j < i ; j++) {
				System.out.print((cycleCount) + " 회전중 : ");
				if(arr[j] > arr[j+1]) {
					tmp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = tmp;
				}
				print(arr);
			}
			System.out.print((cycleCount) + " 회전 결과 : ");
			print(arr);
			cycleCount++;
		}
	}
	
	
	public static void sort(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			int minNum = arr[i];
			for(int j = i+1; j < arr.length; j++) {
				if(minNum > arr[j]) {
					minNum = arr[j];
					arr[j] = arr[i];
					arr[i] = minNum;
				}		
			}
		}
	}
	
	public static void sortReverse(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			int minNum = arr[i];
			for(int j = i+1; j < arr.length; j++) {
				if(minNum < arr[j]) {
					minNum = arr[j];
					arr[j] = arr[i];
					arr[i] = minNum;
				}		
			}
		}
	}

	//젤 끝에 콤마가 찍히면 안돼요!!
	public static void print(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			if(i != arr.length - 1) {
				System.out.print(arr[i] + ", ");				
			}else {
				System.out.println(arr[i]);
			}
		}
	}
}

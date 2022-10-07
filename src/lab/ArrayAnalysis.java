package lab;

import java.util.Scanner;

/*
 * See the link for lab explanation
 * https://docs.google.com/document/d/1QGhcNy-QOFT-J1rOHgeXKv81b5yz0LfEpL_Dl3PPff8/edit#
 * 
 * 
 */

public class ArrayAnalysis {

	
	//#1
	public static int[][] createRandom(int row, int column, int min, int max){
		
		int[][] ranArr = new int[row][column];  
		
		int scope = max;
		int minimum = min;

		for (int i = 0; i < ranArr.length; i++) {  //cycle through all the rows
			for (int j = 0; j < ranArr[i].length; j++) {  //cycle through all the columns on a given row
				
				ranArr[i][j] = (int) (Math.random() * scope  + minimum);  //setting the elements in the array
				
			}
			
		}
		
		return ranArr;
	}
	
	
	//#2
	public static void printArray(int[][] arr)  {
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				
				System.out.print(arr[i][j] + " ");  //prints 1 row
				
			}
			System.out.println();  //move cursor to next row
		}

		System.out.println();
	
	}
	
	
	//#3
	public static int sumTotal(int[][] arr) {
		
		int sum = 0; 
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				
			sum = sum + arr[i][j];	
				
			}
		}
		
		return sum;
	}
	
	
	//#4
	public static double average(int[][] arr) {
		
		int average = 0; 
		int count = 0; 
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				
				count++; 
			}
		}
		
		average = sumTotal(arr)/count; 
		
		return average;
	}
	
	
	//#5
	public static int findMin(int[][] arr) {
		
		int min = Integer.MAX_VALUE; 
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				
				if(arr[i][j] < min) {
					
					min = arr[i][j]; 
				}
			}
		}
		
		return min;
	}
	
	
	//#6
	public static int findMax(int[][] arr) {
		
		int max = Integer.MIN_VALUE; 
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				
				if(arr[i][j] > max) {
					
					max = arr[i][j]; 
				}
			}
		}
		
		return max;
	}
	
	
	//#7
	public static int[][] diffArrays(int[][] arr1, int[][] arr2){
		
		int arr1RowCount = arr1.length;
		int arr1ColCount = arr1[0].length; 
		
		int arr2RowCount = arr2.length;
		int arr2ColCount = arr2[0].length; 
		
		if (arr1RowCount != arr2RowCount) {
			
			return null; 
		}
		else if (arr1ColCount != arr2ColCount) {
			
			return null; 
		}
		
		int[][] outputArr = new int[arr1RowCount][arr1ColCount]; 
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				
				outputArr[i][j] = arr1[i][j] - arr2 [i][j]; 
			}
		}
		
		return outputArr;
	}
	
	
	//#8
	public static int[][] transposeRow(int[][] arr1, int dist){
		
		int arr1RowCount = arr1.length;
		int arr1ColCount = arr1[0].length; 
		
		int[][] outputArr = new int[arr1RowCount][arr1ColCount]; 
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				
				outputArr[(i + dist) % arr1RowCount][j] = arr1[i][j]; 
			}
		}
		
		return outputArr;
	}
	
	
	//#9
	public static long sum3D(int[][][] arr) {
		
		long sum = 0; 
		
		for (int i = 0; i < arr.length; i++) {
			
			sum = sum + sumTotal(arr[i]); 
		}
		
		return sum;
	}
	
	
	//#10
	public static double average3D(int[][][] arr) {
		
		int count = 0; 
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr[i][j].length; k++) {
					
					count++; 
				}
			}
		}
		
		long sum = sum3D(arr);
		double average = sum/count; 
		
		return average;
	}
	
	
	
	
	
	
}

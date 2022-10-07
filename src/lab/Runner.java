package lab;

public class Runner {

	public static void main(String[] args) {
		
		ArrayAnalysis analysis = new ArrayAnalysis();
		
		int[][] arr1 = analysis.createRandom(6, 3, -2, 10);
		int[][] arr2 = analysis.createRandom(2, 8, -1, 7);
		int[][] arr3 = analysis.createRandom(2, 8, -3, 9);

		
		ArrayAnalysis.printArray(arr1); 
		ArrayAnalysis.printArray(arr2); 

		//testing for the first array
		System.out.println("This is the sum of the first array: " + ArrayAnalysis.sumTotal(arr1)); 

		System.out.println("This is the average of the first array: " + ArrayAnalysis.average(arr1)); 
		 
		System.out.println("This is the min of the first array: " + ArrayAnalysis.findMin(arr1)); 
		 
		System.out.println("This is the max of the first array: " + ArrayAnalysis.findMax(arr1)); 

		
		//testing for the second array
		System.out.println("This is the sum of the second array: " + ArrayAnalysis.sumTotal(arr2)); 

		System.out.println("This is the average of the second array: " + ArrayAnalysis.average(arr2)); 
		 
		System.out.println("This is the min of the second array: " + ArrayAnalysis.findMin(arr2)); 
		 
		System.out.println("This is the max of the second array: " + ArrayAnalysis.findMax(arr2)); 

		
		int[][] outputArr; 
		outputArr = ArrayAnalysis.diffArrays(arr1,arr2); //different sized array's 
		
		if(outputArr == null) {
			System.out.println("Array 1 and Array 2 are two different sizes"); 
		}
		else {

			ArrayAnalysis.printArray(outputArr);
		} 
		
		
		outputArr = ArrayAnalysis.diffArrays(arr2,arr3); //the same sized array's 
		ArrayAnalysis.printArray(outputArr); 
		
		if(outputArr == null) {
			System.out.println("Array 2 and Array 3 are two different sizes"); 
		}
		else {

			ArrayAnalysis.printArray(outputArr);
		} 
		
		System.out.println("Transposed array 1: "); 
		outputArr = ArrayAnalysis.transposeRow(arr1,2);
		ArrayAnalysis.printArray(outputArr); 
		
		System.out.println("Transposed array 2: "); 
		outputArr = ArrayAnalysis.transposeRow(arr2,2); 
		ArrayAnalysis.printArray(outputArr); 


		//analysis is the name of the ArrayAnalysis object
		int[][][] arr3D = new int[3][4][5];
		for (int i = 0; i < arr3D.length; i++) {
			arr3D[i] = analysis.createRandom(4, 5, -40, 40);
		}
		int x = 1;
		for (int[][] arr : arr3D) {
			System.out.println("\nLayer #" + x);
			ArrayAnalysis.printArray(arr);
			x++;
		}

		
		System.out.println("This is the sum of the 3d array: " + ArrayAnalysis.sum3D(arr3D)); 

		System.out.println("This is the average of the 3d array: " + ArrayAnalysis.average3D(arr3D)); 
		 
		
		
	}
	
	
	
	
	
	
	
}

package Pages;

import org.junit.Test;

public class HomePage {
	

	
	/*
	 * start with any array
	 * 
	 */
	
	
	public static void sec() {
		int arra[] = {2,4,3,0,3,7,2,7,5,};
		int largest = arra[0];
		int secLarge = arra[1];
		
		for(int i = 1; i<arra.length; i++) {

			
			
			if (largest < arra[i]) {
				secLarge = largest;
				largest = arra[i];
			}
			
			else if(arra[i] > secLarge && arra[i] < largest) {
				secLarge = arra[i];
			}
	
		}
		System.out.println(secLarge);
	}
	
	@Test
	public void fib() {
		int []arr = new int[9];
		//int arr[] = 
		
		arr[0] = 1;
		arr[1] = 1;
		
		for(int i = 2; i < 9; i++) {
			arr[i] = arr[i-2] + arr[i-1];
			
		}
		
		for(int i = 0; i <arr.length;i++) {
			System.out.println(arr[i]);
		}
		//System.out.println(arr);
	
		
		
	}
	
	//locate the menu
	//print
	public void getMenu() {
	
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	



	
	
	
}

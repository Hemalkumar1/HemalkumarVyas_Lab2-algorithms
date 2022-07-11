package hemalVyas_Lab2algorithms;

import java.util.Scanner;

public class TravelerMoney {
	
	public Integer[] enterDenominations() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number of denominations");
		int numberOfDenominations = scan.nextInt();
		Integer [] denom = new Integer[numberOfDenominations];
		
		System.out.println("Enter the denominations");
		for (int i=0; i < numberOfDenominations; i++) {
			denom[i] = scan.nextInt();
		}
		return denom;
	}
	
	public void payAmount(Integer[] denominations,int amount) {
		int[] notes = new int[denominations.length];
		
		for (int i=0; i < denominations.length; i++) {
			notes[i] = amount/denominations[i];
			amount -= (notes[i]*denominations[i]);
			
			if(amount == 0)
				break;
			if (amount < 0)
				System.out.println("cannot give the exact change");
		}
		if (amount == 0){
			for (int i=0; i< notes.length; i++) {
				if (notes[i] > 0){
					System.out.println(denominations[i] + ":" + notes[i]);
				}
			}
		}
		else
			System.out.println("cannot give the exact change");
	}
}


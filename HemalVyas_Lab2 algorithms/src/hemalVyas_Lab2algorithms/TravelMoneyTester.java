package hemalVyas_Lab2algorithms;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class TravelMoneyTester {

	public static void main(String[] args) {
		TravelerMoney travelerMoney = new TravelerMoney();
		
		Integer[] denominations = travelerMoney.enterDenominations();
		
		Arrays.sort(denominations,Collections.reverseOrder());
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the amount that you want to pay");
		
		int amount = scan.nextInt();
		
		travelerMoney.payAmount(denominations, amount);
		
		scan.close();
		
	}

}

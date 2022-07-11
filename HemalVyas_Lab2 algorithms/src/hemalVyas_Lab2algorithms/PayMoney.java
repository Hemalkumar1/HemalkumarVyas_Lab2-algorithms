package hemalVyas_Lab2algorithms;

import java.util.Scanner;

public class PayMoney {
	
	public int[] transactions() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of transaction array");
		int size = sc.nextInt();
		int[] trans = new int[size];
		System.out.println("Enter the values of array");
		for (int i=0; i < size;i++) {
			trans[i] = sc.nextInt();
		}
//		sc.close();
		return trans;
	}
	
	public int findTarget(int[] trans, int target) {
		int total = 0;
		for (int i=0; i< trans.length; i++) {
			total += trans[i];
			if (total > target)
				return i;
		}
		return -1;
	}
	
	public void checkTarget(int[] trans) {
		Scanner sca = new Scanner(System.in);
		System.out.println("Enter the total no of targets that needs to be achieved");
		int noOfTargets = sca.nextInt();
		for (int i=0; i< noOfTargets; i++) {
			System.out.println("Enter the value of target");
			int target = sca.nextInt();
			int transNum = findTarget(trans, target);
			if (transNum == -1)
				System.out.println("Given target is not achieved");
			else
				System.out.println("Target achieved after " + (transNum+1) + " transactions");
		}
		sca.close();
	}
}
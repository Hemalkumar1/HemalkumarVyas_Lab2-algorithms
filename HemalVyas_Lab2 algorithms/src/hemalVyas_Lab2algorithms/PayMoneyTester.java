package hemalVyas_Lab2algorithms;

//import java.util.Scanner;

public class PayMoneyTester {

	public static void main(String[] args) {
		PayMoney payMoney = new PayMoney();
		int[] trans = payMoney.transactions();
		payMoney.checkTarget(trans);
		
//		Scanner sca = new Scanner(System.in);
//		System.out.println("Enter the total no of targets that needs to be achieved");
//		int noOfTargets = sca.nextInt();
//		for (int i=0; i< noOfTargets; i++) {
//			System.out.println("Enter the value of target");
//			int target = sca.nextInt();
//			int transNum = payMoney.findTarget(trans, target);
//			if (transNum == -1)
//				System.out.println("Given target is not achieved");
//			else
//				System.out.println("Target achieved after " + transNum + " transactions");
//		}
//		sca.close();

	}
}

package twsip;

import java.util.Scanner;

public class ATMOperation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		
		int money=5000;
		
		
		
		
		 while (true) {
		System.out.println("ATM Machine");
		System.out.println("Choose 1 for Withdraw");
		System.out.println("Choose 2 for Deposit");
		System.out.println("Choose 3 for Check Balance");
		System.out.println("Choose 4 for Exit");
		
		
		

		
		System.out.println("Enter operation");
		int op = sc.nextInt();
		
		switch(op)
		{
			case 1:
			System.out.println("Enter money to be withdraw");
			int range=  sc.nextInt();
			if(range<=money)  //3000<=5000
			{
				money= money-range;
				
			}
			System.out.println("Money has been withdrawn");
			break;
			
			case 2:
				System.out.println("Enter money to be Deposit");
				
				
				
				
				int dp = sc.nextInt();
				
				
				money= money+dp;  //  8000=5000+3000
				System.out.println("your money has been deposited");
				break;
			case 3:
				System.out.println("your banalce is : " +  money);
				
			break;
			case 4: 
				 System.out.println("Exiting ATM. Thank you!");
                 System.exit(0);
				break;
				
		}
				
			
		}
		

	}

}

package ProjectAtm;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class OptionMenu extends Account {
	Scanner menuInput = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat(" '$',###,##0.00");
	
	HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();
	
	public void getlogin() throws IOException 
	{
		int x=1;
		do{
			try{
				data.put(952141, 191904);
				data.put(989947, 71976);
				
				System.out.println("Welcome to the atm");
				System.out.println("Enter the customer number");
				setCustomerNumber(menuInput.nextInt());
				System.out.println("American");	
				System.out.println("Enter the pin number");
				setCustomerNumber(menuInput.nextInt());
			}catch(Exception e){
				System.out.println("\n" + "Invalid characters(s) only numbers" + "\n");
				x=2;
			}
			
			int cn = getCustomerNumber();
			int pn = getPinNumber();
			if(data.containsKey(cn) && data.get(cn) == pn){
				getAccountType();
			}else
				System.out.println("\n" +"Wrong cus no. or pin number"+"\n");
			
		  }while(x==1);
	}

	public void getAccountType()
	{
		System.out.println("Select the account type you wan to access");
		System.out.println("Checking Account ");
		System.out.println("Saving Account");
		System.out.println("Exit ");
		
		int selection = menuInput.nextInt();
		
		switch(selection)
		{
		case 1:
			getChecking();
			break;
			
		case 2:
			getSaving();
			break;
			
		case 3:
			System.out.println("thankyou for using this account, Bye \n");
			break;
			
		default:
		System.out.println("\n" + "Invalid choice." +" \n");
		
		getAccountType();
		}
	}
	
	public void getChecking()
	{
		System.out.println("Checking Account");
		System.out.println("Type 1 : view balance");
		System.out.println("Type 2 : withdraw ");
		System.out.println("Type 3 : deposit ");
		System.out.println("choice ");
		 
		int selection = menuInput.nextInt();
		
		switch(selection)
		{
		case 1 : 
			System.out.println("Checking account balance" + moneyFormat.format(getCheckingBalance()));
			getAccountType();	
		break;
		
		case 2:
			getCheckingWithdrawInput();	
			getAccountType();	
			break;
			
		case 3:
			getCheckingDepositInput();
			getAccountType();	
			break;
			
		case 4 :
			System.out.println("Thankyou for using this atm");
			break;
			
		default :
			System.out.println("\n" + "invalid choice" + "\n");
			getChecking();
		}
			
	}

	public void getSaving()
	{
		System.out.println("Saving Account");
		System.out.println("Type 1 : view balance");
		System.out.println("Type 2 : withdraw ");
		System.out.println("Type 3 : deposit ");
		System.out.println("choice ");
		 
		int selection = menuInput.nextInt();
		
		switch(selection)
		{
		case 1 : 
			System.out.println("Saving account balance" + moneyFormat.format(getSavingBalance()));
			getAccountType();	
		break;
		
		case 2:
			getSavingWithdrawInput();	
			getAccountType();	
			break;
			
		case 3:
			getSavingDepositInput();
			getAccountType();	
			break;
			
		case 4 :
			System.out.println("Thankyou for using this atm");
			break;
		
		default :
			System.out.println("\n" + "invalid choice" + "\n");
			getSaving();
			
	    }
		
   }
	
                        }                   

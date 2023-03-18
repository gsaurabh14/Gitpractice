package ProjectAtm;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
 
	private int customerNumber;
    private int pinNumber;	
    private double checkingBalance = 0;
    private double savingBalance = 0;
    
    Scanner input = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat(" '$',###,##0.00");
    
	public int getCustomerNumber() {
		return customerNumber;
	}
	
	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}

	public int getPinNumber() {
		return pinNumber;
	}
	
	public void setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
	}

	public double getCheckingBalance() {
		return checkingBalance;
	}
	
	public void setCheckingBalance(double checkingBalance) {
		this.checkingBalance = checkingBalance;
	}

	public double getSavingBalance() {
		return savingBalance;
	}
	
	public void setSavingBalance(double savingBalance) {
		this.savingBalance = savingBalance;
	}
    
    public double calcCheckingWithdraw(double amount){
    	checkingBalance = (checkingBalance-amount);
    	return checkingBalance;
    }
	
    public double calcSavingWithdraw(double amount){
    	savingBalance = (savingBalance-amount);
    	return savingBalance;
    }
    
    public double calcCheckingDeposit(double amount){
    	checkingBalance = (checkingBalance+amount);
    	return checkingBalance;
    }
    
    public double calcSavingDeposit(double amount){
    	savingBalance = (savingBalance+amount);
    	return savingBalance;
    }
    System.out.println("Balance ");
    System.out.println("Balance3 ");
    System.out.println("Balance2 ");
    public void getCheckingWithdrawInput()
    {
    	
    	System.out.println("Checking Account Balance " + moneyFormat.format(checkingBalance));
    	System.out.println("Amount you want to withdraw from checking account ");
    	
    	double amount = input.nextDouble();
    	
    	if((checkingBalance - amount) >= 0){
    		calcCheckingWithdraw(amount);
    		System.out.println("New System balance" + moneyFormat.format(checkingBalance));
    	}else{
    		System.out.println("Balance cannot be negative"+"\n");
    	}
    }
    
    public void getSavingWithdrawInput()
    {
    	
    	System.out.println("Saving Account Balance " + moneyFormat.format(savingBalance));
    	System.out.println("Amount you want to withdraw from saving account ");
    	
    	double amount = input.nextDouble();
    	
    	if((savingBalance - amount>=0))
    	{
    		calcSavingWithdraw(amount);
    		System.out.println("New System balance" + moneyFormat.format(savingBalance));
    	}else{
    		System.out.println("Balance cannot be negative"+ "\n");
    		
    	}
    }
	
	public void getCheckingDepositInput()
	{
		System.out.println("Saving Account Balance " + moneyFormat.format(checkingBalance));
    	System.out.println("Amount you want to deposit to checking account ");
    	
    	double amount = input.nextDouble();
    	
    	if((checkingBalance + amount>=0))
    	{
    		calcCheckingWithdraw(amount);
    		System.out.println("New System balance" + moneyFormat.format(checkingBalance));
    	}else{
    		System.out.println("Balance cannot be negative" + "\n");
    		
    	}
	}
	
	public void getSavingDepositInput()
	{
		System.out.println("Saving Account Balance " + moneyFormat.format(savingBalance));
    	System.out.println("Amount you want to deposit to saving account ");
    	
    	double amount = input.nextDouble();
    	
    	if((savingBalance + amount>=0))
    	{
    		calcSavingWithdraw(amount);
    		System.out.println("New System balance" + moneyFormat.format(savingBalance));
    	}else{
    		System.out.println("Balance cannot be negative"+"\n");
    		
    	}
	}
	
	
		
	
}

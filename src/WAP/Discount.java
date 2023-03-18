package WAP;

import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		int pro = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the price");
		int price = sc.nextInt();
        pro = Discount.discountMethod(price);
        System.out.println("total price of the product after discount"+" "+ pro);
	}
	
	static int discountMethod(int pri){
		int rs = 0;
		if(pri>=500){
		rs = pri-((pri*10)/100);
		}
		else
		rs = pri- ((pri*20)/100);
		return rs;
		
	}

}

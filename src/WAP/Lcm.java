package WAP;

import java.util.Scanner;

public class Lcm {

	public static void main(String[] args) {
		
Scanner sc =new Scanner(System.in);
int ans;
System.out.println("enter the first no.");
int a= sc.nextInt();
System.out.println("enter the second no.");
int b = sc.nextInt();
Lcm l = new Lcm();
ans = l.find(a, b);
System.out.println("lcm of two numbers is"+" "+ ans);
sc.close();

	}
 int find(int x, int y){
	int res =0; int i =2;int temp;
	if(x>y)
		res = x;
	else 
		res=y;
	temp = res;
	while(res%x!=0 || res%y!=0)
	{
		res = temp*i;
		i++ ;
	}
	return res;
 }
}

package java_logical_problems;
import java.util.*;
public class MonthlyPayment {
public static void main(String[] args) {
	System.out.println("Program for monthly payment of loan that compounded annually");
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Priniciple amount:");
	int P=sc.nextInt();
	System.out.println("Enter the No.of Years to payoff:");
	int Y=sc.nextInt();
	System.out.println("Enter the Rate of Interest:");
	int R=sc.nextInt();
	int n=12*Y;
	double r=R/(12*100);
	double pay=P*r/(1-Math.pow(1+r,-n));
	System.out.println("Monthly payment to payoff loan is "+pay);
}
}
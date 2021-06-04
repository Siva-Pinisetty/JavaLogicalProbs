package java_logical_problems;
import java.util.*;
public class SqrtNewton {
public static void main(String[] args) {
	System.out.println("Program to find the Square root of a number");
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number to find sqrt:");
	int c=sc.nextInt();
	double t=c;
	double epsilon = 1e-15;
	while ((double) Math.abs(t-c/t) > epsilon*t )
	{	
		t=(double) (t+c/t)/2;
	}
	System.out.println("Square root of "+c+" is "+t);
}
}

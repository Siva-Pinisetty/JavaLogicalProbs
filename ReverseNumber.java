package java_logical_problems;
import java.util.*;
public class ReverseNumber {
public static void main(String[] args) {
	System.out.println("Program for Reversing a Number");
	Scanner sc = new Scanner(System.in);		
	System.out.println("Enter a Number to find reverse: ");
	int nmb = sc.nextInt();
	int rev=0;
	while(nmb != 0)
	{
		int rmd=nmb%10;
		rev=rev*10+rmd;
		nmb /= 10;
	}
	System.out.println("the reverse of number is "+rev);
}
}

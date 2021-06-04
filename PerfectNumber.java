package java_logical_problems;
import java.util.*;
public class PerfectNumber {
public static void main(String[] args) {
	System.out.println("Program for checking Perfect Number");
	Scanner sc = new Scanner(System.in);		
	System.out.println("Enter a number to check for perfect: ");
	int nmb = sc.nextInt();
	int sum=0;
	for(int i=1;i<nmb;i++)
	{
		if(nmb%i==0) sum+=i;
	}
	if(sum==nmb) System.out.println("Given number is Perfect number");
	else System.out.println("Given number is not Perfect number");
}
}

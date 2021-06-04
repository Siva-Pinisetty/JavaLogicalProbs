package java_logical_problems;
import java.util.*;
public class PrimeNumber {
public static void main(String[] args) {
	System.out.println("Program for to check Prime or not");
	Scanner sc = new Scanner(System.in);		
	System.out.println("Enter a number to check for prime: ");
	int nmb = sc.nextInt();
	int k=0;
	if(nmb<=0||nmb==1) System.out.println(nmb+"is not a prime number");
	else
	{for(int i=2;i<nmb;i++)
		{
			if(nmb%i==0) k=1;break;
		}
	}
	if(k==0) System.out.println(nmb+" is a prime");
	else System.out.println(nmb+" is not prime");
}
}

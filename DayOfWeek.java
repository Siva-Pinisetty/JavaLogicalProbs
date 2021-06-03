package java_logical_problems;
import java.util.*;
public class DayOfWeek {
	public static void main(String[] args) {
		System.out.println("Program to find a week day with given date");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the date of the month ");
		int d=sc.nextInt();
		System.out.println("Enter the month in value");
		int m=sc.nextInt();
		System.out.println("Enter the Year");
		int y=sc.nextInt();
		int Y=y-(14-m)/12;
		int x=Y+Y/4-Y/100-Y/400;
		int M=m+12*((14-m)/12)-2;
		int D=(d+x+31*M/12)%7;
		switch (D) {
		case 0: System.out.println("Sunday");
		break;
		case 1: System.out.println("Monday");
		break;
		case 2: System.out.println("Tuesday");
		break;
		case 3: System.out.println("Wednesday");
		break;
		case 4: System.out.println("Thursday");
		break;
		case 5: System.out.println("Friday");
		break;
		case 6: System.out.println("Saturday");
		}
}
}
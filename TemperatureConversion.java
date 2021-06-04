package java_logical_problems;
import java.util.*;
public class TemperatureConversion {
public static void main(String[] args) {
	System.out.println("Program for Unit conversion of degF to  degC and vice-versa");
	Scanner sc = new Scanner(System.in);
	System.out.println("1.Celsius to Fahrenheit\n2.Fahrenheit to Celsius\nChoose the conversion from above: ");
	int nmb=sc.nextInt();
	switch (nmb) {
	case 1: System.out.println("Enter the value of Celsius: ");
			int C=sc.nextInt();
			degC_degF(C);
			break;
	case 2: System.out.println("Enter the value of Fahrenheit ");
			int F=sc.nextInt();
			degF_degC(F);
	}
}
	public static void degC_degF(int temp) {
		double F=(double)(temp*9/5)+32;
		System.out.println(temp+" Celsius in Fahrenheit is "+F);
		}
	public static void degF_degC(int temp) {
		double C=(double)(temp-32)*5/9;
		System.out.println(temp+" Fahrenheit in Celsius is "+C);
		}
}

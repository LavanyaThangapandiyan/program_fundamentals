package fundamentals;
import java.util.Scanner;
public class Employee 
{
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee's name :");
		String name=sc.nextLine();
		System.out.println("Enter number of hours worked in a week:");
	    double hour=sc.nextDouble();
		System.out.println("Enter hourly pay rate: ");
		double payrate=sc.nextDouble();
		System.out.println("Enter federal tax withholding rate:");
		double federaltax=sc.nextDouble();
		System.out.println("Enter state tax withholding rate :");
		double statetax=sc.nextDouble();
		
		double grosspay,federal,state,total,netpay;
		System.out.println("Employee Name: "+name);
		System.out.println("Hours Worked: "+hour);
		System.out.println("Pay Rate: $"+payrate);
		System.out.println("Gross Pay: $"+(grosspay=hour*payrate));
		System.out.println("Deduction:");
		System.out.println("Federal Withholding(20.0%): $"+( federal=grosspay*federaltax ));
		System.out.println("State Withholding (9.0%): $"+(state=grosspay*statetax));
		System.out.println("Total Deduction: $"+(total=federal+state));
	    System.out.println("Net Pay:"+(netpay=grosspay-total));
	
	}
	
	

}

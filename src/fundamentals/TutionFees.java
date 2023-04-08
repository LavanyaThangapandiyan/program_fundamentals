package fundamentals;

public class TutionFees 
{

	public static void main(String[] args) 
	{
		int amount=10000;
		int totalCost=0;
		for(int year=1; year<=14; year++)
		{
			amount+=amount*0.05;
		if(year==10)
		{
			System.out.println("The tution in 10 years is $" +amount);
		}
		if(year>10)
		{
			totalCost =totalCost+amount;
		}
		}
		System.out.println("The total cost of 4 years tution in 10 year is $"+totalCost);

	}

}

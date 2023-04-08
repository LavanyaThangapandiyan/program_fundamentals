package fundamentals;

public class Sales 
{
	public static void main(String[] args)
	{
		final double goal = 30000; 
		double salesAmount=0,commission,balance;										
		do 
		{	
			balance = commission = 0;	
			salesAmount += 0.01;			

			if (salesAmount > 10000)
				commission += (balance = salesAmount - 10000) * 0.12;

			if (salesAmount > 5000)
				commission += (balance -= balance - 5000) * 0.10;

			if (salesAmount > 0)
				commission += balance * 0.08;	
		}
		while (commission < goal);

		System.out.printf("Minimum sales to earn $30,000: $%.0f\n", salesAmount);
	}	
}


public class OddIntegers {
	
	public static void main(String[] args) {
		
		int number = 1;
		int product = number;
		
		while(number <= 15) 
		{
			
			if(number % 2 == 1)
			{
				product = product * number;
			}
			
			number++;
			
		}
		
		System.out.printf("Product of odd numbers 1-15: %d%n", product);
		
	}

}

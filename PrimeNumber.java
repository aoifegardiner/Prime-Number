
public class PrimeNumber {
	public static boolean isNumberPrime (int number)
	{
		for (int divisor=2; (divisor < number); divisor++)
		{
			if (number%divisor == 0)
				return false;
		}
		return true;
	}
	public static int[] getDivisors (int number)
	{
		int[] divisors = new int[10];
		int index = 0;
		for (int divisor = 2; divisor<=number; divisor++)
		{
			if (number%divisor==0)
			{
				index++;
				divisors[index] = divisor;
			}
		}
		
		return divisors;
	}
	public static void main(String[] args) {
		int number = 9;
		System.out.print("Enter a number: ");
		if (isNumberPrime( number ) == true)
		{
			System.out.println("Number is prime");
		}
		if (isNumberPrime( number ) == false)
		{
			System.out.print("Factors are " + getDivisors(number));
			int [] factors = getDivisors(number);
				for (int index = 0; index<factors.length; index++)
				{
					System.out.print(", " + factors[index]);
				}
		}
	}
}

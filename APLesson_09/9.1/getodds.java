public class getodds
{
	static int[] numbers = new int[10];
	public static void main(String[]args)
	{
		
		fillArray();
		printArray();
		getOdds();
	}
	
	public static void fillArray()
	{
		for(int i = 0; i < numbers.length; i++)
		{
			numbers[i] = (int)(Math.random()*100)+1;
		}
		
	}
	
	public static void printArray()
	{
		for(int num : numbers)
		{
			System.out.print(num + " ");
		}
	}
	
	public static void getOdds()
	{
		String odds = "";
		for(int num : numbers)
		{
			
			if (num % 2 == 1)
			{
				odds += num + " ";
			}
		}	
		System.out.println("\n" + odds);
		
	}
}
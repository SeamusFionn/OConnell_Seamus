import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class Compos
{
	public static void main(String[]args)
	{
		Integer [] numbers = {2,6,8,9,10,12,13,15,17,24,55,66,78,77,79};
		ArrayList<Integer> nums = new ArrayList<>(Arrays.aslist(numbers));
		
		System.out.println(nums);
	}
}
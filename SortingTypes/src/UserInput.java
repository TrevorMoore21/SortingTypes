import java.util.Scanner;


public class UserInput
	{

		public static void questions()
		{
			
			Scanner userStringInput = new Scanner(System.in);
			System.out.println("Hello User! How many times would you like to run this simulation?");
			int numRun = userStringInput.nextInt();
			
			System.out.println("How many integers would you like to sort through?");
			int numOfNum = userStringInput.nextInt();
			
			int[] elements = new int[numOfNum];
		
			
			for (int t : elements)
				{
					double doubleRando = Math.random() * 99;
					int rando = (int)doubleRando;
					t = rando;
				}
			
			
		}
		
		
		
	}

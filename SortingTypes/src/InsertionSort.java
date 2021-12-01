
public class InsertionSort
	{

		public static void insertionSort(int[ ] elements)
			{
				long start = System.nanoTime();

			 	for (int i = 1; i < elements.length; i++)
			 		{
			 			int temp = elements[i];
			 			int possibleIndex = i;
			 			while (possibleIndex > 0 && temp < elements[possibleIndex - 1])
			 				{
			 					elements[possibleIndex] = elements[possibleIndex - 1];
			 					possibleIndex--;
			 				}
			 			elements[possibleIndex] = temp;
			 		}
			 	
				 long end = System.nanoTime();
				 long elapsedTime = end - start;
				 System.out.println(elapsedTime);
			}
	}

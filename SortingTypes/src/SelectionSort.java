
public class SelectionSort
	{
		public static void selectionSort(int[] elements)
			{
			 for (int i = 0; i < elements.length - 1; i++)
			 	{
			 		int minIndex = i;
			 		for (int k = i + 1; k < elements.length; k++)
			 			{
			 				if (elements[k] < elements[minIndex])
			 					{
			 						minIndex = k;
			 					}
			 			}
			 		
			 		int precious = elements[i];
			 		elements[i] = elements[minIndex];
			 		elements[minIndex] = precious;
			 		}
			}

	}
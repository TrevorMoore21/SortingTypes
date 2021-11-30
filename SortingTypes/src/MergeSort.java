
public class MergeSort
	{

		private static void merge(int[] elements, int from, int mid, int to, int[] temp)
			{
				int i = from;
			 	int j = mid + 1;
			 	int k = from;
			 	while (i <= mid && j <= to)
			 		{
			 			if (elements[i] < elements[j])
			 				{
			 					temp[k] = elements[i];
			 					i++;
			 				}
			 			else
			 				{
			 					temp[k] = elements[j];
			 					j++;
			 				}
			 			k++;
			 		}

			 		while (i <= mid)
			 			{
			 				temp[k] = elements[i];
			 				i++;
			 				k++;
			 			}

			 		while (j <= to)
			 			{
			 				temp[k] = elements[j];
			 				j++;
			 				k++;
			 			}
			 		for (k = from; k <= to; k++)
			 			{
			 				elements[k] = temp[k];
			 			}
			}
	}

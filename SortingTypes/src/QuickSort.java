
public class QuickSort
	{

		
		
		static int [ ] qsort(int elements[])
			{
				 long start = System.nanoTime();
				 
				qs(elements, 0, elements.length - 1);
				 
				 long end = System.nanoTime();
				 long elapsedTime = end - start;
				 System.out.println(elapsedTime);
				return elements;
				
			}

		private static void qs(int elements[], int left, int right)
			{
				int i, j;
				int pivot, temp;
				i = left;
				j = right;
				pivot = elements [(left + right) / 2];
			
				do
					{
						while ((elements [i] < pivot) && (i < right))
							i++;
						
				while ((pivot < elements [j]) && (j > left))
					{
						j--;	
					}
					
				if (i <= j)
					{
						temp = elements [i];
						elements [i] = elements [j];
						elements [j] = temp;
						i++;
						j--;
					}
					}
				while (i <= j);
			
				if (left < j)
					qs (elements, left, j);
			
				if (i < right)
					qs (elements, i, right);
			}	
		}
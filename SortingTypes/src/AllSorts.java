import java.util.Scanner;

public class AllSorts
	{
		public static int[] elements;
		
		//asking the questions and fill array--> elements
		public static void questions()
			{
				
				Scanner userStringInput = new Scanner(System.in);
				System.out.println("Hello User! How many times would you like to run this simulation?");
				int numRun = userStringInput.nextInt();
				
				System.out.println("How many integers would you like to sort through?");
				int arraySize = userStringInput.nextInt();
				
				int[] elements = new int[arraySize];
			
				for (int t : elements)
					{
						double doubleRando = Math.random() * 99;
						int rando = (int)doubleRando;
						t = rando;
					}
				System.out.println(elements);
				
				System.out.println("Number of simulations: " + numRun);
				System.out.println("Array size: " + arraySize);
			}
		
		
		//selection sort
		public static void selectionSort()
			{
				
				long start = System.nanoTime();
		
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
			 
			 long end = System.nanoTime();
			 long elapsedTime = end - start;
			 System.out.println(elapsedTime);
			}
		
		//insertion sort
		public static void insertionSort()
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
		
		//quick sort
		static int [ ] qsort()
			{
				 long start = System.nanoTime();
				 
				qs(0, elements.length - 1);
				 
				 long end = System.nanoTime();
				 long elapsedTime = end - start;
				 System.out.println(elapsedTime);
				return elements;
				
			}

		private static void qs(int left, int right)
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
					qs (left, j);
			
				if (i < right)
					qs (i, right);
			}
		
		//merge sort
		private static void merge(int from, int mid, int to, int[] temp)
			{
				 long start = System.nanoTime();
				
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
			 		
					 long end = System.nanoTime();
					 long elapsedTime = end - start;
					 System.out.println(elapsedTime);
			}
		
		//bubble sort
		static void bubbleSort() 
			{  
				 long start = System.nanoTime();
				 
		       int n = elements.length;  
		       int temp = 0;  
		       for(int i=0; i < n; i++)
		    	   {  
		    		   for(int j=1; j < (n-i); j++)
		    			   {  
		    				   if(elements[j-1] > elements[j])
		    					   {  
		    						   temp = elements[j-1];  
		    						   elements[j-1] = elements[j];  
		    						   elements[j] = temp;  
		    					   }  
		                          
		    			   }  
		    	   }  
		  
				 long end = System.nanoTime();
				 long elapsedTime = end - start;
				 System.out.println(elapsedTime);
			}  
		
		
		
	}

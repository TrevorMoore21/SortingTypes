import java.util.Scanner;

public class AllSorts
	{
		public static int[] selSort;
		public static int[] inSort;
		public static int[] qSort;
		public static int[] mergeSort;
		public static int[] bubSort;
		
		
		//asking the questions and fill array--> elements
		public static void questions()
			{
				
				Scanner userStringInput = new Scanner(System.in);
				System.out.println("Hello User! How many times would you like to run this simulation?");
				int numRun = userStringInput.nextInt();
				
				System.out.println("How many integers would you like to sort through?");
				int arraySize = userStringInput.nextInt();
				
//				int[] elements = new int[arraySize];
				
				 selSort = new int[arraySize];
				 inSort = new int[arraySize];
				 qSort = new int[arraySize];
				 mergeSort = new int[arraySize];
				 bubSort = new int[arraySize];
			
//			for (int i = 0; i < elements.length; i++)
//					{
//					double doubleRando = Math.random() * 99;
//						int rando = (int)doubleRando;
//						elements[i] = rando;
//					}
			
			for (int j = 0; j <= arraySize; j++)
				{
					double doubleRando = Math.random() * 99;
					int rando = (int)doubleRando;
//					t = rando;
					
					for (int s : selSort)
						{
							s = rando;
						}
					for (int i : inSort)
						{
							i = rando;
						}
					for (int q : qSort)
						{
							q = rando;
						}
					for (int m : mergeSort)
						{
							m = rando;
						}
					for (int b : bubSort)
						{
							b = rando;
						}
				}
				
				//System.out.println("length==" + selSort.length);
				System.out.println("Number of simulations: " + numRun);
				System.out.println("Array size: " + arraySize);
			}
		
		
		//selection sort
		public static void selectionSort(int[] selSort)
			{
				
				double start = System.nanoTime();
		
			 for (int i = 0; i < selSort.length - 1; i++)
			 	{
			 		int minIndex = i;
			 		for (int k = i + 1; k < selSort.length; k++)
			 			{
			 				if (selSort[k] < selSort[minIndex])
			 					{
			 						minIndex = k;
			 					}
			 			}
			 		
			 		int precious = selSort[i];
			 		selSort[i] = selSort[minIndex];
			 		selSort[minIndex] = precious;
			 		}
			 
			 double end = System.nanoTime();
			 double elapsedTime = (end - start) / 1000000;
			 System.out.println("Selection Sort run time:              " + elapsedTime);
			}
		
		//insertion sort
		public static void insertionSort(int[] inSort)
			{
				double start = System.nanoTime();

			 	for (int i = 1; i < inSort.length; i++)
			 		{
			 			int temp = inSort[i];
			 			int possibleIndex = i;
			 			while (possibleIndex > 0 && temp < inSort[possibleIndex - 1])
			 				{
			 					inSort[possibleIndex] = inSort[possibleIndex - 1];
			 					possibleIndex--;
			 				}
			 			inSort[possibleIndex] = temp;
			 		}
			 	
			 	double end = System.nanoTime();
			 	double elapsedTime = (end - start) / 1000000;
				 System.out.println("Insertion Sort run time:              " + elapsedTime);
			}
		
		//quick sort
		static int [ ] qsort(int[] qSort)
			{
				double start = System.nanoTime();
				 
				qs(0, qSort.length - 1);
				 
				double end = System.nanoTime();
				double elapsedTime = (end - start) / 1000000;
				 System.out.println("Quick Sort run time:                  " + elapsedTime);
				return qSort;
				
			}

		private static void qs(int left, int right)
			{
				int i, j;
				int pivot, temp;
				i = left;
				j = right;
				pivot = qSort [(left + right) / 2];
			
				do
					{
						while ((qSort [i] < pivot) && (i < right))
							i++;
						
				while ((pivot < qSort [j]) && (j > left))
					{
						j--;	
					}
					
				if (i <= j)
					{
						temp = qSort [i];
						qSort [i] = qSort [j];
						qSort [j] = temp;
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
		private static void merge(int[] mergeSort, int from, int mid, int to, int[] temp)
			{
				double start = System.nanoTime();
				
				 int i = from;
				 	int j = mid + 1;
				 	int k = from;
				 	while (i <= mid && j <= to)
				 		{
				 		if (mergeSort[i] < mergeSort[j])
				 	{
				 temp[k] = mergeSort[i];
				 i++;
				 }
				 		else
				{
				 			temp[k] = mergeSort[j];
				 j++;
				 }
				 k++;
				 		}

				 while (i <= mid)
				 		{
				 		temp[k] = mergeSort[i];
				 i++;
				 k++;
				 }

				 while (j <= to)
				 {
				 temp[k] = mergeSort[j];
				 j++;
				 k++;
				 }
				 	for (k = from; k <= to; k++)
				 		{
				 			mergeSort[k] = temp[k];
				 }

				 	double end = System.nanoTime();
				 	double elapsedTime = (end - start) / 1000000;
					 System.out.println("Merge Sort run time:              " + elapsedTime);
			}
		
		//bubble sort
		static void bubbleSort(int[] bubSort) 
			{  
				double start = System.nanoTime();
				 
		       int n = bubSort.length;  
		       int temp = 0;  
		       for(int i=0; i < n; i++)
		    	   {  
		    		   for(int j=1; j < (n-i); j++)
		    			   {  
		    				   if(bubSort[j-1] > bubSort[j])
		    					   {  
		    						   temp = bubSort[j-1];  
		    						   bubSort[j-1] = bubSort[j];  
		    						   bubSort[j] = temp;  
		    					   }  
		                          
		    			   }  
		    	   }  
		  
		       double end = System.nanoTime();
		       double elapsedTime = (end - start) / 1000000;
				 System.out.println("Bubble Sort run time:                 " + elapsedTime);
			}  
		
		
		
	}

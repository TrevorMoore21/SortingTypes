import java.util.ArrayList;
import java.util.Scanner;


public class AllSorts
	{
		public static int[] selSort;
		public static int[] inSort;
		public static int[] qSort;
		public static int[] mergeSort;
		public static int[] bubSort;
		public static int arraySize;
		
		public static ArrayList<FinalTimes> time = new ArrayList<FinalTimes>();
		
		//asking the questions and fill array--> elements
		public static void questions()
			{
				
				Scanner userStringInput = new Scanner(System.in);
				System.out.println("Hello User! How many times would you like to run this simulation?");
				int numRun = userStringInput.nextInt();
				
				System.out.println("How many integers would you like to sort through?");
				 arraySize = userStringInput.nextInt();
				
				 selSort = new int[arraySize];
				 inSort = new int[arraySize];
				 qSort = new int[arraySize];
				 mergeSort = new int[arraySize];
				 bubSort = new int[arraySize];
			
			for (int j = 0; j <= arraySize; j++)
				{
					double doubleRando = Math.random() * 99;
					int rando = (int)doubleRando;
					
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
			 time.add(new FinalTimes("Selection Sort", elapsedTime));
			 //System.out.println("Selection Sort run time:              " + elapsedTime);
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
			 	time.add(new FinalTimes("Insertion Sort", elapsedTime));
				// System.out.println("Insertion Sort run time:              " + elapsedTime);
			}
		
		//quick sort
		static int [ ] qsort(int[] qSort)
			{
				double start = System.nanoTime();
				 
				qs(0, qSort.length - 1);
				 
				double end = System.nanoTime();
				double elapsedTime = (end - start) / 1000000;
				time.add(new FinalTimes("Quick Sort", elapsedTime));
				// System.out.println("Quick Sort run time:                  " + elapsedTime);
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
		static void merge(int[] mergeSort, int arraySize)
			{
				//double start = System.nanoTime();
				
				if (arraySize < 2)
					{
						return;
					}

				int mid = arraySize / 2;
				int[] left_mergeSort = new int[mid];
				int[] right_mergeSort = new int[arraySize - mid];

				// Dividing array into two and copying into two separate arrays
				int k = 0;
				for (int i = 0; i < arraySize; ++i)
					{
						if (i < mid)
							{
								left_mergeSort[i] = mergeSort[i];
							} 
						else
							{
								right_mergeSort[k] = mergeSort[i];
								k = k + 1;
							}
					}
				// Recursively calling the function to divide the subarrays further
				merge(left_mergeSort, mid);
				merge(right_mergeSort, arraySize - mid);
				// Calling the merge method on each subdivision
				merge(left_mergeSort, mid);
			
//				 	double end = System.nanoTime();
//				 	double elapsedTime = (end - start) / 1000000;
//				 	time.add(new FinalTimes("Merge Sort", elapsedTime));
					 //System.out.println("Merge Sort run time:              " + elapsedTime);
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
		       time.add(new FinalTimes("Bubble Sort", elapsedTime));
				// System.out.println("Bubble Sort run time:                 " + elapsedTime);
			}  
		
		
		
	}

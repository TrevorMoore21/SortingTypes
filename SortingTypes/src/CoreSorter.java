import java.util.Collections;

public class CoreSorter
	{

	
		public static void main(String[] args)
			{
				AllSorts.questions();
				AllSorts.selectionSort(AllSorts.selSort);
				AllSorts.insertionSort(AllSorts.inSort);
				AllSorts.qsort(AllSorts.qSort);
				
					double start = System.nanoTime();
				AllSorts.merge(AllSorts.mergeSort, AllSorts.mergeSort.length);
					double end = System.nanoTime();
					double elapsedTime = (end - start) / 1000000;
					AllSorts.time.add(new FinalTimes("Merge Sort", elapsedTime));
				
				AllSorts.bubbleSort(AllSorts.bubSort);
				PrintSorted.lastPrint();
				
				
				
				
				
				
				
				
				
				
				//UserInput.questions();
//				SelectionSort.selectionSort(int[] elements);
//				InsertionSort.insertionSort(int[] elements);
//				MergeSort.merge(int[] elements, int from, int mid, int to, int[] temp);
//				QuickSort.static int [ ] qsort(int elements[]);
//				BubbleSort.bubbleSort(int[] elements);
				
			}
		
	}

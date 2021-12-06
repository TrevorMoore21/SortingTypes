import java.util.Collections;
import java.io.*;

public class PrintSorted
	{

		public static void lastPrint()
		{
			
			Collections.sort(AllSorts.time, new TimeSorter());
			
			for (FinalTimes t: AllSorts.time)
				{
					System.out.printf("%-30s\n", t.getSortName() + "\t" + t.getFinalTime());
				}
		}
		
		
	}

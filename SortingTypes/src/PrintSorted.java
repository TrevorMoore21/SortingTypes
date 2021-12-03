import java.util.Collections;

public class PrintSorted
	{

		public static void lastPrint()
		{
			
			Collections.sort(AllSorts.time, new TimeSorter());
			for (FinalTimes t: AllSorts.time)
				{
					System.out.println(t.getSortName() + "   " + t.getFinalTime());
				}
		}
		
		
	}

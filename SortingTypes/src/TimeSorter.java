import java.util.Collections;
import java.util.Comparator;

public class TimeSorter implements Comparator<FinalTimes>
	{

		public int compare (FinalTimes t1, FinalTimes t2)
		{
			if(t1.getFinalTime() > t2.getFinalTime())
				{
					return 1;
				}
			else
				{
					return -1;
				}
			
		}
		
		
	}

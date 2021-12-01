
public class BubbleSort
	{
		static void bubbleSort(int[] elements) 
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

import java.util.Arrays;

//Lingli Zou
//2/16/2018
//Lab 3.23 - Final Sorts

public class ArrayMethods3 {
	
	public static String[] mergeSort(String[] list)
	{
		if(list.length==1)
		{
			return list;
		}
		
		String[] left= Arrays.copyOfRange(list, 0, list.length/2);
		String[] right= Arrays.copyOfRange(list, list.length/2, list.length);
		
		
		return(merge(mergeSort(left), mergeSort(right))));
		//return the sorted string array
	}
	
	public static int partition(int[] list1, int front, int back)
	{
		
		
		
		//return the position of the pivot
	}
	
	public static void quickSort(int[] list1, int front, int back)
	{
		
	}
}

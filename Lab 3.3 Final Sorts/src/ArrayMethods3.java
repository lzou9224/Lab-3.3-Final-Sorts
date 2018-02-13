import java.util.Arrays;

//Lingli Zou
//2/16/2018
//Lab 3.23 - Final Sorts

public class ArrayMethods3 {
	
	public static String[] merge(String[] list1, String[] list2)
	{
		//precondition: both list1 and list2 contains Strings in alphabetical order from a to z 
		int left=0; 
		int right=0; 
		int t=0;
		String[] total= new String[list1.length+list2.length];

		while(left<list1.length && right<list2.length)
		{
			if(list1[left].compareTo(list2[right])>=0)
			{
				total[t]=list2[right];
				right++;
				t++;
			}
			else if(list1[left].compareTo(list2[right])<0)
			{
				total[t]=list1[left];
				left++;
				t++;
			}
		}		
		
		while(left<list1.length)
		{
			total[t]=list1[left];
			left++;
			t++;
		}

		while(right<list2.length)
		{
			total[t]=list2[right];
			right++;
			t++;
		}
		
		//returns an array of the two lists merged together
		return total;	
	}
	
	
	public static String[] mergeSort(String[] list)
	{
		if(list.length==1)
		{
			return list;
		}
		
		String[] left= Arrays.copyOfRange(list, 0, list.length/2);
		String[] right= Arrays.copyOfRange(list, list.length/2, list.length);
		
		//return the sorted string array
		return(merge(mergeSort(left), mergeSort(right)));
	}
	
	public static int partition(int[] list1, int front, int back)
	{
		
		
		
		//return the position of the pivot
	}
	
	public static void quickSort(int[] list1, int front, int back)
	{
		
	}
}

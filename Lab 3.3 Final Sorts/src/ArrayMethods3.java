import java.util.Arrays;

//Lingli Zou
//2/16/2018
//Lab 3.23 - Final Sorts

public class ArrayMethods3 {
	
	public static void main(String[] args)
	{
		//testing arrays
		String[] test1 = {"apple", "cucumber", "microsoft", "zorro"};
		String[] test2 = {"banana", "cherry", "mahogany", "oreos", "pinata"};
		int[] test3 = {3,4,2,7,1};
		
		//merge test
		long start= System.nanoTime();
		String[] mergeResult= merge(test1, test2);
		long end= System.nanoTime();
		long time = end - start;
		System.out.println("Merge test took : " + time + " nanoseconds");
		System.out.println(Arrays.toString(mergeResult));
		
		start = System.nanoTime();
		int pivotFinalPos = partition(test3);
		end = System.nanoTime();
		time = end - start;
		System.out.println("Partition test took : " + time + " nanoseconds");
		System.out.println("Final Pivot Position: " + pivotFinalPos); 
		System.out.println(Arrays.toString(test3));
		
	
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
	
	public static int partition(int[] list, int front, int back)
	{
		
		int temp;

		
		while(front != back)
		{
			if(front < back)
			{
				if(list[front] < list[back])
				{
					back--;
				}
			
				if(list[back] <= list[front])
				{
					temp = list[front];
					list[front] = list[back];
					list[back] = temp;
					
					temp= back;
					back= front;
					front=temp;
					back++;
				}
			}
			
			else if(front > back)
			{
				if(list[front] > list[back])
				{
					back++;
				}
			
				if(list[back] > list[front])
				{
					temp = list[back];
					list[back] = list[front];
					list[front] = temp;
					
					temp=front;
					front= back;
					back=temp;
					back--;
					
				}
			}
		
	}		   
		//return the position of the pivot
		return front;

	}
	public static void quickSort(int[] list1, int front, int back)
	{
		if(back > front)
		{
			int pivotPos = partition(list1, front, back);
					
			//left side
			quickSort(list1, front, pivotPos-1);
			
			//right side
			quickSort(list1, pivotPos+1, back);
		}
	}
}

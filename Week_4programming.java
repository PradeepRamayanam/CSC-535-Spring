
public class Week_4programming 
{
	public static void main(String[] args)
	{
		int size=7;
		int[]values = new int[]{12345, 35, 627, 91, 1, 9999, 221};
		int lesser = 0;
		int greater = size-1;
		System.out.println("Numbers in the array Before Sorting");
		for (int i= 0; i<size; ++i)
		{
			System.out.println(values[i]);
		}
		divide(values, lesser, greater);
		
		System.out.println("Numbers in the array after Sorting");
		for (int i= 0; i<size; ++i)
		{
			System.out.println(values[i]);
		}
		
	
	}
	public static void divide(int[]array, int lesser, int greater )
	{
		if(lesser < greater)
		{
			int middle = (lesser + greater)/2;
			divide(array, lesser, middle);
			divide(array, middle+1, greater);
			mergesort(array, lesser, middle, greater);
			
		}
	}
	public static void mergesort(int[]array, int lesser, int middle, int greater)
	{
		int s = array.length;
		int[]temp = new int[s];
		for(int i = lesser; i <= greater; ++i)
		{
			temp[i] = array[i];
		}
		int a = lesser;
		int b = middle+1;
		int c = lesser;
		while(a <= middle && b <= greater)
		{
			if(temp[a] <= temp[b])
			{
				array[c]= temp[a];
				++a;
			}
			else
			{
				array[c]= temp[b];
				++b;
			}
			++c;
		}
		while (a<= middle)
		{
			array[c]=temp[a];
			++c;
			++a;
			
		}
	}
}
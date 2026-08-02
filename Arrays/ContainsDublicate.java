import java.util.HashMap;
class ContainsDublicate {
	static boolean isdublicate(int[] arr)
	{
		HashMap<Integer,Integer> map = new HashMap<>();
	
		for(int i=0; i<arr.length; i++)
		{
			//check arr[i] is avialble inside the hashmap as a key or not
			if(map.containsKey(arr[i]))
			{
				return true;
			}
			else {
				map.put(arr[i],i);
			}
		}
		return false;
	}
	public static void main(String[] args)
	{
		//int[] arr= {4, 5, 6, 4};
		int[] arr= {1, 2, 3, 4};
		boolean result= isdublicate(arr);
		System.out.println(result);
	}
}
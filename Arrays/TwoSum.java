import java.util.HashMap;
class TwoSum {
	static void findthetwosum(int[] arr, int target)
	{
		HashMap<Integer,Integer> map= new HashMap<>();
		
		for(int i=0; i<arr.length; i++)
		{
			int req=target-arr[i];
			if(map.containsKey(req))
			{
           System.out.println(map.get(req + " " +i));
				System.out.println(map.get(req) + " " +i);
			}
			else {
				map.put(arr[i],i);
			}
		}
	
	}
	public static void main(String[] args)
	{
		int[] arr={2,7,11,15};
		findthetwosum(arr,9);
	}
}
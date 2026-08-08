class BinarySearch {
	static int search(int[] arr, int target)
	{
		int start=0;
		int end=arr.length-1;
		while(start<end)
		{
			int mid= start+(end-start)/2;
			
			//case:1
			if(arr[mid]<target)
			{
				start = mid+1;
			}
			else if(arr[mid]>target)
			{
				end = mid-1;
			}
			else {
				return mid;
			}
		}
		return -1;
		
		
	}
	public static void main(String[] args)
	{
		int[] arr= {-1,0,3,5,9,12};
		//int result=search(arr,9);
		int result= search(arr,2);
		System.out.println(result);
	}
}
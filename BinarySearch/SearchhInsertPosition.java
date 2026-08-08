class SearchhInsertPosition {
	static int search(int[] arr,int target)
	{
		int start=0;
		int end= arr.length-1;
		while(start<end)
		{
			int mid=start+(end-start)/2;
			
			//Case:1
			if(arr[mid]<target)
			{
				start= mid+1;
			}
			else if(arr[mid]>=target)
			{
				return mid;
			}
		}
		return arr.length;
	}
	public static void main(String[] args)
	{
		int[] arr ={1,3,5,6};
		int result= search(arr,7);
//		System.out.println(result,5);
		System.out.println(result);
	}
}
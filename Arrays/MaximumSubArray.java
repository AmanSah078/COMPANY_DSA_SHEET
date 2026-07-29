class Max_Sub_Array {
	static void findthemaxarray(int[] arr)
	{
		int curr=0;
		int max=0;
		for(int i=0; i<arr.length; i++)
		{
			if(curr>0)
			{
				curr=curr+arr[i];
			}
			else {
				curr=arr[i];
			}
			if(curr>max)
			{
				max=curr;
			}
		}
		System.out.println(max);
	}
	public static void main(String[] args)
	{
		//int[] arr={5,4,-1,7,8};
		int[] arr={-2,1,-3,4,-1,2,1,-5,4};
		findthemaxarray(arr);
	}
}

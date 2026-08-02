import java.util.Arrays;
class MissingValues {
	static int missingvalues(int[] arr)
	{
//		int index=-1;
		for(int i=0;i<arr.length-1;i++)
{
			if(arr[i]+1!=arr[i+1])
			{
				return arr[i]+1;
			}
		}
     // Missing at the end
        return arr[arr.length - 1] + 1;
	}
	public static void main(String[] args)
	{
		//int[] arr ={3,0,1};
		int[] arr= {0,1};
		Arrays.sort(arr);
		int result= missingvalues(arr);
		System.out.println(result);
	}
}
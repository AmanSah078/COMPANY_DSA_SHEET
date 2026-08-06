class FindFirstOccurance {
	static int firstoccurance(String haystack, String needle)
	{
		//we should first find the index?
		
		for(int i=0; i<haystack.length()-needle.length(); i++)
		{
			//if true then directly it will go where? to return i
			
			boolean found= true;
		//Now to use the Outer loop for the 2nd loop
			for(int j=0; j<needle.length(); j++)
			{  
				if(haystack.charAt(i + j)!=needle.charAt(j))
				{
					 found = false;
					break;
				}
			}
			
			if(found)
			{
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args)
	{
		String haystack="sadbutsad";
		String needle= "sad";
		int result= firstoccurance(haystack,needle);
		System.out.println(result);
	}
}
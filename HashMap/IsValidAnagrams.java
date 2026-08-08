class IsValidAnagrams {
	static boolean isvalid(String str, String tsr)
	{
		//for the freq
		int[]arr= new int[26];
		//Let's find the freq of the char of the 1st string
		for(int i=0; i<str.length(); i++)
		{
			char ch= str.charAt(i);
			arr[ch-'a']++;
		}
		//Let's find the freq of char of the 2nd String
		for(int j=0; j<tsr.length(); j++)
		{
			char ch1= tsr.charAt(j);
			arr[ch1-'a']--;
		}
			for(int i=0; i<26; i++)
			{
				if(arr[i]!=0)
				{
					return false;
				}
			}
		return true;
		
		}
	
	public static void main(String[] args)
	{
		String str= "anagram";
		String tsr= "nagaram";
//		String str= "cat";
//		String tsr= "rat";
		boolean result = isvalid(str,tsr);
		System.out.println(result);
	}
}
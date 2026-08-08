import java.util.HashMap;
class ValidAnagrams {
	static boolean isvalidanagrams(String s1,String s2)
	{
		HashMap<Character,Integer> map = new HashMap<>();
		
		//Let's see the 1st loop
		for(int i=0; i<s1.length(); i++)
		{
		 //need to convert in to the char-> I think yes dude
			char ch1= s1.charAt(i);
			map.put(ch1,i);
		
		//Let's verify
		for(int j=0; j<s2.length(); j++)
		{
			char ch2=s2.charAt(j);
			if(ch1.equals(ch2))
			{
				return true;
			}
		}
		}
		return false;
	}
	public static void main(String[] args)
	{
//		String s1= "anagram";
//		String s2= "nagarami";
		String s1= "cat";
		String s2= "rat";
		boolean result = isvalidanagrams(s1,s2);
		System.out.println(result);
	}
}
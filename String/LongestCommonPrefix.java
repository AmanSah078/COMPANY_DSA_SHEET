import java.util.Arrays;
import java.util.List
class LongestCommonPrefix {
	static String prefixcommon(String[] str)
	{
		List<String> list= Arrays.asList("flower","flask","fly");
		
		//1.To find the minlength
		int minlength= Integer.MAX_VALUE;
		
		//i need sbse smallest length ka string
		for(int i=0; i<str.length(); i++)
		{
			minlength= Math.min(minlength,list.get(i).length());
		}
		//2.To store the result i mean to store the new String 
		
		StringBuilder result= new StringBuilder();
		
		//3.To take outer loop for i=0 to minlength ->runs only once time
		for(int i=0; i<minlength; i++)
		{
			char current= list.get(0).charAt(i);
		
		//4.To take the inner loop for j=1 to minlength
	    for(int j=1; j<list.size(); j++)
		{
			
		//5.Now it's time to compare
			if(list.get(j).charAt(i)!=current)
			{
				return result.toString();
			}
		}
			
		result.append(current);
			
		}
		return result.toString();
			
		}
	public static void main(String[] args)
	{
		String[]str= {"flower","flask","fly"};
		String result= prefixcommon(str);
		System.out.println(result);
	}
	}

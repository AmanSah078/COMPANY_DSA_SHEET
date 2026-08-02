class Fiboancci_Number {
	static void findthefiboanncinum(int n)
	{
		int a=0; 
		int b=1;
		int fn=0;
		for(int i=2; i<=n; i++)
		{
			int c=a+b;
			fn=c;
			a=b;
			b=c;
		}
		System.out.println(fn);
	}
	public static void main(String[] args)
	{
		findthefiboanncinum(4);
	}
}
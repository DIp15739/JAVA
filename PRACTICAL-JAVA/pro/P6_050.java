class P6_050
{
	public static void main(String args[])
	{
		int a = 10;
		int b = 20;
		int c = 30;
		int result1, result2, result3;
		result1 = a>b?a:b;
		result2 = c>result1?c:result1;
		result3 = result2>result1?result1:result2;
		System.out.println(result3 + "is second maximum!!"); 
	}
}

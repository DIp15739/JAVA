class P5_050
{
	public static void main(String args[])
		{
			int a = 10;
			int b = 20;
			int c = 30;
			int result;
			int result2;
			result = a > b?a : b;
			result2 = c > result?c:result;
			System.out.println("greatest number is:" +result2);
		}
}

class P16_1_2_050
{
	public static void main(String args[])
	{
		// getChars Using Exception code view!!
		String s1 = "welcome world!!!!";
		char ch[] = new char[10];
		s1.getChars(6, 16, ch, 0);
		System.out.println(ch);
		try
		{
			s1.getChars(6, 16, ch, 0);
			System.out.println(ch);
		}
		catch(Exception ex)
		{
			System.out.print(ex);
		}
	}
}

class P16_1_3_050
{
	public static void main(String args[])
	{
		String s1 = "welcome world!!!!";
		char ch[] = new char[5];
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

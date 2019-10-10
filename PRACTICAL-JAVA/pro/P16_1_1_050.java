class P16_1_1_050
{
	public static void main(String args[])
	{
		// getChars using Simple code view!!
		String s1 = "welcome world!!!!";
		char ch[] = new char[10];
		s1.getChars(6, 16, ch, 0);
		System.out.println(ch);
}
}

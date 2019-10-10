class P4_050
{
	public static void main(String args[])
		{
			int i = 0;
			int j = 0;
			int a = 0;
			System.out.println("Prime numbers between 1 to 100 are:");
			for(i = 1; i <= 100; i++)
			{
				a = 0;
					for(j = 2; j <= i/2; j++)
					{
						if(i % j == 0)
						{
							a = 1;
							break;
						}
					}
				if(a == 0 && i != 1)
				{
				          System.out.println(i+ "");	
				}
			}
		}
}

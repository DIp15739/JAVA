class P8_050
{
	public static void main(String args[])
	{
		P8_050 a1 = new P8_050();
		a1.add(10, 20);
		a1.sub(20, 10);
		a1.mul(5, 2);
		a1.div(10, 2);
	}
	double add(double a, double b)
	{
		double c= a + b;
		System.out.println("addition is: "+c);
		return c;
	}
	double sub(double x, double y)
	{
		double z= x - y;
		System.out.println("Subtraction is:" +z);
		return z;
	}
	double mul(double m,  double n)
	{
		double o= m * n;
		System.out.println("multiplication is:" +o);
		return o;
	}
	double div(double e, double f)
	{
		double g= e/f;
		System.out.println("division is:" +g);
		return g;
	}
}

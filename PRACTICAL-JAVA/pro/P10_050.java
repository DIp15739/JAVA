class P10_050
{
public static void main(String args[])
{
int a[][] = new int[3][3];
a[0][0] = 1;
a[0][1] = 2;
a[0][2] = 3;
a[1][0] = 4;
a[1][1] = 5;
a[1][2] = 1;
a[2][0] = 2;
a[2][1] = 3;
a[2][2] = 4;
for(int i=0;i<a.length;i++)
{
for(int j=0;j<a.length;j++)
{
System.out.println("a["+i+"]["+j+"] = " +a[i][j]);	
}
}
System.out.println("");
int b[][] = new int[3][3];
b[0][0] = 1;
b[0][1] = 2;
b[0][2] = 3;
b[1][0] = 4;
b[1][1] = 5;
b[1][2] = 1;
b[2][0] = 2;
b[2][1] = 3;
b[2][2] = 4;
for(int i=0;i<b.length;i++)
{
for(int j=0;j<b.length;j++)
{
System.out.println("b["+i+"]["+j+"] = " +b[i][j]);
}
}
}
}

class P11_050
{
public static void main(String args[])
{
int a[][]=new int[3][3];
int b[][]=new int[3][3];
int c[][]=new int[3][3];
a[0][0]=1;
a[0][1]=2;
a[0][2]=3;
a[1][0]=4;
a[1][1]=5;
a[1][2]=1;
a[2][0]=2;
a[2][1]=3;
a[2][2]=4;

b[0][0]=1;
b[0][1]=2;
b[0][2]=3;
b[1][0]=4;
b[1][1]=5;
b[1][2]=1;
b[2][0]=2;
b[2][1]=3;
b[2][2]=4;
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
c[i][j] = 0;

for (int k = 0; k < 3; k++)
{
c[i][j] += a[i][k] * b[k][j];
}
System.out.print(c[i][j] + " ");
}
System.out.println();
}
}
}

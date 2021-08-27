public class decimalToBinary
{
public static void main(int a)
{
int r,bin=0,c=0;
while(a!=0)
{
r=a%2;
bin=(int)Math.pow(10,c)*r+bin;
a=a/2;c++;
}
System.out.print(bin);
}}

public class hcfeec
{int n=5;
int hcf(int a,int b)
{n--;
    if(n<=0)
    return 1;
    if(a%n==0&&b%n==0)
    {
    return n*hcf(a/2,b/2);
     }
    
    return hcf(a,b);
}
void display()
{
  System.out.print(  hcf(4,6));
    
}
}
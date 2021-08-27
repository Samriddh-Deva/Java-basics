public class r2
{
int fibo(int n1)
{
    if(n1==1)
    return 1;
    if(n1==2)
    return 1;
    return fibo(n1-1)+fibo(n1-2);
}
void main(int n)
{int i;
    r2 ob= new r2();
    for(i=1;i<=n;i++)
    {
        System.out.print(ob.fibo(i)+" ");
    }
}
}

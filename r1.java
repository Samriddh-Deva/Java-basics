public class r1
{
public static void main (int n)
{int s;
    r1 ob=new r1();
    s=ob.rec(n);
    System.out.print(ob.rec(n));
}
int rec(int n)
{
    
    if(n==1)
    return 1;
    return n+rec(n-1);
}
}

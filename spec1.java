public class spec1
{
int rec(int n)
{
    if(n==0)
    return 0;
    return (n%10)*(n%10)+rec(n/10);
}
}
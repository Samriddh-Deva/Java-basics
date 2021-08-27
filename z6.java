public class z6
{int c=3;
int reverse(int y)
{
    int r;
    r=y%10;
    if(y==0)
    return 0;
    return r*(int)Math.pow(10,--c)+reverse(y/10);
}
}

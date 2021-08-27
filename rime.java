public class rime
{
int is(int x,int y)
{
    if(y<x)
    {
        if(x%y==0)
        return 0;
       return is(x,y+1);
    }
    return 1;
}
}

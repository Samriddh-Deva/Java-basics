public class rec_rime
{
int r(int n,int y)
{
    if(y<n)
   {if(n%y==0)
       return 0;
       return r(n,y+1);
    }
    return 1;
}
}

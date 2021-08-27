public class pprimefac
{
    int r(int num,int q)
    {   if(num%q==0)
        { System.out.print(q+",");
            r(num/q,q);}
        else
        if(q<num)
            r( num,++q);
        return 0;
    }
}

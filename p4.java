public class p4
{
    public static void main(int n,int m)
    {
        
        int c,no,f=0,j,co,s,r=0,i;
      
       if(n<m)
       { for(i=n;i<=m;i++)
        {
            no=i;c=no;co=0;s=0;
            for(j=1;j<=no;j++)
            {if(no%j==0)
            co++;}
            
            while(c>9)
            {s=0;
                while(c!=0)
                {r=c%10;
                    s=s+r;
                    c=c/10;
                }c=s;
            }
            
            if(co!=2&&c==1)
            {System.out.print(i+" ");f++;}
        }System.out.println();
        System.out.print("total="+f);}
    
        else 
        {System.out.print("re try");}
    }
}

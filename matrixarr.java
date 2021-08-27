
public class matrixarr
{
public static void main(int l)
{
    int a[][]=new int[l][l];
    int i,ls=0,le=l-1,fg,j,c=1;
    System.out.println("Enter elements");
    if(l%2==0)
    fg=l/2;
    else
    fg=(l+1)/2;
    while(fg!=0)
    {
    for(i=ls;i<=le;i++)
    {if(a[ls][i]==0)
        a[ls][i]=c++;
        
    }for(i=ls;i<=le;i++)
    {if(a[i][le]==0)
        a[i][le]=c++;
        
    }
    for(i=le;i>=ls;i--)
    {if(a[le][i]==0)
        a[le][i]=c++;
        
    }
    for(i=le;i>=ls;i--)
    {if(a[i][ls]==0)
        a[i][ls]=c++;
        
    }
    ls++;le--;fg--;
    }
    
    
for(i=0;i<l;i++)
{
    for(j=0;j<l;j++)
    {
        System.out.print(a[i][j]+"  ");
}
System.out.println();
}
}
}
import java.util.Scanner;
public class composite_Magic
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n,m,cp,no,f=0,j,c,s,r=0,i;
       System.out.println("Enter the Start limit and end limit");
        n=sc.nextInt();
        m=sc.nextInt();
       if(n<m)
       { for(i=n;i<=m;i++)
        {
            no=i;cp=no;c=0;s=0;
            for(j=2;j<=no;j++)
            {if(no%j==0)
            c++;}
            
            while(cp>9)
            {s=0;
                while(cp!=0)
                {r=cp%10;
                    s=s+r;
                    cp=cp/10;
                }cp=s;
            }
            
            if(c!=1&&cp==1)
            {System.out.print(i+",");f++;}
        }System.out.println();
        System.out.print(f+"=frequency");}
    
        else 
        {System.out.print("Wrong entry");}
    }
}

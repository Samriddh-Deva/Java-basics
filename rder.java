import java.util.Scanner;
public class rder
{
public static void main()
{Scanner sc=new Scanner(System.in);
    int m,r,l,n=0,c=1,flag=0,p=0,temp=0,i;
    while(n<=0)
    {System.out.println("Enter n");
     n=sc.nextInt();
    }
    int a[]=new int[n];
    if(n%2!=0)
    m=(n+1)/2;
    else
    m=(n/2)-1;
    l=m-1;
    r=1+m;
    System.out.println("Enter values");
    for(i=0;i<n;i++)
    a[i]=sc.nextInt();
    System.out.println("original values");
    for(i=0;i<n;i++)
    System.out.print("  "+a[i]);
    flag=a[0];
    System.out.println("");
    for(i=0;i<n;i++)
    {if(a[i]<flag)
       { flag=a[i];
        p=i;}
    }
    temp=a[m];
    a[m]=flag;
    a[p]=temp;
    
    //9 2 1 10 6 4 8 5
    while(c<n)
    {c++;flag=a[0];p=0;
    for(i=0;i<n;i++)
    {if(a[i]<flag&&(i<=l||i>=r))
       { flag=a[i];
        p=i;}
    
    }
    if(c%2==0)
    {temp=a[r];
    a[r]=flag;
    a[p]=temp;r++;}
    if(c%2!=0)
    {temp=a[l];
    a[l]=flag;
    a[p]=temp;l--;}
   }temp=a[0];a[0]=a[n-1];a[n-1]=temp;
   System.out.println("new values");
    for(i=0;i<n;i++)
    System.out.print("  "+a[i]);
}
}
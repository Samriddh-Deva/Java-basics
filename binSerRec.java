import java.util.Scanner;
public class binSerRec
{
int n,l,u;int A[]=new int[4];
binSerRec(int nn)
{
    n=nn;
    l=0;u=n-1;
   
}

void readdata()
{int i;
    Scanner sc=new Scanner(System.in);
    System.out.print("enter data");
    System.out.print(A.length);
    for(i=0;i<n;i++)
    {
        A[i]=sc.nextInt();
    }
}
int binarysearch(int v)
{int a;
    a=(l+u)/2;
if(l>u)
return -1;
if(A[a]==v)
return 1;
 if(A[a]>v)
 {
     u=a-1;
     return binarysearch(v);
}
else if(A[a]<v)
{l=a+1;
return binarysearch(v);}
return 0;
}
}
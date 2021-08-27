import java.util.Scanner;
public class a6
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j,l=0,sl=0,k,t=0;
        System.out.println("enter val");
        n=sc.nextInt();
        if(n<=20)
        {
            int a[][]=new int[n][n];
            System.out.println("enter elements");
            for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                {
                    a[i][j]=sc.nextInt();
                    if(l<a[i][j])
                    {
                        sl=l;l=a[i][j];
                    }
                }
            }
            System.out.println("riginal matrix");
            for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                {
                    System.out.print(a[i][j]);
                }
                System.out.println();
            }
            System.out.println("largest number= "+l);
            System.out.println("2nd largest number= "+sl);
            for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                {
                    for(k=0;k<n-1;k++)
                   {
                       if(a[i][k]>a[i][k+1])
                       {
                           t=a[i][k];
                           a[i][k]=a[i][k+1];
                           a[i][k+1]=t;
                        }
                   }
                }
            }
            System.out.println("new matrix");
            for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                {
                    System.out.print(a[i][j]);
                }
                System.out.println();
            }
        }
    }
}
import java.util.Scanner;
public class matrix
{public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter range");
        int n,i,c,j,temp,k,c2=0,cp;
        n=sc.nextInt();
        if(n>2&&n<10)
        {
            int a[]=new int[n];
            int b[][]=new int[n][n];cp=n;
            System.out.print("enter elements");
            for(i=0;i<n;i++)
            {
                a[i]=sc.nextInt();}
                //Sorting starts
                for(j=0;j<=cp;j++)
                for(i=0;i<n-1;i++)
                {if(a[i]>a[i+1])
                    {temp=a[i];
                        a[i]=a[i+1];
                        a[i+1]=temp;
                    }
                }c=n;
                for(i=0;i<n;i++)
                {k=0;c2=0;
                    for(j=0;j<n;j++)
                    { if(k==c&&c2==0)
                      {  k=0;c2=1;}
                        b[i][j]=a[k++];
                       
                    }
                    c--;}
                    for(i=0;i<n;i++)
                    {
                        for(j=0;j<n;j++)
                        System.out.print(b[i][j]);
                        System.out.println();
                    }
                }
            else
        System.out.print("out of r");
    }
}
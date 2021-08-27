public class a8
{
    public static void main(int n)
    {int c=0,y=n-1,x=0;
        int a[][]=new int[n][n];
        int b[][]=new int[n][n];
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                a[i][j]=++c;
        for(int i=0;i<n;i++)
        {for(int j=0;j<n;j++)
            {   b[i][y]=a[j][i];y--;}
            System.out.println();y=n-1;
        }for(int i=0;i<n;i++)
        {for(int j=0;j<n;j++)
                System.out.print(b[i][j]);
            System.out.println();
        }

    }
}

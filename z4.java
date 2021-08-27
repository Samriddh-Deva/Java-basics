public class z4
{

    void main(int n,char f1,char f2, char f3)
    {
        char a[][]=new char[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i+j==n-1||i==j)
                
                    a[i][j]=f3;
                    else if(i<j&&(i+j)<=(n/2+1)||i>j&&i+j>=n)
                    a[i][j]=f1;
                    else
                    a[i][j]=f2;
                
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {System.out.print(a[i][j]);
            }
            System.out.println();
        }
        
    }
}

public class q1
{int a[][],ca;
    void main(int n)
    {a=new int[n][n];
        int flag=1,c=(n/2),r=0,i,j;
        ca=n;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                a[r--][c++]=flag++;
                if(r<0&&c<n)
                    r=n-1;
                if(c>n-1&&r>=0)
                    c=0;
                if(r<0&&c>n-1||a[r][c]!=0)
                {r=r+2;c--;
                }

            }
        }
        for(i=0;i<ca;i++)
        {
            for(j=0;j<ca;j++)
            {System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }

}

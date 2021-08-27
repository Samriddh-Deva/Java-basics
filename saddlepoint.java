public class saddlepoint
{
    public static void main()
    {int A[][]={{4,16,12},{2,8,14},{1,3,6}};
        int i,j,k,max=A[0][0],min=A[0][0],c=0,c2=0,n=3;
         A:for(i=0;i<n;i++)
        {for (j=0;j<n;j++)
            { if(min>=A[i][j])
                {  min=A[i][j];c=j;
                }}
            for(k=0;k<n;k++)
                if(max<=A[k][i])
                    max=A[k][i];

            if(max==min)
            {System.out.print(max);c2=1;}}
        if(c2==0)
            System.out.println("no");
    }}
import java.util.Scanner;
public class matrixsaddlepoint
{
    public static void main()
    {Scanner sc=new Scanner(System.in);
        System.out.println(" enter Dimentions of matrix");
        int n;
        n=sc.nextInt();
        int A[][]=new int[n][n];
        int i,j,k,max,min,c=0,c2=0,flag,temp;

        System.out.println("Enter elements of matrix");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                A[i][j]=sc.nextInt();}}
                max=A[0][0];min=A[0][0];
        System.out.println("original matrix");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(A[i][j]+"\t");}
            System.out.println();}
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
        int b[]=new int[n];
        for(i=0;i<n;i++)
        {b[i]=A[i][i];}
        for(i=1;i<n;i++)
        {flag=b[i];
            j=i-1;
            while(j>=0&&b[j]>flag)
            {b[j+1]=b[j];
                j--;}
            b[j+1]=flag;}
        for(i=0;i<n;i++)
        {A[i][i]=b[i];}
        System.out.println("New matrix =");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(A[i][j]+"\t");}
            System.out.println();}
    }}
import java.util.Scanner;
public class rotate
{
    public static void main()
    {Scanner sc=new Scanner(System.in);
        int i,j,c,n;
        System.out.println("Enter the order");
        n=sc.nextInt();

        int A[][]=new int[n][n];
        int b[][]=new int[n][n];
        if(n>2&&n<10)
        {
            System.out.println("Enter elements");
            for(i=0;i<n;i++)
                for(j=0;j<n;j++)
                    A[i][j]=sc.nextInt();
            System.out.println();
            System.out.println("Original matrix");
            for(i=0;i<n;i++)
            {for(j=0;j<n;j++)
                {System.out.print(A[i][j]+"\t");
                }System.out.println();}

            c=n-1;

            for(i=0;i<n;i++)
            {for(j=0;j<n;j++)
                {b[j][c]=A[i][j];
                }c--;}
            System.out.println("90 degree Rotated matrix");
            for(i=0;i<n;i++)
            {for(j=0;j<n;j++)
                {System.out.print(b[i][j]+"\t");
                }System.out.println();}
            System.out.println("sum of corner elements = "+(A[0][0]+A[n-1][n-1]+A[0][n-1]+A[n-1][0]));}
        else
            System.out.println("Out of range");
    }}
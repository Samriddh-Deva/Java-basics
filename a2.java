import java.util.Scanner;
public class a2
{ public static void main()
    {
        int n=0,c=0,cy=0,i,j;
        char ch1,ch2,ch3;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter no");
        n=sc.nextInt();
        System.out.print("enter 1st character");
        ch1=(sc.next()).charAt(0);
        System.out.print("enter 2st character");
        ch2=(sc.next()).charAt(0);
        System.out.print("enter 3st character");
        ch3=(sc.next()).charAt(0);
        char M[][]=new char[n][n];
        if(n>3&&n<10)
        {
            for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                {
                    if((i==0&&j==0)||(j==n-1&&i==n-1)||(i==n-1&&j==0)||(j==n-1&&i==0))
                        M[i][j]=ch1;
                    else if(i==0||i==n-1||j==0||j==n-1)
                        M[i][j]=ch2;
                    else
                        M[i][j]=ch3;
                }

            }
            for(i=0;i<n;i++)
            {for(j=0;j<n;j++)
                    System.out.print(M[i][j]+" ");
                System.out.println();
            }
        }
        else
            System.out.println("invalid");
    }
}

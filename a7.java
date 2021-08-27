import java.util.Scanner;
public class a7
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int i,j,n,max=0,c;
        System.out.println("enter number");
        n=sc.nextInt();
        String a[]=new String[n];
        a[0]=sc.nextLine();
        for(i=0;i<n;i++)
        {a[i]=sc.nextLine();
            if(a[i].length()>max)
                max=a[i].length();
        }
        String b[][]=new String[max][n];
        for(i=0;i<n;i++)
        {c=0;
            for(j=0;j<a[i].length();j++)
            {b[c][i]="";
                b[c][i]=b[c++][i]+a[i].charAt(j);
            }}
        for(i=0;i<max;i++)
        {
            for(j=0;j<n;j++)
            {   if(b[i][j]==null||b[i][j]=="")
                    System.out.print(" \t");
                else
                    System.out.print(b[i][j]+"\t");
            }
            System.out.println();
        }
    }
}

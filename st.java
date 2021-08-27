
import java.util.Scanner;
public class st
{
    public static void main()
    {   Scanner sc=new Scanner(System.in);
        System.out.println("enter");
        int i=0,j;
        int n=sc.nextInt();
        String a[]=new String[n];
        System.out.println("enter names");
        a[0]=sc.nextLine();
        for(i=0;i<n;i++)
        {a[i]=sc.nextLine();
            System.out.println("hi");
        }
        
        int max=a[0].length();
        for(i=1;i<n;i++)
        {
            if(a[i].length()>max)
                max=a[i].length();
        }
        for(i=0;i<max;i++)
        {
            for (j=0;j<n;j++)
            {if(a[j].length()>i)
                    System.out.print(a[j].charAt(i)+"\t");
                else
                    System.out.print("\t");
            }
            System.out.println();
        }
    }
}


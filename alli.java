import java.util.Scanner;
public class alli
{ public static void main()
    {Scanner sc=new Scanner(System.in);
        int n,rev=0,c=0,cu=0,r,s;
        System.out.println("enter");
        n=sc.nextInt();
        System.out.println("n"+n);
        if(n>9)
        while(n!=rev&&cu<15)
        {c=n;rev=0;
            cu++;
            while(c!=0)
            {r=c%10;
             rev=rev*10+r;
              c=c/10;}
                s=rev+n;
                if(rev==n)
                 break;
                n=s;}
            if(n>9&&cu<15)
            { System.out.println("alli"+rev);
            System.out.println("ste"+--cu);}
        else
         ;
         }}
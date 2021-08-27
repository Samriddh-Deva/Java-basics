import java.util.Scanner;
public class q3
{
public static void main()
{
    int h=0,m=0,flag;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter time");
    h=sc.nextInt();
    m=sc.nextInt();
    String a[]={"one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","frteen","quater","sixteen","seventeen","eighteen","nineteen","twenty"};
    if(h>=1&&h<=12&&m>=0&&m<=59)
    {System.out.print(h+":"+m);
        if(m>30)
        {h++;
            flag=60-m;
            if(flag==15)
            System.out.println(a[flag-1]+" to "+a[h-1]);
            else if(flag<21)
            System.out.println(a[flag-1]+" minutes to "+a[h-1]);
            else
            System.out.print("twenty "+a[flag-21]+" minutes to "+a[h-1]);
        }
        else if(m==0)
        System.out.print(a[h-1]+"  O'clock");
        else if(m==30)
        System.out.println(" half past "+a[h-1]);
        else
        {
            if(m==15)
            System.out.println(a[m-1]+" past "+a[h-1]);
            else if(m<21)
            System.out.println(a[m-1]+" minutes past "+a[h-1]);
            else
            System.out.print("twenty "+a[m-21]+" minutes past "+a[h-1]);
        }
    }
    else
    System.out.println("invalid");
}
}
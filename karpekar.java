import java.util.Scanner;
public class karpekar
{
 public static void main()
 {
     Scanner sc=new Scanner(System.in);
     int i,f=0,n,sq,c,rh,lh,cp,s,p,q;
    System.out.println("Enter Start limit and end limit") ;
     p=sc.nextInt();
     q=sc.nextInt();
     System.out.print("karpekar nos are=");
     
     if(p<q)
     
     {for(i=p;i<=q;i++)
     {
         n=i;s=0;
         sq=n*n;
         c=0;
         cp=n;
         while(cp!=0)
         {
             c++;
             cp=cp/10;}
             lh=sq/((int)Math.pow(10,c));
             rh=sq%((int)Math.pow(10,c));
         s=lh+rh;
         if(s==n)
         {System.out.print(n+",");
         f++;}}
        System.out.println();
         System.out.print("frequency="+f);
        }
         else
         {System.out.print("wrong limits");
            }
            }}
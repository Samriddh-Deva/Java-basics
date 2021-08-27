import java.util.Scanner;
public class z3
{
    int s,flag,am,sum,r,n;
    int a[];
    z3()
    {
        s=flag=am=sum=r=n=0;
    }
    void accept(int nn)
    {
        n=nn;
        Scanner sc=new Scanner(System.in);
        a=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter");
            a[i]=sc.nextInt();
        }
    }
       boolean check()
        {
            int i,s=0,l=n-1;
            boolean f=true;
            r=a[0]+a[n-1];
            
            if(n%2==0)
            am=n/2;
            else
            am=n/2+1;
            for(i=0,l=n-1;i<am;i++,l--)
            {
               f= false;
            }
            return f;
        }
        void main()
        {z3 b=new z3();
            b.accept(5);
            boolean t=b.check();
            if(t=true)
            System.out.println("true");
            else
            System.out.println("nt");
            }
   }

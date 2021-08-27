import java.util.Scanner;
public class p2
{
int isprime(int n)
  {int c=0,i;
    for(i=1;i<n;i++)
    {
       if(n%i==0)
        c++;}
        if(c==1)
        return 1;
       else
        return 0;
}
    void main()
  {prime_triplet obj=new prime_triplet();
    int i,s,l,c1=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Start limit");
    s=sc.nextInt();
    System.out.println("Enter the last limit");
    l=sc.nextInt();
    while(s>l)
    {
        System.out.println("Their was an error re-enter nos.");
        System.out.println("Enter the Start limit");
        s=sc.nextInt();
        System.out.println("Enter the last limit");
        l=sc.nextInt();
    }
    
    System.out.println("The prime triplet nos are");
    for(i=s;i<=l;i++)
    {  if(obj.isprime(i)==1&&obj.isprime(i+2)==1&&obj.isprime(i+6)==1)
       { System.out.print(i+"");
        System.out.print((i+2)+" ");
        System.out.println(i+6);
        c1++;}
       if(obj.isprime(i)==1&&obj.isprime(i+4)==1&&obj.isprime(i+6)==1)
       { System.out.print(i+" ");
        System.out.print((i+4)+" ");
        System.out.println(i+6);
        c1++;}
    
    }System.out.print("Total combinations="+c1);
}
}

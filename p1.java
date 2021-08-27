
public class p1
{
     public static void main(int p,int q)
 {
     int i,f=0,n,sq,c,r,l,cp,p1;
     System.out.print("karpekar =");
     if(!(p>q))
     
     {for(i=p;i<=q;i++)
     {
         n=i;
         sq=n*n;
         c=0;
         cp=n;
         while(cp!=0)
         {
             c++;
             cp=cp/10;}
            
             p1=(int)Math.pow(10,c);
             l=sq/p1;
             r=sq%p1;
         
         if((l+r)==n)
         {System.out.print(n+",");
         f++;}}
        System.out.println();
         System.out.print("frequency,"+f);
        }
         else
         {System.out.print("wrong enry");
            }
            }
}

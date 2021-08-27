import java.util.Scanner;
public class a4
{ public static void main(String s)
    {
        int i,n,c=0,l=0;
        String rev="",wrd="";
        Scanner sc=new Scanner(System.in);
        System.out.println("enter sent Code 2312179862310199501872379231018117927");
        
        l=s.length();
        if(l<200)
        {
            for(i=0;i<l;i++)
            { rev=s.charAt(i)+rev;}
            s="";
            for(i=0;i<l;i++)
            {
               wrd=wrd+rev.charAt(i);
               c++;
               if(c==2||c==3)
               {n=Integer.parseInt(wrd);
                     if(n==32||n>=65&&n<=90||n>=97&&n<=122)
                    {
                        c=0;
                        System.out.print((char)n);
                        wrd="";                        
                    }
                    
                }

            }
        }
        else
            System.out.println("invalid");
    }
}

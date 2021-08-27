import java.util.Scanner;
public class a3
{ public static void main()
    {
        int n=0,l=0,m1=0,m2=0,i,c=0;
        String s="";
        Scanner sc=new Scanner(System.in);
        System.out.print("enter sent odd no ");
        s=sc.nextLine();
        l=s.length();
        m1=m2=l/2;
        System.out.println(m1);
        if(l%2!=0)
        {
            System.out.println(s);

            while(m1!=0&&m2!=l-1)
            {  
                for(i=0;i<l;i++)
                {
                    if(i<m1||i>m2)
                    {
                        System.out.print(s.charAt(i));
                    }
                    else
                        System.out.print(" ");
                }
                System.out.println("");
                m1--;
                m2++;
            }
            m1++;
            m2--;
            while(m1!=l/2)
            {   m1++;
                m2--;
                for(i=0;i<l;i++)
                {
                    if(i<m1||i>m2)
                    {
                        System.out.print(s.charAt(i));
                    }
                    else
                        System.out.print(" ");
                }
                System.out.println("");
            }
            System.out.println(s);
        }
        else
            System.out.println("invalid");
    }
}

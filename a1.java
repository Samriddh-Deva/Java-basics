import java.util.Scanner;
public class a1
{ public static void main()
    {
        int n=0,c=0,cy=0,i;
        String s="";
        Scanner sc=new Scanner(System.in);
        System.out.print("enter no");
        n=sc.nextInt();
        cy=n;
        if(n>1&&n<100)
        {
            while(cy!=0)
            {
                s=(cy%2)+s;
                cy=cy/2;
            }
            System.out.println("Binary equi.= "+s);
            for(i=0;i<s.length();i++)
            {
                if(s.charAt(i)=='1')
                    c++;
            }
            System.out.println("no. of 1s= "+c);
            if(c%2==0)
                System.out.println("evil");
            else
                System.out.println("nt");
        }
        else
            System.out.println("invalid");
    }
}

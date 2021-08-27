import java.util.Scanner;
public class date
{
    public static void main()
    {Scanner sc=new Scanner(System.in);
        int i,c2=0,c=0,p=0,d=0,r;
        String s,s2="";
        char ch;
        String str[]={"Sunday","Monday","Tuesday","wed","thurs","fri","Sat"};
        System.out.println("Enter date in format dd/mm/yyyy");
        String days[]=new String[7];
        int a[]=new int[3];
        s=sc.next();
        s=s.trim();
        s=s+"/";
        for(i=0;i<s.length();i++)
        {ch=s.charAt(i);
            if(ch!='/')
                s2=s2+ch;
            else
            {a[c++]=Integer.parseInt(s2);
                s2="";}}
        s2=sc.next();
                for(i=0;i<7;i++)
               if(str[i].equalsIgnoreCase(s2))
               p=i;
               
               for(i=0;i<7;i++)
              { days[i]=str[p++];
               if(p==7)
               p=0;}
               d=d+a[0];c=0;
       if(d>31&&(a[1]==1||a[1]==3||a[1]==5||a[1]==7||a[1]==8||a[1]==10||a[1]==12))
       c2++;
       if(d>30&&(a[1]==4||a[1]==6||a[1]==9||a[1]==11))
       c2++;
       if(d>29&&a[1]==2&&(a[2]%4==0&&a[2]%100!=0||a[2]%400==0))
       c2++;
       if(d>28&&a[1]==2&&!(a[2]%4==0&&a[2]%100!=0||a[2]%400==0))
       c2++;
       if(a[1]>12)
       c2++;
       a[1]--;
       while(a[1]!=0&&c2==0)
       {
        if((a[1]==1||a[1]==3||a[1]==5||a[1]==7||a[1]==8||a[1]==10||a[1]==12))
       {d=d+31;a[1]--;}
       if((a[1]==4||a[1]==6||a[1]==9||a[1]==11))
       {d=d+30;a[1]--;}
       if(a[1]==2&&(a[2]%4==0&&a[2]%100!=0||a[2]%400==0))
       {d=d+29;a[1]--;}
       if(a[1]==2&&!(a[2]%4==0&&a[2]%100!=0||a[2]%400==0))
       {d=d+28;a[1]--;}
         }
         r=d%7;
         System.out.println(r);
       if(r==0)
         r=7;
         if(c2==0)
         System.out.println(days[r-1]);
        else
        System.out.println("invalid");
        }}
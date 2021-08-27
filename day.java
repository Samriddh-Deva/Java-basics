import java.util.Scanner;
public class day
{public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n,y,m=1;
        System.out.print("Enter the days");
        n=sc.nextInt();
        System.out.print("Enter year");
        y=sc.nextInt();
        System.out.print("Enter next days");
        n=n+sc.nextInt();
        while((n>31&&(m==1||m==3||m==5||m==7||m==8||m==10||m==12))||(n>30&&(m==4||m==6||m==9||m==11))||n>28)
        {
            if(n>31&&m==1||m==3||m==5||m==7||m==8||m==10||m==12)
            {n=n-31;
                m++;
                if(m>12)
                {m=1;y++;
                }
            if(n<30)
            break;
            }
            if(n>30&&m==4||m==6||m==9||m==11)
            {n=n-30;
                m++;
                if(m>12)
                {m=1;y++;
                }if(n<29)
            break;}
            if(m==2&&(y%400==0||y%100!=0&&y%4==0)&&n>29)
            {n=n-29;
                m++;
                if(m>12)
                {m=1;y++;
                }if(n<28)
            break;}
            if(m==2&&!(y%400==0||y%100==0&&y%4!=0)&&n>28)
            {n=n-28;
                m++;
                if(m>12)
                {m=1;y++;
                }
            }
        }
        System.out.print("date="+n+"/"+m+"/"+y);
    }}
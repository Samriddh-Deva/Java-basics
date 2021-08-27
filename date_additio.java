import java.util.Scanner;
 public class date_additio
 {public static void main()
  {   int dd,mm,yyyy,d,c=0;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter days");
     dd=sc.nextInt();
     System.out.println("Enter month");
     mm=sc.nextInt();
     System.out.println("Enter year");
     yyyy=sc.nextInt();
     System.out.println("Enter no days to be altered");
     d=sc.nextInt();
     dd=dd+d;
    while(c!=1)
    {c=1;
     while(dd>31)
    { if(mm==1||mm==3||mm==5||mm==7||mm==9||mm==11||mm==01||mm==03||mm==05||mm==07||mm==9&&dd>31)
        
        
        
     {c=0;
         dd=dd-31;
       mm++;
       if(mm>12)
       {mm=mm-12;
         yyyy++;
        }continue;
     }}while(dd>30)
      {
          if(mm==4||mm==6||mm==8||mm==10||mm==12||mm==04||mm==06||mm==8&&dd>30)
      { dd=dd-30;c=0;
          mm++;
         if(mm>12)
         {mm=mm-12;
           yyyy++;
        }continue;
       }
      }
           while(dd>28)
        {  
            if(mm==2&&dd>28)
            {c=0;
            dd=dd-28;
            mm++;
           if(mm>12)
          {mm=mm-12;
           yyyy++;
           }continue;
         }
        }
        
  }

  System.out.print("dd/mm/yyyy"+" "+dd+"/"+mm+"/"+yyyy);
}
}
import java.util.Scanner;
public class p3
{
public static void main(int dd,int mm,int yyyy)
  {   Scanner sc=new Scanner(System.in);
      int dddc,cp=0;
      System.out.print("change of date");
      dddc=sc.nextInt();
     dd=dd+dddc;
    while(cp!=1)
    {cp=1;
     while((mm==1||mm==3||mm==5||mm==7||mm==8||mm==10||mm==01||mm==03||mm==05||mm==07||mm==12)&&dd>31)
    { 
        
        
        
     cp=0;
         dd=dd-31;
       mm++;
       if(mm>12)
       {mm=mm-12;
         yyyy++;
        }continue;
     
    }
     
     while((dd>30&&mm==4||mm==6||mm==9||mm==11||mm==04||mm==06||mm==9)&&dd>30)
      {
          
        dd=dd-30;cp=0;
          mm++;
         if(mm>12)
         {mm=mm-12;
           yyyy++;
        }continue;
       
      }
      
      while(mm==2&&dd>28)
        {  
            if(mm==2&&dd>28)
            {cp=0;
            dd=dd-28;
            mm++;
           if(mm>12)
          {mm=mm-12;
           yyyy++;
           }continue;
         }
        }
        
  }

  System.out.print(dd+"/"+mm+"/"+yyyy);
}
}

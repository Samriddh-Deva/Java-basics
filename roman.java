import java.util.Scanner;
public class roman
{
   public static void main()
   {
       Scanner sc=new Scanner(System.in);
       int t=0,i,l;
       String s;
       char ch,ch2;
       System.out.println("Enter Roman numral");             //XXI=21,IXX=19
       s=sc.next();s=s.toUpperCase();
       for(i=0;i<s.length()-1;i++)
       {
           ch=s.charAt(i);ch2=s.charAt(i+1);//         C=100,D=500,M=1000,L=50,I=1;V=5,X=10
           if(ch=='I')
           {
               if(ch2=='X'||ch2=='V'||ch2=='L'||ch2=='C'||ch2=='D'||ch2=='M')//---------------------------
              t=t-1;
            else if(ch2=='I')
            t=t+1;
        
        }
        if(ch=='V')
        {
               if(ch2=='X'||ch2=='L'||ch2=='C'||ch2=='D'||ch2=='M')//---------------------------
              t=t-5;
            else if(ch2=='I'||ch2=='V')
            t=t+5;
        
        }
    
        if(ch=='X')
        {
               if(ch2=='L'||ch2=='C'||ch2=='D'||ch2=='M')//---------------------------
              t=t-10;
            else if(ch2=='X'||ch2=='I'||ch2=='V')
            t=t+10;
        
        }
        if(ch=='L')
         {
               if(ch2=='C'||ch2=='D'||ch2=='M')//---------------------------
              t=t-50;
            else if(ch2=='L'||ch2=='X'||ch2=='I'||ch2=='V')
            t=t+50;
        
        }
        if(ch=='C')
         {
               if(ch2=='D'||ch2=='M')//---------------------------
              t=t-100;
            else if(ch2=='C'||ch2=='L'||ch2=='X'||ch2=='I'||ch2=='V')
            t=t+100;
        
        }
        
        if(ch=='D')
         {
               if(ch2=='M')//---------------------------
              t=t-500;
            else if(ch2=='D'||ch2=='C'||ch2=='L'||ch2=='X'||ch2=='I'||ch2=='V')
            t=t+500;
        
        }
        if(ch=='M')
        {if(ch2=='D'||ch2=='C'||ch2=='L'||ch2=='X'||ch2=='I'||ch2=='V'||ch2=='M')
            t=t+1000;
        }
        
    }
    l=s.length();
    ch=s.charAt(l-1);
    if(ch=='I')
    t+=1;
    if(ch=='V')
    t+=5;
    if(ch=='X')
    t+=10;
    if(ch=='L')
    t+=50;
    if(ch=='C')
    t+=100;
    if(ch=='D')
    t+=500;
    if(ch=='M')
    t+=1000;
   System.out.print("No. is="+t);
}}
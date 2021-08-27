import java.util.Scanner;
public class g
{public static void main()
    {Scanner sc=new Scanner(System.in);
       System.out.print(" ");
        String s[]={"nessicity","is","the","mother","of","invension"};
        String t,min;
        int j,i;
         for(j=0;j<s.length;j++)
    for(i=0;i<((s.length-1));i++)
    {
        if(s[i].compareTo(s[i+1])>0)
        {
            t=s[i];
            s[i]=s[i+1];
            s[i+1]=t;
        }
        
    }
    for(i=0;i<s.length;i++)
        System.out.print(s[i]);
    
    int x=0,p=0;
    
    
    while(x!=(s.length-1))
    {min=s[x];
        for(i=x;i<s.length;i++)
        if(min.compareTo(s[i])>1)
        {
        min=s[i];System.out.print(min);
    p=i;}
        t=s[x];
    s[x]=min;
    s[p]=t;
    } 
    System.out.println("");
    for(i=0;i<s.length;i++)
    System.out.print(s[i]);
}}
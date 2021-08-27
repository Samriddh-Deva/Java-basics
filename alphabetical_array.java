import java.util.Scanner;
public class alphabetical_array
{
public static void main()
{Scanner sc=new Scanner(System.in);
    int i,j,c=0,x=0;
    String str="",wrd="",t,str1="";
    char ch;
   System.out.println("Enter String");
    str=sc.nextLine();str=str.trim();
    for(i=0;i<str.length();i++)
    {ch=str.charAt(i); 
    if(ch==' ')
    c++;}
    String s[]=new String[c+1];
    str=str+" ";
    for(i=0;i<str.length();i++)
    {
        ch=str.charAt(i);
        if(ch!=' ')
        {
            wrd=wrd+ch;}
            else
            {s[x]=wrd;
                x++;
            wrd="";
            }
    
    }
    for(j=0;j<s.length;j++)
    for(i=0;i<((s.length-1)-j);i++)
    {
        if(s[i].compareTo(s[i+1])>0)
        {
            t=s[i];
            s[i]=s[i+1];
            s[i+1]=t;
        }
        
    }
    for(i=0;i<s.length;i++)
    {str1=str1+s[i]+" ";
    }str1=str1.trim();
    System.out.print("new string in alphabetical order = "+str1);
   }}
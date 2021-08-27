import java.util.Scanner;
public class alphabetical_without_array
{
public static void main()
{Scanner sc=new Scanner (System.in);
    int i,j,le,l,x=0,k,fs,sf=0,sl=0,c;
    String wrd="",str,s="",min;
    char ch;
    System.out.println("Enter the String");
    str=sc.nextLine();
    str=str.trim();
    str=str+" ";
        le=str.length();
    
    for(i=0;i<=le;)
    {   
        str=str+" ";
        le=str.length();
        fs=str.indexOf(" ");
      min=str.substring(0,fs);
     
      for(j=0;j<le;j++)
      {   ch=str.charAt(j);c=0;
        if(ch!=' ')
        {
            wrd=wrd+ch;}
            else
            {
              if(wrd.compareTo(min)<0)
             { sl=j;c++;
                  min=wrd;
                  wrd="";
                  if(c==1)
                  sf=str.lastIndexOf(" ",(sl-1));
                  if(sf==-1)
                   sf=0;
                  
                }
                wrd="";
            }
        }  
        x=min.length(); 
        s=s+min+" ";
        str=str.substring(0,sf)+str.substring(sl);
        le=le-x;
        if(str==" ")
        break;
    }
    System.out.print(s);
}}
                
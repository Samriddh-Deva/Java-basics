import java.util.*;
public class z1
{void main()
    {
        Scanner sc=new Scanner (System.in);
        int i,l=0,f=0;
        char ch1,ch;
        String str,wrd="",sentv="",sentc="";
        System.out.println("enter");
        str=sc.nextLine();
        str=str.trim();
        if(str.charAt(str.length()-1)=='.'||str.charAt(str.length()-1)=='?'||str.charAt(str.length()-1)=='!')
        {
            str=str+" ";
            l=str.length();
            for(i=0;i<l;i++)
            {
                ch=str.charAt(i);
                if(ch!=' '&&Character.isLetter(ch))
                {wrd=wrd+ch;
                }
                else if(wrd!="")
                {System.out.print(wrd.length());
                    if((wrd.charAt(wrd.length()-1)=='A'||wrd.charAt(wrd.length()-1)=='E'||wrd.charAt(wrd.length()-1)=='I'||wrd.charAt(wrd.length()-1)=='O'||wrd.charAt(wrd.length()-1)=='U')&&(wrd.charAt(0)=='A'||wrd.charAt(0)=='E'||wrd.charAt(0)=='I'||wrd.charAt(0)=='O'||wrd.charAt(0)=='U'))
                    {
                        f++;
                        sentv=sentv+wrd+" ";
                    }
                    else
                    sentc=sentc+wrd+" ";
                    wrd="";
                }}
                
                System.out.println("freq="+f);
                System.out.println("sent="+sentv+sentc);
            }else
            System.out.println("invalid");
        }
    }
import java.util.*;
public class z2
{void main()
    {
        Scanner sc=new Scanner (System.in);
        int i,l=0;
        char ch;
        String str,sent="";
        System.out.println("enter");
        str=sc.nextLine();
        str=str.trim();l=str.length();
        if(l>3&&l<100)
        {l++;
            str=str+" ";
            for(i=0;i<l;i++)
            {
                ch=str.charAt(i);
                if(ch!=' '&&Character.isLetter(ch))
                {if(ch!=' '&&Character.isUpperCase(ch))
                    {
                        ch+=13;
                        if(ch>90)
                        ch-=26;}
                    
                    if(ch!=' '&&Character.isLowerCase(ch))
                    {
                        ch+=13;
                        if(ch>122)
                        ch-=26;}
                    
                    sent=sent+ch;
                    
                }
                else if(ch!=' ')
                sent=sent+ch+" ";
                
            }
                System.out.println("enc="+sent);
                
            }else
            System.out.println("invalid");
        }
    }


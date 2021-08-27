import java.util.Scanner;
public class a5
{
    void main()
    {
        String s,wrd="",temp,st;
        int i,c=0,l,j;
        char ch1,ch2;
        String str[];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter");
        s=sc.nextLine();
        s=s.trim();
        if(!(s.length()>80)&&(s.charAt(s.length()-1)=='.'))
        {
            s=s+" ";l=s.length();
            for(i=0;i<l-1;i++)
            {
                if(s.charAt(i+1)==' '&&s.charAt(i)!=' ')
                    c++;
            }
            str=new String[c];
            c=0;
            for(i=0;i<l;i++)
            {
                ch1=s.charAt(i);
                if(ch1!=' '&&ch1!='.')
                {
                    wrd=wrd+ch1;
                }
                else if(ch1==' '&& wrd!="")
                {
                    str[c++]=wrd;
                    wrd="";
                }
            }
            
            for(i=0;i<c;i++)
            {for(j=0;j<c-1;j++)
                {
                    if(str[j].length()<str[j+1].length())
                    {
                        temp=str[j];
                        str[j]=str[j+1];
                        str[j+1]=temp;
                    }
                    if(str[j].length()==str[j+1].length()&&str[j].compareTo(str[j+1])<0)
                    {
                        temp=str[j];
                        str[j]=str[j+1];
                        str[j+1]=temp;
                    }
                }
            }
            for(i=0;i<c;i++)
            {
                st=str[i];wrd="";
                for(j=0;j<st.length();j++)
                {ch1=st.charAt(j);
                    if(j==0)
                    ch1=Character.toUpperCase(ch1);
                    wrd=wrd+ch1;
                }
                str[i]=wrd;
            }
            str[c-1]=str[c-1]+'.';
            for(i=0;i<c;i++)
            System.out.print(str[i]+" ");
        }
        else
        System.out.print("invalid ");
    }
}
                    
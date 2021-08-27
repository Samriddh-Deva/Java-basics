public class bt
{
public static void main()
{int i,j,le,l,x=0,k,fs,sf=0,sl=0,c;
    String wrd="",str="a hi i am",s="",min;
    char ch;str=str+" ";
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
                   System.out.print(sf);
                   System.out.print(sl);
                }
                wrd="";
            }
        }  
        System.out.print(min);
    }}
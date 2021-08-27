import java.util.Scanner;
public class q2
{
    public static void main()
    {
        int i,wl=0,l,s=0,c=0,j,tem;
        String str,wrd="",flag;
        char ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter sent");
        str=sc.nextLine();
        str=(str.trim())+" ";l=str.length();
        for(i=0;i<l;i++)
        {ch=str.charAt(i);
            if(ch==' ')
                wl++;
        }
        String st[]=new String[wl];
        int a[]=new int[wl];
        if(str.charAt(i-2)=='.'||str.charAt(i-2)=='!'||str.charAt(i-2)=='?')
        {for(i=0;i<l;i++)
            {ch=str.charAt(i);
                if(ch!=' ' && Character.isLetter(ch))
                {s=s+ch;
                    wrd=wrd+ch;
                }
                else if(ch==' ')
                {
                    a[c]=s;
                    st[c++]=wrd;
                    System.out.println(wrd+"="+s);
                    wrd="";s=0;
                }
            }
            for(i=0;i<wl;i++)
                for(j=0;j<wl-1;j++)
                {
                    if(a[j]>a[j+1])
                    {
                        tem=a[j];
                        a[j]=a[j+1];
                        a[j+1]=tem;
                        flag=st[j];
                        st[j]=st[j+1];
                        st[j+1]=flag;

                    }}
            for(i=0;i<wl;i++)
                System.out.print(st[i]+" ");

        }
        else
            System.out.print("invalid inut ");
    }
}

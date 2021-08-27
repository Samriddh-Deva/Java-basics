public class pal
{String str="dan",rev="";
   void recrever(int l)
   {char ch;
       if(l==0)
       return;
       ch=str.charAt(l-1);
       rev=rev+ch;
       recrever(l-1);
}
void display()
{System.out.print(rev);
}
}
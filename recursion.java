public class recursion
{
    String str="Himynameissam",n="";
    char con(char ch)
    {
        ch=Character.toUpperCase(ch);
        return ch;}

    void rechange(int a)
    {

        if(a!=str.length())
        {
            n=n+con(str.charAt(a));
            rechange(++a);
        }
    }
void display()
{System.out.print(n);
}


}

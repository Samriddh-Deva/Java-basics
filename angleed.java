public class angleed
{
int d,m;
angleed(int a,int b)
{
    d=a;
    m=b;
}
void display()
{
    System.out.println("degree is "+d);
    System.out.println("minutes are "+m);
}
angleed addangle(angleed A,angleed B)
{
    d=A.d+B.d;
    m=A.m+B.m;
    if(m>60)
    {
        d++;
        m=m-60;}
        return this;
    }
    void main()
    {
        angleed ob1=new angleed(80,40);
        angleed ob2=new angleed(10,10);
        angleed ob3=addangle(ob1,ob2);
    ob3.display();
    }
}
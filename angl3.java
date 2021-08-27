public class angl3
{
int dd,mm;
angl3(int a,int b)
{dd=a;mm=b;}
void display()
{
System.out.print(dd+" "+mm);}
angl3 addangle(angl3 z,angl3 x)
{
    dd=z.dd+x.dd;
    mm=z.mm+x.mm;
    return this;
}
void main()
{angl3 q=new angl3(99,99);
    angl3 w=new angl3(99,99);
    angl3 e=addangle(q,w);
    e.display();
}
}
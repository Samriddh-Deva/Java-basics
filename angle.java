public class angle
{
  int d,m;
  angle(int dd,int mm)
  {
      d=dd;
      m=mm;
}
void display()
{
    System.out.print("Degree="+d+"min="+m);
    
}
angle addangle(angle a,angle b)
{
    d=a.d+b.d;
    m=b.m+a.m;
    if(m>60)
    {m=m-60;
        d++;
    }
    return this;
}
void main()
{
    angle ob= new angle(12,50);
angle ob2= new angle(12,50);
angle ob3= addangle(ob,ob2);
ob3.display();
}
}
public class cbr
{
    int d,m;
    cbr(int x,int y)
    {d=x;m=y;
    }
    cbr addangle(cbr p,cbr q)
    {d=q.d+p.d;
        m=q.m+p.m;
        return this;
    }
    void display()
    {System.out.print(d+"  "+m);
    }
        void main()
        {cbr a=new cbr(39,47);
            cbr b=new cbr(30,47);
            cbr c=addangle(a,b);
            c.display();
        }
    }

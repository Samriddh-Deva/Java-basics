import java.util.Scanner;
public class point
{int x,y;
 point()
 {
     x=0;y=0;}
     
    void readpoint()
 {Scanner sc=new Scanner(System.in);
     System.out.print(" ");
    x=sc.nextInt();y=sc.nextInt();
    }
    point addtime(point c1,point c2)
    {x=(c1.x+c2.x)/2;
        y=(c1.y+c2.y)/2;
        return this;
}
void display()
{System.out.print(x+" "+y);
}
void main()
{System.out.print(" ");
    point a=new point();
    a.readpoint();
    point b=new point();
    b.readpoint();
    point c=addtime(a,b);
    c.display();
}
}
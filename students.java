import java.util.Scanner;
class students
{
int roll;
String std;
void accept()
{Scanner sc=new Scanner(System.in);
 System.out.println("Enter");
    std=sc.nextLine();
    roll=sc.nextInt();
}
void display()
{
 System.out.println("name"+std);
 System.out.println("roll"+roll);
}
}
class markss extends students
{
    protected float sub1,sub2;
    void getMarks(float x,float y)
    {
        sub1=x;
        sub2=y;
    }
    void dispMarks()
    {
        System.out.println("marks1"+sub1);
        System.out.println("marks2"+sub2);
    }
}
class results extends markss
{
    float total;
    void display()
    {
        total=sub1+sub2;
        System.out.println("name"+std);
        System.out.println("roll"+roll);
        System.out.println("marks1"+sub1);
        System.out.println("marks2"+sub2);
        System.out.println("total marks"+total);
    }

    public static void main()
    {
        results o=new results();
        o.accept();
        o.getMarks(78.2f,58.9f);
        o.display();
    }
}
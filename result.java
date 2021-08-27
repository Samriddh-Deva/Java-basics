public class result extends marks
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
        result o=new result();
        o.accept();
        o.getMarks(78.2f,58.9f);
        o.display();
    }
}
public class marks extends student
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

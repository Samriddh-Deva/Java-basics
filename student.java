import java.util.Scanner;
public class student
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
import java.util.Scanner;
public class q
{
public static void main()
{Scanner sc=new Scanner(System.in);
  int  n=10;
    int stack[]=new int[n];
    int front=-1,rear=-1,i=0;
    while(i!=4)
    {System.out.print(" ");
        i=sc.nextInt();
    switch(i)
    {
        case 1://push element
        if(rear>=n-1)
        {System.out.print("Overflow");
        break;}
        else
        {rear++;
            stack[rear]=sc.nextInt();}
        break;
        case 2:
        if(rear==-1)
        {System.out.print("underflow");
        break;}
        front++;
        break;
        case 3:
        for(i=front+1;i<=rear;i++)
    System.out.print(stack[i]+",");
    }}
    for(i=front+1;i<rear;i++)
    System.out.print(stack[i]+",");

}}
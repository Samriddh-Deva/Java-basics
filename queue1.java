import java.util.Scanner;
public class queue1
{
    public static void main()
    {Scanner sc=new Scanner(System.in);
        System.out.println("");
        int n,rear=-1,front=-1,c=0,i;
        n=sc.nextInt();
        int queue[]=new int[n];
        while(c!=1)
        {
            System.out.println("Enter choice");
            c=sc.nextInt();
            if(c==1)
                System.out.println("Menu terminated");
            if(c==2)
            {
                if(rear+1==n)
                    break;
                queue[++rear]=sc.nextInt();
            }
            if(c==3)
            {
                if(front!=rear)
                {
                    front++;
                    System.out.println("element popped");}
                if(front==rear)
                {                    System.out.println("Empty");break;}
            }}
        for(i=front+1;i<=rear;i++)
            System.out.print(queue[i]+",");
    }}
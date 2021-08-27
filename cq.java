import java.util.Scanner;
public class cq
{
    public static void main()
    {Scanner sc=new Scanner(System.in);
        int n=5;
        int cq[]=new int[n];
        int i=0,front=-1,rear=-1;
        while(i!=4)
        {System.out.print(" ");
            i=sc.nextInt();
            switch(i)
            {case 1:

                if(front == rear+1||(rear==n-1&&front==0))
                    System.out.println("Overflowwwwwwwwww");
                else
                {
                    if(front==-1&&rear == -1)
                    {System.out.println("Queue was empty");front=0;rear=0;}
                    else
                    if(rear==n-1)
                        rear=0;
                    else
                        rear++;
                }
                cq[rear]=1;
                break;
                case 2:
                if(front==rear)
                {System.out.println("Underflowwwwwwwwww");
                    break;}
                    if(front==-1)
                    {
                        System.out.println("Underflowwwwwwwwww");
                        break;}
                    else
                    if(front==n-1)
                        front=0;
                    else
                        front++;
                    break;
                    case 3:
                    for(i=front;i<=rear;i++)
                    System.out.print(cq[i]+",");
                }}
            for(i=front;i<=rear;i++)
                System.out.print(cq[i]+",");
            }
        }
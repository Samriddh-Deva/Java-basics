import java.util.Scanner;
public class pop_push
{
public static void main()
{Scanner sc=new Scanner(System.in);
    int stack[]=new int[10];
    int top=-1,i=0;
    while(i!=3)
    {System.out.print(" ");
        i=sc.nextInt();
    switch(i)
    {
        case 1://push element
        if(top>=9)
        {System.out.print("Stack Overflow");
        break;}
        top=top+1;
        stack[top]=sc.nextInt();
        break;
        case 2:
        if(top==-1)
        {System.out.print("Stack underflow");
        break;}
        top=top-1;
        break;}
    }
    for(i=0;i<9;i++)
    System.out.print(stack[i]+",");
}}
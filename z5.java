import java.util.Scanner;
public class z5
{
    int n;
    int arr[];
    z5(int nn)
    {
        n=nn;
        arr=new int[n];
    }
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter");
            arr[i]=sc.nextInt();
        }
    }
       z5 min(z5 A)
        {int j=0,tem;
            z5 b=new z5(n+A.n);
            for(int i=0;i<n;i++)
            {b.arr[j++]=arr[i];
            }
            for(int i=0;i<A.n;i++)
            {
                b.arr[j++]=A.arr[i];
            }
            for(int i=0;i<n+A.n;i++)
            {
                for(j=0;j<n+A.n-1;j++)
            {
                if(b.arr[j+1]<b.arr[j])
                {
                    tem=b.arr[j];
                    b.arr[j]=b.arr[j+1];
                    b.arr[j+1]=tem;
            }
            }}
            return b;
        }
        void display()
        {
            System.out.print("Array=");
            for(int i=0;i<n;i++)
            {
                System.out.print(arr[i]);
            }
        }
        void main()
        {
            z5 b1=new z5(3);
            b1.accept();
            z5 b2=new z5(4);
            b2.accept();
            z5 b3=b2.min(b1);
            b3.display();
        }
    }
    
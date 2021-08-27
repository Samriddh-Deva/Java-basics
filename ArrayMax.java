import java.util.Scanner;
public class ArrayMax
{int arr[][]=new int[2][2];
int m;
ArrayMax(int mm)
{
    m=mm;
}

void readElement()
{Scanner sc=new Scanner(System.in);
    int i,j;
    
    System.out.print(" ");
    for(i=0;i<2;i++)
    {
        for(j=0;j<2;j++)
        {System.out.print("");
            arr[i][j]=sc.nextInt();
        }
    }
}
void large()
{int max,i,j;
    for(i=0;i<m;i++)
    {max=arr[i][0];
        for(j=0;j<m;j++)
        {
            if(arr[i][j]>max)
            max=arr[i][j];
        }
        System.out.println(i+"="+max);
    }
}
void display()
{int i,j;
for(i=0;i<m;i++)
    {
        for(j=0;j<m;j++)
        {System.out.print(arr[i][j]+",");
          
        }
    }
}

}

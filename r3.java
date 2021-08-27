import java.util.Scanner;
public class r3
{
public static void main()
{int l,c2,l1,c1,p,x=0,i,j,k;
    Scanner sc=new Scanner(System.in);
    System.out.print("eneter length");
    l=sc.nextInt();
    c2=sc.nextInt();
    l1=sc.nextInt();
    c1=sc.nextInt();
    int a[][]=new int[l][c2];
    int b[][]=new int[l1][c1];
    int c[][]=new int[l][c1];
    if(c2==l1)
    {
        System.out.print("element 1");
        for(i=0;i<l;i++)
        {
            for(j=0;j<c2;j++)
            {
                a[i][j]=sc.nextInt();
            }}
            System.out.print("element 2");
        for(i=0;i<l;i++)
        {
            for(j=0;j<c1;j++)
            {
                b[i][j]=sc.nextInt();
            }}
            for(i=0;i<l;i++)
            {x=0;p=0;
            for(j=0;j<c1;j++)
            {for(k=0;k<c2;k++)
            {
                c[i][j]=a[i][k]*b[k][j]+c[i][j];
                
}
}}
System.out.print("product=");
for(i=0;i<l;i++)
{
    for(j=0;j<c1;j++)
    {
        System.out.print(c[i][j]+",");
    }System.out.println();
}
}
}
}
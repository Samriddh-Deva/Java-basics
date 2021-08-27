public class array
{
public static void main()
{
    int a[][]={{2,3,1,5,0},{7,1,5,3,1},{2,5,7,8,1},{0,1,5,0,1},{3,4,9,1,5}};
    int i,j,k,l,x=0;
    for(i=0;i<5;i++)
    {for(k=1;k<=i;k++)
        System.out.print(" ");
    for(j=i;j<5;j++)
    {
        
        if(j>=i)
        System.out.print(a[i][j]);
}
System.out.println();
}}}
public class reverserec
{int c=0;
int rev(int a,int le)
{if(a==0)
    return 0;
    else
    
    return (a%10)*(int)Math.pow(10,le--)+rev(a/10,le);
    
}
void main(int z)
{
    reverserec obj=new reverserec();
    int len=3;
    System.out.println(""+obj.rev(z,len-1));
}}
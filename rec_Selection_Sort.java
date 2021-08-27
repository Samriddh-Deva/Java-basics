
public class rec_Selection_Sort
{
    public  void Selection_sort(int arr[],int size)
    {
        int p1=0,p2,temp,cp,i;
        p2=size-1;
        size--;
        cp=arr[0];
        for(i=0;i<=size;i++)
        {  if(arr[i]>cp)
            {   p1=i;cp=arr[i];}}

        temp=arr[p2];
        arr[p2]=arr[p1];
        arr[p1]=temp;

        if(size>0)
            Selection_sort(arr,size);

        if(size==0)
        {    for(i=0;i<arr.length;i++)
            {
                System.out.println(arr[i]+",");
            }}
    }

}
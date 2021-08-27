import java.io.*;
public class p7
{
public static void main()throws IOException
{
    FileOutputStream os=new FileOutputStream("Input.dat");
    DataOutputStream ds=new DataOutputStream(os);
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.print("enter name if want to else enter *  ");
    String str,s;
    str=br.readLine();
    int income,i;
    while(!(str.equalsIgnoreCase("")))
    { 
        System.out.print("Enter the income  ");
        income=Integer.parseInt(br.readLine());
        ds.writeUTF(str);
        ds.writeInt(income);
        System.out.print("enter name if want to else enter *  ");
        str=br.readLine();
    }
    os.close();
    ds.close();
    FileInputStream fi=new FileInputStream("input.dat");
    DataInputStream di=new DataInputStream(fi);
    FileOutputStream fos=new FileOutputStream("temp.dat");
    DataOutputStream dos=new DataOutputStream(fos);
    boolean eof=false;
    
    while(!eof)
    {
        try
        {
        s=di.readUTF();
        i=di.readInt();
        if(i>100000)
        {
           dos.writeUTF(s);
           dos.writeInt(i);
        System.out.print(s+" is name and taxable income="+i);
       }}
        catch(EOFException e1)
       {eof=true;
        }
    }
    di.close();
    fi.close();
    File f1=new File("input.dat");
    File f2=new File("temp.dat");
    f2.renameTo(f1);
    f1.delete();
}
}
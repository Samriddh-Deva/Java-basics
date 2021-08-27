import java.io.*;
public class filehand2
{
public static void main()throws IOException
{boolean eof=false;
    FileInputStream a=new FileInputStream("sam.dat");
    DataInputStream b=new DataInputStream(a);
    while(!eof)
    try
    {
        System.out.print(b.readUTF());
        
}
catch(EOFException e)
{eof=true;}
}}
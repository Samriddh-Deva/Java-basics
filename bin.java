import java.io.*;
public class bin
{
void main() throws IOException
 {   FileOutputStream fos=new FileOutputStream("samd.bin");
DataOutputStream dos=new DataOutputStream(fos);
dos.writeUTF("I Love My Country");
dos.close();
FileInputStream fis=new FileInputStream("samd.bin");
DataInputStream dis=new DataInputStream(fis);
System.out.print(dis.readUTF());
}
}
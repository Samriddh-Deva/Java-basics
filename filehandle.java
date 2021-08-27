import java.io.*;
public class filehandle
{
void main()throws IOException
{FileOutputStream fos=new FileOutputStream("sam.dat");
    DataOutputStream dos=new DataOutputStream(fos);
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.print(" ");
    dos.writeUTF(br.readLine());
    dos.close();
    fos.close();
}
}
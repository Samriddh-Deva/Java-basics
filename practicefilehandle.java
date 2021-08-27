import java.io.*;
public class practicefilehandle
{
 public static void main()throws IOException
 {   System.out.println("Ent");
     BufferedReader br2=new BufferedReader(new InputStreamReader(System.in));
     String n=br2.readLine();
     FileWriter fw=new FileWriter(n);
     BufferedWriter bw=new BufferedWriter(fw);
     PrintWriter pw=new PrintWriter(bw);
     String s="samriddh ";
     pw.println(s);
     pw.println("123");
     pw.close();
     FileReader pr=new FileReader(n);
     BufferedReader br=new BufferedReader(pr);
     System.out.println(br.readLine());
    System.out.println(Integer.parseInt(br.readLine()));
    
    }}
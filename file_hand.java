import java.io.*
;public class file_hand
{
    void main() throws IOException
    {
        
        
        int i=4;
        FileWriter fw=new FileWriter("samdking.dat");
        BufferedWriter bw= new BufferedWriter(fw);
        PrintWriter pw=new PrintWriter(bw);
        pw.print("Hello");
        pw.close();
        FileReader fr=new FileReader("samdking.dat");
        BufferedReader br=new BufferedReader(fr);
        System.out.print(br.readLine());
    }
}
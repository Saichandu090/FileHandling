package copyingfilecontentusingbuffer;

import java.io.*;

public class Reading
{
    public static void main(String[] args) {

        File f=new File("source1.txt");

        try(FileReader fr=new FileReader(f);
            BufferedReader br=new BufferedReader(fr);
            FileWriter fw=new FileWriter("destination1.txt");
            BufferedWriter bw=new BufferedWriter(fw))
        {
            String rs=br.readLine();
            while(rs!=null)
            {
                bw.write(rs);
                bw.newLine();
                rs=br.readLine();
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}

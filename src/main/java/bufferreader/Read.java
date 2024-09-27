package bufferreader;

import java.io.*;

public class Read
{
    public static void main(String[] args) {

        try(FileReader fr=new FileReader("input.txt");
           BufferedReader br=new BufferedReader(fr))
        {
            int rs=br.read();
            while(rs!=-1)
            {
                System.out.print((char) rs);
                rs=br.read();
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}

package countwordsinfile;

import java.io.BufferedReader;
import java.io.FileReader;

public class Counting
{
    public static void main(String[] args)
    {
        try(FileReader fr=new FileReader("text_file.txt");
            BufferedReader br=new BufferedReader(fr))
        {
            String rs=br.readLine();
            int r=1;
            while(rs!=null)
            {
                String[] t=rs.split(" ");
                System.out.println("Words in line "+(r++)+": "+t.length);
                rs=br.readLine();
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}

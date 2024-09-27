package copyfilecontent;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Reading
{
    public static void main(String[] args)
    {
       try( FileReader ff=new FileReader(new File("source.txt")))
       {
           int rs = ff.read();
           while (rs != -1) {
               System.out.print((char) rs);
               rs = ff.read();
           }
       }
       catch (IOException e)
       {
           e.printStackTrace();
       }
    }
}

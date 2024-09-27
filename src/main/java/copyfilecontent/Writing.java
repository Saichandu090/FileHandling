package copyfilecontent;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writing
{
    public static void main(String[] args)
    {
        try (FileWriter fr = new FileWriter(new File("destination.txt")))
        {
            fr.write("Hey sweet Heart,How was your day man?");
            fr.flush();
            fr.close();
            System.out.println("Data Stored");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}

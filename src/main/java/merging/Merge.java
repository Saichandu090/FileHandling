package merging;

import java.io.*;

public class Merge
{
    public static void main(String[] args)
    {
        try(FileReader fr1=new FileReader("file1.txt");
            FileReader fr2=new FileReader("file2.txt");
            FileReader fr3=new FileReader("file3.txt");

            BufferedReader br1=new BufferedReader(fr1);
            BufferedReader br2=new BufferedReader(fr2);
            BufferedReader br3=new BufferedReader(fr3);

            FileWriter fw=new FileWriter(new File("merged_feedback.txt"),true);
            BufferedWriter bw=new BufferedWriter(fw))
        {
            String s1=br1.readLine();
            while(s1!=null)
            {
                bw.write(s1);
                bw.newLine();
                s1=br1.readLine();
            }

            String s2=br2.readLine();
            while(s2!=null)
            {
                bw.write(s2);
                bw.newLine();
                s2=br2.readLine();
            }

            String s3=br3.readLine();
            while(s3!=null)
            {
                bw.write(s3);
                bw.newLine();
                s3= br3.readLine();
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}

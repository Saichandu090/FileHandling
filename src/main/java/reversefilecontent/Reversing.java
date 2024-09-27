package reversefilecontent;

import java.io.*;

public class Reversing
{
    public static void main(String[] args) {

        File f=new File("input.txt");
        try(FileReader fr=new FileReader(f);
            BufferedReader br=new BufferedReader(fr);
            FileWriter fw=new FileWriter("reversed.txt");
            BufferedWriter bw=new BufferedWriter(fw))
        {
            String input=br.readLine();
            while(input!=null)
            {
                StringBuilder ss = new StringBuilder();
                ss.append(input);
                ss.reverse();
                bw.write(ss.toString());
                bw.newLine();
                bw.flush();
                System.out.println(ss);
                input=br.readLine();
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}

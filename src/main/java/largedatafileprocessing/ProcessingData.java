package largedatafileprocessing;

import java.io.*;

public class ProcessingData
{
    public static void main(String[] args)
    {
        File old=new File("transaction.txt");
        File n=new File("filtered_transactions.txt");


        try(FileReader fr=new FileReader(old);
            BufferedReader br=new BufferedReader(fr);
            FileWriter fw=new FileWriter(n);
            BufferedWriter bw=new BufferedWriter(fw))
        {
            String rs=br.readLine();
            while(rs!=null)
            {
                String[] qw=rs.split(",");
                double amount=Double.parseDouble(qw[2]);
                if(amount>900.0)
                {
                    bw.write(rs);
                    bw.newLine();
                }
                rs=br.readLine();
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}

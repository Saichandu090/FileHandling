package filewriter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Writing
{
    public static void main(String[] args)
    {
        try(Scanner sc=new Scanner(System.in);
            FileWriter fw=new FileWriter("user_input.txt"))
        {
            System.out.println("Enter the data to enter inside the file : ");
            String data=sc.nextLine();

            fw.write(data);
            fw.flush();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}

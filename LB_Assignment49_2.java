import java.util.*;
import java.io.*;

class LB_Assignment49_2
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter file name : ");
        String Fname = sobj.nextLine();

        try
        {
            FileInputStream fiobj = new FileInputStream(Fname);

            int i = 0;

            while((i = fiobj.read()) != -1)
            {
                System.out.print((char)i);
            }

            fiobj.close();
        }
        catch(Exception obj)
        {
            System.out.println("Unable to open file");
        }
    }
}
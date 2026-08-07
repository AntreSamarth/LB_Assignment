import java.util.*;
import java.io.*;

class LB_Assignment49_1
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter file name : ");
        String Fname = sobj.nextLine();

        try
        {
            FileInputStream fiobj = new FileInputStream(Fname);
            System.out.println("File opened successfully...");
            fiobj.close();
        }
        catch(Exception obj)
        {
            System.out.println("Unable to open file");
        }
    }
}
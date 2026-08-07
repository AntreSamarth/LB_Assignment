import java.util.*;
import java.io.*;

class LB_Assignment49_4
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter file name : ");
        String Fname = sobj.nextLine();

        try
        {
            File fobj = new File(Fname);

            if(fobj.createNewFile())
            {
                System.out.println("File gets created successfully");
            }
            else
            {
                System.out.println("File is already present");
            }
        }
        catch(Exception obj)
        {
            System.out.println("Unable to create file");
        }
    }
}
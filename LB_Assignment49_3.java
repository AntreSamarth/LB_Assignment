import java.util.*;
import java.io.*;

class LB_Assignment49_3
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter file name : ");
        String Fname = sobj.nextLine();

        System.out.print("\nEnter data : ");
        String Data = sobj.nextLine();

        try
        {
            FileWriter fwobj = new FileWriter(Fname, true);

            fwobj.write(Data);
            fwobj.write("\n");

            fwobj.close();

            System.out.println("Data written successfully...");
        }
        catch(Exception obj)
        {
            System.out.println("Unable to write file");
        }
    }
}
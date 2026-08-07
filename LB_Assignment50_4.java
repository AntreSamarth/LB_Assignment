import java.util.*;
import java.io.*;

class LB_Assignment50_4
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter file name : ");
        String Fname = sobj.nextLine();

        int Checksum = 0;

        try
        {
            FileInputStream fiobj = new FileInputStream(Fname);

            int i = 0;

            while((i = fiobj.read()) != -1)
            {
                Checksum = Checksum + i;
            }

            fiobj.close();

            System.out.println("Checksum is : " + Checksum);
        }
        catch(Exception obj)
        {
            System.out.println(obj);
        }
    }
}
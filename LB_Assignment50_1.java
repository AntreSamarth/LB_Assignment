import java.util.*;
import java.io.*;

class LB_Assignment50_1
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter source file name : ");
        String Src = sobj.nextLine();

        System.out.print("Enter destination file name : ");
        String Dest = sobj.nextLine();

        try
        {
            FileInputStream fiobj = new FileInputStream(Src);
            FileOutputStream foobj = new FileOutputStream(Dest);

            int i = 0;

            while((i = fiobj.read()) != -1)
            {
                foobj.write(i);
            }

            fiobj.close();
            foobj.close();

            System.out.println("File copied successfully...");
        }
        catch(Exception obj)
        {
            System.out.println(obj);
        }
    }
}
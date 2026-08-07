import java.util.*;
import java.io.*;

class Program5
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter directory name : ");
        String Dname = sobj.nextLine();

        File fobj = new File(Dname);

        if(fobj.exists() && fobj.isDirectory())
        {
            String Files[] = fobj.list();

            System.out.println("Files are :");

            for(int i = 0; i < Files.length; i++)
            {
                System.out.println(Files[i]);
            }
        }
        else
        {
            System.out.println("Directory not found");
        }
    }
}
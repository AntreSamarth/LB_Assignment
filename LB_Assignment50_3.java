import java.util.*;
import java.io.*;

class Program3
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter directory name : ");
        String Dname = sobj.nextLine();

        File fobj = new File(Dname);

        if(fobj.mkdir())
        {
            System.out.println("Directory created successfully");
        }
        else
        {
            System.out.println("Directory already exists or cannot be created");
        }
    }
}
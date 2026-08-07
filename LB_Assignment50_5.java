import java.util.*;
import java.io.*;

class LB_Assignment50_5
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter directory name : ");
        String Dname = sobj.nextLine();

        File fobj = new File(Dname);

        if(fobj.exists() && fobj.isDirectory())
        {
            File Arr[] = fobj.listFiles();

            System.out.println("Files in directory are :");

            for(int i = 0; i < Arr.length; i++)
            {
                if(Arr[i].isFile())
                {
                    System.out.println(Arr[i].getName() + "\t" + Arr[i].length() + " Bytes");
                }
            }
        }
        else
        {
            System.out.println("Directory not found");
        }
    }
}
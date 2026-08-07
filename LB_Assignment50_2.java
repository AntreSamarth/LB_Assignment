import java.util.*;
import java.io.*;

class LB_Assignment50_2
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter file name : ");
        String Fname = sobj.nextLine();

        File fobj = new File(Fname);

        if(fobj.exists() && fobj.isFile())
        {
            System.out.println("It is a Regular File");
        }
        else
        {
            System.out.println("It is not a Regular File");
        }
    }
}
import java.io.*;
import java.util.*;

class Program3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter directory name : ");
        String DirName = sobj.nextLine();

        File fobj = new File(DirName);

        if(fobj.exists() && fobj.isDirectory())
        {
            File Arr[] = fobj.listFiles();

            try
            {
                FileWriter fw = new FileWriter("Marvellous.txt");

                for(int i = 0; i < Arr.length; i++)
                {
                    if(Arr[i].isFile())
                    {
                        FileReader fr = new FileReader(Arr[i]);

                        int ch = 0;

                        while((ch = fr.read()) != -1)
                        {
                            fw.write(ch);
                        }

                        fr.close();
                    }
                }

                fw.close();

                System.out.println("Data copied successfully");
            }
            catch(IOException e)
            {
                System.out.println("Unable to perform operation");
            }
        }
        else
        {
            System.out.println("Directory not found");
        }
    }
}
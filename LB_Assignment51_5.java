import java.io.*;
import java.util.*;

class Program5
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
                        fw.write("File Name : " + Arr[i].getName());
                        fw.write("\n");

                        fw.write("File Size : " + Arr[i].length() + " bytes");
                        fw.write("\n");

                        FileReader fr = new FileReader(Arr[i]);

                        int ch = 0;

                        while((ch = fr.read()) != -1)
                        {
                            fw.write(ch);
                        }

                        fw.write("\n-----------------------------\n");

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
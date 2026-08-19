import java.util.*;

class Program2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter sentence : ");
        String str = sobj.nextLine();

        str = str.trim();
        str = str.replaceAll("\\s+", " ");

        String Tokens[] = str.split(" ");

        String temp = Tokens[0];

        for(int i = 1; i < Tokens.length; i++)
        {
            if(Tokens[i].length() > temp.length())
            {
                temp = Tokens[i];
            }
        }

        System.out.println("Longest word : " + temp);
    }
}
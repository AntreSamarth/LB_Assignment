import java.util.*;

class Program1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter sentence : ");
        String str = sobj.nextLine();

        str = str.trim();
        str = str.replaceAll("\\s+", " ");

        String Tokens[] = str.split(" ");

        StringBuffer FinalStr = new StringBuffer("");

        for(int i = 0; i < Tokens.length; i++)
        {
            StringBuffer sb = new StringBuffer(Tokens[i]);

            sb.reverse();

            FinalStr.append(sb);
            FinalStr.append(" ");
        }

        System.out.println(FinalStr.toString().trim());
    }
}
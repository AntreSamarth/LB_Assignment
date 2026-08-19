import java.io.*;

class Program2
{
    public static void main(String A[]) throws Exception
    {
        int iNo = 0;
        int iSquare = 0;

        BufferedReader bobj =
            new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter number : ");
        iNo = Integer.parseInt(bobj.readLine());

        iSquare = iNo * iNo;

        String strNo = String.valueOf(iNo);
        String strSquare = String.valueOf(iSquare);

        if(strSquare.endsWith(strNo))
        {
            System.out.println("Automorphic Number");
        }
        else
        {
            System.out.println("Not Automorphic Number");
        }
    }
}
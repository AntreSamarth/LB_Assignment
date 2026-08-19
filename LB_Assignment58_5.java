import java.io.*;

class Program5
{
    public static void main(String A[]) throws Exception
    {
        int iNo = 0;
        int iTemp = 0;
        int iDigit = 0;
        int iRev = 0;

        BufferedReader bobj =
            new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter number : ");
        iNo = Integer.parseInt(bobj.readLine());

        iTemp = iNo;

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            iRev = iRev * 10 + iDigit;

            iNo = iNo / 10;
        }

        if(iRev == iTemp)
        {
            System.out.println("Palindrome Number");
        }
        else
        {
            System.out.println("Not Palindrome Number");
        }
    }
}
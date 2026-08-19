import java.io.*;

class Program1
{
    public static void main(String A[]) throws Exception
    {
        int iNo = 0;
        int iTemp = 0;
        int iDigit = 0;
        int iFact = 0;
        int iSum = 0;

        BufferedReader bobj =
            new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter number : ");
        iNo = Integer.parseInt(bobj.readLine());

        iTemp = iNo;

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            iFact = 1;

            while(iDigit != 0)
            {
                iFact = iFact * iDigit;
                iDigit--;
            }

            iSum = iSum + iFact;

            iNo = iNo / 10;
        }

        if(iSum == iTemp)
        {
            System.out.println("Strong Number");
        }
        else
        {
            System.out.println("Not Strong Number");
        }
    }
}
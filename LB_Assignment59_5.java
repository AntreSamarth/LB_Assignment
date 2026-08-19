import java.io.*;

class Program5
{
    public static void main(String A[]) throws Exception
    {
        int iNo = 0;
        int iTemp = 0;
        int iDigit = 0;
        int iCount = 0;
        int iPower = 0;
        int iSum = 0;

        BufferedReader bobj =
            new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter number : ");
        iNo = Integer.parseInt(bobj.readLine());

        iTemp = iNo;

        while(iTemp != 0)
        {
            iCount++;
            iTemp = iTemp / 10;
        }

        iTemp = iNo;

        while(iTemp != 0)
        {
            iDigit = iTemp % 10;

            iPower = 1;

            for(int i = 1; i <= iCount; i++)
            {
                iPower = iPower * iDigit;
            }

            iSum = iSum + iPower;

            iCount--;

            iTemp = iTemp / 10;
        }

        if(iSum == iNo)
        {
            System.out.println("Disarium Number");
        }
        else
        {
            System.out.println("Not Disarium Number");
        }
    }
}
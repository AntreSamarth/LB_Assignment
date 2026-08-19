bimport java.io.*;

class Program4
{
    public static void main(String A[]) throws Exception
    {
        int iNo = 0;
        int iValue = 0;
        int i = 0;

        BufferedReader bobj =
            new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter number : ");
        iNo = Integer.parseInt(bobj.readLine());

        iValue = iNo + 1;

        for(i = 1; i * i <= iValue; i++)
        {
            if(i * i == iValue)
            {
                break;
            }
        }

        if(i * i == iValue)
        {
            System.out.println("Sunny Number");
        }
        else
        {
            System.out.println("Not Sunny Number");
        }
    }
}
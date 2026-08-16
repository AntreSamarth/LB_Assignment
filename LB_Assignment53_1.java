import java.io.*;

class Program1
{
    public static void main(String A[]) throws Exception
    {
        int iHours = 0;
        int iFee = 0;

        BufferedReader bobj =
            new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter total parking hours : ");
        iHours = Integer.parseInt(bobj.readLine());

        if(iHours < 0)
        {
            System.out.println("Invalid Input");
        }
        else
        {
            if(iHours <= 2)
            {
                iFee = 20;
            }
            else
            {
                iFee = 20 + ((iHours - 2) * 10);
            }

            if(iHours > 10)
            {
                iFee = iFee + 50;
            }

            System.out.println("Total Parking Duration: " + iHours + " hours");
            System.out.println("Total Parking Fee: ₹" + iFee);
        }
    }
}
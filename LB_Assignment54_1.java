import java.io.*;

class Program1
{
    public static void main(String A[]) throws Exception
    {
        int iDistance = 0;
        int iFare = 50;
        String strPeak = null;

        BufferedReader bobj =
            new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter distance in km : ");
        iDistance = Integer.parseInt(bobj.readLine());

        System.out.println("Peak hour (Yes/No) : ");
        strPeak = bobj.readLine();

        if(iDistance < 0)
        {
            System.out.println("Invalid Input");
        }
        else if(!strPeak.equalsIgnoreCase("Yes") &&
                !strPeak.equalsIgnoreCase("No"))
        {
            System.out.println("Invalid Input");
        }
        else
        {
            if(iDistance <= 10)
            {
                iFare = iFare + (iDistance * 12);
            }
            else
            {
                iFare = iFare + (10 * 12);
                iFare = iFare + ((iDistance - 10) * 15);
            }

            if(strPeak.equalsIgnoreCase("Yes"))
            {
                iFare = iFare + (iFare * 20 / 100);
            }

            System.out.println("Distance: " + iDistance + " km");
            System.out.println("Peak Hour: " + strPeak);
            System.out.println("Total Fare: ₹" + iFare);
        }
    }
}
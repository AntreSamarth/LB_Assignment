import java.io.*;

class Program4
{
    public static void main(String A[]) throws Exception
    {
        String strHelmet = null;
        String strLicense = null;
        String strOverspeeding = null;

        int iFine = 0;

        BufferedReader bobj =
            new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Helmet worn (Yes/No) : ");
        strHelmet = bobj.readLine();

        System.out.println("License available (Yes/No) : ");
        strLicense = bobj.readLine();

        System.out.println("Overspeeding (Yes/No) : ");
        strOverspeeding = bobj.readLine();

        if((!strHelmet.equalsIgnoreCase("Yes") &&
            !strHelmet.equalsIgnoreCase("No")) ||
           (!strLicense.equalsIgnoreCase("Yes") &&
            !strLicense.equalsIgnoreCase("No")) ||
           (!strOverspeeding.equalsIgnoreCase("Yes") &&
            !strOverspeeding.equalsIgnoreCase("No")))
        {
            System.out.println("Invalid Input");
        }
        else
        {
            if(strHelmet.equalsIgnoreCase("No"))
            {
                iFine = iFine + 500;
            }

            if(strLicense.equalsIgnoreCase("No"))
            {
                iFine = iFine + 1000;
            }

            if(strOverspeeding.equalsIgnoreCase("Yes"))
            {
                iFine = iFine + 1500;
            }

            System.out.println("Total Fine Amount: ₹" + iFine);
        }
    }
}
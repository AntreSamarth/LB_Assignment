import java.io.*;

class Program5
{
    public static void main(String A[]) throws Exception
    {
        int iBattery = 0;
        String strStatus = null;

        BufferedReader bobj =
            new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter battery percentage : ");
        iBattery = Integer.parseInt(bobj.readLine());

        if(iBattery < 0 || iBattery > 100)
        {
            System.out.println("Invalid Input");
        }
        else
        {
            if(iBattery <= 5)
            {
                strStatus = "Critical";
            }
            else if(iBattery <= 15)
            {
                strStatus = "Low";
            }
            else
            {
                strStatus = "Normal";
            }

            System.out.println("Battery Percentage: " + iBattery + "%");
            System.out.println("Status: " + strStatus);
        }
    }
}
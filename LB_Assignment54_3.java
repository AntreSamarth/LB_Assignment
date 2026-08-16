import java.io.*;

class Program3
{
    public static void main(String A[]) throws Exception
    {
        int iWeight = 0;
        int iCharge = 0;

        BufferedReader bobj =
            new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter parcel weight in kg : ");
        iWeight = Integer.parseInt(bobj.readLine());

        if(iWeight <= 0)
        {
            System.out.println("Invalid Input");
        }
        else
        {
            if(iWeight <= 1)
            {
                iCharge = 50;
            }
            else if(iWeight <= 5)
            {
                iCharge = 50 + ((iWeight - 1) * 20);
            }
            else
            {
                iCharge = 150 + ((iWeight - 5) * 30);
            }

            System.out.println("Parcel Weight: " + iWeight + " kg");
            System.out.println("Courier Charge: ₹" + iCharge);
        }
    }
}
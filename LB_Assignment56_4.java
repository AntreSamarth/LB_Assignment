import java.io.*;

class Program5
{
    public static void main(String A[]) throws Exception
    {
        int minutes = 0;
        double totalBill = 0;

        BufferedReader bobj =
            new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter call duration in minutes : ");
        minutes = Integer.parseInt(bobj.readLine());

        if(minutes < 0)
        {
            System.out.println("Invalid call duration");
            return;
        }

        if(minutes <= 5)
        {
            totalBill = 0;
        }
        else if(minutes <= 15)
        {
            totalBill = (minutes - 5) * 1;
        }
        else
        {
            totalBill = (10 * 1)
                      + ((minutes - 15) * 2);
        }

        System.out.println("Call Duration : " + minutes + " minutes");
        System.out.println("Total Call Charge : ₹" + totalBill);
    }
}
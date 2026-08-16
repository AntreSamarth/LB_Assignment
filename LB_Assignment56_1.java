import java.io.*;

class Program1
{
    public static void main(String A[]) throws Exception
    {
        int days = 0;
        double totalBill = 0;
        double finalBill = 0;

        BufferedReader bobj =
            new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter number of days stayed : ");
        days = Integer.parseInt(bobj.readLine());

        if(days < 0)
        {
            System.out.println("Invalid number of days");
            return;
        }

        totalBill = days * 3000;

        finalBill = totalBill;

        if(days > 7)
        {
            finalBill = totalBill - (totalBill * 0.05);
        }

        System.out.println("Total Stay Duration : " + days + " days");
        System.out.println("Final Bill Amount : ₹" + finalBill);
    }
}
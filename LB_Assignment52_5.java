import java.io.*;

class Program5
{
    public static void main(String A[]) throws Exception
    {
        int amount = 0;
        double discount = 0;
        double finalAmount = 0;
        String membershipType = null;

        BufferedReader bobj =
            new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter purchase amount : ");
        amount = Integer.parseInt(bobj.readLine());

        System.out.println("Enter membership type (Premium/Regular) : ");
        membershipType = bobj.readLine();

        if(amount < 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        if(!membershipType.equalsIgnoreCase("Premium") &&
           !membershipType.equalsIgnoreCase("Regular"))
        {
            System.out.println("Invalid Input");
            return;
        }

        if(amount > 5000)
        {
            discount = amount * 0.20;
        }
        else if(amount > 2000)
        {
            discount = amount * 0.10;
        }
        else
        {
            discount = 0;
        }

        finalAmount = amount - discount;

        if(membershipType.equalsIgnoreCase("Premium"))
        {
            finalAmount = finalAmount - (finalAmount * 0.05);
        }

        System.out.println("Original Amount: ₹" + amount);
        System.out.println("Total Discount: ₹" + (amount - finalAmount));
        System.out.println("Final Payable Amount: ₹" + finalAmount);
    }
}
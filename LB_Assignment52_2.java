import java.io.*;

class Program2
{
    public static void main(String A[]) throws Exception
    {
        int balance = 0;
        int withdrawalAmount = 0;
        int remainingBalance = 0;

        BufferedReader bobj =
            new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter current balance : ");
        balance = Integer.parseInt(bobj.readLine());

        System.out.println("Enter requested withdrawal amount : ");
        withdrawalAmount = Integer.parseInt(bobj.readLine());

        if(balance < 0 || withdrawalAmount <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        if(withdrawalAmount % 100 != 0)
        {
            System.out.println("Transaction Failed: Withdrawal amount must be a multiple of ₹100");
        }
        else if(withdrawalAmount > 25000)
        {
            System.out.println("Transaction Failed: Maximum withdrawal limit is ₹25000");
        }
        else
        {
            remainingBalance = balance - withdrawalAmount;

            if(remainingBalance < 1000)
            {
                System.out.println("Transaction Failed: Minimum balance of ₹1000 must be maintained");
            }
            else
            {
                System.out.println("Transaction Successful");
                System.out.println("Remaining Balance: ₹" + remainingBalance);
            }
        }
    }
}
import java.io.*;

class Program3
{
    public static void main(String A[]) throws Exception
    {
        int iStock = 0;
        int iQuantity = 0;
        int iRemaining = 0;

        BufferedReader bobj =
            new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter current stock : ");
        iStock = Integer.parseInt(bobj.readLine());

        System.out.println("Enter requested quantity : ");
        iQuantity = Integer.parseInt(bobj.readLine());

        if(iStock < 0 || iQuantity <= 0)
        {
            System.out.println("Invalid Input");
        }
        else if(iQuantity > iStock)
        {
            System.out.println("Order Failed: Insufficient Stock.");
        }
        else
        {
            iRemaining = iStock - iQuantity;

            System.out.println("Order Processed Successfully.");
            System.out.println("Remaining Stock: " + iRemaining);

            if(iRemaining < 5)
            {
                System.out.println("Low Stock Alert!");
            }
        }
    }
}
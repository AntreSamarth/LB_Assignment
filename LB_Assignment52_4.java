import java.util.*;

class Program4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int units = 0;
        int weeksLate = 0;

        double fixedCharge = 0;
        double billAmount = 0;
        double penalty = 0;
        double finalBill = 0;

        double rate1 = 0;
        double rate2 = 0;
        double rate3 = 0;

        System.out.println("Enter units : ");
        units = sobj.nextInt();

        System.out.println("Enter fixed meter charge : ");
        fixedCharge = sobj.nextDouble();

        System.out.println("Enter rate for first slab : ");
        rate1 = sobj.nextDouble();

        System.out.println("Enter rate for second slab : ");
        rate2 = sobj.nextDouble();

        System.out.println("Enter rate for third slab : ");
        rate3 = sobj.nextDouble();

        System.out.println("Enter weeks late : ");
        weeksLate = sobj.nextInt();

        if(units <= 100)
        {
            billAmount = units * rate1;
        }
        else if(units <= 200)
        {
            billAmount = (100 * rate1)
                        + ((units - 100) * rate2);
        }
        else
        {
            billAmount = (100 * rate1)
                        + (100 * rate2)
                        + ((units - 200) * rate3);
        }

        billAmount = billAmount + fixedCharge;

        penalty = weeksLate * 0.02;

        if(penalty > 0.10)
        {
            penalty = 0.10;
        }

        finalBill = billAmount + (billAmount * penalty);

        System.out.println("Bill Amount : " + billAmount);
        System.out.println("Penalty : " + (billAmount * penalty));
        System.out.println("Final Bill : " + finalBill);
    }
}
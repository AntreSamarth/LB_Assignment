import java.util.*;

class Program1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int days = 0;
        String wardType = null;
        double medicineBill = 0;
        double consultationFee = 0;
        String insured = null;

        double roomCharge = 0;
        double totalBill = 0;
        double insuranceCover = 0;
        double finalPay = 0;

        System.out.println("Enter number of days : ");
        days = sobj.nextInt();

        System.out.println("Enter ward type (Normal/ICU) : ");
        wardType = sobj.next();

        System.out.println("Enter medicine bill : ");
        medicineBill = sobj.nextDouble();

        System.out.println("Enter consultation fee : ");
        consultationFee = sobj.nextDouble();

        System.out.println("Enter insured (Yes/No) : ");
        insured = sobj.next();

        System.out.println("Enter room charge per day : ");
        roomCharge = sobj.nextDouble();

        totalBill = (days * roomCharge)
                    + medicineBill
                    + consultationFee;

        if(insured.equalsIgnoreCase("Yes"))
        {
            insuranceCover = Math.min(50000, totalBill * 0.70);
        }
        else
        {
            insuranceCover = 0;
        }

        finalPay = totalBill - insuranceCover;

        System.out.println("Total Bill       : " + totalBill);
        System.out.println("Insurance Cover  : " + insuranceCover);
        System.out.println("Final Pay        : " + finalPay);
    }
}
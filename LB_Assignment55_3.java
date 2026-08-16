import java.util.*;

class Program3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        double mins = 0;
        double gb = 0;
        double sms = 0;

        double planMins = 0;
        double planGB = 0;
        double planSMS = 0;
        double planCost = 0;

        double cheapest = Double.MAX_VALUE;
        int recommendedPlan = 0;

        System.out.println("Enter calls in minutes : ");
        mins = sobj.nextDouble();

        System.out.println("Enter data in GB : ");
        gb = sobj.nextDouble();

        System.out.println("Enter SMS count : ");
        sms = sobj.nextDouble();

        for(int i = 1; i <= 4; i++)
        {
            System.out.println("\nEnter details of Plan " + i);

            System.out.println("Enter plan minutes : ");
            planMins = sobj.nextDouble();

            System.out.println("Enter plan data in GB : ");
            planGB = sobj.nextDouble();

            System.out.println("Enter plan SMS : ");
            planSMS = sobj.nextDouble();

            System.out.println("Enter plan cost : ");
            planCost = sobj.nextDouble();

            if(mins <= planMins &&
               gb <= planGB &&
               sms <= planSMS)
            {
                if(planCost < cheapest)
                {
                    cheapest = planCost;
                    recommendedPlan = i;
                }
            }
        }

        if(recommendedPlan == 0)
        {
            System.out.println("No suitable plan available");
        }
        else
        {
            System.out.println("Recommended Plan : " + recommendedPlan);
            System.out.println("Total Cost : " + cheapest);
        }
    }
}
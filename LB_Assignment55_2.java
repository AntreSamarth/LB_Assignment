import java.util.*;

class Program2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        double distance = 0;
        String classType = null;
        double bookingHoursBefore = 0;
        int age = 0;

        double sleeperFare = 0;
        double ac3Fare = 0;
        double ac2Fare = 0;

        double finalFare = 0;

        System.out.println("Enter distance : ");
        distance = sobj.nextDouble();

        System.out.println("Enter class (Sleeper/3AC/2AC) : ");
        classType = sobj.next();

        System.out.println("Enter booking hours before : ");
        bookingHoursBefore = sobj.nextDouble();

        System.out.println("Enter age : ");
        age = sobj.nextInt();

        System.out.println("Enter Sleeper fare per km : ");
        sleeperFare = sobj.nextDouble();

        System.out.println("Enter 3AC fare per km : ");
        ac3Fare = sobj.nextDouble();

        System.out.println("Enter 2AC fare per km : ");
        ac2Fare = sobj.nextDouble();

        if(classType.equalsIgnoreCase("Sleeper"))
        {
            finalFare = distance * sleeperFare;
        }
        else if(classType.equalsIgnoreCase("3AC"))
        {
            finalFare = distance * ac3Fare;
        }
        else if(classType.equalsIgnoreCase("2AC"))
        {
            finalFare = distance * ac2Fare;
        }
        else
        {
            System.out.println("Invalid class");
            return;
        }

        if(bookingHoursBefore <= 24)
        {
            finalFare = finalFare + (finalFare * 0.30);
        }

        if(age >= 60)
        {
            finalFare = finalFare - (finalFare * 0.40);
        }

        System.out.println("Final Fare : " + finalFare);
    }
}
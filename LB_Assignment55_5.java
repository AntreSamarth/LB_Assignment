import java.util.*;

class Program5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int rows = 0;
        int cols = 0;

        System.out.println("Enter number of rows : ");
        rows = sobj.nextInt();

        System.out.println("Enter number of columns : ");
        cols = sobj.nextInt();

        int rowPrice[] = new int[rows];

        for(int i = 0; i < rows; i++)
        {
            System.out.println("Enter price of row " + (i + 1) + " : ");
            rowPrice[i] = sobj.nextInt();
        }

        boolean bookedSeat[][] = new boolean[rows][cols];

        System.out.println("Enter number of already booked seats : ");
        int bookedSeatCount = sobj.nextInt();

        for(int i = 0; i < bookedSeatCount; i++)
        {
            System.out.println("Enter booked seat row : ");
            int row = sobj.nextInt();

            System.out.println("Enter booked seat column : ");
            int col = sobj.nextInt();

            bookedSeat[row - 1][col - 1] = true;
        }

        System.out.println("Enter number of seats to book : ");
        int requestedSeatCount = sobj.nextInt();

        int requestedRow[] = new int[requestedSeatCount];
        int requestedCol[] = new int[requestedSeatCount];

        boolean success = true;

        for(int i = 0; i < requestedSeatCount; i++)
        {
            System.out.println("Enter requested seat row : ");
            requestedRow[i] = sobj.nextInt();

            System.out.println("Enter requested seat column : ");
            requestedCol[i] = sobj.nextInt();

            int row = requestedRow[i] - 1;
            int col = requestedCol[i] - 1;

            if(row < 0 || row >= rows ||
               col < 0 || col >= cols)
            {
                success = false;
            }
            else if(bookedSeat[row][col] == true)
            {
                success = false;
            }
        }

        double totalCost = 0;

        if(success == true)
        {
            for(int i = 0; i < requestedSeatCount; i++)
            {
                int row = requestedRow[i] - 1;
                int col = requestedCol[i] - 1;

                bookedSeat[row][col] = true;

                totalCost = totalCost + rowPrice[row];
            }

            if(requestedSeatCount >= 6)
            {
                totalCost = totalCost - (totalCost * 0.10);
            }

            System.out.println("Booking successful");
            System.out.println("Total Cost : " + totalCost);
        }
        else
        {
            System.out.println("Booking failed");
        }

        int remainingSeats = 0;

        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                if(bookedSeat[i][j] == false)
                {
                    remainingSeats++;
                }
            }
        }

        System.out.println("Remaining Seats : " + remainingSeats);
    }
}
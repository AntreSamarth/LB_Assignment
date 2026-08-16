import java.io.*;

class Program3
{
    public static void main(String A[]) throws Exception
    {
        int steps = 0;
        int goal = 0;
        int goalAchievedDays = 0;
        int maximumSteps = 0;

        BufferedReader bobj =
            new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter daily step goal : ");
        goal = Integer.parseInt(bobj.readLine());

        if(goal < 0)
        {
            System.out.println("Invalid goal");
            return;
        }

        for(int i = 1; i <= 7; i++)
        {
            System.out.println("Enter steps for day " + i + " : ");
            steps = Integer.parseInt(bobj.readLine());

            if(steps < 0)
            {
                System.out.println("Invalid steps");
                return;
            }

            if(steps >= goal)
            {
                goalAchievedDays++;
            }

            if(steps > maximumSteps)
            {
                maximumSteps = steps;
            }
        }

        System.out.println("Goal Achieved Days : " + goalAchievedDays);
        System.out.println("Maximum Steps in Week : " + maximumSteps);
    }
}
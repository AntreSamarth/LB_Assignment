import java.io.*;
import java.util.*;

class Program2
{
    public static void main(String A[]) throws Exception
    {
        int N = 0;
        int voterID = 0;
        int validVotes = 0;
        int rejectedVotes = 0;

        BufferedReader bobj =
            new BufferedReader(new InputStreamReader(System.in));

        HashSet<Integer> hobj = new HashSet<Integer>();

        System.out.println("Enter number of votes : ");
        N = Integer.parseInt(bobj.readLine());

        if(N <= 0)
        {
            System.out.println("Invalid number of votes");
            return;
        }

        for(int i = 0; i < N; i++)
        {
            System.out.println("Enter voter ID : ");
            voterID = Integer.parseInt(bobj.readLine());

            if(voterID < 0)
            {
                System.out.println("Invalid voter ID");
                rejectedVotes++;
            }
            else if(hobj.contains(voterID))
            {
                rejectedVotes++;
            }
            else
            {
                hobj.add(voterID);
                validVotes++;
            }
        }

        System.out.println("Valid Votes : " + validVotes);
        System.out.println("Rejected Duplicate Votes : " + rejectedVotes);
    }
}
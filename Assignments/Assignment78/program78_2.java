import java.util.*;

class program78_2
{

/////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Entry point function for the application
// 
/////////////////////////////////////////////////////////////////////////////////////////////////

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int N = 0, temp = 0;
        
        System.out.println("Enter no of votes :");
        N = sobj.nextInt();

        temp = N;

        if(N < 0)
        {
            System.out.println("Invalid Input.");
            return;
        }

        int VoterID [] = new int[N];
        int i = 0;
        int rejectedVotes = 0, validVotes = 0;

        System.out.println("Enter Voter ids for all :");
        for(i = 0; i<N; i++)
        {
            VoterID[i] = sobj.nextInt();

            if(VoterID[i] < 0)
            {
                System.out.println("Invalid Input.");
                return;
            } 
        }

        for(i = 0; i < N; i++)
        {
            boolean duplicate = false;

            for(int j = 0; j < i; j++)
            {
                if(VoterID[i] == VoterID[j])
                {
                    duplicate = true;
                    break;
                }
            }

            if(VoterID[i] < 0 || duplicate)
                rejectedVotes++;
            else
                validVotes++;
        }

        System.out.println("Total Valid Votes : " + validVotes);
        System.out.println("Rejected Votes : " + rejectedVotes);

        sobj.close();
    }
}

/*

Enter no of votes :
5
Enter Voter ids for all :
101
102
103
103
103
Total Valid Votes : 3
Rejected Votes : 2

Enter no of votes :
3
Enter Voter ids for all :
101
102
103
Total Valid Votes : 3
Rejected Votes : 0

*/
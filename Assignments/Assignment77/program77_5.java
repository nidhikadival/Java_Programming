import java.util.*;

class program77_5
{

/////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Entry point function for the application
// 
/////////////////////////////////////////////////////////////////////////////////////////////////
    
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        
        int R = 0;
        int C = 0;

        System.out.println("Enter no of rows :");
        R = sobj.nextInt();

        System.out.println("Enter no of columns :");
        C = sobj.nextInt();

        int Seats[][] = new int[R][C];

        int i = 0, j = 0;

        System.out.println("Enter booking Status : (1 : booked, 0 : empty)");
        for(i = 0; i < R; i++)
        {
            System.out.print("Row " + (i+1) + " : ");
            for(j = 0; j < C; j++)
            {
                Seats[i][j] = sobj.nextInt();
            }
        }

        // Requested seats
        System.out.println("Enter number of seats to book : ");
        int n = sobj.nextInt();

        int request[][] = new int[n][2];

        System.out.println("Enter seat positions (row column) : ");
        for(i = 0; i < n; i++)
        {
            request[i][0] = sobj.nextInt() - 1;  
            request[i][1] = sobj.nextInt() - 1;  
        }

        boolean possible = true;

        for(i = 0; i < n; i++)
        {
            int r = request[i][0];
            int c = request[i][1];

            if(r < 0 || r >= R || c < 0 || c >= C || Seats[r][c] == 1)
            {
                possible = false;
                break;
            }
        }

        if(possible == false)
        {
            System.out.println("Booking Failed.");
        }
        else
        {
            int totalCost = 0;
            int seatPrice = 0;

            for(i = 0; i < n; i++)
            {
                int r = request[i][0];
                seatPrice = 50 * (r + 1);  
                totalCost += seatPrice;
            }

            if(n >= 6)
            {
                totalCost = (int)(totalCost * 0.9);  
            }

            for(i = 0; i < n; i++)
            {
                int r = request[i][0];
                int c = request[i][1];
                Seats[r][c] = 1;
            }

            System.out.println("Booking Successful");
            System.out.println("Total Cost : " + totalCost);
        }

        int remaining = 0;
        for(i = 0; i < R; i++)
        {
            for(j = 0; j < C; j++)
            {
                if(Seats[i][j] == 0)
                {
                    remaining++;
                }
            }
        }

        System.out.println("Remaining Seats : " + remaining);

        sobj.close();
    }
}

/*

Enter no of rows :
4
Enter no of columns :
4
Enter booking Status : (1 : booked, 0 : empty)
Row 1 : 1 1 0 0 
Row 2 : 0 0 0 0
Row 3 : 1 1 1 0
Row 4 : 0 0 0 1
Enter number of seats to book : 
2
Enter seat positions (row column) : 
2 1
2 2
Booking Successful
Total Cost : 200
Remaining Seats : 8

Enter no of rows :
4
Enter no of columns :
4
Enter booking Status : (1 : booked, 0 : empty)
Row 1 : 0 0 0 0
Row 2 : 1 1 1 1
Row 3 : 0 0 1 1
Row 4 : 0 0 0 0
Enter number of seats to book : 
6
Enter seat positions (row column) : 
3 1
3 2
4 1
4 2
4 3
4 4
Booking Successful
Total Cost : 990
Remaining Seats : 4

Enter no of rows :
4
Enter no of columns :
4
Enter booking Status : (1 : booked, 0 : empty)
Row 1 : 0 1 1 0 
Row 2 : 1 0 0 0
Row 3 : 0 1 1 0
Row 4 : 1 1 1 1
Enter number of seats to book : 
2 
Enter seat positions (row column) : 
1 2
1 3
Booking Failed.
Remaining Seats : 7

*/
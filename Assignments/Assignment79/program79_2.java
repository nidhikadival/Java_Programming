import java.util.*;

class program79_2
{

/////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Entry point function for the application
// 
/////////////////////////////////////////////////////////////////////////////////////////////////

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Rows = 0;
        int Columns = 0;

        System.out.println("Enter no of Rows in Theatre:");
        Rows = sobj.nextInt();

        System.out.println("Enter no of Columns in Theatre:");
        Columns = sobj.nextInt();

        if(Rows <= 0 || Columns <= 0)
        {
            System.out.println("Invalid Input.");
            return;
        }

        int Seats[][] = new int[Rows][Columns];

        int i = 0, j = 0;

        System.out.println("Enter Booking Details (0/1):");
        for(i=0; i<Rows; i++)
        {
            System.out.println("Enter details of row "+(i+1));
            for(j=0;j<Columns;j++)
            {
                Seats[i][j] = sobj.nextInt();
                if(Seats[i][j] != 0 && Seats[i][j] != 1)
                {
                    System.out.println("Invalid Input.");
                    return;
                }
            }
        }

        int TotalBooked = 0;     // total booked seats
        int MaxBookedInRow = 0;
        int RowWithMax = 0;
        boolean FullRowExist = false;

        int RowBooked = 0;

        for(i=0; i<Rows; i++)
        {
            RowBooked = 0;
            for(j=0;j<Columns;j++)
            {
                if(Seats[i][j] == 1)
                {
                    TotalBooked++;
                }

                RowBooked = RowBooked + Seats[i][j];
            }

            if(RowBooked > MaxBookedInRow)
            {
                MaxBookedInRow = RowBooked;
                RowWithMax = i;
            }

            if(RowBooked == Columns)
            {
                FullRowExist = true;
            }
        }

        System.out.println("Total Booked Seats: " + TotalBooked);
        System.out.println("Max Booked Row is " + "Row " + (RowWithMax+1) );
        System.out.println("Full Row exists : " + (FullRowExist ? "Yes" : "No"));

        System.out.println("Seat Layout in Theatre:");
        for(i=0;i<Rows;i++)
        {
            for(j=0;j<Columns;j++)
            {
                System.out.print(Seats[i][j] + "\t");
            }
            System.out.println();
        }
        
        sobj.close();
    }
}

/*

Enter no of Rows in Theatre:
3
Enter no of Columns in Theatre:
4
Enter Booking Details (0/1):
Enter details of row 1
1 0 1 1
Enter details of row 2
1 1 1 1
Enter details of row 3
0 0 1 0
Total Booked Seats: 8
Max Booked Row is Row 2
Full Row exists : Yes
Seat Layout in Theatre:
1	0	1	1
1	1	1	1
0	0	1	0

*/
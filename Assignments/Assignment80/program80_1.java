import java.util.*;

class program80_1
{

/////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Entry point function for the application
// 
/////////////////////////////////////////////////////////////////////////////////////////////////

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Cities = 0;     // N
        System.out.println("Enter no of cities: ");
        Cities = sobj.nextInt();

        if(Cities <= 0)
        {
            System.out.println("Invalid Input.");
            return;
        }

        int Electricity[][] = new int[Cities][7];

        System.out.println("Enter electricity consumption of each city :");

        int i = 0, j = 0;
        for(i=0;i<Cities;i++)
        {
            System.out.print("City "+(i+1)+" :");
            for(j=0;j<7;j++)
            {
                Electricity[i][j] = sobj.nextInt();
                if(Electricity[i][j] < 0)
                {
                    System.out.println("Invalid Input.");
                    return;
                }
            }
        }

        int Weekly[] = new int[7];
        int HighestCity = 0;
        int MaxWeekly = 0;

        int PeakDay = 0;
        int MaxDayTotal = 0;

        int Sum = 0;

        for(i=0;i<Cities;i++)
        {
            Sum = 0;
            for(j=0;j<7;j++)
            {
                Sum = Sum + Electricity[i][j];      // row addition
                Weekly[i] = Sum;                    // memorized
            }

            if(Sum > MaxWeekly)
            {
                MaxWeekly = Sum;
                HighestCity = i;
            }
        }

        System.out.println("Highest Consumption : City "+(HighestCity));
        
       // day with max consumption

       int DaySum = 0;
       int Day = 0;

       for(Day = 0; Day < 7; Day++)
       {
            DaySum = 0;
            for(i=0;i<Cities;i++)
            {
                DaySum = DaySum + Electricity[i][Day];
            }
            
            if(DaySum > MaxDayTotal)
            {
                MaxDayTotal = DaySum;
                PeakDay = Day;
            }
       }

       
       System.out.println("Peak Consumption Day : Day "+PeakDay);

       System.out.println("Consumption value of the peak day : "+MaxDayTotal);

        System.out.println("Weekly Consumption of all cities :");
        for(i=0;i<Cities;i++)
        {
            System.out.println("City "+(i+1)+": "+Weekly[i]);
        }

        // Cities with more than 500 Consumption

        System.out.println("Cities with more than 500 Consumption");
        for(i=0;i<Cities;i++)
        {
            if(Weekly[i] > 500)
            {
                System.out.println("City "+(i+1));
            }
        }

        sobj.close();
    }
}

/*

Enter no of cities: 
3
Enter electricity consumption of each city :
City 1 : 80 90 99 60 70 75 80 
City 2 : 90 99 87 70 87 30 45 
City 3 : 40 70 60 40 80 44 55
Highest Consumption : City 0
Peak Consumption Day : Day 1
Consumption value of the peak day : 259
Weekly Consumption of all cities :
City 1: 554
City 2: 508
City 3: 389
Cities with more than 500 Consumption
City 1
City 2

*/
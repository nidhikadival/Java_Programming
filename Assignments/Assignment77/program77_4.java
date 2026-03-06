/*
Slabs :
    Within 10 Slabs -> ₹150
    Below >= 20 -> ₹150 + ₹100
    Below >= 30 -> ₹250 + ₹200
*/
import java.util.*;

class program77_4
{

/////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Entry point function for the application
// 
/////////////////////////////////////////////////////////////////////////////////////////////////

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Units = 0;
        int WeeksLate = 0;
        float Cost = 0;

        System.out.println("Enter Units : ");
        Units = sobj.nextInt();

        System.out.println("Enter how many weeks late : ");
        WeeksLate = sobj.nextInt();

        if((Units < 0) || (WeeksLate < 0))
        {
            System.out.println("Invalid Input.");
            return;
        }

        if(Units <= 10)
        {
            Cost = 150;
        }
        else if(Units>10 && Units<=15)
        {
            Cost = 150 + (Units - 10)*20;
        }
        else if(Units>15)
        {
            Cost = 250 + (Units - 15)*30;
        }

        if(WeeksLate <= 5)
        {
            Cost = Cost + (0.02f * WeeksLate)*Cost;
        }
        else
        {
            Cost = Cost + (0.02f * 5)*Cost;
        }

        System.out.println("Total Bill : ₹"+Cost);

        sobj.close();
    }
}

/*
Enter Units : 
6
Enter how many weeks late : 
0
Total Bill : ₹150.0

Enter Units : 
18
Enter how many weeks late : 
2
Total Bill : ₹353.6

Enter Units : 
20
Enter how many weeks late : 
3
Total Bill : ₹424.0
*/
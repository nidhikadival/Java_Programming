import java.util.*;

class program75_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Hours = 0;
        int Fine = 0;

        System.out.println("Enter hours :");
        Hours = sobj.nextInt();

        if(Hours < 0)
        {
            System.out.println("Invalid Input.");
            return;
        }

        if(Hours <= 2)
        {
            Fine = 20;
        }
        else if(Hours > 2)
        {
            Fine = 20 + ((Hours - 2) * 10);
        }
        
        if(Hours > 10)
        {
            Fine = Fine + 50;
        }

        System.out.println("Total Parking Duration : " + Hours + " hours.");
        System.out.println("Total Parking Fee : ₹"+Fine);

        sobj.close();
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Testcases successfully handled by the application
//
//  Enter hours :
//  1
//  Total Parking Duration : 1 hours.
//  Total Parking Fee : ₹20
//
//  Enter hours :
//  5
//  Total Parking Duration : 5 hours.
//  Total Parking Fee : ₹50
//
//  Enter hours :
//  12
//  Total Parking Duration : 12 hours.
//  Total Parking Fee : ₹170
/////////////////////////////////////////////////////////////////////////////////////////////////
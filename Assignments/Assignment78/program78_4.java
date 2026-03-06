import java.util.*;

class program78_4
{

/////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Entry point function for the application
// 
/////////////////////////////////////////////////////////////////////////////////////////////////

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Duration = 0;
        int Cost = 0;

        System.out.println("Enter the call duration in minutes :");
        Duration = sobj.nextInt();

        if(Duration < 0)
        {
            System.out.println("Invalid Input.");
            return;
        }

        if(Duration <= 5)
        {
            Cost = 0;
        }
        else if((Duration > 5) && (Duration <= 15))
        {
            Cost = Cost + 1 * (Duration - 5);
        }
        else if(Duration > 15)
        {
            Cost = 10 + 2 * (Duration - 15);
        }

        System.out.println("Call Duration : "+Duration+" mins");
        System.out.println("Total Call Charge : ₹"+Cost);

        sobj.close();
    }
}

/*

Enter the call duration in minutes :
4
Call Duration : 4 mins
Total Call Charge : ₹0

Enter the call duration in minutes :
10
Call Duration : 10 mins
Total Call Charge : ₹5

Enter the call duration in minutes :
18
Call Duration : 18 mins
Total Call Charge : ₹16

*/
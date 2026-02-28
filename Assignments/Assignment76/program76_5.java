import java.util.*;

class program76_5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Battery = 0;

        System.out.println("Enter your Battery Percentage : ");
        Battery = sobj.nextInt();

        if(Battery > 100 || Battery < 0)
        {
            System.out.println("Invalid Input.");
            return;
        }

        System.out.println("Battery Percentage : "+Battery+"%");

        if(Battery <= 5)
        {
            System.out.println("Status : Critical");
        }
        else if(Battery <= 15)
        {
            System.out.println("Status : Low");
        }
        else
        {
            System.out.println("Status : Normal");
        }

        sobj.close();
    }
}

/*
Enter your Battery Percentage : 
60
Battery Percentage : 60%
Status : Normal

Enter your Battery Percentage : 
12
Battery Percentage : 12%
Status : Low

Enter your Battery Percentage : 
1
Battery Percentage : 1%
Status : Critical

Enter your Battery Percentage : 
-9
Invalid Input.
*/
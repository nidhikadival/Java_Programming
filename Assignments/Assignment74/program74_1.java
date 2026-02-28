import java.util.*;

class program74_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int TotalDays = 0;
        int Fine = 0;

        System.out.println("Enter the number of days : ");
        TotalDays = sobj.nextInt();

        if(TotalDays < 0)
        {
            System.out.println("Invalid Input.");
            return;
        }

        if(TotalDays <= 7)
        {
            System.out.println("No Fine Applicable.");
            return;
        }
        else if((TotalDays >= 8) && (TotalDays <=12))
        {
            Fine = (TotalDays - 7) * 5;
        }
        else if(TotalDays > 12)
        {
            Fine = (5 * 5) + ((TotalDays - 12) * 10);
        }
        System.out.println("Total fine to be paid : ₹"+Fine);
    }
}

/*

Enter the number of days : 
7
No Fine Applicable.

Enter the number of days : 
9
Total fine to be paid : ₹10

Enter the number of days : 
11
Total fine to be paid : ₹20

Enter the number of days : 
15
Total fine to be paid : ₹55

*/
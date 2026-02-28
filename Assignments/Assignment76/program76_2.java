import java.util.*;

class program76_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Percentage = 0;
        int Attendance = 0;
        int Income = 0;

        System.out.println("Enter Percentage : ");
        Percentage = sobj.nextInt();

        System.out.println("Enter Attendance : ");
        Attendance = sobj.nextInt();

        System.out.println("Enter Family Income : ");
        Income = sobj.nextInt();

        if((Percentage < 0) || (Percentage > 100))
        {
            System.out.println("Invalid Input.");
            return;
        }

        if(Income < 0)
        {
            System.out.println("Invalid Input.");
            return;
        }

        if(Percentage < 80)
        {
            System.out.println("Schoralship Rejected : Marks must be greater than 80%");
        }
        else if(Attendance < 75)
        {
            System.out.println("Schoralship Rejected : Attendance must be greater than 75%");
        }
        else if(Income > 300000)
        {
            System.out.println("Schoralship Rejected : Family Income must be less than ₹3,00,000");
        }
        else
        {
            System.out.println("Schoralship Approved");
        }

        sobj.close();
    }
}

/*
Enter Percentage : 
60
Enter Attendance : 
80
Enter Family Income : 
210000
Schoralship Rejected : Marks must be greater than 80%

Enter Percentage : 
90
Enter Attendance : 
30
Enter Family Income : 
2000
Schoralship Rejected : Attendance must be greater than 75%

Enter Percentage : 
90
Enter Attendance : 
80
Enter Family Income : 
500000
Schoralship Rejected : Family Income must be less than ₹3,00,000

Enter Percentage : 
80
Enter Attendance : 
90
Enter Family Income : 
25000
Schoralship Approved
*/
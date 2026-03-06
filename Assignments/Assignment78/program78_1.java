import java.util.*;

class program78_1
{

/////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Entry point function for the application
// 
/////////////////////////////////////////////////////////////////////////////////////////////////

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Days = 0;
        System.out.println("Enter number of days stayed : ");
        Days = sobj.nextInt();

        if(Days < 0)
        {
            System.out.println("Invalid Input.");
            return;
        }

        int Cost = 0;
        
        Cost = Days * 3000;

        if(Days > 7)
        {
            Cost = Cost - (int)(0.05f * Cost);
        }

        System.out.println("Total Stay Duration : "+ Days+ " days");
        System.out.println("Final Bill Amount : ₹"+Cost);

        sobj.close();
    }
}

/*
Enter number of days stayed : 
2
Total Stay Duration : 2 days
Final Bill Amount : ₹6000

Enter number of days stayed : 
8
Total Stay Duration : 8 days
Final Bill Amount : ₹22800
*/
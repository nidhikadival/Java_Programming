import java.util.*;

class program74_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Units = 0;
        int Amount = 0;

        System.out.println("Enter total units consumed : ");
        Units = sobj.nextInt();

        if(Units < 0)
        {
            System.out.println("Units cannot be negative.");
            return;
        }

        if(Units <= 100)
        {
            Amount = (Units) * 5;
        }
        else if(Units <= 200)
        {
            Amount = (100 * 5) + (Units - 100) * 7;
        }
        else if(Units > 200)
        {
            Amount = (100 * 5) + (100 * 7) + (Units - 200) * 10;
        }

        System.out.println("Total Units Consumed : "+ Units);
        System.out.println("Total Electricity Bill : ₹"+ Amount);

        sobj.close();
    }
}

/*

Enter total units consumed : 
100
Total Units Consumed : 100
Total Electricity Bill : ₹500

Enter total units consumed : 
300
Total Units Consumed : 300
Total Electricity Bill : ₹2200

Enter total units consumed : 
150
Total Units Consumed : 150
Total Electricity Bill : ₹850

*/
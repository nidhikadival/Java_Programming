import java.util.*;

class program74_5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Amount = 0;
        String Membership_Type = null; 
        float Discount_Amount = 0.0f;
        float Final_Amount = 0.0f;

        System.out.println("Enter Purchase Amount : ");
        Amount = sobj.nextInt();

        System.out.println("Enter Membership Type : (Premium/Regular)");
        Membership_Type = sobj.next();

        if(
            (Amount < 0) ||
            (
                (Membership_Type.equalsIgnoreCase("Premium") == false ) &&
                (Membership_Type.equalsIgnoreCase("Regular") == false )
            )
        )
        {
            System.out.println("Invalid Input.");
            return;
        }

        if(Amount > 5000)
        {
            // 20%
            Discount_Amount = (float)(0.20f * Amount);
        }
        else if(Amount > 2000)
        {
            // 10%
            Discount_Amount = (float) (0.10f * Amount);
        }
        else
        {
            Discount_Amount = (float) (0.0f * Amount);
        }

        Final_Amount = Amount - Discount_Amount;

        if(Membership_Type.equalsIgnoreCase("Premium") == true)
        {
            Discount_Amount = Discount_Amount + (float) (0.05 * Final_Amount);
            Final_Amount = Amount - Discount_Amount;
        }

        System.out.println("Original Amount : "+ Amount);
        System.out.println("Total Discount : " + Discount_Amount);
        System.out.println("Final Payable Amount : " + Final_Amount);

        sobj.close();
    }
}

/*

Enter Purchase Amount : 
7000
Enter Membership Type : (Premium/Regular)
regular
Original Amount : 7000
Total Discount : 1400.0
Final Payable Amount : 5600.0

Enter Purchase Amount : 
7000
Enter Membership Type : (Premium/Regular)
premium
Original Amount : 7000
Total Discount : 1680.0
Final Payable Amount : 5320.0

*/
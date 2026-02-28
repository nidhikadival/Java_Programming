import java.util.*;

class program75_5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Annual_Income = 0;
        float Tax = 0.0f;

        System.out.println("Enter Annual Income: ");
        Annual_Income = sobj.nextInt();

        if(Annual_Income < 0)
        {
            System.out.println("Invalid Input.");
            return;
        }

        System.out.println("Annual Income : ₹"+Annual_Income);

        if(Annual_Income <= 250000)
        {
            System.out.println("Total Tax Payable : ₹"+Tax);
        }
        else if(Annual_Income <= 500000)
        {
            Tax = (float) ((0.05f) * Annual_Income);
            System.out.println("Total Tax Payable : ₹"+Tax);
        }
        else if(Annual_Income <= 1000000)
        {
            Tax = (float) ((0.05f) * 500000 + (0.20f) * (Annual_Income - 500000));
            System.out.println("Total Tax Payable : ₹"+Tax);
        }
        else if(Annual_Income > 1000000)
        {
            Tax = (float) ( (0.05f) * 500000 + (0.20f) * 1000000 + (0.30f) * (Annual_Income - 1000000));
            System.out.println("Total Tax Payable : ₹"+Tax);
        }

        sobj.close();
    }
}

/*

Enter Annual Income: 
300000
Annual Income : ₹300000
Total Tax Payable : ₹15000.0

Enter Annual Income: 
700000
Annual Income : ₹700000
Total Tax Payable : ₹65000.0

Enter Annual Income: 
2000000
Annual Income : ₹2000000
Total Tax Payable : ₹525000.0

*/
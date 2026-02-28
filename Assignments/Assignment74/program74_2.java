import java.util.*;

class program74_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Withdrawal_Amount = 0;
        int Current_Balance = 0;

        System.out.println("Please Enter your current balance : ");
        Current_Balance = sobj.nextInt();

        System.out.println("Please Enter the amount that you want to withdraw : ");
        Withdrawal_Amount = sobj.nextInt();

        if((Current_Balance < 0) || (Withdrawal_Amount <= 0))
        {
            System.out.println("Invalid Input.");
            return;
        }

        if(Withdrawal_Amount % 100 != 0)
        {
            System.out.println("Transaction Failed : Withdrawal amount must be a multiple of 100.");
        }
        else if(Withdrawal_Amount > 25000)
        {
            System.out.println("Transaction Failed : Maximum withdrawal per transaction is ₹25,000.");
        }
        else if( (Current_Balance - Withdrawal_Amount) < 1000)
        {
            System.out.println("Transaction Failed : After withdrawal, balance must remain at least ₹1,000.");
        }
        else
        {
            Current_Balance = Current_Balance - Withdrawal_Amount;
            System.out.println("Transaction Sucessful.");
            System.out.println("Remaining Balance : ₹ " + Current_Balance);
        }

    }
}

/*

Please Enter your current balance : 
10000
Please Enter the amount that you want to withdraw : 
2000
Transaction Sucessful.
Remaining Balance : ₹ 8000

Please Enter your current balance : 
200
Please Enter the amount that you want to withdraw : 
300
Transaction Failed : After withdrawal, balance must remain at least ₹1,000.

Please Enter your current balance : 
2000
Please Enter the amount that you want to withdraw : 
250
Transaction Failed : Withdrawal amount must be a multiple of 100.

Please Enter your current balance : 
10000
Please Enter the amount that you want to withdraw : 
27000
Transaction Failed : Maximum withdrawal per transaction is ₹25,000.

*/
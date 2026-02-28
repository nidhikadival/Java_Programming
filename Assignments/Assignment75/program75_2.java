import java.util.*;

class program75_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Age = 0;
        int Monthly_Income = 0;
        int Credit_Score = 0;

        String Loan_Status = null;

        System.out.println("Enter Age :");
        Age = sobj.nextInt();

        System.out.println("Enter Monthly Income :");
        Monthly_Income = sobj.nextInt();

        System.out.println("Enter Credit Score :");
        Credit_Score = sobj.nextInt();

        System.out.println("Do you have an existing unpaid loan? (Yes/No)");
        Loan_Status = sobj.next();

        if(Age < 0 || Monthly_Income < 0 || Credit_Score < 0)
        {
            System.out.println("Invalid Input.");
            return;
        }

        if( (Loan_Status.equalsIgnoreCase("yes") == false) &&
            (Loan_Status.equalsIgnoreCase("no") == false))
        {
            System.out.println("Invalid Input.");
            return;
        }

        if( (Age < 21) || (Age > 60) )
        {
            System.out.println("Loan Rejected : Age must be between 21 to 60.");
        }
        else if(Monthly_Income < 25000)
        {
            System.out.println("Loan Rejected : Monthly Income must be greater than ₹25,000.");
        }
        else if(Credit_Score < 700)
        {
            System.out.println("Loan Rejected : Credit Score must be greater than 700.");
        }
        else if(Loan_Status.equalsIgnoreCase("yes") == true)
        {
            System.out.println("Loan Rejected : You must not have an existing unpaid Loan.");
        }
        else
        {
            System.out.println("Loan Approved");
        }

        sobj.close();
    }
}

/*

Enter Age :
20
Enter Monthly Income :
25000
Enter Credit Score :
700
Do you have an existing unpaid loan? (Yes/No)
no
Loan Rejected : Age must be between 21 to 60.

Enter Age :
27
Enter Monthly Income :
27000
Enter Credit Score :
800
Do you have an existing unpaid loan? (Yes/No)
no
Loan Approved

*/
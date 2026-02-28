import java.util.*;

class program75_3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Current_Stock = 0;
        int Quantity = 0;

        System.out.println("Enter Current Stock :");
        Current_Stock = sobj.nextInt();

        System.out.println("Enter Quantity :");
        Quantity = sobj.nextInt();

        if(Current_Stock < 0 || Quantity < 0)
        {
            System.out.println("Invalid Input.");
            return;
        }

        if(Quantity > Current_Stock)
        {
            System.out.println("Order Failed : Insufficient Stock");
        }
        else
        {
            Current_Stock = Current_Stock - Quantity;
            System.out.println("Order Processed Succesfully.");
            System.out.println("Remainig Stock : "+Current_Stock);
        }

        if(Current_Stock < 5)
        {
            System.out.println("Low Stock Alert!");
        }

        sobj.close();
    }
}

/*

Enter Current Stock :
200
Enter Quantity :
150
Order Processed Succesfully.
Remainig Stock : 50

Enter Current Stock :
100
Enter Quantity :
150
Order Failed : Insufficient Stock

Enter Current Stock :
200
Enter Quantity :
197
Order Processed Succesfully.
Remainig Stock : 3
Low Stock Alert!

*/
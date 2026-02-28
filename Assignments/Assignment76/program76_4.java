import java.util.*;

class program76_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Budget = 0;
        int Items = 0;

        System.out.println("Enter Budget :");
        Budget = sobj.nextInt();

        System.out.println("Enter no of Items :");
        Items = sobj.nextInt();

        if((Budget <= 0) || (Items <= 0))
        {
            System.out.println("Invalid Input.");
            return;
        }

        int Prices[] = new int[Items];

        int i = 0;

        System.out.println("Enter the prices of each item :");
        for(i=0; i<Items; i++)
        {
            System.out.print("Item "+(i+1)+ ": ");
            Prices[i] = sobj.nextInt();
            
            if(Prices[i] < 0)
            {
                System.out.println("Invalid Input.");
                return;
            }
        }

        int Count = 0;

        for(i=0 ;i<Items;i++)
        {
            if(Prices[i] <= Budget)
            {
                Count++;
                Budget = Budget - Prices[i];
            }
        }

        System.out.println("Items Purchased : "+Count);
        System.out.println("Remaining Balance : ₹"+Budget);

        sobj.close();
    }
}

/*
Enter Budget :
600
Enter no of Items :
5
Enter the prices of each item :
Item 1: 100
Item 2: 50
Item 3: 100
Item 4: 20
Item 5: 200
Items Purchased : 5
Remaining Balance : ₹130

Enter Budget :
-98
Enter no of Items :
2
Invalid Input.

Enter Budget :
400
Enter no of Items :
3
Enter the prices of each item :
Item 1: 100
Item 2: 300
Item 3: 50
Items Purchased : 2
Remaining Balance : ₹0

*/
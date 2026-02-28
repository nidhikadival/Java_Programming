import java.util.*;

class program76_3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Weight = 0;
        int Fare = 0;

        System.out.println("Enter Parcel Weight :");
        Weight = sobj.nextInt();

        if(Weight <= 0)
        {
            System.out.println("Invalid Input.");
            return;
        }

        if(Weight <= 1)
        {
            Fare = 50;
        }
        else if(Weight>1 && Weight<=5)
        {
            Fare = 50 + (Weight - 1)*20;
        }
        else if(Weight>5)
        {
            Fare = 150 + (Weight - 5)*30;
        }

        System.out.println("Parcel Weight : "+Weight);
        System.out.println("Courier Charge : ₹"+Fare);

        sobj.close();
    }
}

/*
Enter Parcel Weight :
1
Parcel Weight : 1
Courier Charge : ₹50

Enter Parcel Weight :
3
Parcel Weight : 3
Courier Charge : ₹90

Enter Parcel Weight :
7
Parcel Weight : 7
Courier Charge : ₹210
*/
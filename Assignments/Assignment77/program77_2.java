/*
    First 50km -> ₹100
    Next 25km -> ₹20

    2AC -> ₹1000 (5 times)
    3AC -> ₹600 (3 times)
    Sleeper -> ₹200

    Tatkal -> 30% extra 

    Senior Citizen (60+) -> 40% discount
*/
import java.util.*;

class program77_2
{

/////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Entry point function for the application
// 
/////////////////////////////////////////////////////////////////////////////////////////////////

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Distance = 0, Age = 0;
        String classType = null, Tatkal = null;
        float Fare = 0.0f;

        System.out.println("Enter Distance :");
        Distance = sobj.nextInt();

        System.out.println("Enter Type of seat (Sleeper/3AC/2AC) :");
        classType = sobj.next();

        System.out.println("Is the train departure within 24hrs ? (yes/no)"); //Tatkal
        Tatkal = sobj.next();

        System.out.println("Enter Age :");
        Age = sobj.nextInt();

        if((Distance < 0) || (Age < 0))
        {
            System.out.println("Invalid Input.");
            return;
        }

        if( ((Tatkal.equalsIgnoreCase("yes") == false) && (Tatkal.equalsIgnoreCase("no") == false))
                ||
            ((classType.equalsIgnoreCase("Sleeper") == false) && (classType.equalsIgnoreCase("2AC") == false) 
            && (classType.equalsIgnoreCase("3AC") == false))  )
        {
            System.out.println("Invalid Input.");
            return;
        }

        int BaseFare = 0;
        BaseFare = 100; // Intitalization

        if(Distance > 50)
        {
            if (((Distance - 50) % 25) == 0 )
            {
                BaseFare = BaseFare + 20*(((Distance - 50) / 25));
            }
            else
            {
                BaseFare = BaseFare + 20*(((Distance - 50) / 25)+1);
            }
        }

        Fare = Fare + BaseFare;

        int TypeFare = 0;

        if((classType.equalsIgnoreCase("Sleeper") == true))
        {
            TypeFare = 200;
        }
        else if((classType.equalsIgnoreCase("3AC") == true))
        {
            TypeFare = 200 * 3;
        }
        else if((classType.equalsIgnoreCase("2AC") == true))
        {
            TypeFare = 200 * 5;
        }

        Fare = Fare + TypeFare;

        float TatkalFare = 0;

        if((Tatkal.equalsIgnoreCase("yes") == true))
        {
            TatkalFare = 0.30f * Fare;
            Fare = Fare + TatkalFare;
        }

        float SeniorFare = 0.0f;
        if(Age > 60)
        {
            SeniorFare = 0.40f * Fare;
            Fare = Fare - SeniorFare;
        }

        System.out.println("Total Bill : ₹"+Fare);
        System.out.println("Distance Fare : ₹"+BaseFare);
        System.out.println("Class Type Charges ("+classType+") : ₹"+TypeFare);
        System.out.println("Tatkal Price (Extra): ₹"+TatkalFare);
        System.out.println("Senior Citizen (Discount) : ₹"+SeniorFare);

        sobj.close();
    }
}

/*

Enter Distance :
185
Enter Type of seat (Sleeper/3AC/2AC) :
Sleeper
Is the train departure within 24hrs ? (yes/no)
yes
Enter Age :
18
Total Bill : ₹546.0
Distance Fare : ₹220
Class Type Charges (Sleeper) : ₹200
Tatkal Price (Extra): ₹126.00001
Senior Citizen (Discount) : ₹0.0

Enter Distance :
185
Enter Type of seat (Sleeper/3AC/2AC) :
Sleeper
Is the train departure within 24hrs ? (yes/no)
yes
Enter Age :
70
Total Bill : ₹327.59998
Distance Fare : ₹220
Class Type Charges (Sleeper) : ₹200
Tatkal Price (Extra): ₹126.00001
Senior Citizen (Discount) : ₹218.40001


*/
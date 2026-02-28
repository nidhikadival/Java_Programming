import java.util.*;

class program76_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Distance = 0;
        String PeakHours = null;

        float Fare = 50;

        System.out.println("Enter Distance :");
        Distance = sobj.nextInt();

        System.out.println("Is it Peak hour? ");
        PeakHours = sobj.next();

        if(Distance < 0)
        {
            System.out.println("Invalid Input.");
            return;
        }

        /*if(Distance <= 10)
        {
            Fare = 12 * 10;;
        }*/
        if(Distance > 10)
        {
            Fare = Fare + (Distance - 10)*15;
        }

        if(PeakHours.equalsIgnoreCase("yes") == true)
        {
            Fare = (float) (Fare + (0.20f * Fare));
        }

        System.out.println("Distance : "+Distance);
        System.out.println("Peak Hour : "+PeakHours);
        System.out.println("Total Fare : ₹"+Fare);

        sobj.close();
    }
}

/*

Enter Distance :
2
Is it Peak hour? 
no
Distance : 2
Peak Hour : no
Total Fare : ₹50.0

Enter Distance :
12
Is it Peak hour? 
no
Distance : 12
Peak Hour : no
Total Fare : ₹80.0

Enter Distance :
12
Is it Peak hour? 
yes
Distance : 12
Peak Hour : yes
Total Fare : ₹96.0

*/
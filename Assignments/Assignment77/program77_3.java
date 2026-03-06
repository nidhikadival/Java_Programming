import java.util.*;

class program77_3
{

/////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Entry point function for the application
// 
/////////////////////////////////////////////////////////////////////////////////////////////////

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        //      {calls (mins), data (GB), SMS(count), Plan Price}                  
        int Plan1[] = {200,3,100,130};
        int Plan2[] = {300,5,120,200};
        int Plan3[] = {400,5,150,240};
        int Plan4[] = {500,9,200,350};

        int extraMins = 20;
        int extraData = 50;
        int extraSms = 10;

        int Price1 = 0, Price2 = 0, Price3 = 0, Price4 = 0;
        Price1 = Plan1[3];
        Price2 = Plan2[3];
        Price3 = Plan3[3];
        Price4 = Plan4[3];

        int Calls = 0, Data = 0, Sms = 0;

        System.out.println("Enter Call time (mins) :");
        Calls = sobj.nextInt();

        System.out.println("Enter Data usage (GB) :");
        Data = sobj.nextInt();

        System.out.println("Enter Sms count :");
        Sms = sobj.nextInt();

        if((Calls < 0) || (Data < 0) || (Sms < 0))
        {
            System.out.println("Invalid Input.");
            return;
        }


        if(Calls > Plan1[0])
        {
            Price1 = Price1 + ((Calls - Plan1[0])*extraMins);
        } 
        if(Data > Plan1[1])
        {
            Price1 = Price1 + ((Data - Plan1[1])*extraData);
        }
        if(Sms > Plan1[2])
        {
            Price1 = Price1 + ((Sms - Plan1[2])*extraSms);
        }

        if(Calls > Plan2[0])
        {
            Price2 = Price2 + ((Calls - Plan2[0])*extraMins);
        } 
        if(Data > Plan2[1])
        {
            Price2 = Price2 + ((Data - Plan2[1])*extraData);
        }
        if(Sms > Plan2[2])
        {
            Price2 = Price2 + ((Sms - Plan2[2])*extraSms);
        }

        if(Calls > Plan3[0])
        {
            Price3 = Price3 + ((Calls - Plan3[0])*extraMins);
        } 
        if(Data > Plan3[1])
        {
            Price3 = Price3 + ((Data - Plan3[1])*extraData);
        }
        if(Sms > Plan3[2])
        {
            Price3 = Price3 + ((Sms - Plan3[2])*extraSms);
        }

        if(Calls > Plan4[0])
        {
            Price4 = Price4 + ((Calls - Plan4[0])*extraMins);
        } 
        if(Data > Plan4[1])
        {
            Price4 = Price4 + ((Data - Plan4[1])*extraData);
        }
        if(Sms > Plan4[2])
        {
            Price4 = Price4 + ((Sms - Plan4[2])*extraSms);
        }

        System.out.println("Price 1 : ₹"+Price1);
        System.out.println("Price 2 : ₹"+Price2);
        System.out.println("Price 3 : ₹"+Price3);
        System.out.println("Price 4 : ₹"+Price4);

        int Minimum = 0;
        int plan = 1;
        Minimum = Price1;

        if(Price2 < Minimum)
        {
            Minimum = Price2;
            plan = 2;
        }
        if(Price3 < Minimum)
        {
            Minimum = Price3;
            plan = 3;
        }
        if(Price4 < Minimum)
        {
            Minimum = Price4;
            plan = 4;
        }

        System.out.println("Recommended Plan : "+plan);
        System.out.println("Total cost : ₹"+Minimum);

        sobj.close();
    }
}

/*


Enter Call time (mins) :
400
Enter Data usage (GB) :
5
Enter Sms count :
150
Price 1 : ₹4730
Price 2 : ₹2500
Price 3 : ₹240
Price 4 : ₹350
Recommended Plan : 3
Total cost : ₹240

*/
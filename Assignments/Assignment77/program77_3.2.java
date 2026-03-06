import java.util.*;

class program77_3
{                             
    public static int CalculatePrice(int Input[], int Extra[], int Plan[])
    {
        int Price = 0;
        Price = Plan[3];

        if(Input[0] > Plan[0])
        {
            Price = Price + ((Input[0] - Plan[0])*Extra[0]);
            //System.out.println(" Extra Calls : "+Price1);
        } 
        if(Input[1] > Plan[1])
        {
            Price = Price + ((Input[1] - Plan[1])*Extra[1]);
            //System.out.println("Extra Data : "+Price1);
        }
        if(Input[2] > Plan[2])
        {
            Price = Price + ((Input[2] - Plan[2])*Extra[2]);
            //System.out.println("Extra Sms : "+Price1);
        }
        
        return Price;
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        //      {calls (mins), data (GB), SMS(count), Plan Price}                  
        int Plan1[] = {200,3,100,130};
        int Plan2[] = {300,5,120,200};
        int Plan3[] = {400,5,150,240};
        int Plan4[] = {500,9,200,350};

         
        int Extra [] = {20,50,10}; // extra price for calls-> 20, data -> 50, sms -> 10

        int Input[] = new int[3]; // calls, data, sms

        System.out.println("Enter Call time (mins) :");
        Input[0] = sobj.nextInt();

        System.out.println("Enter Data usage (GB) :");
        Input[1] = sobj.nextInt();

        System.out.println("Enter Sms count :");
        Input[2] = sobj.nextInt();

        if((Input[0] < 0) || (Input[1] < 0) || (Input[2] < 0))
        {
            System.out.println("Invalid Input.");
            return;
        }

        int Price1 = CalculatePrice(Input, Extra, Plan1);
        int Price2 = CalculatePrice(Input, Extra, Plan2);
        int Price3 = CalculatePrice(Input, Extra, Plan3);
        int Price4 = CalculatePrice(Input, Extra, Plan4);

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

Recommended Plan : 3
Total cost : ₹240

(Price 1 : ₹4730, Price 2 : ₹2500, Price 3 : ₹240, Price 4 : ₹350)

*/
import java.util.*;

class program77_1
{
/////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Entry point function for the application
// 
/////////////////////////////////////////////////////////////////////////////////////////////////

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        float FinalPay = 0.0f;

        int Days = 0, medicineBill = 0, consultationFee = 0;
        int PerRoomCharge = 100;

        String wardType = null, insured = null;

        System.out.println("Enter no of Days :");
        Days = sobj.nextInt();

        System.out.println("Enter the Medicine Bill :");
        medicineBill = sobj.nextInt();

        System.out.println("Enter the Consultation Fee :");
        consultationFee = sobj.nextInt();

        System.out.println("Enter the Ward Type : (Normal/ICU)");
        wardType = sobj.next();

        System.out.println("Are you insured ? (yes/no)");
        insured = sobj.next();

        if((Days < 0) || (medicineBill < 0) || (consultationFee < 0) )
        {
            System.out.println("Invalid Input.");
            return;
        }

        if ((wardType.equalsIgnoreCase("Normal") == false) && (wardType.equalsIgnoreCase("ICU") == false))
        {
            System.out.println("Invalid Input.");
            return;
        }

        FinalPay = medicineBill + (Days * PerRoomCharge) + consultationFee;

        if(wardType.equalsIgnoreCase("ICU") == true)
        {
            System.out.println("ICU room");
            FinalPay = FinalPay + 1000;
        }

        float InsuranceCover = 0.0f;
        
        if(insured.equalsIgnoreCase("yes") == true)
        {
            if((0.70f * FinalPay) < 50000)
            {
                //System.out.println("70 %");
                InsuranceCover = 0.70f * FinalPay;
            }
            else
            {
                //System.out.println("50,000");
                InsuranceCover = 50000;
            }

        }

        System.out.println("Total Bill Amount : ₹"+FinalPay);
        System.out.println("Insurance Cover : ₹"+InsuranceCover);
        System.out.println("Final Pay Amount : ₹"+(FinalPay - InsuranceCover));        

        sobj.close();
    }
}

/*

Enter no of Days :
5
Enter the Medicine Bill :
800
Enter the Consultation Fee :
500
Enter the Ward Type : (Normal/ICU)
normal
Are you insured ? (yes/no)
no
Total Bill Amount : ₹1800.0
Insurance Cover : ₹0.0
Final Pay Amount : ₹1800.0

Enter no of Days :
5
Enter the Medicine Bill :
800
Enter the Consultation Fee :
500
Enter the Ward Type : (Normal/ICU)
normal
Are you insured ? (yes/no)
yes
Total Bill Amount : ₹1800.0
Insurance Cover : ₹1260.0
Final Pay Amount : ₹540.0

Enter no of Days :
5
Enter the Medicine Bill :
800
Enter the Consultation Fee :
500
Enter the Ward Type : (Normal/ICU)
ICU
Are you insured ? (yes/no)
no
ICU room
Total Bill Amount : ₹2800.0
Insurance Cover : ₹0.0
Final Pay Amount : ₹2800.0

Enter no of Days :
10
Enter the Medicine Bill :
20000
Enter the Consultation Fee :
5000
Enter the Ward Type : (Normal/ICU)
ICU
Are you insured ? (yes/no)
yes
ICU room
Total Bill Amount : ₹27000.0
Insurance Cover : ₹18900.0
Final Pay Amount : ₹8100.0

Enter no of Days :
100
Enter the Medicine Bill :
90000
Enter the Consultation Fee :
20000
Enter the Ward Type : (Normal/ICU)
ICU
Are you insured ? (yes/no)
yes
ICU room
Total Bill Amount : ₹121000.0
Insurance Cover : ₹50000.0
Final Pay Amount : ₹71000.0

*/
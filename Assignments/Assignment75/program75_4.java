import java.util.*;

class program75_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String Helmet = null;
        String License = null;
        String Overspeeding = null;

        int Fine = 0;

        System.out.println("Helmet Worn ?");
        Helmet = sobj.next();

        System.out.println("License ?");
        License = sobj.next();

        System.out.println("Overspeeding ?");
        Overspeeding = sobj.next();

        if(
            ((Helmet.equalsIgnoreCase("yes") == false) &&
            (Helmet.equalsIgnoreCase("no") == false))
            ||
            ((License.equalsIgnoreCase("yes") == false) &&
            (License.equalsIgnoreCase("no") == false))
            ||
            ((Overspeeding.equalsIgnoreCase("yes") == false) &&
            (Overspeeding.equalsIgnoreCase("no") == false))
        )
        {
            System.out.println("Invalid Input");
            return;
        }

        if(Helmet.equalsIgnoreCase("no"))
        {
            Fine = Fine + 500;
        }

        if(License.equalsIgnoreCase("no"))
        {
            Fine = Fine + 1000;
        }
        
        if(Overspeeding.equalsIgnoreCase("yes"))
        {
            Fine = Fine + 1500;
        }

        System.out.println("Total Fine Amount : ₹"+ Fine);

        sobj.close();
    }
}

/*

Helmet Worn ?
yes 
License ?
yes
Overspeeding ?
yes
Total Fine Amount : ₹1500

Helmet Worn ?
yes
License ?
no
Overspeeding ?
no
Total Fine Amount : ₹1000

Helmet Worn ?
no
License ?
yes
Overspeeding ?
no
Total Fine Amount : ₹500

Helmet Worn ?
no
License ?
no
Overspeeding ?
no
Total Fine Amount : ₹1500

Helmet Worn ?
yes
License ?
no
Overspeeding ?
yes
Total Fine Amount : ₹2500

*/
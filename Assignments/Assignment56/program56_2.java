/////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Required packages
// 
/////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;

class program56_2
{

/////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Entry point function for the application
// 
/////////////////////////////////////////////////////////////////////////////////////////////////

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int fd = 0;
        String Fname = "\0";
        String Buffer = "\0";

        System.out.println("Enter file name: ");
        Fname = sobj.nextLine();

        try 
        {
            FileReader frobj = new FileReader(Fname);
            BufferedReader brobj = new BufferedReader(frobj);

            System.out.println("Contents of file is :");

            while((Buffer = brobj.readLine()) != null)
            {
                System.out.println(Buffer);
            }

            frobj.close();
            brobj.close();
        } 
        catch (Exception e) 
        {
            System.out.println("Error reading file");
        }
        
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Testcases successfully handled by the application
//
//  Output:
//  Enter file name: 
//  PPA.txt
//  Contents of file is :
//  Jay Ganesh ...
//
//  Output:
//  Enter file name: 
//  LB.txt
//  Error reading file
//
/////////////////////////////////////////////////////////////////////////////////////////////////
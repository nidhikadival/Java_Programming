/////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Required packages
// 
/////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;

class program56_3
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
            FileWriter fwobj = new FileWriter(Fname, true); 

            fwobj.write("\nThankyou.");
            fwobj.close();

            System.out.println("Data written successfully.");
        } 
        catch (Exception e) 
        {
            System.out.println("Error in writing into the file");
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
//  Data written successfully.
//
//  Output:
//  Enter file name: 
//  LB.txt
//  Data written successfully.
//
/////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Required packages
// 
/////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.*;

class program57_4 
{

/////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Entry point function for the application
// 
/////////////////////////////////////////////////////////////////////////////////////////////////

    public static void main(String[] A) 
    {
        Scanner sc = new Scanner(System.in);

        String fname = "\0";
        int ch = 0;
        int checksum = 0;

        System.out.print("Enter file name: ");
        fname = sc.nextLine();

        try
        {
        FileInputStream fobj = new FileInputStream(fname);

        while ((ch = fobj.read()) != -1) 
        {
            checksum = checksum + ch;
        }

        fobj.close();

        System.out.println("Checksum : " + checksum);
        }

        catch(Exception e)
        {
            System.out.println("Error in CheckSum functionality");
        }
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Testcases successfully handled by the application
//
//  Output:
//  Enter file name: LB.txt
//  Checksum : 500 (=>"Hello")
//
/////////////////////////////////////////////////////////////////////////////////////////////////
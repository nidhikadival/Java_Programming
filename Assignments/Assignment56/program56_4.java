/////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Required packages
// 
/////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;

class program56_4
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
            File fobj = new File(Fname);
            if (fobj.createNewFile()) {
                System.out.println("File created successfully.");
            } else {
                System.out.println("File already exists.");
            }
        } 
        catch (Exception e) 
        {
            System.out.println("Error in creating the file");
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
//  File already exists.
//
//  Output:
//  Enter file name: 
//  Demo.txt
//  File created successfully..
//
/////////////////////////////////////////////////////////////////////////////////////////////////
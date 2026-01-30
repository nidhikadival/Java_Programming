/////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Required packages
// 
/////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.*;

class program62_5
{

/////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Entry point function for the application
// 
/////////////////////////////////////////////////////////////////////////////////////////////////

    public static void main(String A[]) throws Exception
    {
        String FileName = null;
        int count = 0;
        int iRet = 0;
        int n = 0;
        int i = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter file name: ");
        FileName = sobj.nextLine();

        try 
        {
            FileInputStream fiobj = new FileInputStream(FileName);
            System.out.println("File opened successfully.");
            fiobj.close();
        }

        catch (FileNotFoundException e) 
        {
            System.out.println("File not found.");
        }

        catch (SecurityException e) 
        {
            System.out.println("Permission denied.");
        }

        catch (IOException e) 
        {
            System.out.println("I/O error occurred.");
        }

        catch (Exception e) 
        {
            System.out.println("Unknown error.");
        }
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Testcases successfully handled by the application
//
//  Output:
//  Enter file name: 
//  Demo.txt
//  File opened successfully.
//
//  Output:
//  Enter file name: 
//  Hello.txt
//  File not found.
//
/////////////////////////////////////////////////////////////////////////////////////////////////
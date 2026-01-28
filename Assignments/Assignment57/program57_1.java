/////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Required packages
// 
/////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.*;

class program57_1 
{

/////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Entry point function for the application
// 
/////////////////////////////////////////////////////////////////////////////////////////////////

    public static void main(String[] A) 
    {
        Scanner sc = new Scanner(System.in);
        int ch = 0;
        String src = "\0";
        String dest = "\0";

        System.out.print("Enter source file name: ");
        src = sc.nextLine();

        System.out.print("Enter destination file name: ");
        dest = sc.nextLine();

        try
        {
        FileInputStream obj1 = new FileInputStream(src);
        FileOutputStream obj2 = new FileOutputStream(dest);

        while ((ch = obj1.read()) != -1) 
        {
            obj2.write(ch);
        }

        obj1.close();
        obj2.close();

        System.out.println("File copied successfully.");
        }

        catch (Exception e) 
        {
            System.out.println("Error in coping the file");
        }
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Testcases successfully handled by the application
//
//  Output:
//  Enter source file name: 
//  PPA.txt
//  Enter destination file name: 
//  LB.txt
//  File copied successfully.
//
/////////////////////////////////////////////////////////////////////////////////////////////////

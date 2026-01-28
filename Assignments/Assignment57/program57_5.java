/////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Required packages
// 
/////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.*;

class program57_5
{

/////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Entry point function for the application
// 
/////////////////////////////////////////////////////////////////////////////////////////////////

    public static void main(String[] A) 
    {
        Scanner sc = new Scanner(System.in);

        String dname = "\0";
        int i = 0;

        System.out.print("Enter directory name: ");
        dname = sc.nextLine();

        File f = new File(dname);

        if (f.exists() && f.isDirectory()) 
        {
            File[] files = f.listFiles();

           for (i = 0; i < files.length; i++)
            {
                if (files[i].isFile()) 
                {
                    System.out.println(files[i].getName() + " : " + files[i].length() + " bytes");
                }
            }

        } 
        else 
        {
            System.out.println("Invalid directory.");
        }
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Testcases successfully handled by the application
//
//  Output:
//  Enter directory name: Folder
//  demo.txt : 14 bytes
//  new.txt : 0 bytes
//
//  Output:
//  Enter directory name: Assignment58
//  Invalid directory.
//
/////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Required packages
// 
/////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.*;

class program58_1
{

/////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Entry point function for the application
// 
/////////////////////////////////////////////////////////////////////////////////////////////////

    public static void main(String[] A) {

        Scanner sc = new Scanner(System.in);
        String dname = "\0";

        System.out.println("Enter directory name: ");
        dname = sc.nextLine();

        File f = new File(dname);

        if (f.exists() && f.isDirectory()) 
        {
            File[] files = f.listFiles();

            for (int i = 0; i < files.length; i++) 
            {
                if (files[i].isFile()) 
                {
                    System.out.println(files[i].getName());
                }
            }
        } 
        else 
        {
            System.out.println("Invalid directory");
        }
    }
}


/////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Testcases successfully handled by the application
//
//  Output:
//  Enter directory name: 
//  Folder
//  demo.txt
//  new.txt.
//
/////////////////////////////////////////////////////////////////////////////////////////////////

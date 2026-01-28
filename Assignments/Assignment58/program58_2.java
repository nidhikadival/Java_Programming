/////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Required packages
// 
/////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.*;

class program58_2
{

/////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Entry point function for the application
// 
/////////////////////////////////////////////////////////////////////////////////////////////////

    public static void main(String[] A)  {

        Scanner sc = new Scanner(System.in);

        String name = "\0";
        String dname = "\0";

        System.out.println("Enter directory name: ");
        dname = sc.nextLine();

        try
        {
            File f = new File(dname);
            FileOutputStream fobj = new FileOutputStream("Marvellous.txt");

            File[] files = f.listFiles();

            for (int i = 0; i < files.length; i++) 
            {
                if (files[i].isFile()) 
                {
                    name = files[i].getName() + "\n";
                    fobj.write(name.getBytes());
                }
            }

            fobj.close();
            System.out.println("File names written successfully.");
        }

        catch(Exception e)
        {
            System.out.println("Error");
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
//  File names written successfully.
//
/////////////////////////////////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Required packages
// 
/////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.*;

class program58_5
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

        System.out.println("Enter directory name: ");
        dname = sc.nextLine();

        String info = "\0";
        int ch = 0;

        try
        {
            File f = new File(dname);
            File[] files = f.listFiles();

            FileOutputStream fobj1 = new FileOutputStream("Marvellous.txt");

            for (int i = 0; i < files.length; i++) 
            {
                if (files[i].isFile()) 
                {
                    info = "File Name: " + files[i].getName() + " Size: " + files[i].length() + " bytes\n";
                    fobj1.write(info.getBytes());

                    FileInputStream fobj2 = new FileInputStream(files[i]);

                    while ((ch = fobj2.read()) != -1)
                    {
                        fobj1.write(ch);
                    }

                    fobj1.write("\n\n".getBytes());
                    fobj2.close();
                }
            }

            fobj1.close();
            System.out.println("Name, size and data written.");
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
//  Name, size and data written.
//
/////////////////////////////////////////////////////////////////////////////////////////////////

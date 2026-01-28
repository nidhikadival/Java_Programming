/////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Required packages
// 
/////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;

class program56_5
{

/////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Entry point function for the application
// 
/////////////////////////////////////////////////////////////////////////////////////////////////

    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        String dname = "\0";

        System.out.println("Enter directory name:");
        dname = sobj.nextLine();

        File dobj = new File(dname);

        if (dobj.exists() && dobj.isDirectory())
        {
            File files[] = dobj.listFiles();

            System.out.println("Files in the directory:");

            for (int i = 0; i < files.length; i++)
            {
                System.out.println(files[i].getName());
            }
        }
        else
        {
            System.out.println("Invalid directory name");
        }
    }
}


/////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Enter directory name:
//  .
//  Files in the directory:
//  program56_3.class
//  program56_1.class
//  Demo.txt
//  program56_1.java
//  program56_5.class
//  LB.txt
//  program56_2.class
//  program56_4.class
//  program56_4.java
//  PPA.txt
//  program56_5.java
//  program56_2.java
//  program56_3.java
/////////////////////////////////////////////////////////////////////////////////////////////////
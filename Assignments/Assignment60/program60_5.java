/////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Required packages
// 
/////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.*;

class program60_5
{

/////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Entry point function for the application
// 
/////////////////////////////////////////////////////////////////////////////////////////////////

    public static void main(String A[])
    {
        String Path = null;
        int i = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter path: ");
        Path = sobj.nextLine();

        File fobj = new File(Path);

        if((fobj.exists()))
        {
            System.out.println("Path exists");

            if(fobj.isDirectory())
            {
                System.out.println("It is a directory");
            }
            else if(fobj.isFile())
            {
                System.out.println("It is a file");
            }
        }
        else
        {
            System.out.println("There is no such folder");
        }
    }
}


/////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Testcases successfully handled by the application
//
//  Output:
//  Enter path: 
//  /Users/nidhikadival/Desktop/LB/Assignments/Assignment59/Marvellous/C.txt
//  Path exists
//  It is a file
//
//  Output:
//  Enter path: 
//  /Users/nidhikadival/Desktop/LB/Assignments/Assignment59/Marvellous/MarvellousX
//  Path exists
//  It is a directory
//
//  Output:
//  Enter path: 
//  /Users/nidhikadival/Desktop/LB/Assignments/Assignment59/Marvellous/program.c
//  There is no such folder
//
/////////////////////////////////////////////////////////////////////////////////////////////////s
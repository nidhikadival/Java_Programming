/////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Required packages
// 
/////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.*;

class program61_3
{

/////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Entry point function for the application
// 
/////////////////////////////////////////////////////////////////////////////////////////////////

    public static void main(String A[]) throws Exception
    {
        File fobj = null;

        String FileName = null;
        String Input = null;

        byte Buffer[] = new byte[1024];

        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of source file: ");
        FileName = sobj.nextLine();

        System.out.println("Enter the string you want to append: ");
        Input = sobj.nextLine();

        fobj = new File(FileName);

        if(fobj.exists())
        {
            FileInputStream fiobj = new FileInputStream(fobj);
            FileOutputStream foobj = new FileOutputStream(fobj,true);

            Buffer = Input.getBytes();

            foobj.write(Buffer);

            System.out.println("String appended succesfully");

            fiobj.close();
            foobj.close();
        }
}
}

/////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Testcases successfully handled by the application
//
//  Enter the name of source file: 
//  File.txt
//  Enter the string you want to append: 
//  Hello
//  String appended succesfully
//
/////////////////////////////////////////////////////////////////////////////////////////////////s
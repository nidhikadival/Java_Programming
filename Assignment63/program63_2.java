/////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Required packages
// 
/////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.*;

class program63_2
{

/////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Entry point function for the application
// 
/////////////////////////////////////////////////////////////////////////////////////////////////

    public static void main(String A[]) throws Exception 
    {
        long start = 0, end = 0;
        int ch = 0;

        FileInputStream fiobj = new FileInputStream("Demo.txt");
        FileOutputStream foobj = new FileOutputStream("NormalCopy.txt");

        start = System.currentTimeMillis();
        
        while ((ch = fiobj.read()) != -1) 
        {
            foobj.write(ch);
        }
        end = System.currentTimeMillis();

        fiobj.close();
        foobj.close();

        System.out.println("Normal stream time: " + (end - start) + " ms");

        // Buffered streams
        BufferedInputStream bin = new BufferedInputStream(new FileInputStream("Demo.txt"));
        BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream("BufferedCopy.txt"));

        start = System.currentTimeMillis();
        while ((ch = bin.read()) != -1)
        {
            bout.write(ch);
        }
        end = System.currentTimeMillis();

        bin.close();
        bout.close();

        System.out.println("Buffered stream time: " + (end - start) + " ms");
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Testcases successfully handled by the application
//
//  Output:
//  Normal stream time: 1 ms
//  Buffered stream time: 0 ms
//
/////////////////////////////////////////////////////////////////////////////////////////////////
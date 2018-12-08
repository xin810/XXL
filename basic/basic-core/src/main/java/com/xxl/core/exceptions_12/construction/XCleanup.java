
package com.xxl.core.exceptions_12.construction;

import com.xxl.util.Print;

public class XCleanup
{
    public static void main(String[] args)
    {
        String s1 = XCleanup.class.getName();
        String s2 = XCleanup.class.getSimpleName();
        String s3 = XCleanup.class.getTypeName();
        String s4 = XCleanup.class.getCanonicalName();
        Package p = XCleanup.class.getPackage();
        String s5 = p.getName();
        Print.print("s1 = " + s1);
        Print.print("s2 = " + s2);
        Print.print("s3 = " + s3);
        Print.print("s4 = " + s4);
        Print.print("s5 = " + s5);

        try
        {
            InputFile in = new InputFile("D:\\Java开发1\\com\\xxl\\basic\\basic-core\\src\\main\\java\\com\\xxl\\core\\exceptions_12\\construction\\XCleanup.java");
            //InputFile in = new InputFile(s1);

            try
            {
                String s;
                int i = 1;
                while ((s = in.getLine()) != null)
                {
                    Print.print(s);
                }; // Perform line-by-line processing here...
            }
            catch (Exception e)
            {
                Print.print("Caught Exception in main");
                e.printStackTrace(System.out);
            }
            finally
            {
                in.dispose();
            }
        }
        catch (Exception e)
        {
            Print.print("InputFile construction failed");
        }
    }
}


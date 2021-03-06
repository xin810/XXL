
package com.xxl.core.exceptions_12.finallytry;

import static com.xxl.util.Print.print;

public class MultipleReturns
{
    public static void f(int i)
    {
        print("Initialization that requires cleanup");
        try
        {
            print("Point 1");
            if (i == 1) return;
            print("Point 2");
            if (i == 2) return;
            print("Point 3");
            if (i == 3) return;
            print("End");
        }
        finally
        {
            print("Performing cleanup");
        }
    }

    public static void main(String[] args)
    {
        for (int i = 1; i <= 4; i++)
        {
            f(i);
            print();
        }
    }
}


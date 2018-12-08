
package com.xxl.core.strings_13;

import com.xxl.util.Print;

public class SimpleFormat
{
    public static void main(String[] args)
    {
        int x = 5;
        double y = 5.332542;

        // The old way:
        Print.print(System.currentTimeMillis());
        System.out.println("Row 1: [" + x + " " + y + "]");
        Print.print(System.currentTimeMillis());
        Print.print("-------------------------------");
        // The new way:
        Print.print(System.currentTimeMillis());
        System.out.format("Row 1: [%d %f]\n", x, y);
        Print.print(System.currentTimeMillis());
        Print.print("-------------------------------");
        // or
        Print.print(System.currentTimeMillis());
        System.out.printf("Row 1: [%d %f]\n", x, y);
        Print.print(System.currentTimeMillis());
    }
}


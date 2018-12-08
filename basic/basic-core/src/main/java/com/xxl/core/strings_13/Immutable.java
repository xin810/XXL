
package com.xxl.core.strings_13;

import com.xxl.util.Print;

public class Immutable
{
    public static String upcase(String s)
    {
        return s.toUpperCase();
    }

    public static void main(String[] args)
    {
        String q = "howdy";
        Print.print(q);

        String qq = upcase(q);
        Print.print(qq);

        Print.print(q);
    }
}


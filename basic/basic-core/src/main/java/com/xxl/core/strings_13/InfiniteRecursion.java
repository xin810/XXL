
package com.xxl.core.strings_13;

import java.util.ArrayList;
import java.util.List;

import com.xxl.util.Print;

public class InfiniteRecursion
{
    @Override
    public String toString()
    {
        return " InfiniteRecursion address: " + super.toString() + "\n";
    }

    public static void main(String[] args)
    {
        List<InfiniteRecursion> iList = new ArrayList<InfiniteRecursion>();
        for (int i = 0; i < 10; i++)
        {
            iList.add(new InfiniteRecursion());
        }

        Print.print(iList);
    }
}


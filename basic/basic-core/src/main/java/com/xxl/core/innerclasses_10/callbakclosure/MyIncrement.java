
package com.xxl.core.innerclasses_10.callbakclosure;

import com.xxl.util.Print;

public class MyIncrement
{
    /**
     * my increment
     * <一句话功能简述>
     * <功能详细描述>
     * @author l
     */
    public void increment()
    {
        Print.print("Other operation.");
    }

    public static void f(MyIncrement mi)
    {
        mi.increment();
    }
}



package com.xxl.core.innerclasses_10.callbakclosure;

import com.xxl.util.Print;

/**
 * Very simple to just implement the interface
 * <一句话功能简述>
 * <功能详细描述>
 *
 * @author l
 * @version [1.0.0, l]
 */
public class Callee1 implements Incrementable
{
    private int i = 0;

    public void increment()
    {
        i++;
        Print.print(i);
    }
}


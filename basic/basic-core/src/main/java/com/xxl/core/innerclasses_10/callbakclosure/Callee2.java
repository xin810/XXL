
package com.xxl.core.innerclasses_10.callbakclosure;

import com.xxl.util.Print;

/**
 * If you class must implement increment() in some other way,
 * you must use an inner class:
 * <一句话功能简述>
 * <功能详细描述>
 *
 * @author l
 * @version [1.0.0, l]
 */
public class Callee2 extends MyIncrement
{
    private int i = 0;

    @Override
    public void increment()
    {
        super.increment();

        i++;
        Print.print(i);
    }

    public Incrementable getCallbackReference()
    {
        return new Closure();
    }

    private class Closure implements Incrementable
    {
        public void increment()
        {
            // Specify outer-class method, otherwise you'd get an infinite recursion:
            Callee2.this.increment();
        }
    }
}


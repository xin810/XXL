
package com.xxl.core.innerclasses_10.callbakclosure;

public class Caller
{
    private Incrementable callbackReference;

    /**
     *
     * <默认构造函数>
     * @param cbh
     * @author l
     */
    public Caller(Incrementable cbh)
    {
        callbackReference = cbh;
    }

    public void go()
    {
        callbackReference.increment();
    }
}



package com.xxl.core.innerclasses_10.callbakclosure;

/**
 *
 * <一句话功能简述>
 * <功能详细描述>
 *
 * @author l
 * @version [1.0.0, l]
 */
public class Callbacks
{
    public static void main(String[] args)
    {
        Callee1 c1 = new Callee1();
        Callee2 c2 = new Callee2();

        Caller caller1 = new Caller(c1);
        Caller caller2 = new Caller(c2.getCallbackReference());

        caller1.go();
        caller1.go();

        MyIncrement.f(c2);

        caller2.go();
        caller2.go();

        Callee3 c3 = new Callee3();
        c3.increment();
    }
}


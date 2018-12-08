/**
 * Project Name:X01
 * File Name:NestingInterfaces.java
 * Package Name:interfaces_9.nesting
 * Date:2018年1月22日下午8:28:07
 * Copyright (c) 2018, All Rights Reserved.
 *
*/

package com.xxl.core.interfaces_9.nesting;

class A
{
    interface B
    {
        void f();
    }

    public class BImpl implements B
    {
        public void f()
        {
        }
    }
    private class BImpl2 implements B
    {
        public void f()
        {
        }
    }

    public interface C
    {
        void f();
    }

    class CImpl implements C
    {
        public void f()
        {
        }
    }
    private class CImpl2 implements C
    {
        public void f()
        {
        }
    }

    private interface D
    {
        void f();
    }

    private class DImpl implements D
    {
        public void f()
        {
        }
    }
    public class DImpl2 implements D
    {
        public void f()
        {
        }
    }

    public D getD()
    {
        //D d = new DImpl2();
        return new DImpl2();
    }

    private D dReaf;

    public void receiveD(D d)
    {
        dReaf = d;
        dReaf.f();
    }
}

interface E
{
    interface G
    {
        void f();
    }

    // Redundant "public":
    public interface H
    {
        void f();
    }

    void g();

    // Cannot be private within an interface:
    //! private interface I {}
}

/**
 * ClassName:NestingInterfaces <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:   TODO ADD REASON. <br/>
 * Date:     2018年1月22日 下午8:28:07 <br/>
 * @author   XXL
 * @version
 * @since    JDK 1.8
 * @see
 */
public class NestingInterfaces
{
    public class BImpl implements A.B
    {
        public void f()
        {
        }
    }
    class CImpl implements A.C
    {
        public void f()
        {
        }
    }

    // Cannot implement a private interface except within that interface's defining calss:
//    class DImpl implements A.D
//    {
//        @Override
//        public void f()
//        {
//        }
//    }

    class EImpl implements E
    {
        public void g()
        {
        }
    }
    class EGImpl implements E.G
    {
        public void f()
        {
        }
    }

    class EImpl2 implements E
    {
        public void g()
        {
        }
        class EG implements E.G
        {
            public void f()
            {
            }
        }
    }

    public static void main(String[] args)
    {
        A a = new A();

        // Can't access A.D:
        //! A.D ad = a.getD();

        // Doesn't return anything but A.D:
        //! A.DImpl2 adi2 = a.getD();

        // Cannot access a member of the interface:
        //! a.getD().f();

        // Only another A can do anything with getD():
        A a2 = new A();
        a2.receiveD(a.getD());
    }
}



package com.xxl.core.innerclasses_10.staticinner;

import com.xxl.util.Print;

class MNA
{
    /**
     *
     * <一句话功能简述>
     * <功能详细描述>
     * @author l
     */
    private void f()
    {
        Print.print("MNA.f()");
    }

    class A
    {
        private void g()
        {
            Print.print("MNA.A.g()");
        }

        class B
        {
            void h()
            {
                g();
                f();
                Print.print("MNA.A.B.h()");
            }
        }
    }
}

/**
 *
 * <一句话功能简述>
 * <功能详细描述>
 *
 * @author l
 * @version [1.0.0, l]
 */
public class MultiNestingAccess
{

    /**
     * <默认构造函数>
     * @author l
     */

    public MultiNestingAccess()
    {

        // TODO Auto-generated constructor stub

    }

    public static void main(String[] args)
    {
        MNA mna = new MNA();
        MNA.A mnaa = mna.new A();
        MNA.A.B mnaab = mnaa.new B();

        mnaab.h();
    }
}


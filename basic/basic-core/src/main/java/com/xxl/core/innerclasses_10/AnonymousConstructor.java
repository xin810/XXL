
package com.xxl.core.innerclasses_10;

import com.xxl.util.Print;

/**
 * ClassName:AnonymousConstructor <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:   TODO ADD REASON. <br/>
 * Date:     2018年1月28日 下午3:38:12 <br/>
 * @author   l
 * @version
 * @since    JDK 1.8
 * @see
 */
public class AnonymousConstructor
{
    public static Base getBase(final int i)
    {
        return new Base(i)
        {
            {Print.print("Inside instance initializer");}

            @Override
            public void f(int i)
            {
                Print.print("in anonymous f()");
            }
        };
    }

    public static void main(String[] args)
    {
        Base base = getBase(47);

        base.f(1);
    }
}

/**
 *
 * ClassName: Base <抽象类>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 * date: 2018年1月28日 下午3:53:13 <br/>
 *
 * @author l
 * @version
 * @since JDK 1.8
 */
abstract class Base
{
    public Base(int i)
    {
        Print.print("Base constructor, i = " + i);
    }

    public abstract void f(int i);
}

